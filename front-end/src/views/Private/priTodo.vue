<template>
  <div>
 
      <el-button type="text" @click="allSelect">전체 TODO LIST: {{todoList.length}} </el-button>
      <el-button type="text" @click="doneSelect">완료된 할일: {{countDone}} </el-button>
      <el-button type="text" @click="remainSelect">남은 할일: {{todoList.length - countDone}} </el-button>
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
        add: false, //추가하는곳 보여주기
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
              this.todoList = res.data
         }) 
    },
    computed:{
      countDone(){
          let count = 0
          this.todoList.forEach(list =>{
            console.log(list.del)
            if(list.del == '1') count++
            console.log(count)
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
       },
       //전체 보기로 
       allSelect(){
        
       },
       //완료된 할일 보여주는 곳
       doneSelect(){

       },
       //남은 할일 보여주는 곳
       remainSelect(){

       }
    }
}
</script>

<style>

</style>