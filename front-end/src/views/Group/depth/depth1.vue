<template>
  <div class="depth1">
      <br>
      <h2>{{ groupOne.name }}</h2>
      <br>
      <h5>{{ groupOne.name }}</h5>
      <p>{{ groupOne.maxMember }}</p>
      <p>{{ groupOne.startDate }}</p>
      <p>{{ groupOne.endDate }}</p>
      <p>{{ groupOne.info }}</p>
  </div>
</template>

<script>
export default {
  data(){
    return{
      groupInfoSeq: "",
      groupOne: []
    }
  },
  methods:{
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