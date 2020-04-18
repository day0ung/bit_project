<template>
  <div class="boardDetail">
    <br>
    <br>
    <div class="groupDetailcCntainer">
      <div class="groupName">
        <h1>{{ this.$store.state.s_group.groupBoardDetail.title }}</h1>
      </div>
      <div class="hr"></div>
      <div class="groupInfoTitle">
        <h5>스터디 소개</h5>
      </div>
      <div class="groupInfoContent">
        { groupOne.info }}
      </div>
      <div class="hr"></div>
      <div class="groupInfoTitle">
        <h5><span>상세 정보</span></h5>
      </div>
      <div class="groupInfoContent">
        <div><span>분류</span> { groupOne.interBigDto.bigName }} > {groupOne.interSmallDto.smallName}}</div>
        <div><span>지역</span> { groupOne.groupLocation }}</div>
        <div><span>인원</span> { groupOne.currMember}} / { groupOne.maxMember}}</div>
        <div><span>일정</span></div>
        <div class="schedules" style="line-height: 12px;">
        </div>
        
        <div><span>시작일</span> { groupOne.startDate }}</div>
        <div><span>완료일</span> { groupOne.endDate }}</div>
      </div>
      <div class="hr"></div>
      <div class="groupName">
        <el-button type="primary" @click="showList" round>돌아가기</el-button>
        <el-button type="primary" round>수정하기</el-button>
        <el-button type="primary" round>삭제하기</el-button>
      </div>
    </div>
    <br>
    <br>
  </div>
</template>

<script>
export default {
    name: 'boardDetail',
    data(){
        return{
            boardOne: "",
            boardSeq: ""
        }
    },
    methods:{
        showList(){
            this.$emit("showBoard")
        }
    },
    mounted(){
    // this.boardSeq = this.$route.params.contentId
    // var params = new URLSearchParams();	// post 방식으로 받아야함.
    // params.append('boardSeq', this.boardSeq);
    // axios.post("http://localhost:9000/groupBoardOne", params)
    //             .then(res => {
    //         this.boardOne = res.data
    //       })
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
    background: #f7f7f7;
}

.groupImage img{
    display: table;
    margin: auto;
    height: 250px;
}

.groupName{
    text-align: center;
    padding: 35px;
}
.groupInfoTitle{
    float: left;
    padding: 60px 0px 0px 100px;
}
.groupInfoTitle > h5 > span{
    color: #727272;
}
.groupInfoContent{
    float: right;
    padding: 60px 100px 60px 0px;
    width: 600px;
    text-align: initial;
}
.groupInfoContent > div{
    margin: 14px 0px;
    line-height: 24px;
}

.groupInfoContent > div > span{
    display: list-item;
    color: #727272;
}

.hr{
    display: flex;
    margin: auto;
    margin-top: 15px;
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