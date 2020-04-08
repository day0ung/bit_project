<template>
  <div class="depth2">
      <div>{{boardOne}}</div>
      <div>{{boardOne.title}}</div>
      <div>{{boardOne.content}}</div>
  </div>
</template>

<script>
export default {
    data(){
        return{
            boardOne: [],
            boardSeq: ""
        }
    },
    mounted(){
    this.boardSeq = this.$route.params.contentId
    var params = new URLSearchParams();	// post 방식으로 받아야함.
    params.append('boardSeq', this.boardSeq);
    axios.post("http://localhost:9000/groupBoardOne", params)
                .then(res => {
            this.boardOne = res.data
          })
    }
}
</script>

<style>

</style>