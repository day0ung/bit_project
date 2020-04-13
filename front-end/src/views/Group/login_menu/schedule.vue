<template>
  <div class="detail3">
      <br>
      <br>
      <div class="calendar">
      <el-calendar v-model="date">
      </el-calendar>
      </div>
  </div>
</template>

<script>
import 'element-ui/lib/theme-chalk/index.css';
export default {
  data(){
    return{
      memberlist: this.$store.state.s_subStore.data,
      date: "",
    }
  },
  mounted(){
      this.$store.state.currpage = this.$route.path
  }
}
</script>

<style scoped>
.calendar{
  width: 80%;
  margin: auto;
}

</style>