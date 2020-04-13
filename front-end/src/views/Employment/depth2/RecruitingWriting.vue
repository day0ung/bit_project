<template>
	<div>
		<el-form :model="ruleForm" label-position="top" :rules="rules" ref="ruleForm" label-width="120px" class="demo-ruleForm">
			<el-form-item label="기업명">
				<el-input readonly="readonly" :value="login1.memberName"></el-input>
			</el-form-item>
			<el-form-item label="제목"  prop="title">
				<el-input v-model="ruleForm.title"></el-input>
			</el-form-item>
			<el-form-item label="접수기간">
				<el-date-picker
					v-model="ruleForm.cvStartDate"
					type="date"
					placeholder="Pick a day">
				</el-date-picker>
				-
				<el-date-picker
					v-model="ruleForm.cvEndDate"
					type="date"
					placeholder="Pick a day">
				</el-date-picker>
			</el-form-item>
			<el-form-item label="경력"  prop="career">
				<el-input v-model="ruleForm.career"></el-input>
			</el-form-item>
			<el-form-item label="학력" prop="education">
				<el-input v-model="ruleForm.education"></el-input>
			</el-form-item>
			<el-form-item label="근무형태" prop="workingType">
				<el-input v-model="ruleForm.workingType"></el-input>
			</el-form-item>
			<el-form-item label="급여" prop="salary">
				<el-input v-model="ruleForm.salary"></el-input>
			</el-form-item>
			<el-form-item label="직급" prop="position">
				<el-input v-model="ruleForm.position"></el-input>
			</el-form-item>
			<el-form-item label="근무지" prop="workingLocation">
				<el-input v-model="ruleForm.workingLocation"></el-input>
			</el-form-item>
			<el-form-item label="기업로고 이미지" prop="image">
				<el-upload
					v-model="ruleForm.dialogImageUrl"
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
					<img width="100%"  :src="ruleForm.dialogImageUrl" alt="">
				</el-dialog>
			</el-form-item>
			<el-form-item label="내용" prop="content">
				<el-input type="textarea" v-model="ruleForm.content"></el-input>
			</el-form-item>
			<el-form-item>
				<el-button type="primary" @click="submitForm('ruleForm')">적용</el-button>
				<el-button @click="resetForm('ruleForm')">취소</el-button>
			</el-form-item>
		</el-form>
	</div>
</template>

<script>
import 'element-ui/lib/theme-chalk/index.css';
import Vue from "vue"
import moment from "moment"
import VueMomentJS from "vue-momentjs"

Vue.use(VueMomentJS, moment)

export default {
	 data() {
      return {
        ruleForm: {
		  title: '',
          career: '',
          education: '',
          workingType: '',
		  salary: '',
		  cvStartDate: '',
          position: '',
          workingLocation: '',
		  content: '',
		  login1: [],
		  dialogImageUrl: ""
		},
		
		login : "",
        rules: {
		  title: [
			{ required: true, message: '제목을 입력하세요', trigger: 'blur' },
		  ],
		  career: [
			{ required: true, message: '경력을 입력하세요', trigger: 'blur' },
		  ],
		  period: [
			{ required: true, message: '경력을 입력하세요', trigger: 'blur' },
		  ],
		  education: [
			{ required: true, message: '학력을 입력하세요', trigger: 'blur' },
		  ],
		  workingType: [
            { required: true, message: '근무형태를 입력하세요', trigger: 'blur' },
		  ],
		  salary: [
            { required: true, message: '급여를 입력하세요', trigger: 'blur' },
		  ],
		  position: [
            { required: true, message: '직책을 입력하세요', trigger: 'blur' },
		  ],
		  workingLocation: [
            { required: true, message: '근무지를 입력하세요', trigger: 'blur' },
          ],
          content: [
            { required: true, message: '내용을 입력하세요', trigger: 'blur' }
          ]
        }
      };
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
			
			axios.get("http://localhost:9000/insertRecruit",{
				params:{
					memberSeq: this.login1.memberSeq,
					title: this.ruleForm.title,
					career: this.ruleForm.career,
					education: this.ruleForm.education,
					workingType: this.ruleForm.workingType,
					cvStartDate : this.$moment(this.ruleForm.cvStartDate).format('YYYY.MM.DD HH:mm:ss'),
					cvEndDate : this.$moment(this.ruleForm.cvEndDate).format('YYYY.MM.DD HH:mm:ss'),
					salary: this.ruleForm.salary,
					position: this.ruleForm.position,
					workingLocation: this.ruleForm.workingLocation,
					image: this.ruleForm.dialogImageUrl,
					content:this.ruleForm.content

				}
			}).then(res =>{
				alert("통신성공")
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
	
	},
	created(){
		let sMemberSeq = sessionStorage.getItem("loginUser")
		this.login1 = JSON.parse(sMemberSeq)
		// this.memberSeq = this.$store.state.loginUser.memberSeq
	}
  }
</script>