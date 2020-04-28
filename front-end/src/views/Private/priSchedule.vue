<template>
  <div>
      <full-calendar 
        :events="this.$store.state.s_private.memberCalendar"
        :config="config"
        @day-click="dayClick" 
        @event-selected="eventSelected" 
        @event-drop="eventDrop"></full-calendar>
        <CalDetail 
        v-if="caldetail"
        @close="detail">
        </CalDetail>
        <CalWrite 
        v-if="calendarwrite"
        @close="calendarwrite = false"
        @insert="writeAf">
        </CalWrite>
  </div>
</template>

<script>
import CalDetail from '@/views/Private/Calendar/DetailCal.vue'
import CalWrite from '@/views/Private/Calendar/WriteCal.vue'
import 'fullcalendar/dist/fullcalendar.css'
import 'fullcalendar/dist/locale/ko'
import { FullCalendar } from 'vue-full-calendar'
export default {
    components:{ CalDetail,CalWrite },
    data(){
      return{
      config: {
          locale: 'ko',
          defaultView:'month',
      },
      clickDay:'',
      caldetail: false,
      calendarwrite: false
      }

    },
    methods:{
      getCalenarInfo(){
        let params = new URLSearchParams()	
        //alert("calendar"+this.$store.state.s_private.memberSeq)
        let memberSeq = this.$store.state.s_private.memberSeq
        params.append('memberSeq', memberSeq)
        axios.post("http://localhost:9000/getMemberCalendar", params)
          .then(res => {
          console.log("DB: "+JSON.stringify(res.data))
          let e = JSON.stringify(res.data)
          this.$store.state.s_private.memberCalendar = JSON.parse(e)
          //alert(this.$store.state.s_private.memberCalendar) 
          //alert(JSON.stringify(this.$store.state.s_private.memberCalendar)) 
        })  
      },
      eventSelected(event, jsEvent, view){ //detail
        if(event.end === null){
            event.end = event.start
         }

         this.$store.state.s_private.memberCalendarDetail = event
         this.caldetail = true
      },
      dayClick(date, jsEvent, view){
          this.$confirm('일정을 추가하시겠습니까?', '일정추가', {
          confirmButtonText: '추가',
          cancelButtonText: '취소',
          type: 'info'
        }).then(() => {
          this.clickDay = date
          this.$store.state.s_private.memberCalendarStartDate = date._i
          //alert( this.$store.state.s_private.memberCalendarStartDate )
          this.calendarwrite = true

        }).catch(() => {
          this.$message({
            type: 'info',
            message: '취소되었습니다.'
          });          
        });
      },
      eventDrop(event){
        alert('asdf')
      },
      writeAf(){
        this.calendarwrite = false
        this.getCalenarInfo()
      },
      detail(){
        this.caldetail = false
       this.getCalenarInfo()
      }

    },
    mounted(){
      this.getCalenarInfo()
    }
  
}
</script>

<style>

</style>