<template>
  <div class="detail3">
      <br>
      <br>
      <div class="calendar">

      <full-calendar :events="events" :config="config" @day-click="dayClick"></full-calendar>

      </div>
  </div>
</template>

<script>
import 'element-ui/lib/theme-chalk/index.css';
import 'fullcalendar/dist/fullcalendar.css'
import 'fullcalendar/dist/locale/ko'
import { FullCalendar } from 'vue-full-calendar'

export default {
  name: 'GroupSchedule',
  data(){
    return{
      memberlist: this.$store.state.s_subStore.data,
      events: [
                    // {
                    //     title  : 'event1',
                    //     start  : '2020-01-01',
                    // },
                    // {
                    //     title  : 'event2',
                    //     start  : '2020-01-05',
                    //     end    : '2020-01-07',
                    // },
                    // {
                    //     title  : 'event3',
                    //     start  : '2020-01-09T12:30:00',
                    //     allDay : false,
                    // },

                ],
                config: {
                        locale: 'ko',
                        defaultView:'month'
                        
                },
      
    }
  },
  methods:{
    dayClick(args){
        alert(args)
   
    }
  },
  mounted(){
      this.$store.state.currpage = this.$route.path
  }
}
</script>

<style scoped>
.calendar{
  width: 80%;
  margin: auto;
}

</style>