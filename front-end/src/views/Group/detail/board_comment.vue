<template>
  <div>
    <div class="commentsList"  v-loading="this.$store.state.s_group.showBoardDetailComments">
      <ul>
        <li v-for="(comment, index) in this.$store.state.s_group.groupBoardDetailComments" :key="comment.boardCommentSeq">
          <div class="report">
            <div v-if="loginSeq == comment.memberSeq">
              <span @click="answerUpdate(comment.boardCommentSeq, comment.content)">수정</span>
              <span @click="answerDelete(comment.boardCommentSeq)" style="margin: 0px 10px">삭제</span>
            </div>
            <div v-else>
              <span @click="answerReport(comment.boardCommentSeq)">신고</span>
            </div>
          </div>  
          <div class="memberId">{{comment.memberId}}</div>  
          <div class="writeDate">{{comment.writeDate}}</div>
          <div v-if="comment.boardCommentSeq==clicked">
            <div v-show="isShow == 1">
              <span class="miniAnswer" @click="answerCancle(comment.boardCommentSeq)">답글 취소</span>
              <div class="content">{{comment.content}}</div>
              <el-input class="answerContent input-with-select" size="medium"
                        v-model="subContent" placeholder="댓글을 작성해주세요.">
              <el-button size="mini" slot="append" @click="answerInsert(comment.boardCommentSeq)">등록</el-button></el-input>
            </div>
            <div v-show="isShow == 2">
              <span class="miniAnswer" @click="answerCancle(comment.boardCommentSeq)">답글</span>
              <div class="content">
                <el-input size="medium" v-model="answertxt" :value="comment.content" style="width:80%">
                <el-button size="medium" slot="append" @click="realAnswerUpdate()">수정</el-button>
                </el-input>
              </div>
            </div>
            <div v-show="isShow == false">
              <span class="miniAnswer" @click="answer(comment.boardCommentSeq)" >답글</span>
              <div class="content">{{comment.content}}</div>
            </div>
          </div>
          <div v-else-if="index != clicked">
              <span class="miniAnswer" @click="answer(comment.boardCommentSeq)">답글</span>
              <div class="content">{{comment.content}}</div>
          </div> 
          
          <div class="dotline"></div>
        </li>

      </ul>
    <div class="commentInput">
      <el-input style="width:80%"
        type="textarea"
        :autosize="{ minRows: 2, maxRows: 4}"
        placeholder="댓글을 작성해주세요."
        v-model="content">
      </el-input>
      <el-button @click="insertComment" style="margin:10px">댓글 달기</el-button>
    </div>
    </div>

  </div>
</template>

<script>
import { loading } from 'element-ui';

export default {
name: 'Comment',
 data() {
    return {
      answertxt:'',
      updateStatus:0,
      clicked:-1,
      isShow:false,
      boardSeq:'',
      loginSeq:'',
      content: '',
      subContent:'',
    }
  },
  methods:{
    getComments(){
        this.$store.state.s_group.showBoardDetailComments = true
        var params = new URLSearchParams();
        params.append('boardSeq', this.boardSeq);
        axios.post("http://localhost:9000/groupBoardDetailComments", params).then(res => { 
        this.$store.state.s_group.groupBoardDetailComments = res.data
        this.$store.state.s_group.showBoardDetailComments = false
      })
    },
    insertComment(){
      //alert("id:"+this.loginSeq + "/ boardSeq:"+ this.boardSeq +"/ content: "+this.content)
      var params = new URLSearchParams();	// post 방식으로 받아야함.
      params.append('memberSeq', this.loginSeq);
      params.append('boardSeq', this.boardSeq);
      params.append('content', this.content);
      axios.post("http://localhost:9000/insertComment", params)
              .then(res => {
                //alert("답글달기")
                this.content = ""
                this.getComments()
              })
    },
    answer(boardCommentSeq){
      this.subContent=""
      this.isShow = 1
      this.clicked = boardCommentSeq
      //alert(boardCommentSeq)

    },
    answerCancle(boardCommentSeq){
      this.isShow = false
      this.clicked = boardCommentSeq
      //alert(boardCommentSeq)
    },
    answerUpdate(boardCommentSeq, content){
      //alert(boardCommentSeq+"/update")
      this.clicked=boardCommentSeq
      this.answertxt= content
      this.isShow = 2
    },
    answerDelete(boardCommentSeq){
      alert(boardCommentSeq+"/delete")
       var params = new URLSearchParams();
        params.append('boardCommentSeq', boardCommentSeq);
        axios.post("http://localhost:9000/answerDelete", params).then(res => { 
          this.getComments()
      })
    },
    answerReport(boardCommentSeq){
      alert(boardCommentSeq+"/report")
    },
    answerInsert(boardCommentSeq){
      alert(boardCommentSeq+"/"+this.subContent)
      var params = new URLSearchParams();
      params.append('boardCommentSeq', boardCommentSeq);
      params.append('content', this.content);
      axios.post("http://localhost:9000/answerDelete", params).then(res => { 
          this.getComments()
      })
    }

   
  },
  created(){
    this.loginSeq = this.$store.state.loginUser.memberSeq
    this.boardSeq = this.$store.state.s_group.groupBoardDetail.boardSeq
    
  }
}
</script>

<style scoped>
.commentsList{
  background-color: #f7f7f7;
  margin: 30px;
  padding: 30px;
}
.memberId {
  font-weight: bold;
  float: left;
  margin-left: 20px;
}

.writeDate{
width: 100px;
float: left;
 font-size: 10px;
 margin-left: 70px;
 margin-bottom: 10px;
 color: darkgray;
}

.content{
  margin: 20px 20px 0px 20px;
  /* margin-bottom: 20px; */
}

.dotline{
  height: 1px;
  overflow: hidden;
  font: 0/0 arial;
  border-bottom-width: 1px;
  border-bottom-style: dotted;
  margin-top: 20px;
  margin-bottom: 20px;
}
.report{
  float: right;
  margin-bottom: 20px;
  margin-right: 20px;
  font-size: 12px
}

span{
  cursor: pointer;
}

span.miniAnswer {
  padding-left: 10px;
  background: url(https://cafe.pstatic.net/cafe4/bu_arr.png) no-repeat 0 0;
}
.answerContent{
  width:80%;
  margin:10px 0px 0px 40px;
  padding-left: 10px; 
  background: url(https://cafe.pstatic.net/cafe4/ico_comm_re2.gif) 0 13px no-repeat
}

</style>