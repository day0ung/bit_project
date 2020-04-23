<template>
  <div>
      <h4>==============리스트 보여주는 곳==============</h4>
    <el-card shadow="hover" v-for="(task, index) in list" :key="index"><!-- this.$store.state.s_private.todoList -->
      <p>{{index}}</p>
      <p>{{task.title}}</p>
      <p>{{task.todoDate}}</p>
      <p v-if="task.del == 0">{{task.del}}</p>
      <el-button @click="del(task.todoSeq)">삭제버튼</el-button>
      <el-button @click="done(task.todoSeq)">완료버튼</el-button>
      <el-button @click="edit(task.todoSeq, index)" >수정버튼</el-button>
      <div v-if="index == clicked">
        <div v-if="isShow">
          <el-input v-model="editList" placeholder="TODO LIST를 작성해주세요. 예)매일 독서, #공부" @input="editVal"></el-input>
          <el-button type="success" plain @click="editReal(task.todoSeq)" v-model="editBtn" v-if="editBtn">수정</el-button>
          <el-button type="success" plain @click="editReal(task.todoSeq)" v-model="editBtn" disabled v-else>수정</el-button>
        </div>
      </div>
    </el-card>
 
  </div>
</template>

<script>
export default {
    props:["list"], 
    data(){
      return{
        isShow: false, //수정 input 보여주기
        clicked: 0, //수정버튼값과 div값이 같을때
        status: true, //수정버튼 눌렀을때
        editList: '', //수정내용
        editBtn: false //수정버튼 보여주기
      }
    },
    methods:{
        del(todoSeq){
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq 
        
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         params.append('todoSeq', todoSeq)
         axios.post('http://localhost:9000/todoDel', params)
          .then(res => {
            this.$emit("del")
         }) 
       },
       done(todoSeq){
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq 
        
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         params.append('todoSeq', todoSeq)
         axios.post('http://localhost:9000/todoDone', params)
          .then(res => {
            this.$emit("done")
            }) 
       },
       edit(todoSeq, index){
        this.isShow = !this.isShow
        this.clicked = index
       },
       editVal(){
        this.editList == ''? 
        this.editBtn = false
        :this.editBtn = true
       },
       editReal(todoSeq){
         //alert(this.editList)
         //alert(todoSeq) title, memberseq, todoseq
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq 
        
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         params.append('todoSeq', todoSeq)
         params.append('title', this.editList)
         axios.post('http://localhost:9000/todoEdit', params)
          .then(res => {
            this.$emit("edit")
            }) 

       }
    }
}
</script>

<style scoped>

</style>