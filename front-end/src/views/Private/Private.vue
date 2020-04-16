<template>
  <div class="private">
   <el-tabs v-model="activeName" @tab-click="handleClick">
    <el-tab-pane label="To Do List" name="first">To Do List</el-tab-pane>
    <el-tab-pane label="나의 일정" name="second">나의 일정</el-tab-pane>
    <el-tab-pane label="자료실" name="third">자료실</el-tab-pane>
  </el-tabs>
  </div>
</template>


<style scoped>
  .private{
    padding-top: 10px;
  }
</style>

<script>
 export default {
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