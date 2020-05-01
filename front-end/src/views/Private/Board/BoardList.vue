<template>
  <div>
       <el-button type="plain" style="float: right; margin-right: 20px" round @click="writeBoard">글 쓰기</el-button>
       <el-table 
          :data="this.$store.state.s_private.BoardData"
          stripe
          style="width: 100% cursor:pointer"
        >
        <el-table-column
          prop="rownum"
          label="글번호"
          >
        </el-table-column>
        <el-table-column
          prop="title"
          label="글제목"
          >
        </el-table-column>
        <!-- <el-table-column
          prop="memberDto.memberName"
          label="작성자"
          width="150px"
          >
        </el-table-column> -->
        <el-table-column
          prop="writeDate"
          label="작성일"
          >
        </el-table-column>
      </el-table>
  </div>
</template>

<script>
export default {
    data(){
        return{
            
        }
    },
    methods:{
       writeBoard(){
        this.$store.state.s_private.list = false
        this.$store.state.s_private.write = true
       },
       getMemberBoard(){
        var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq
         var params = new URLSearchParams();
         params.append('memberSeq', memSeq)
         axios.post('http://localhost:9000/getMemberBoard', params)
         .then(res => {
            this.$store.state.s_private.BoardData = res.data
           }) 
       }
    },
    mounted(){
        this.getMemberBoard()
    }
}
</script>

<style>

</style>