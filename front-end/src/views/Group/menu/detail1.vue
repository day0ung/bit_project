<template>
  <div class="detail1 clfix">
      <br>
      <h5>detail1</h5>
      <br>
      <table border="1">
        <tr v-for="member in memberlist" :key="member.id">
          <td>{{ member.id }}</td>
          <td>{{ member.name }}</td>
        </tr>
      </table>
  </div>
</template>

<script>
export default {
  data(){
    return{
      memberlist: this.$store.state.subStore.data
    }
  },
  mounted(){
      this.$store.state.currpage = window.location.href
  }
}
</script>

<style>

</style>