<template>
  <div class="depth2">
      <h1>depth2</h1>
      <div>{{groupOne.groupName}}</div>
  </div>
</template>

<script>
export default {
    data(){
        return{
            groupOne: []
        }
    },
    mounted(){
    this.groupInfoSeq = this.$route.params.contentId
    var params = new URLSearchParams();	// post 방식으로 받아야함.
    params.append('groupInfoSeq', this.groupInfoSeq);
    axios.post("http://localhost:9000/getOneGroup", params)
                .then(res => {
            this.groupOne = res.data
          })
    }
}
</script>

<style>

</style>