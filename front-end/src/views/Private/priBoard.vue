<template>
  <div>
      <Board v-if="this.$store.state.s_private.list">    
      </Board>
      <Write v-if="this.$store.state.s_private.write"
      @upload="uploadData">
      </Write>
      <Detail v-if="this.$store.state.s_private.detail">
      </Detail>
  </div>
</template>

<script>
import Write from '@/views/Private/Board/WriteBoard.vue'
import Board from '@/views/Private/Board/BoardList.vue'
import Detail from '@/views/Private/Board/DetailBoard.vue'
export default {
    components:{
      Board, Write,Detail
    },
    data(){
        return{
     
            tableData:[]
        }
    }, 
    methods:{
      getBoard(){
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         axios.post('http://localhost:9000/getMemberBoard', params)
         .then(res => {
            this.store.state.s_private.BoardData= res.data
            //alert(this.$store.state.s_private.BoardData)
           }) 
       },
       uploadData(){
         this.getBoard()
       }

    },
    mounted(){
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         axios.post('http://localhost:9000/getMemberBoard', params)
         .then(res => {
            this.$store.state.s_private.BoardData = res.data
           }) 
    },
}
</script>

<style>

</style>