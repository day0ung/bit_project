<template>
  <div class="about">
    <p>>{{ this.$store.getters.pageName }}</p>
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