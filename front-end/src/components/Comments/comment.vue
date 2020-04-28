<template>
  <div>
    <el-table
        v-loading="this.$store.state.s_group.showBoardList"
        :row-class-name="clickableRows"
        :data="this.$store.state.s_group.groupBoardDetailComments"
        stripe
        style="width: 100% cursor:pointer"
        @row-click="gotoClick">

        <el-table-column
          prop="memberId"
          label="작성자"
          width="150px">
        </el-table-column>
        <el-table-column align="center"
          prop="content"
          label="댓글"
          width="500px">
        </el-table-column>
        <el-table-column
          prop="writeDate"
          label="작성일"
          width="170px">
        </el-table-column>
        <el-table-column
          prop="title"
          label="수정"
          width="50px">
        </el-table-column>
        <el-table-column
          prop="title"
          label="삭제"
          width="50px">
        </el-table-column>
        <el-table-column
          prop="readCount"
          label="신고"
          width="50px">
        </el-table-column>


    </el-table>
    <div class="commentInput">
      <el-input style="width:80%"
        type="textarea"
        :autosize="{ minRows: 2, maxRows: 4}"
        placeholder="Please input"
        v-model="content">
      </el-input>
      <el-button @click="insertComment">댓글 달기</el-button>
    </div>
  </div>
</template>

<script>
export default {
name: 'Comment',
 data() {
    return {
      boardSeq:'',
      loginSeq:'',
      content: '',
    }
  },
  methods:{
    insertComment(){

      alert("id:"+this.loginSeq + "/ boardSeq:"+ this.boardSeq +"/ content: "+this.content)
      var params = new URLSearchParams();	// post 방식으로 받아야함.
      params.append('memberSeq', this.loginSeq);
      params.append('boardSeq', this.boardSeq);
      params.append('content', this.content);
      axios.post("http://localhost:9000/insertComment", params)
              .then(res => {
                alert("답글달기")
                
      })
    }
  },
  created(){
    this.loginSeq = this.$store.state.loginUser.memberSeq
    this.boardSeq = this.$store.state.s_group.groupBoardDetail.boardSeq
  }
}
</script>

<style>

</style>