<template>
  <div>
      <h1>전체 할일 {{todoList.length}}/ 완료된 할일:{{countDone}} / 남은 할일:{{todoList.length - countDone}} </h1>
     <ListShow
      :list="todoList"
      @del="listDel"
      @done="listDone"
      @edit="listEdit">
      </ListShow> 
      <el-button @click="showAdd"><i class="el-icon-plus"></i> 할일을 추가하세요</el-button>
      <ListAdd v-if="add"
      @listAdd="listAppend"
      @cancle="offAdd">
      </ListAdd>
  </div>
</template>

<script>
import ListAdd from '@/views/Private/TodoAdd.vue'
import ListShow from "@/views/Private/TodoShow.vue";
export default {
    components:{
      ListAdd,ListShow
    },
    data(){
      return{
        add: false,
        todoList:[]
      }
    },
    mounted(){
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         axios.post('http://localhost:9000/selectTodoList', params)
          .then(res => {
              /* this.$store.state.s_private.todoList = res.data
              this.todoList = this.$store.state.s_private.todoList */
              this.todoList = res.data
         }) 
    },
    computed:{
      countDone(){
          let count = 0
          this.todoList.forEach(list =>{
            if(list.del === '1') count++
          })
          return count
      }
    },
    methods:{
      showAdd(){
        this.add = true
      },
       offAdd(){
         this.add = false
       },
       listAppend(title){
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq //addTodoList
        
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         params.append('title', title)
         axios.post('http://localhost:9000/selectOneList', params)
          .then(res => {
              var datas = res.data
              console.log(datas)
              this.todoList.push({todoSeq: datas.todoSeq, title:datas.title, todoDate: datas.todoDate, del: datas.del})
              this.add = false
         }) 
       },
       listDel(){
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         axios.post('http://localhost:9000/selectTodoList', params)
          .then(res => {
            /*   this.$store.state.s_private.todoList = res.data
              this.todoList = this.$store.state.s_private.todoList */
              this.todoList = res.data
         }) 
       },
       listDone(){
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         axios.post('http://localhost:9000/selectTodoList', params)
          .then(res => {
              this.todoList = res.data
         }) 
       },
       listEdit(){
        var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         axios.post('http://localhost:9000/selectTodoList', params)
          .then(res => {
              this.todoList = res.data
         }) 
       }
    }
}
</script>

<style>

</style>