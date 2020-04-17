<template>
  <div class="detail3">
      <br>
      <br>
      <div class="calendar">

      <full-calendar :event-sources="eventSources" :config="config" @day-click="dayClick"></full-calendar>

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
      eventSources: [],
      config: {
              locale: 'ko',
              defaultView:'month'
      },
      
    }
  },
  methods:{
    dayClick(args){
        alert(args)
   
    },
    events(start, end, timezone, callback){

          var params = new URLSearchParams()	
          var groupSeq = 1
          params.append('groupSeq', groupSeq)
          axios.post("http://localhost:9000/getGroupSchedule", params)
          .then(res => {
            alert(res.data)
            this.eventSources = res.data
          })
      }
  },
  mounted(){
      this.$store.state.currpage = this.$route.path;
      this.events();
      

  }
}
</script>

<style scoped>
.calendar{
  width: 80%;
  margin: auto;
}

</style>