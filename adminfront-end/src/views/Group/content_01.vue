<template>
    <div class="content01_view">
        <h1> {{title}} group 11111111111111111111111111111111111111111111111111111111111111</h1>
    </div>
</template>

<script>
export default {
    data(){
        return {
            title:'group1'
        }
    },
methods:{
    searchBigSeq(seq){
      //alert(seq)
    //   var params = new URLSearchParams();	// post 방식으로 받아야함.
    //   params.append('interBigSeq', seq);
      axios.post("http://localhost:9000/AdmingetAllGroup")
              .then(res => {
          this.list = res.data
        })
    }
  }


}
</script>

<style>

</style>