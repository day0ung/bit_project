<template>
  <div class="employment">
<<<<<<< HEAD
      <empDepth02></empDepth02>
      <ul class="e_list clfix">
        <li></li>
      </ul>
=======
      <h1>{{ this.$store.getters.pageName }}</h1>
>>>>>>> 217ff95e4732f7420424bd477807df228ac8b37a
  </div>
</template>

<script>
<<<<<<< HEAD
import empDepth02 from '@/components/include/depth02.vue'
import empCSS from '@/assets/css/employment/employment.css'

export default {
    name: 'employment',
    components: {
      empDepth02,
      
    }
=======
export default {
  mounted(){
    this.$store.state.currpage = window.location.href
  }
>>>>>>> 217ff95e4732f7420424bd477807df228ac8b37a
}
</script>

<style>

</style>