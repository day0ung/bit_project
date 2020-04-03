<template>
  <div class="detail4">
      <br>
      <h5>detail4</h5>
      <br>
      <h6>{{ this.$store.state.s_subStore.data }}</h6>
  </div>
</template>

<script>
export default {
  mounted(){
    this.$store.state.currpage = window.location.href
  }
}
</script>

<style>

</style>