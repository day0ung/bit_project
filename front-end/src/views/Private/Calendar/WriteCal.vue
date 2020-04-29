<template>
   <transition name="modal">
           <div class="modal-mask">
      <div class="modal-wrapper">
        <div class="modal-container">

          <div class="modal-header">
            <slot name="header">
                일정 추가
            </slot>
          </div>

          <div class="modal-body">
            <slot name="body">
                    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="120px" class="demo-ruleForm">
                <el-form-item label="시작일" prop="startDate">
                  <el-date-picker 
                    v-model="ruleForm.startDate"
                    type="datetime"
                    placeholder="시작일">
                  </el-date-picker>
                </el-form-item>
                <el-form-item label="종료일" prop="endDate">
                  <el-date-picker prop="endDate"
                    v-model="ruleForm.endDate"
                    type="datetime"
                    placeholder="마감일">
                  </el-date-picker>
                </el-form-item>
                <el-form-item label="제목" prop="title">
                  <el-input v-model="ruleForm.title" size="mini"></el-input>
                </el-form-item>
                <el-form-item label="내용" prop="content">
                  <el-input type="textarea" v-model="ruleForm.content"></el-input>
                </el-form-item>
                <el-form-item label="배경" prop="backColor">
                  <el-select v-model="ruleForm.backColor" placeholder="배경">
                    <el-option label="노랑색" value="#ffff00" style="background-color:#ffff00;"></el-option>
                    <el-option label="주황색" value="#ffa94d" style="background-color:#ffa94d; color:#fff"></el-option>
                    <el-option label="파란색" value="#74c0fc" style="background-color:#74c0fc; color:#fff"></el-option>
                    <el-option label="빨간색" value="#f06595" style="background-color:#f06595; color:#fff"></el-option>
                    <el-option label="초록색" value="#a9e34b" style="background-color:#a9e34b; color:#fff"></el-option>
                  </el-select>
                </el-form-item>


                <el-form-item>
                  <el-button type="primary" @click="submitForm('ruleForm')">Create</el-button>
                  <el-button @click="resetForm('ruleForm')">Reset</el-button>
                </el-form-item>
              </el-form>
           
            </slot>
          </div>

          <div class="modal-footer">
            <slot name="footer">
              <button class="modal-default-button"  @click="exit">
                      CLOSE
              </button>
            </slot>
          </div>
        </div>
      </div>
    </div>
   </transition>
</template>

<script>
export default {
    data(){
      return{
        selectedDate:'',
        ruleForm: {
          title: '',
          startDate: '',
          endDate: '',
          content: '',
          backColor:''
        },
        rules: {
          title: [
            { required: true, message: 'Please input Activity name', trigger: 'blur' },
            { min: 3, max: 10, message: 'Length should be 3 to 10', trigger: 'blur' }
          ],
          startDate: [
            { required: true, message: 'Please pick a date', trigger: 'change' }
          ],
          endDate: [
            { required: true, message: 'Please pick a date', trigger: 'change' }
          ],
          content: [
            { required: true, message: 'Please input activity form', trigger: 'blur' }
          ],
          backColor:[
             { required: true, message: 'Please input activity form', trigger: 'blur' }
          ]
        }
      }
    },
    methods:{
        submitForm(formName) {
          this.$refs[formName].validate((valid) => {
            if (valid) {
              //insertMemberCalendar
             // alert(this.$store.state.s_private.memberSeq+"::::"+this.ruleForm.title+":::"+this.ruleForm.content+":::"+this.$moment(this.ruleForm.startDate).format('YYYY.MM.DD HH:mm:ss')+this.$moment(this.ruleForm.endDate).format('YYYY.MM.DD HH:mm:ss'))
              axios.get("http://localhost:9000/insertMemberCalendar",{
                  params:{
                    memberSeq: this.$store.state.s_private.memberSeq,
                    title: this.ruleForm.title,
                    content: this.ruleForm.content,
                    start : this.$moment(this.ruleForm.startDate).format('YYYY.MM.DD HH:mm:ss'),
                    end : this.$moment(this.ruleForm.endDate).format('YYYY.MM.DD HH:mm:ss'),
                    color : this.ruleForm.backColor
                  }
                  }).then(res =>{
                    if(res.data === ""){
                      alert("성공적으로 등록되었습니다.")
                      this.$emit('insert')
                    }
                    else {
                      alert("실패했습니다. 다시 확인해주시기 바랍니다.")
                    }
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
        exit(){
          this.$emit('close')
        },
        regi(){
          this.$emit('close')
        },
       
    },
    created(){
     this.ruleForm.startDate = this.$moment(this.$store.state.s_private.memberCalendarStartDate).format('YYYY.MM.DD HH:mm:ss')
     this.ruleForm.endDate = this.$moment(this.$store.state.s_private.memberCalendarEndDate).format('YYYY.MM.DD HH:mm:ss')
    }

}
</script>

<style>

</style>