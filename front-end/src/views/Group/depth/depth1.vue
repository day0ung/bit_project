<template>
  <div class="depth1">
      <br>
      <h5>depth1</h5>
      <br>
      <h5>{{ groupInfoSeq }}</h5>
  </div>
</template>

<script>
export default {
  data(){
    return{
      groupInfoSeq: this.$route.params.contentId,
      list: []
    }
  },
  mounted(){
    this.list = this.$store.state.s_group.groupList
  }
}
</script>

<style>

</style>