<template>
  <div class="Group">
      <br>
      <h1 id="classs">{{ this.$store.getters.pageName }}</h1>
      <br>
      <router-link to="/group/detail1">detail1</router-link> |
      <router-link to="/group/detail2">detail2</router-link> |
      <router-link to="/group/detail3">detail3</router-link> |
      <router-link to="/group/detail4">detail4</router-link>
      <br>
      <router-view></router-view>
  </div>
</template>

<script>

export default {
  mounted(){
    this.$store.state.currpage = this.$route.path
  }
}
</script>

<style scope>

</style>