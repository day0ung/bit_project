<template>
  <div>
    <div class="commentsList"  v-loading="this.$store.state.s_group.showBoardDetailComments">
      <ul>
        <li v-for="(comment, index) in this.$store.state.s_group.groupBoardDetailComments" :key="comment.boardCommentSeq">
          <div class="report"><a href="">신고</a></div>  
          <div class="memberId">{{comment.memberId}}</div>  
          <div class="writeDate">{{comment.writeDate}}</div>
          <div v-if="comment.boardCommentSeq==clicked">
            <div class="answerLink" v-show="isShow == true">
              <p @click="answerCancle(comment.boardCommentSeq)">답글 취소</p>
              <el-input class="answerContent input-with-select" v-model="subContent" placeholder="수정사항을 작성해주세요." @input="editVal">
              <el-button size="mini" slot="append" @click="addCoComment(comment.boardCommentSeq)">등록</el-button></el-input>
            </div>
             <div v-show="isShow == false">
              <div class="answerLink"><p @click="answer(comment.boardCommentSeq)" >답글</p></div>
            </div>
          </div>
          <div v-else-if="index != clicked">
              <div class="answerLink"><p @click="answer(comment.boardCommentSeq)">답글</p></div>
          </div> 
          <div class="content">{{comment.content}}</div>
          
          <div class="dotline"></div>
        </li>

      </ul>
    </div>

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
import { loading } from 'element-ui';

export default {
name: 'Comment',
 data() {
    return {
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
      this.isShow = true
      this.clicked = boardCommentSeq
      //alert(boardCommentSeq)

    },
    answerCancle(boardCommentSeq){
      this.isShow = false
      this.clicked = boardCommentSeq
      //alert(boardCommentSeq)
    },
    addCoComment(boardCommentSeq){
      alert(boardCommentSeq+"/"+this.subContent)
    }

   
  },
  created(){
    this.loginSeq = this.$store.state.loginUser.memberSeq
    this.boardSeq = this.$store.state.s_group.groupBoardDetail.boardSeq
    
  }
}
</script>

<style scoped>
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
  margin: 20px;
  margin-bottom: 20px;
  z-index: 2;
}

.dotline{
  height: 1px;
    padding: 0px;
    overflow: hidden;
    font: 0/0 arial;
    border-bottom-width: 1px;
    border-bottom-style: dotted;
    margin-bottom: 20px;
}
.report{
  float: right;
  margin-bottom: 20px;
  margin-right: 20px;
  font-size: 12px
}

.answerLink{
  cursor: pointer;
  margin-right: 20px;
}

.answerContent{
  width:80%;
  margin-left: 20px;
  margin-top:10px;
}

</style>