<template>
  <div>
      <h1>TODO LIST </h1>
       <!-- <el-card shadow="hover" v-for="(task, index) in this.$store.state.s_private.todoList" :key="index">
      <p>{{index}}</p>
      <p>{{task.title}}</p>
      <p v-if="task.del == 0">{{task.del}}</p>
      <el-button @click="del(task.todoSeq)">삭제버튼</el-button>
      <el-button @click="delCom(task.todoSeq)">완료버튼</el-button>
      <el-button @click="edit(task.todoSeq)">수정버튼</el-button>
    </el-card> -->
     <ListShow
      :list="todoList"
      @del="delCom">
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
              this.$store.state.s_private.todoList = res.data
              this.todoList = this.$store.state.s_private.todoList
         }) 
    },
    computed:{
      delCom(todoSeq){
         alert(JSON.stringify(todoSeq)) 
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq //addTodoList
        
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         params.append('todoSeq', todoSeq)
         axios.post('http://localhost:9000/todoDel', params)
          .then(res => {
            alert(res.data)
            this.todoList = this.$store.state.s_private.todoList
         })
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
       delCom(){
         
       }
    }
}
</script>

<style>

</style>