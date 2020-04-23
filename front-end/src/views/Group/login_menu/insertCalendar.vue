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
                    
                <!-- input box -->
<el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="120px" class="demo-ruleForm">
  <el-form-item label="기간설정" prop="date1">
                   <div class="block" >
                      <el-date-picker
                        size="mini"
                        v-model="ruleForm.date1"
                        type="datetimerange"
                        range-separator="~"
                        start-placeholder="Start date"
                        end-placeholder="End date"
                        
                        style="width:288px">
                      </el-date-picker>
                    </div>
                    {{ruleForm.date1}}
                </el-form-item>
  <el-form-item label="title" prop="title">
    <el-input v-model="ruleForm.title" size="mini"></el-input>
  </el-form-item>
  
  <el-form-item label="content" prop="desc">
    <el-input type="textarea" v-model="ruleForm.desc"></el-input>
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
              <button class="modal-default-button" @click="exit">
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
         ruleForm: {
          title: '',
          date1: '',
          desc: ''
        },
        rules: {
          title: [
            { required: true, message: 'Please input Activity name', trigger: 'blur' },
            { min: 3, max: 10, message: 'Length should be 3 to 10', trigger: 'blur' }
          ],
          date1: [
            { type: 'date', required: true, message: 'Please pick a date', trigger: 'change' }
          ],
          desc: [
            { required: true, message: 'Please input activity form', trigger: 'blur' }
          ]
        }
      };
      
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
      mounted(){
         console.log("cal 1")
         this.setDate()
        
      },
      setDate(){
        console.log("cal 2")
        this.ruleForm.date1 = this.$store.state.s_group.groupCalendarStartDate
      },
        exit(){
          this.$emit('close')
        },
        regi(){
          this.$emit('close')
        },
       
    }

}
</script>

<style>
.el-form-item__label{
  font-size: 15px;
}
</style>