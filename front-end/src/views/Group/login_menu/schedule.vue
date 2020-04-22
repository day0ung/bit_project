<template>
  <div class="detail3">
      <br>
      <br>
      <div class="calendar">

      <full-calendar :events="events" :config="config" @day-click="dayClick" @event-selected="eventSelected"></full-calendar>
      <Modal v-if="showModal" @close="showModal = false"></Modal>
      </div>
  </div>
</template>

<script>
import 'element-ui/lib/theme-chalk/index.css';
import 'fullcalendar/dist/fullcalendar.css'
import 'fullcalendar/dist/locale/ko'
import { FullCalendar } from 'vue-full-calendar'
import Modal from '@/views/Group/login_menu/insertCalendar.vue'

export default {
  name: 'GroupSchedule',
  data(){
    return{
      showModal: false,
      //memberlist: this.$store.state.s_subStore.data,
      events: [],
      config: {
              locale: 'ko',
              defaultView:'month'
      },
      
    }
  },
  components:{
        Modal
  },
  methods:{
    eventSelected(event, jsEvent, view){
        alert(event.title + "/"+ event.start +" / " + event.content)
    },
    dayClick(args){
        if(confirm("일정추가?")){
          this.showModal = true
          alert(args)
        }
    }
  },
    created(){
        let params = new URLSearchParams()	
          let groupSeq = this.$store.state.s_group.groupSeq
          params.append('groupInfoSeq', groupSeq)
          axios.post("http://localhost:9000/getGroupSchedule", params)
          .then(res => {
            console.log(JSON.stringify(res.data))
            let e = (JSON.stringify(res.data))
            this.$store.state.s_group.groupCalendar = JSON.parse(e)
            this.events=this.$store.state.s_group.groupCalendar
          })  
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

</style>