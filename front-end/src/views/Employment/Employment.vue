<template>
  <div class="employment">

      <h1>{{ this.$store.getters.pageName }}</h1>

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