<template>
    <div class="create">
        <div class="createContainer">
            <div class="title">그룹 스터디 생성</div>
            <el-form :model="ruleForm" label-position="top" :rules="rules" ref="ruleForm" label-width="120px" class="demo-ruleForm">
                <!-- 아이디 설정 -->
                <el-form-item label="아이디" prop="memberId">
                    <el-input placeholder="아이디를 입력해 주세요" v-model="ruleForm.memberId"></el-input>
                </el-form-item>
				<!-- 비밀번호 -->
				 <el-form-item label="비밀번호" prop="pass">
					<el-input type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
				</el-form-item>
				<el-form-item label="비밀번호 확인" prop="checkPass">
					<el-input type="password" v-model="ruleForm.checkPass" autocomplete="off"></el-input>
				</el-form-item>
				<!--  이메일 -->
				 <el-form-item prop="email" label="Email">
					<el-input v-model="ruleForm.email"></el-input>
				 </el-form-item>	 
                <!--  나이대선택 -->
				<el-form-item label="성별/ 연령" prop="age">
					<el-select v-model="ruleForm.age" placeholder="나이대를 선택해주세요">
						<el-option label="10대" value="10대"></el-option>
						<el-option label="20-24" value="20-24"></el-option>
						<el-option label="25-29" value="25-29"></el-option>
						<el-option label="30-34" value="30-34"></el-option>
						<el-option label="40대" value="40대"></el-option>
					</el-select>
					||
					<el-radio v-model="ruleForm.gender" label="1" >남자</el-radio>
  					<el-radio v-model="ruleForm.gender" label="2" >여자</el-radio>
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
export default {
    data(){
		var validatePass = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('비밀번호를 입력해주세요'));
        } else {
          if (this.ruleForm.checkPass !== '') {
            this.$refs.ruleForm.validateField('checkPass');
          }
          callback();
        }
      };
      var validatePass2 = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('Please input the password again'));
        } else if (value !== this.ruleForm.pass) {
          callback(new Error('비밀번호가 일치하지 않습니다'));
        } else {
          callback();
        }
      };
        return{
            ruleForm: {
				memberId: '',
				pass: '',
				checkPass: '',
				email: '', 
				gender: '',
				age: '',
				postcode: '',
      			address: '',
     			extraAddress: '',
                maxMember:'',
                schedeul: [],
                date: '',
                desc: '',
                dialogImageUrl: '',
                dialogVisible: false
            },
            rules: {
            memberId: [
                { required: true, message: '아이디를 입력해주세요', trigger: 'blur' },
                { min: 3, max: 20, message: '스터디 그룹명은 3글자에서 20자로 사이로 지어주세요', trigger: 'blur' }
			],
			pass: [
            	{ required: true, validator: validatePass, trigger: 'blur' }
			],
			checkPass: [
				{ required: true, validator: validatePass2, trigger: 'blur' }
			],
			email: [
				{ required: true, message: 'Please input email address', trigger: 'blur' },
				{ type: 'email', message: 'Please input correct email address', trigger: ['blur', 'change'] }
			],
			age: [
				{ required: true, message: '나이대를 선택해 주세요', trigger: 'blur' },
			],
			gender:[

			],
			postcode:[

			],
			address:[

			],
			extraAddress:[

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
            InterListAll: ''
            }
    },
    methods:{
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
		},
		execDaumPostcode() {
			new daum.Postcode({
			onComplete: (data) => {
			if (data.userSelectedType === 'R') {
				this.address = data.roadAddress;
			} else {
				this.address = data.jibunAddress;
			}
			if (data.userSelectedType === 'R') {
				if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
				this.extraAddress += data.bname;
				}
				if (data.buildingName !== '' && data.apartment === 'Y') {
				this.extraAddress +=
					this.extraAddress !== ''
					? `, ${data.buildingName}`
					: data.buildingName;
				}
				if (this.extraAddress !== '') {
				this.extraAddress = ` (${this.extraAddress})`;
				}
			} else {
				this.extraAddress = '';
			}
			},
		}).open();
		}
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