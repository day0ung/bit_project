<template>
  <div>
      <h1>TODO LIST </h1>
      <ListShow
      :todoList="list">
      </ListShow>
      <el-button @click="showAdd(add = true)"><i class="el-icon-plus"></i> 할일을 추가하세요</el-button>
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
    methods:{
       offAdd(){
         this.add = false
       },
       listAppend(list){
         this.todoList.push({list: list, status: 'created'})
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.membeSeq
         
       }

    }
}
</script>

<style>

</style>