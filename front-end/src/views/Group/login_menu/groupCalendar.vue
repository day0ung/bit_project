<template>
  <div class="detail3">
      <br>
      <br>
      <div class="calendar">
      <full-calendar :events="this.$store.state.s_group.groupCalendar" :config="config" @day-click="dayClick" @event-selected="eventSelected"></full-calendar>
      <Cwrite v-if="show_calendar_write" @close="show_calendar_write = false" :startDate="clickDay"></Cwrite>
      </div>
  </div>
</template>

<script>


import 'element-ui/lib/theme-chalk/index.css';
import 'fullcalendar/dist/fullcalendar.css'
import 'fullcalendar/dist/locale/ko'
import { FullCalendar } from 'vue-full-calendar'
import Cwrite from '@/views/Group/detail/calendar_write.vue'

export default {
  name: 'GroupSchedule',
  data(){
    return{
      date1:'',
      show_calendar_write: false,
      //memberlist: this.$store.state.s_subStore.data,
      config: {
              locale: 'ko',
              defaultView:'month'
      },
      clickDay:'',
    }
  },
  components:{
        Cwrite
  },
  methods:{
    getCalendar(){
      let params = new URLSearchParams()	
          let groupSeq = this.$store.state.s_group.groupSeq
          params.append('groupInfoSeq', groupSeq)
          axios.post("http://localhost:9000/getGroupCalendar", params)
          .then(res => {
            console.log(JSON.stringify(res.data))
            let e = (JSON.stringify(res.data))
            this.$store.state.s_group.groupCalendar = JSON.parse(e)
            
          })  
    },
    eventSelected(event, jsEvent, view){
        alert(event.calendarSeq+"/"+event.title + "/"+ event.start +" / " + event.content)
        
    },
    dayClick(date, jsEvent, view){
        this.$confirm('추가하시겠습니까?', '일정추가', {
          confirmButtonText: 'OK',
          cancelButtonText: 'Cancel',
          type: 'info'
        }).then(() => {
          console.log(date)

          let a = 
          alert(date._i)
          this.clickDay = date
          this.$store.state.s_group.groupCalendarStartDate = date._i
          this.show_calendar_write = true

        }).catch(() => {
          this.$message({
            type: 'info',
            message: 'canceled'
          });          
        });




        
    }
  },
    mounted(){
      this.getCalendar()
        
   }
  
}

</script>

<style scoped>
.calendar{
  width: 80%;
  margin: auto;
  margin-bottom: 50px;
  height: auto;
  
}
.fc-view-container{
height: auto;
}

</style>