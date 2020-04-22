<template>
  <div>
      <h1>리스트 보여주는 곳</h1>
    <el-card shadow="hover" v-for="(task, index) in list" :key="index">
      <p>{{index}}</p>
      <p>{{task.title}}</p>
<!--       <p v-if="task.del == 1">{{task.del}}</p> -->
      <p v-if="task.del == 0">{{task.del}}</p>
      <el-button>삭제버튼</el-button>
      <el-button>완료버튼</el-button>
      <el-button>취소버튼</el-button>
    </el-card>
 
  </div>
</template>

<script>
export default {
    props:["list"], 
}
</script>

<style>

</style>