<template>
  <transition name="modal">
           <div class="modal-mask">
      <div class="modal-wrapper">
        <div class="modal-container">

          <div class="modal-header">
            <slot name="header" v-if="updateNum==1">일정 수정하기</slot>
            <slot name="header" v-else>일정 보기</slot>
          </div>

          <div class="modal-body">
            <slot name="body">
                    
                <!-- input box -->
              <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="120px" class="demo-ruleForm">
                <el-form-item label="시작일" prop="startDate">
                  <el-date-picker v-if="updateNum==1" 
                                  v-model="ruleForm.startDate" type="datetime" placeholder="시작일"></el-date-picker>
                  <el-date-picker v-else
                                  v-model="ruleForm.startDate" type="datetime" placeholder="시작일" readonly></el-date-picker>
                </el-form-item>
                <el-form-item label="종료일" prop="endDate">
                  <el-date-picker v-if="updateNum==1"  
                    v-model="ruleForm.endDate" type="datetime" placeholder="마감일"></el-date-picker>
                    <el-date-picker v-else 
                    v-model="ruleForm.endDate" type="datetime" placeholder="마감일" readonly></el-date-picker>
                </el-form-item>
                <el-form-item label="title" prop="title">
                  <el-input v-if="updateNum==1"  v-model="ruleForm.title" size="mini"></el-input>
                  <el-input v-else v-model="ruleForm.title" size="mini" readonly></el-input>
                </el-form-item>
                
                <el-form-item label="content" prop="content">
                  <el-input v-if="updateNum==1" type="textarea" v-model="ruleForm.content"></el-input>
                  <el-input v-else type="textarea" v-model="ruleForm.content" readonly :value="1"></el-input>
                </el-form-item>
                <el-form-item>
                  <el-button type="primary" v-if="updateNum == 0" @click="updateNum = 1">수정하기</el-button>
                  <el-button type="primary" v-if="updateNum == 1" @click="updateNum = 1">수정하기</el-button>
                  <el-button v-if="updateNum == 1" @click="resetForm('ruleForm')">Reset</el-button>
                  <el-button type="primary" @click="deleteCal">삭제하기</el-button>
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
            updateNum: 0,
            ruleForm: {
                calendarSeq:'',
                startDate: '',
                endDate: '',
                title: '',
                content: ''
            },
        }
    },

methods:{
    deleteCal(){
        let seq = this.$store.state.s_group.groupCalendarDetail.calendarSeq
        alert(seq)
    },
    resetForm(formName) {
        this.$refs[formName].resetFields();
        },
    exit(){
        this.$emit('close')
    },
},
mounted(){
//this.$moment(this.$store.state.s_group.groupCalendarStartDate).format('YYYY.MM.DD HH:mm:ss')
    
    this.ruleForm.startDate = this.$store.state.s_group.groupCalendarDetail.startDate
    this.ruleForm.endDate = this.$moment(this.$store.state.s_group.groupCalendarDetail.endDate).format('YYYY.MM.DD HH:mm:ss')
    this.ruleForm.title = this.$store.state.s_group.groupCalendarDetail.title
    this.ruleForm.content = this.$store.state.s_group.groupCalendarDetail.content
}

}
</script>

<style>

</style>