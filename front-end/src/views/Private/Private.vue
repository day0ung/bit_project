<template>
  <div class="private">
   <el-tabs v-model="activeName" @tab-click="handleClick">
    <el-tab-pane label="To Do List" name="first">
      <Todo></Todo>
    </el-tab-pane>
    <el-tab-pane label="나의 일정" name="second"> 
      <Schedule></Schedule>
    </el-tab-pane>
    <el-tab-pane label="자료실" name="third">
      <Board></Board>
    </el-tab-pane>
  </el-tabs>
  </div>
</template>


<style scoped>
  .private{
    padding-top: 10px;
    min-height: 100vh;
  }
</style>

<script>
import Schedule from '@/views/Private/priSchedule.vue'
import Board from '@/views/Private/priBoard.vue'
import Todo from '@/views/Private/priTodo.vue'
 export default {
    components:{
        Schedule,
        Board,
        Todo
    },
    data() {
      return {
        activeName: 'first'
      };
    },
    methods: {
      handleClick(tab, event) {
        console.log(tab, event);
      }
    }
  };
</script>