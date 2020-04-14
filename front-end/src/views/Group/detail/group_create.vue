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
                <el-form-item label="스터디 주제" prop="inter">
                    <el-select v-model="ruleForm.inter" placeholder="주제를 선택해주세요" style="width: 85%">
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
                <el-form-item label="최대인원" prop="maxMember">
                    <el-input-number size="" v-model="ruleForm.maxMember" :min="4" :max="10"></el-input-number>
                </el-form-item>
                <!-- 기간설정 -->
                <el-form-item label="기간설정" prop="date">
                    <el-date-picker
                        style="width: 85%"
                        v-model="ruleForm.date"
                        type="daterange"
                        align="right"
                        unlink-panels
                        range-separator=" ~ "
                        start-placeholder="시작일"
                        end-placeholder="종료일"
                        :picker-options="pickerOptions">
                    </el-date-picker>
                </el-form-item>
                <!-- 장소선택 -->
                <el-form-item label="지역선택" prop="address">
                    <el-button type="primary" round @click="execDaumPostcode">우편번호찾기</el-button>
                    <el-input placeholder="주소" v-model="ruleForm.address" style="width: 85%" readonly="readonly"></el-input>
                    <el-input placeholder="상세주소" v-model="ruleForm.extraAddress" style="width: 85%" readonly="readonly"></el-input>
                </el-form-item>
                <!-- 주간일정 -->
                <el-form-item label="주간 일정" prop="selectSchedeul">
                    <!-- <el-checkbox-group v-model="ruleForm.selectSchedeul"> -->
                    <el-checkbox v-model="selectSchedeul" label="schedeul[1].name" value="schedeul[1].val"></el-checkbox>
                    <!-- </el-checkbox-group> -->
                </el-form-item>
                <!-- 그룹소개 -->
                <el-form-item label="스터디 간단소개" prop="smallInfo">
                    <el-input type="textarea" v-model="ruleForm.smallInfo" style="width: 85%;" :autosize="{ minRows: 1, maxRows: 3}" placeholder="스터디를 한마디로 표현한다면?"></el-input>
                </el-form-item>
                <el-form-item label="스터디 상세소개" prop="info">
                    <el-input type="textarea" v-model="ruleForm.info" style="width: 85%;" :autosize="{ minRows: 10, maxRows: 20}" placeholder="스터디의 조건과 방법등 사람들이 보고 참여할 수 있게 소개 해주세요"></el-input>
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
                    <el-dialog :visible.sync="dialogVisible">
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
const schedeulTable = [
    { name: "일", dataValue: "sunday", val: "1" },
    { name: "월", dataValue: "monday", val: "1" },
    { name: "화", dataValue: "tuesday", val: "1" },
    { name: "수", dataValue: "wednesday", val: "1" },
    { name: "목", dataValue: "thursday", val: "1" },
    { name: "금", dataValue: "friday", val: "1" },
    { name: "토", dataValue: "saturday", val: "1" }
]

export default {
    data(){
        return{
            loading: true,
            dialogVisible: false,
            schedeul: schedeulTable,
            ruleForm: {
                groupName: '',
                inter: '',
                address: '',
                extraAddress: '',
                maxMember:'',
                date: '',
                info: '',
                smallInfo: '',
                dialogImageUrl: '',
                selectSchedeul: [],
                sunday: '',
            },
            rules: {
            groupName: [
                { required: true, message: '스터디 그룹 이름을 지어주세요', trigger: 'blur' },
                { min: 3, max: 20, message: '스터디 그룹명은 3글자에서 20자로 사이로 지어주세요', trigger: 'blur' }
            ],
            inter: [
                { required: true, message: '스터디 그룹 주제를 선택해주세요', trigger: 'change' }
            ],
            // selectSchedeul: [
            //     { type: 'array', required: true, message: '주간일정을 선택해주세요', trigger: 'change' }
            // ],
            date: [
                { required: true, message: '시작일과 종료일을 선택해주세요', trigger: 'change' }
            ],
            info: [
                { required: true, message: '스터디 그룹을 소개해주세요', trigger: 'blur' },
                { min: 1, max: 500, message: '그룹소개는 500자 이내로 작성해주세요.', trigger: 'blur' }
            ],
            smallInfo:[
                { required: true, message: '스터디 그룹을 소개해주세요', trigger: 'blur' },
                { min: 1, max: 30, message: '간단소개는 30자 이내로 작성해주세요.', trigger: 'blur' }
            ],
            address:[
                { required: true, message: '지역을 선택해주세요', trigger: 'blur' },
            ]
            },
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
            this.dialogVisible = true;
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
                // let selectAarrySchedeul = [];
                // this.ruleForm.selectSchedeul.forEach(function(element){
                //     schedeulTable.forEach(function(params) {
                //         if(element === params.name){
                //             var data = new Object() ;
                //             data.name = params.dataValue ;
                //             data.val = params.val ;
                //             selectAarrySchedeul.push(data) ;
                //         }
                //     })
                // })
                // this.ruleForm.selectSchedeul = selectAarrySchedeul
                //alert(JSON.stringify(selectAarrySchedeul))
                var params = new URLSearchParams();	// post 방식으로 받아야함.
                params.append('groupDto', this.ruleForm);
                alert(JSON.stringify(this.ruleForm))
                axios.post("http://localhost:9000/creatGroupApply", params)
                            .then(res => {
                                alert(res.data + "통신성공")
                            })
            } else {
                console.log('error submit!!');
                return false;
            }
            });
        },
        resetForm(formName) {
            this.$refs[formName].resetFields();
        },
        execDaumPostcode() {
            new daum.Postcode({
                onComplete: (data) => {
                if (data.userSelectedType === 'R') {
                    this.ruleForm.address = data.roadAddress;
                } else {
                    this.ruleForm.address = data.jibunAddress;
                }
                if (data.userSelectedType === 'R') {
                    if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
                    this.ruleForm.extraAddress += data.bname;
                    }
                    if (data.buildingName !== '' && data.apartment === 'Y') {
                    this.ruleForm.extraAddress +=
                        this.ruleForm.extraAddress !== ''
                        ? `, ${data.buildingName}`
                        : data.buildingName;
                    }
                    if (this.ruleForm.extraAddress !== '') {
                    this.ruleForm.extraAddress = ` (${this.ruleForm.extraAddress})`;
                    }
                } else {
                    this.ruleForm.extraAddress = '';
                }
                },
            }).open();
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
    padding: 40px;
    margin: auto;
    overflow: hidden;
    width: 600px;
    height: auto;
    background: #f7f7f7;
}
.title{
    font-family: "Helvetica Neue",Helvetica,"PingFang SC","Hiragino Sans GB","Microsoft YaHei","微软雅黑",Arial,sans-serif;
    font-size: 24px;
    margin: auto;
    margin-bottom: 20px;
    text-align: center;
}
.submitBtnDiv{
    text-align: center;
}
</style>