<template>
    <div class="create">
        <div class="createContainer">
            <div class="title">그룹 스터디 생성</div>
            <el-form :model="ruleForm" label-position="top" :rules="rules" ref="ruleForm" label-width="120px" class="demo-ruleForm" v-loading="loading">
                <!-- 그룹명 설정 -->
                <el-form-item label="그룹 스터디명" prop="groupName">
                    <el-input placeholder="그룹 스터디명을 적어주세요" v-model="ruleForm.groupName" style="width: 85%"></el-input>
                </el-form-item>
                <!-- 주제선택 -->
                <el-form-item label="스터디 주제" prop="region1">
                    <el-select v-model="ruleForm.region1" placeholder="주제를 선택해주세요">
                        <el-option-group v-for="bigInter in InterListAll" :key="bigInter.interBigSeq" :value="bigInter.interBigSeq" :label="bigInter.bigName">
                            <el-option v-for="item in bigInter.interSmallDtos" :key="item.interSmallSeq" :value="item.interSmallSeq" :label="item.smallName"></el-option>
                        </el-option-group>
                    </el-select>
                </el-form-item>
                <!-- <el-form-item label="작은 주제" prop="region2">
                    <el-select v-model="ruleForm.region2" placeholder="선택해주세요">
                        <el-option v-for="smallInter in smallInterList" :key="smallInter.interSmallSeq" :value="smallInter.interSmallSeq" :label="smallInter.smallName"></el-option>
                    </el-select>
                </el-form-item> -->
                <!-- 인원설정 -->
                <el-form-item label="인원설정" prop="maxMember">
                    <el-input-number size="mini" v-model="ruleForm.maxMember" :min="4" :max="10"></el-input-number>
                </el-form-item>
                <!-- 기간설정 -->
                <el-form-item label="기간설정" prop="date">
                    <el-date-picker
                        v-model="ruleForm.date"
                        type="daterange"
                        align="right"
                        unlink-panels
                        range-separator="|"
                        start-placeholder="시작일"
                        end-placeholder="종료일"
                        :picker-options="pickerOptions">
                    </el-date-picker>
                </el-form-item>
                <!-- 주간일정 -->
                <el-form-item label="주간 일정" prop="schedeul">
                    <el-checkbox-group v-model="ruleForm.schedeul">
                        <el-checkbox label="월" name="schedeul"></el-checkbox>
                        <el-checkbox label="화" name="schedeul"></el-checkbox>
                        <el-checkbox label="수" name="schedeul"></el-checkbox>
                        <el-checkbox label="목" name="schedeul"></el-checkbox>
                        <el-checkbox label="금" name="schedeul"></el-checkbox>
                        <el-checkbox label="토" name="schedeul"></el-checkbox>
                        <el-checkbox label="일" name="schedeul"></el-checkbox>
                    </el-checkbox-group>
                </el-form-item>
                <!-- 그룹소개 -->
                <el-form-item label="스터디 소개" prop="desc">
                    <el-input type="textarea" v-model="ruleForm.desc" style="width: 85%"></el-input>
                </el-form-item>
                <!-- 그룹 이미지 -->
                <el-form-item label="그룹대표 이미지" prop="image">
                    <el-upload
                        action="https://jsonplaceholder.typicode.com/posts/"
                        list-type="picture-card"
                        accept=".jpg, .jpeg, .png, .bmp"
                        multiple
                        :limit="1"
                        :on-exceed="handleExceed"
                        :on-preview="handlePictureCardPreview"
                        :on-remove="handleRemove">
                        <i class="el-icon-plus"></i>
                    </el-upload>
                    <el-dialog :visible.sync="ruleForm.dialogVisible"
                                append-to-body="true">
                        <img width="100%" :src="ruleForm.dialogImageUrl" alt="">
                    </el-dialog>
                </el-form-item>
                <!-- 서브밋버튼 -->
                <div class="submitBtnDiv">
                    <el-form-item>
                        <el-button type="primary" @click="submitForm('ruleForm')">Create</el-button>
                        <el-button @click="resetForm('ruleForm')">Reset</el-button>
                    </el-form-item>
                </div>
            </el-form>
        </div>

    </div>
</template>

<script>
import { loading } from 'element-ui';
export default {
    data(){
        return{
            loading: true,
            ruleForm: {
                groupName: '',
                region1: '',
                region2: '',
                maxMember:'',
                schedeul: [],
                date: '',
                desc: '',
                dialogImageUrl: '',
                dialogVisible: false
            },
            rules: {
            groupName: [
                { required: true, message: '스터디 그룹 이름을 지어주세요', trigger: 'blur' },
                { min: 3, max: 20, message: '스터디 그룹명은 3글자에서 20자로 사이로 지어주세요', trigger: 'blur' }
            ],
            region1: [
                { required: true, message: '스터디 그룹 큰주제를 선택해주세요', trigger: 'change' }
            ],
            region2: [
                { required: true, message: '스터디 그룹 작은주제를 선택해주세요', trigger: 'change' }
            ],
            schedeul: [
                { type: 'array', required: true, message: '주간일정을 선택해주세요', trigger: 'change' }
            ],
            date: [
                { type: 'date', required: true, message: '시작일과 종료일을 선택해주세요', trigger: 'change' }
            ],
            desc: [
                { required: true, message: '스터디 그룹을 소개해주세요', trigger: 'blur' },
                { min: 1, max: 500, message: '그룹소개는 500자 이내로 작성해주세요.', trigger: 'blur' }
            ]
            },
            bigInterList: "",
            smallInterList: "",
            bigValue: 0,
            pickerOptions: {
                shortcuts: [{
                    text: '일주일',
                    onClick(picker) {
                    const end = new Date();
                    const start = new Date();
                    end.setTime(start.getTime() + 3600 * 1000 * 24 * 7);
                    picker.$emit('pick', [start, end]);
                    }
                }, {
                    text: '한달',
                    onClick(picker) {
                    const end = new Date();
                    const start = new Date();
                    end.setTime(start.getTime() + 3600 * 1000 * 24 * 30);
                    picker.$emit('pick', [start, end]);
                    }
                }, {
                    text: '3개월',
                    onClick(picker) {
                    const end = new Date();
                    const start = new Date();
                    end.setTime(start.getTime() + 3600 * 1000 * 24 * 90);
                    picker.$emit('pick', [start, end]);
                    }
                }, {
                    text: '6개월',
                    onClick(picker) {
                    const end = new Date();
                    const start = new Date();
                    end.setTime(start.getTime() + 3600 * 1000 * 24 * 180);
                    picker.$emit('pick', [start, end]);
                    }
                }, {
                    text: '1년',
                    onClick(picker) {
                    const end = new Date();
                    const start = new Date();
                    end.setTime(start.getTime() + 3600 * 1000 * 24 * 365);
                    picker.$emit('pick', [start, end]);
                    }
                }]
            },
            value1: '',
            value2: '',
            InterListAll: ''
            }
    },
    methods:{
        gruopCreateApply: function (event) {
            alert("그룹신청이 완료되었습니다.\n심사 후 그룹개설이 완료됩니다.")
            this.$router.push({
                path: "/group"
            })
        },
        handleRemove(file, fileList) {
            console.log(file, fileList);
        },
        handlePictureCardPreview(file) {
            this.ruleForm.dialogImageUrl = file.url;
            this.ruleForm.dialogVisible = true;
        },
        handleExceed(files, fileList){
            this.$message({
                showClose: true,
                center: true,
                message: '대표이미지는 1개만 업로드가능합니다.',
                type: 'error'
            })
        },
        submitForm(formName) {
            this.$refs[formName].validate((valid) => {
            if (valid) {
                alert('submit!');
            } else {
                console.log('error submit!!');
                return false;
            }
            });
        },
        resetForm(formName) {
            this.$refs[formName].resetFields();
        }
    },
    mounted(){
        this.loading = true
        axios.get("http://localhost:9000/getInterListAll")
        .then(res => {
            this.InterListAll = res.data
            this.loading = false
        })
    }
}
</script>

<style scope>

.createContainer {
    position: relative;
    margin: auto;
    overflow: hidden;
    width: 600px;
    height: auto;
    border-radius: 10px;
}
.title{
    font-family: "Helvetica Neue",Helvetica,"PingFang SC","Hiragino Sans GB","Microsoft YaHei","微软雅黑",Arial,sans-serif;
    font-size: 18px;
    margin: auto;
    margin-top: 30px;
    margin-bottom: 20px;
    text-align: center;
}
.submitBtnDiv{
    margin-left: -120px;
    text-align: center;
}
</style>