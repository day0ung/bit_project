<template>
  <div class="Group">
      <h1>{{ this.$store.getters.pageName }}</h1>
      <h2>{{ this.$store.state.subStore.data }}</h2>
      <subnav></subnav>

  </div>
</template>

<script>
<<<<<<< HEAD
import empDepth02 from '@/components/include/depth02.vue'
=======
import subnav from '@/views/Group/subnav.vue'

>>>>>>> 217ff95e4732f7420424bd477807df228ac8b37a
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