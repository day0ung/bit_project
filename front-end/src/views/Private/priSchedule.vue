<template>
  <div>
      <full-calendar :events="this.$store.state.s_group.groupCalendar" :config="config" 
                      @day-click="dayClick" @event-selected="eventSelected" @event-drop="eventDrop"
                      v-loading="this.$store.state.s_group.showGroupCalendar"
                      ></full-calendar>
  </div>
</template>

<script>
import 'fullcalendar/dist/fullcalendar.css'
import 'fullcalendar/dist/locale/ko'
import { FullCalendar } from 'vue-full-calendar'
export default {
    data(){
      return{
      config: {
          locale: 'ko',
          defaultView:'month',
      },
      clickDay:'',

      }
    },
    eventSelected(event, jsEvent, view){
      alert('')
    },
    dayClick(date, jsEvent, view){
    },
    eventDrop(event){
    }
  
}
</script>

<style>

</style>