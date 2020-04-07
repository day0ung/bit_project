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
  </div>
</template>

<script>
export default {
  data(){
    return{
      boardList: []
    }
  },
  methods:{
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
          })
  }
}
</script>

<style scoped>
  .li_table {width: 700px; margin: auto;}
  .li_table ul {clear: left;margin: 0;padding: 0;list-style-type: none;} 
  /* list-style-type 블릿표시 padding: 0; 들여쓰기*/
  .li_table .subject {font-weight: bold;text-align: center;}
  .li_table ul li {text-align: center;float: left;margin: 0;padding: 2px, 1px;width: 40%;}
  .li_table ul .col {width: 15%;} /* 표 라인 맞추기기 위해*/
</style>
