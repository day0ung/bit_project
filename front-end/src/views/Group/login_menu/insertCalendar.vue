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
  <el-form-item label="time" required>
    <el-col :span="11">
      <el-form-item prop="date1">
        <el-date-picker type="date" placeholder="Pick a date" v-model="ruleForm.date1" style="width: 100%;"></el-date-picker>
      </el-form-item>
    </el-col>
    <el-col class="line" :span="2">-</el-col>
    <el-col :span="11">
      <el-form-item prop="date2">
        <el-time-picker placeholder="Pick a time" v-model="ruleForm.date2" style="width: 100%;"></el-time-picker>
      </el-form-item>
    </el-col>
  </el-form-item>
  <el-form-item label="기간설정" prop="date3">
                    <el-date-picker
                        style="width: 85%"
                        v-model="date3"
                        type="daterange"
                        align="right"
                        unlink-panels
                        range-separator=" ~ "
                        start-placeholder="시작일"
                        end-placeholder="종료일"
                        :picker-options="pickerOptions">
                    </el-date-picker>
                </el-form-item>
  <el-form-item label="title" prop="title">
    <el-input v-model="ruleForm.title"></el-input>
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
          date2: '',
          date3: '',
          desc: ''
        },
        rules: {
          title: [
            { required: true, message: 'Please input Activity name', trigger: 'blur' },
            { min: 3, max: 5, message: 'Length should be 3 to 5', trigger: 'blur' }
          ],
          date1: [
            { type: 'date', required: true, message: 'Please pick a date', trigger: 'change' }
          ],
          date2: [
            { type: 'date', required: true, message: 'Please pick a time', trigger: 'change' }
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

</style>