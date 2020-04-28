<template>
  <div class="about">
  </div>
</template>

<script>
export default {
  data(){
    return{

    }
  },

  mounted(){
    this.$store.state.currpage = this.$route.path
  }
}
</script>

<style>
.about{
  height: 100vh;
}
</style>