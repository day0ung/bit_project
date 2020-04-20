<template>
  <div>
      <h1>interesting</h1>
      <h3>{{myinfo}}</h3>
      <p>관심지역</p>
      <p>{{myinfo.interArea}}</p>
      <p>관심분야</p>
      <h2>{{myinfo.interBigDtos}}</h2>
      <p>{{myinfo.interBigDtos.interSmallDtos}}</p>
     <!--  <h2 v-for="myinfo.interBigDtos"></h2> -->
  </div>
</template>

<script>
export default {
    data(){
      return{
          myinfo: [],
          myBig: '',

      }
    },
     mounted(){
		 var params = new URLSearchParams();
		 params.append('memberSeq', this.$route.params.seq)
		 axios.post('http://localhost:9000/selectMember', params)
		 .then(res => {
				this.myinfo = res.data
		 }) 
	},   
}
</script>

<style>

</style>