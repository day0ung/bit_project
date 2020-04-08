<template>
  <div class="detail2">
    <h3>그룹게시판</h3>
    <br>
    <br>
    <div class="li_table">
      <ul class="subject">
        <li class="col">글번호</li>
        <li>글제목</li>
        <li>작성자</li>
      </ul>
      <ul v-for="(one, index) in boardList" :key="one.boardSeq">
        <li class="col">{{index + 1}}</li>
        <li @click="gotoDetail(one.boardSeq)">{{one.title}}</li>
        <li>{{one.memberSeq}}</li>
      </ul>
    </div>

    <el-table
      :data="tableData"
      stripe
      style="width: 100%"
      row-click="gotoClick"
      >
      <el-table-column
        prop="boardSeq"
        label="글번호"
        width="200px">
      </el-table-column>
      <el-table-column
        prop="title"
        label="글제목"
        width="500px"
        >
      </el-table-column>
      <el-table-column
        prop="memberSeq"
        label="작성자"
        >
      </el-table-column>
      <el-table-column
        prop="readCount"
        label="조회수"
        >
      </el-table-column>
      <el-table-column
        prop="writeDate"
        label="작성일"
        >
      </el-table-column>
    </el-table>
  </div>
</template>

<script scoped>
import 'element-ui/lib/theme-chalk/index.css';

export default {
  data(){
    return{
      boardList: [],
      tableData: []
    }
  },
  methods:{
    gotoClick(){
      alert("확인")
    },
    gotoDetail(seq){
      this.$router.push({
        path : "/group/detail2/depth2/" + seq
      })
    }
  },
  mounted(){
      this.$store.state.currpage = this.$route.path
      axios.get("http://localhost:9000/groupBoardList")
                .then(res => {
            this.boardList = res.data
            this.tableData = res.data
          })
  }
}
</script>

<style scoped>
.hr{
  margin: auto;
  margin-top: 5px;
  margin-bottom: 5px;
  background: #9e9e9e;
  height: 1px;
  width: 90%;
}
.li_table {width: 700px; margin: auto;}
.li_table ul {clear: left;margin: 0;padding: 0;list-style-type: none;} 
/* list-style-type 블릿표시 padding: 0; 들여쓰기*/
.li_table .subject {font-weight: bold;text-align: center;}
.li_table ul li {text-align: center;float: left;margin: 0;padding: 2px, 1px;width: 40%;height: 35px;}
.li_table ul .col {width: 15%;} /* 표 라인 맞추기기 위해*/
</style>
