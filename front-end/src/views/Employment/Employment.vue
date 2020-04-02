<template>
  <div class="employment">
      <empDepth02></empDepth02>
      <ul class="e_list clfix">
        <li></li>
      </ul>
  </div>
</template>

<script>
import empDepth02 from '@/components/include/depth02.vue'
import empCSS from '@/assets/css/employment/employment.css'

export default {
    name: 'employment',
    components: {
      empDepth02,
      
    }
}
</script>

<style>

</style>