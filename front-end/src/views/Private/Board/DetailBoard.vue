
<template>
  <div class="boardDetail">
    <br>

      <div class="hr"></div>
      <div class="groupdetailInfo">
         <div><span>파일정보</span>{{ this.$store.state.s_group.groupReferenceDetail.content }}</div>
        <div><span>작성자</span> {{ this.$store.state.s_group.groupReferenceDetail.memberSeq }}</div>
        <div><span>작성일</span> {{ this.$store.state.s_group.groupReferenceDetail.writeDate }}</div>
        <div><span>조회수</span> {{ this.$store.state.s_group.groupReferenceDetail.readCount }}</div>
      </div>
      <div class="groupInfoTitle">
        <h5>자료</h5>
      </div>
      <div class="groupInfoContent">
        <a v-for="file in this.$store.state.s_private.fileDetail " :key="file.boardSeq" :href="file.url" download>{{file.fileName}}</a>
      </div>
      <div class="hr"></div>
      <div class="groupInfoContent" v-html="this.$store.state.s_group.groupBoardDetail.content"></div>
      <div class="hr"></div>
      
      <div class="groupName">
        <el-button type="primary" @click="showList" round>돌아가기</el-button>
        <el-button type="primary"  @click="boardOneUpdate" round>수정하기</el-button>
        <el-button type="primary"  @click="boardOneDelete" round>삭제하기</el-button>
      </div>
  </div>
</template>

<script>
export default {
  data(){
    return{
        boardOne: "",
        boardSeq: ""
      }
  },
  methods:{

  }

}
</script>

<style scoped>

.group_detail{
    width: 950px;
    margin: auto;
}

.groupDetailcCntainer {
    position: relative;
    margin: auto;
    overflow: hidden;
    height: auto;
   
}

.groupImage img{
    display: table;
    margin: auto;
    height: 250px;
}

.groupName{
    text-align: center;
    padding: 10px;
}
.groupInfoTitle{
    float: left;
    padding: 60px 0px 0px 100px;
}
.groupInfoTitle > h5 > span{
    color: #727272;
}
.groupdetailInfo{
    padding: 0px 10px 0px 100px;
    width: 600px;
    text-align: initial;
}
.groupdetailInfo > div{
    float: left;
    margin: 14px 0px;
    margin-right: 50px;
    line-height: 24px;
}
.groupdetailInfo > div > span{
    margin-right: 10px;
    color: #727272;
}
.groupInfoContent{
    /* float: left; */
    padding: 10px 100px 60px 100px;
    width: auto;
    text-align: initial;
}
.groupInfoContent > div{
    float: left;
    margin: 14px 0px 50px 0px;
    line-height: 24px;
}

.groupInfoContent > div > span{
    margin-right: 10px;
    color: #727272;
}

.hr{
    display: flex;
    margin: auto;
    margin-top: 5px;
    margin-bottom: 5px;
    background: #c1c1c1;
    height: 1px;
    width: 80%;
}

.schedules {
    display: grid;
    color: #4e4e4e;
    grid-template-columns: repeat(auto-fill, 30px);
    grid-gap: 4px;
}
.schedule {
    padding: 8px;
    border: 1px solid #4e4e4e;
    font-size: 0.7em;
    text-align: center;
}
.schedule_check{
    padding: 8px;
    border: 1px solid #4e4e4e;
    font-size: 0.7em;
    text-align: center;
    background: #FF6C00;
    color: #f5f5f5;
    transition: all 0.4s ease-in-out;
}

</style>