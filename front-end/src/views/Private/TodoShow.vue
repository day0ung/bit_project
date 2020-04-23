<template>
  <div>
      <h1>리스트 보여주는 곳</h1>
    <el-card shadow="hover" v-for="(task, index) in list" :key="index"><!-- this.$store.state.s_private.todoList -->
      <p>{{index}}</p>
      <p>{{task.title}}</p>
      <p v-if="task.del == 0">{{task.del}}</p>
      <el-button @click="del(task.todoSeq)">삭제버튼</el-button>
      <el-button @click="delCom(task.todoSeq)">완료버튼</el-button>
      <el-button @click="edit(task.todoSeq)">수정버튼</el-button>
    </el-card>
 
  </div>
</template>

<script>
export default {
    props:["list"], 
    data(){
      return{

      }
    },
    methods:{
        del(todoSeq){
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq //addTodoList
        
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         params.append('todoSeq', todoSeq)
         axios.post('http://localhost:9000/todoDel', params)
          .then(res => {
            this.$emit('del')
         }) 
       },
       done(todoSeq){

       },
       edit(todoSeq){

       }
    }
}
</script>

<style>

</style>