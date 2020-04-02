<template>

    <div class="detail2">
        <h1>{{ this.$store.getters.pageName }}</h1>
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