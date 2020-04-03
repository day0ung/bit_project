<template>
  <div class="detail2">
      <br>
      <h5>detail2</h5>
      <br>
      <h6>{{ this.$store.state.s_subStore.data }}</h6>
  </div>
</template>

<script>
export default {
  mounted(){
      this.$store.state.currpage = this.$route.path
  }
}
</script>

<style>

</style>