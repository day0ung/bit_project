<template>
  <div class="detail3">
      <br>
      <br>
      <div class="calendar">
 <el-date-picker type="date" placeholder="Pick a date" v-model="date1" style="width: 100%;"></el-date-picker>
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
      date1:'',
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
    dayClick(date, jsEvent, view){
        this.$confirm('추가하시겠습니까?', '일정추가', {
          confirmButtonText: 'OK',
          cancelButtonText: 'Cancel',
          type: 'info'
        }).then(() => {
          console.log(date)

          let clickDay = this.$moment(date).format('YYYY-MM-DD')
          alert(clickDay)
          

          this.showModal = true

        }).catch(() => {
          this.$message({
            type: 'info',
            message: 'canceled'
          });          
        });




        
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
.fc-view-container{
height: auto;
}

</style>