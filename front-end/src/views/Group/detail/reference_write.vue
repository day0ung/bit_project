<template>
  <div class="reference_write">
        <br>
        <br>
        <el-button @click="showGroupReference" round>목록으로</el-button>
        <br>
        <br>
        <el-form :model="ruleForm" label-position="top" :rules="rules" ref="ruleForm" label-width="120px" class="demo-ruleForm">
            <el-form-item label="자료 올리기" prop="image">
                <el-upload
                    ref="upload"
                    action=""
                    list-type="picture-card"
                    accept=".jpg, .jpeg, .png, .bmp, .txt, .ppt, .pptx, .hwp"
                    multiple
                    :file-list="ruleForm.fileList"
                    :limit="2"
                    :auto-upload="false"
                    :on-change="handleChange"
                    :on-success="handleSuccess"
                    :on-exceed="handleExceed"
                    :on-preview="handlePictureCardPreview"
                    :on-remove="handleRemove">
                    <i class="el-icon-plus"></i>
                </el-upload>
                <el-dialog :visible.sync="dialogVisible">
                    <img width="100%" :src="ruleForm.dialogImageUrl" alt="">
                </el-dialog>
            </el-form-item>

            <el-form-item label="자료 제목"  prop="title">
                <el-input v-model="ruleForm.title"></el-input>
            </el-form-item>

            <el-form-item label="자료 간략내용" style="margin-bottom: 10px;">
                <el-input v-model="ruleForm.content"></el-input>
            </el-form-item>
                <br>
                <br>
                <br>
            <div class="writeButton" style="display: table; margin: auto;">
                <el-form-item>
                    <el-button @click="submitForm('ruleForm')" round>작성완료</el-button>
                </el-form-item>
            </div>
        </el-form>
  </div>
</template>

<script>
import quillexamplesnow from '@/components/Qilledit'

export default {
    components:{
        quillexamplesnow
    },
    data(){
        return{
            dialogVisible: false,
            ruleForm:{
                title: '',
                content: '',
                dialogImageUrl: '',
                fileList: [],
            },
            rules: {
                title: [
                    { required: true, message: '자료 제목을 입력하세요', trigger: 'blur' },
                ],
                content: [
                    { required: true, message: '간략하게 자료에 대한 설명을해주세요', trigger: 'blur' },
                ]
            }
        }
    },
    methods:{
        showGroupReference(){
            this.$emit("showGroupReference")
        },
        textContent(value){
            this.content = value
        },
        submitForm(formName) {
			this.$refs[formName].validate((valid) => {
			if (valid) {

                let formData = new FormData();
                //formData.append
                alert(this.$refs.upload.fileList)
                //alert(this.ruleForm.fileList[0].raw)
                this.showGroupReference()
                // alert(this.$store.state.loginUser.memberSeq)
                // alert(this.$store.state.s_group.groupSeq)
				// axios.get("http://localhost:9000/insertGroupBoard",{
				// 	params:{
                // 		memberSeq: this.$store.state.loginUser.memberSeq,
                //         groupInfoSeq: this.$store.state.s_group.groupSeq,
				// 		title: this.ruleForm.title,
				// 		content: this.content
				// 	}
				// }).then(res =>{
                //     alert("게시글 작성이 완료되었습니다.")
                //     this.allList()
                //     this.showList()
				// })
				
			} else {
				console.log('error submit!!');
				return false;
			}
            });
        },
        handleChange(file, fileList){
            this.ruleForm.fileList = fileList
            alert(this.ruleForm.fileList)
        },
        handleSuccess(response, file, fileList){
            alert(fileList)
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
                message: '자료는 한번에 2개만 업로드가능합니다.',
                type: 'error'
            })
        },
    }
}
</script>

<style>

</style>