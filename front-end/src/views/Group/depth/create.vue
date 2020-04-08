<template>
    <div class="create">
        <div class="createContainer">
            <div class="title">그룹 스터디 생성</div>
            <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="120px" class="demo-ruleForm">
                <!-- 그룹명 설정 -->
                <el-form-item label="그룹 스터디명" prop="groupName">
                    <el-input v-model="ruleForm.groupName" style="width: 85%"></el-input>
                </el-form-item>
                <!-- 주제선택 -->
                <el-form-item label="큰 주제" prop="region1">
                    <el-select v-model="ruleForm.region1" placeholder="선택해주세요" @change="interBig">
                        <el-option v-for="bigInter in bigInterList" :key="bigInter.interBigSeq" :value="bigInter.interBigSeq" :label="bigInter.bigName"></el-option>
                    </el-select>
                    <!-- <el-select v-model="ruleForm.region2" placeholder="선택해주세요">
                        <el-option v-for="smallInter in smallInterList" :key="smallInter.interSmallSeq" :value="smallInter.interSmallSeq" :label="smallInter.smallName"></el-option>
                    </el-select> -->
                </el-form-item>
                <el-form-item label="작은 주제" prop="region2">
                    <el-select v-model="ruleForm.region2" placeholder="선택해주세요">
                        <el-option v-for="smallInter in smallInterList" :key="smallInter.interSmallSeq" :value="smallInter.interSmallSeq" :label="smallInter.smallName"></el-option>
                    </el-select>
                </el-form-item>
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
import 'element-ui/lib/theme-chalk/index.css';
export default {
    data(){
        return{
            ruleForm: {
                groupName: '',
                region1: '',
                region2: '',
                schedeul: [],
                date: '',
                desc: '',
            },
            rules: {
            groupName: [
                { required: true, message: '스터디 그룹 이름을 지어주세요', trigger: 'blur' },
                { min: 3, max: 5, message: 'Length should be 3 to 5', trigger: 'blur' }
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
                { required: true, message: '스터디 그룹을 소개해주세요', trigger: 'blur' }
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
        value2: ''
        }
    },
    methods:{
        gruopCreateApply: function (event) {
            alert("그룹신청이 완료되었습니다.\n심사 후 그룹개설이 완료됩니다.")
            this.$router.push({
                path: "/group"
            })
        },
        interBig(value){
            this.bigValue = value
            var params = new URLSearchParams();
            params.append('interBigSeq', this.bigValue);
            axios.post("http:localhost:9000/getSmallIndex", params)
                .then(res => {
                    this.smallInterList = res.data
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
        axios.post("http://localhost:9000/getBigIndex")
            .then(res => {
                this.bigInterList = res.data
        })

    }

}
</script>

<style scope>

.createContainer {
    position: relative;
    margin: auto;
    margin-top: 30px;
    overflow: hidden;
    width: 650px;
    height: auto;
    max-height: 700px;
    background: #f5f5f5;
    box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.5);
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