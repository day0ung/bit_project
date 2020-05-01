<template>
  <div>
       <el-button type="plain" style="float: right; margin-right: 20px" round @click="writeBoard">글 쓰기</el-button>
       <el-table 
          :data="this.$store.state.s_private.BoardData"
          stripe
          style="width: 100%; cursor:pointer"
          @row-click="gotoClick"
        >
        <el-table-column
          prop="rowNum"
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
       gotoClick(row, column, event){
         var loginData = sessionStorage.getItem("loginUser");
         var login = JSON.parse(loginData); 
         var memSeq = login.memberSeq 
         //alert(row.boardSeq)
         //게시판
         axios.get("http://localhost:9000/detailLibarary",{ params:{ boardSeq: row.boardSeq} }  )
              .then(res => {
                this.$store.state.s_private.boardDetail = res.data
                //alert("게시판"+JSON.stringify(this.$store.state.s_private.boardDetail))
              })

          //파일
          var params = new URLSearchParams()
          params.append('memberSeq', memSeq)
          params.append('boardSeq', row.boardSeq);
          axios.post("http://localhost:9000/detailFile", params)
              .then(res => {
                this.$store.state.s_private.fileDetail = res.data
                //alert("파일"+JSON.stringify(this.$store.state.s_private.fileDetail))
              })

       }
    },
    mounted(){
      this
    }
}
</script>

<style>

</style>