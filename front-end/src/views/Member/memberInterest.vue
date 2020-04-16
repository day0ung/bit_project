<template>
  
</template>

<script>
export default {

}
</script>

<style>

</style><template>
    <div class="create">
        <div class="createContainer">
            <div class="title">회원가입이 완료되었습니다. 관심목록을 설정해 주세요</div>
            <el-form :model="ruleForm" label-position="top" :rules="rules" ref="ruleForm" label-width="120px" class="demo-ruleForm">
               <!-- 관심지역 -->
               <el-form-item label="관심지역" prop="interArea">
                <p style="color: #ef6c00; margin-top:-30px " >서울 / 경기 / 인천</p>
                    <el-checkbox-group v-model="ruleForm.interArea">
                    <el-checkbox label="강남" name="type"></el-checkbox>
                    <el-checkbox label="홍대" name="type"></el-checkbox>
                    <el-checkbox label="종각" name="type"></el-checkbox>
                    <el-checkbox label="의정부" name="type"></el-checkbox>
                    <el-checkbox label="분당" name="type"></el-checkbox>
                    <el-checkbox label="안양" name="type"></el-checkbox>
                    <el-checkbox label="신촌" name="type"></el-checkbox>
                    <el-checkbox label="인천" name="type"></el-checkbox>
                    <el-checkbox label="부형" name="type"></el-checkbox>
                    <el-checkbox label="노원" name="type"></el-checkbox>
                    <el-checkbox label="건대" name="type"></el-checkbox>
                    <el-checkbox label="수원" name="type"></el-checkbox>
                    <el-checkbox label="일산" name="type"></el-checkbox>
                </el-checkbox-group>
               </el-form-item>

                <el-form-item label="관심분야" prop="interBig">
                     <el-checkbox-group v-model="ruleForm.interBig" style="float: left">
                        <el-checkbox id="interBig" v-model="interBigSeq">
                            <label for="interBig">대학생/취업</label>
                        </el-checkbox>
                        <el-checkbox label="공무원/임용" name="type" ></el-checkbox>
                        <el-checkbox label="어학/회화" name="type" ></el-checkbox>
                        <el-checkbox label="라이프/취미" name="type" ></el-checkbox>
                 </el-checkbox-group>

                </el-form-item>
               <!-- 관심분야 -->
               <!-- <el-form-item label="관심분야" prop="interBig">
                    <el-checkbox-group v-model="ruleForm.interBig" style="float: left">
                        <el-checkbox label="대학생/취업" :value="1" name="type" ></el-checkbox>
                        <el-checkbox label="공무원/임용" name="type" ></el-checkbox>
                        <el-checkbox label="어학/회화" name="type" ></el-checkbox>
                        <el-checkbox label="라이프/취미" name="type" ></el-checkbox>
                </el-checkbox-group>
               </el-form-item> -->


                <!-- 상세분야 -->
              <!--  <el-form-item label="상세분야" prop="interSmall" >
                  <p style="color: #82CF1E; margin-bottom:-10px" >대학생/취업</p>
                   <div style="border-bottom: solid 1px; color: #cecece; padding-bottom: 10px">
                    <el-checkbox-group v-model="ruleForm.interSmall" size="medium">
                        <el-checkbox label="공기업" name="type" ></el-checkbox>
                        <el-checkbox label="자격증" name="type"></el-checkbox>
                        <el-checkbox label="자소서" name="type"></el-checkbox>
                        <el-checkbox label="경영/사무" name="type"></el-checkbox>
                        <el-checkbox label="디자인" name="type"></el-checkbox>
                        <el-checkbox label="전문직" name="type"></el-checkbox>
                        <el-checkbox label="IT/Internet" name="type"></el-checkbox>
                        <el-checkbox label="유통/무역" name="type"></el-checkbox>
                        <el-checkbox label="서비스" name="type"></el-checkbox>
                    </el-checkbox-group> 
                   </div>
                     <p style="color: #82CF1E; margin-bottom:-10px" >공무원/임용</p>
                   <div style="border-bottom: solid 1px; color: #cecece; padding-bottom: 10px">
                    <el-checkbox-group v-model="ruleForm.interSmall" size="medium">
                        <el-checkbox label="일반행정" name="type" ></el-checkbox>
                        <el-checkbox label="세무" name="type"></el-checkbox>
                        <el-checkbox label="교육행정" name="type"></el-checkbox>
                        <el-checkbox label="교정" name="type"></el-checkbox>
                        <el-checkbox label="군무원" name="type"></el-checkbox>
                        <el-checkbox label="사회복지" name="type"></el-checkbox>
                        <el-checkbox label="검찰사무" name="type"></el-checkbox>
                        <el-checkbox label="소방" name="type"></el-checkbox>
                        <el-checkbox label="경찰" name="type"></el-checkbox>
                    </el-checkbox-group>
                     </div> 
                     <p style="color: #82CF1E; margin-bottom:-10px" >어학/회화</p>
                   <div style="border-bottom: solid 1px; color: #cecece; padding-bottom: 10px">
                    <el-checkbox-group v-model="ruleForm.interSmall" size="medium">
                        <el-checkbox label="토익" name="type" ></el-checkbox>
                        <el-checkbox label="토스/오픽" name="type"></el-checkbox>
                        <el-checkbox label="기초영어회화" name="type"></el-checkbox>
                        <el-checkbox label="일본어" name="type"></el-checkbox>
                        <el-checkbox label="중국어" name="type"></el-checkbox>
                        <el-checkbox label="제2 외국어" name="type"></el-checkbox>
                    </el-checkbox-group>
                     </div> 
                     <p style="color: #82CF1E; margin-bottom:-10px" >라이프/취미</p>
                   <div style="border-bottom: solid 1px; color: #cecece; padding-bottom: 10px">
                    <el-checkbox-group v-model="ruleForm.interSmall" size="medium">
                        <el-checkbox label="여행/아웃도어" name="type" ></el-checkbox>
                        <el-checkbox label="운동" name="type"></el-checkbox>
                        <el-checkbox label="봉사활동" name="type"></el-checkbox>
                        <el-checkbox label="공예/만들기" name="type"></el-checkbox>
                        <el-checkbox label="댄스/무용" name="type"></el-checkbox>
                        <el-checkbox label="요리/제조" name="type"></el-checkbox>
                        <el-checkbox label="자유" name="type"></el-checkbox>
                    </el-checkbox-group>
                     </div> 
               </el-form-item> -->

                <!-- 서브밋버튼 -->
                <div class="submitBtnDiv">
                    <el-form-item>
                        <el-button type="primary" @click="submitForm('ruleForm')">회원가입</el-button>
                        <el-button @click="resetForm('ruleForm')">취소</el-button>
                    </el-form-item>
                </div>
            </el-form>
        </div>

    </div>
</template>

<script>
/* const interBigger = [] */
export default {
    data(){
        return{
            interBigSeq: ['1','2', '3', '4'],
            ruleForm: {
                interArea:[],
                interBigSeq: [],
                interSmall:[]
            },
            rules: {
     
          /*       interArea:[
                    { required: true, message: '관심지역을 선택해주세요', trigger: 'change' },
                ], */
                interBig:[
                    { required: true, message: '관심분야를 선택해주세요', trigger: 'change' },
                ],
              /*   interSmall:[
                    { required: true, message: '상세분야를 선택해주세요', trigger: 'change' },
                ] */
            },
           
        }
    },
    methods:{
        submitForm(formName) {
            this.$refs[formName].validate((valid) => {
            if (valid) {
               /*  const seq = '1'
                if( this.ruleForm.interBig.one == true){
                    alert(typeof this.ruleForm.interBig.one)
                    seq = this.ruleForm.interBig.one
                    alert(this.seq)
                } */
                alert(this.interBig)
            } else {
                console.log('error submit!!');
                return false;
            }
            });
        },
        resetForm(formName) {
            this.$refs[formName].resetFields();
		},

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