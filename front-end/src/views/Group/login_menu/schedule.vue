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
      events: [{
            title  : 'event1',
            start  : '2020-04-03',
            color : '#cecece'
        }
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
   
    },
      
  },
  mounted(){
      
          var params = new URLSearchParams()	
          var groupSeq = 1
          params.append('groupInfoSeq', groupSeq)
          axios.post("http://localhost:9000/getGroupSchedule", params)
          .then(res => {
            console.log(res.data.length)
            
            res.data.forEach(element => {
            //alert( JSON.stringify(res.data[0].title) )
             this.events[0].title = res.data[0].title
             this.events[0].start = res.data[0].startDate
             this.events[0].end = res.data[0].endDate 
            });
            
             
          })

      

  }
}
</script>

<style scoped>
.calendar{
  width: 80%;
  margin: auto;
}

</style>