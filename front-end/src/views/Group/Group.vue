<template>
  <div class="Group">
      <h1>{{ this.$store.getters.pageName }}</h1>
      <h2>{{ this.$store.state.subStore.data }}</h2>
      <subnav></subnav>

  </div>
</template>

<script>
import subnav from '@/views/Group/subnav.vue'

export default {
  components: {
    subnav,
  },
  methods:{

  },
  mounted(){
    this.$store.state.currpage = window.location.href
  }
}
</script>

<style scope>

</style>