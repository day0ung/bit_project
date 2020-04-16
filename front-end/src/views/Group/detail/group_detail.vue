<template>
  <div class="group_detail">
    <br>
    <br>
    <div class="groupDetailcCntainer">
      <div class="groupImage">
        <img :src="groupOne.image" />
      </div>
      <div class="groupName">
        <h1>{{ groupOne.groupName }}</h1>
      </div>
      <div class="hr"></div>
      <div class="groupInfoTitle">
        <h5>스터디 소개</h5>
      </div>
      <div class="groupInfoContent">
        {{ groupOne.info }}
      </div>
      <div class="hr"></div>
      <div class="groupInfoTitle">
        <h5>상세 정보</h5>
      </div>
      <div class="groupInfoContent">
        <p>분류 : {{ groupOne.interBigDto.bigName }} > {{groupOne.interSmallDto.smallName}}</p>
        <p>지역 : {{ groupOne.groupLocation }}</p>
        <p>인원 : {{ groupOne.currMember}} / {{ groupOne.maxMember}}</p>
        <p>일정 : <div class="sizes">
            <div v-if="groupOne.groupSchedule.monday == 0" class="size_blue">월</div>
            <div v-else class="size_blue_check">월</div>
            <div v-if="groupOne.groupSchedule.tuesday == 0" class="size_blue">화</div>
            <div v-else class="size_blue_check">화</div>
            <div v-if="groupOne.groupSchedule.wednesday == 0" class="size_blue">수</div>
            <div v-else class="size_blue_check">수</div>
            <div v-if="groupOne.groupSchedule.thursday == 0" class="size_blue">목</div>
            <div v-else class="size_blue_check">목</div>
            <div v-if="groupOne.groupSchedule.friday == 0" class="size_blue">금</div>
            <div v-else class="size_blue_check">금</div>
            <div v-if="groupOne.groupSchedule.saturday == 0" class="size_blue">토</div>
            <div v-else class="size_blue_check">토</div>
            <div v-if="groupOne.groupSchedule.sunday == 0" class="size_blue">일</div>
            <div v-else class="size_blue_check">일</div>
          </div>
        <p>시작일 : {{ groupOne.startDate }}</p>
        <p>완료일 : {{ groupOne.endDate }}</p>
      </div>
      <div class="hr"></div>
      <div class="groupName">
        <el-button type="primary" round>그룹 스터디 참여신청</el-button>
        <el-button type="primary" round>♥</el-button>
      </div>
    </div>
    <br>
    <br>
  </div>
  

</template>

<script>
import { loading } from 'element-ui';
export default {
  data(){
    return{
      groupInfoSeq: "",
      groupOne: [],
      loading: true,
    }
  },
  methods:{
    joinGroup(){
      alert("참여신청이 완료되었습니다.\n마이페이지 그룹에서 확인해주세요")
    }
  },
  mounted(){
    this.loading = true;
    this.groupInfoSeq = this.$route.params.contentId
    var params = new URLSearchParams();	// post 방식으로 받아야함.
    params.append('groupInfoSeq', this.groupInfoSeq);
    axios.post("http://localhost:9000/getOneGroup", params)
                .then(res => {
            this.groupOne = res.data
            this.loading = false;
          })
  },
  create(){

  }
}
</script>

<style scoped>

@import url("https://fonts.googleapis.com/css?family=Lato:400,700");
/* center container in the middle */
.group_detail{
}

.groupDetailcCntainer {
	 position: relative;
	 margin: auto;
	 overflow: hidden;
   height: auto;
	 background: #ebebeb;
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
.groupInfoContent{
  float: right;
  padding: 60px 100px 60px 0px;
  width: 600px;
  text-align: initial;
}

.hr{
  display: flex;
  margin: auto;
  margin-top: 15px;
  margin-bottom: 5px;
  background: #9e9e9e;
  height: 1px;
  width: 80%;
}

 .sizes {
	 display: grid;
	 color: #4e4e4e;
	 grid-template-columns: repeat(auto-fill, 30px);
	 grid-gap: 4px;
	 margin-left: 15px;
	 margin-top: 5px;
}
.size_blue {
	 padding: 8px;
	 border: 1px solid #4e4e4e;
	 font-size: 0.7em;
	 text-align: center;
}
.size_blue_check{
  padding: 8px;
  border: 1px solid #4e4e4e;
  font-size: 0.7em;
  text-align: center;
  background: #74b9ff;
  color: #f5f5f5;
  transition: all 0.4s ease-in-out;
}

</style>