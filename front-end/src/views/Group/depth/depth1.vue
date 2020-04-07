<template>
  <div class="depth1">
    <br>
    <br>
    <!-- blue -->
    <div class="depthcontainer" v-if="groupOne.interBigSeq == 1">
      <div class="depthimages blueInner">
        <img :src="groupOne.image" />
      </div>
      <div class="groupdetail_product">
        <p class="desc">그룹스터디 상세 : {{ groupOne.info }}</p>
      </div>
      <div class="product">
        <div class="product_content">
          <h1>{{ groupOne.groupName }}</h1>
          <p>{{ groupOne.startDate }} ~ {{ groupOne.endDate }}</p>
          <br>
          <div class="group_info">
            <p>그룹장 : {{groupOne.memberSeq}}</p>
            <p> { 현재인원 } / {{ groupOne.maxMember}} </p>
            <p>분류: {{groupOne.interBigSeq}} > {{groupOne.interSmallSeq}}</p>
          </div>
          <p class="pick">그룹 주간일정</p>
          <div class="sizes">
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
        </div>
      </div>
      <div class="detailcontainer blue">
        <button class="add" @click="joinGroup">그룹 스터디 참여신청</button>
        <button class="like"><span>♥</span></button>
      </div>
    </div>
    <!-- red -->
    <div class="depthcontainer" v-if="groupOne.interBigSeq == 2">
      <div class="depthimages redInner">
        <img :src="groupOne.image" />
      </div>
      <div class="groupdetail_product">
        <p class="desc">그룹스터디 상세 : {{ groupOne.info }}</p>
      </div>
      <div class="product">
        <div class="product_content">
          <h1>{{ groupOne.groupName }}</h1>
          <p>{{ groupOne.startDate }} ~ {{ groupOne.endDate }}</p>
          <br>
          <div class="group_info">
            <p>그룹장 : {{groupOne.memberSeq}}</p>
            <p> { 현재인원 } / {{ groupOne.maxMember}} </p>
            <p>분류: {{groupOne.interBigSeq}} > {{groupOne.interSmallSeq}}</p>
          </div>
          <p class="pick">그룹 주간일정</p>
          <div class="sizes">
            <div v-if="groupOne.groupSchedule.monday == 0" class="size_red">월</div>
            <div v-else class="size_red_check">월</div>
            <div v-if="groupOne.groupSchedule.tuesday == 0" class="size_red">화</div>
            <div v-else class="size_red_check">화</div>
            <div v-if="groupOne.groupSchedule.wednesday == 0" class="size_red">수</div>
            <div v-else class="size_red_check">수</div>
            <div v-if="groupOne.groupSchedule.thursday == 0" class="size_red">목</div>
            <div v-else class="size_red_check">목</div>
            <div v-if="groupOne.groupSchedule.friday == 0" class="size_red">금</div>
            <div v-else class="size_red_check">금</div>
            <div v-if="groupOne.groupSchedule.saturday == 0" class="size_red">토</div>
            <div v-else class="size_red_check">토</div>
            <div v-if="groupOne.groupSchedule.sunday == 0" class="size_red">일</div>
            <div v-else class="size_red_check">일</div>
          </div>
        </div>
      </div>
      <div class="detailcontainer red">
        <button class="add" @click="joinGroup">그룹 스터디 참여신청</button>
        <button class="like"><span>♥</span></button>
      </div>
    </div>
  <!-- green -->
    <div class="depthcontainer" v-if="groupOne.interBigSeq == 3">
      <div class="depthimages greenInner">
        <img :src="groupOne.image" />
      </div>
      <div class="groupdetail_product">
        <p class="desc">그룹스터디 상세 : {{ groupOne.info }}</p>
      </div>
      <div class="product">
        <div class="product_content">
          <h1>{{ groupOne.groupName }}</h1>
          <p>{{ groupOne.startDate }} ~ {{ groupOne.endDate }}</p>
          <br>
          <div class="group_info">
            <p>그룹장 : {{groupOne.memberSeq}}</p>
            <p> { 현재인원 } / {{ groupOne.maxMember}} </p>
            <p>분류: {{groupOne.interBigSeq}} > {{groupOne.interSmallSeq}}</p>
          </div>
          <p class="pick">그룹 주간일정</p>
          <div class="sizes">
            <div v-if="groupOne.groupSchedule.monday == 0" class="size_green">월</div>
            <div v-else class="size_green_check">월</div>
            <div v-if="groupOne.groupSchedule.tuesday == 0" class="size_green">화</div>
            <div v-else class="size_green_check">화</div>
            <div v-if="groupOne.groupSchedule.wednesday == 0" class="size_green">수</div>
            <div v-else class="size_green_check">수</div>
            <div v-if="groupOne.groupSchedule.thursday == 0" class="size_green">목</div>
            <div v-else class="size_green_check">목</div>
            <div v-if="groupOne.groupSchedule.friday == 0" class="size_green">금</div>
            <div v-else class="size_green_check">금</div>
            <div v-if="groupOne.groupSchedule.saturday == 0" class="size_green">토</div>
            <div v-else class="size_green_check">토</div>
            <div v-if="groupOne.groupSchedule.sunday == 0" class="size_green">일</div>
            <div v-else class="size_green_check">일</div>
          </div>
        </div>
      </div>
      <div class="detailcontainer green">
        <button class="add" @click="joinGroup">그룹 스터디 참여신청</button>
        <button class="like"><span>♥</span></button>
      </div>
    </div>
    <!-- yellow -->
    <div class="depthcontainer" v-if="groupOne.interBigSeq == 4">
      <div class="depthimages yellowInner">
        <img :src="groupOne.image" />
      </div>
      <div class="groupdetail_product">
        <p class="desc">그룹스터디 상세 : {{ groupOne.info }}</p>
      </div>
      <div class="product">
        <div class="product_content">
          <h1>{{ groupOne.groupName }}</h1>
          <p>{{ groupOne.startDate }} ~ {{ groupOne.endDate }}</p>
          <br>
          <div class="group_info">
            <p>그룹장 : {{groupOne.memberSeq}}</p>
            <p> { 현재인원 } / {{ groupOne.maxMember}} </p>
            <p>분류: {{groupOne.interBigSeq}} > {{groupOne.interSmallSeq}}</p>
          </div>
          <p class="pick">그룹 주간일정</p>
          <div class="sizes">
            <div v-if="groupOne.groupSchedule.monday == 0" class="size_yellow">월</div>
            <div v-else class="size_yellow_check">월</div>
            <div v-if="groupOne.groupSchedule.tuesday == 0" class="size_yellow">화</div>
            <div v-else class="size_yellow_check">화</div>
            <div v-if="groupOne.groupSchedule.wednesday == 0" class="size_yellow">수</div>
            <div v-else class="size_yellow_check">수</div>
            <div v-if="groupOne.groupSchedule.thursday == 0" class="size_yellow">목</div>
            <div v-else class="size_yellow_check">목</div>
            <div v-if="groupOne.groupSchedule.friday == 0" class="size_yellow">금</div>
            <div v-else class="size_yellow_check">금</div>
            <div v-if="groupOne.groupSchedule.saturday == 0" class="size_yellow">토</div>
            <div v-else class="size_yellow_check">토</div>
            <div v-if="groupOne.groupSchedule.sunday == 0" class="size_yellow">일</div>
            <div v-else class="size_yellow_check">일</div>
          </div>
        </div>
      </div>
      <div class="detailcontainer yellow">
        <button class="add" @click="joinGroup">그룹 스터디 참여신청</button>
        <button class="like"><span>♥</span></button>
      </div>
    </div>

  </div>
  

</template>

<script>
export default {
  data(){
    return{
      groupInfoSeq: "",
      groupOne: []
    }
  },
  methods:{
    joinGroup(){
      alert("참여신청이 완료되었습니다.\n마이페이지 그룹에서 확인해주세요")
    }
  },
  mounted(){
    this.groupInfoSeq = this.$route.params.contentId
    var params = new URLSearchParams();	// post 방식으로 받아야함.
    params.append('groupInfoSeq', this.groupInfoSeq);
    axios.post("http://localhost:9000/getOneGroup", params)
                .then(res => {
            this.groupOne = res.data
          })
  }
}
</script>

<style scoped>

@import url("https://fonts.googleapis.com/css?family=Lato:400,700");
/* center container in the middle */

.group_info{
  height: 80px;
}

.group_info p{
  margin: 10px;
}

.groupdetail_product{
  margin: auto;
  margin-top: 20px;
  width: 80%;
}

.depthimages img{
  width: 350px;
  height: 250px;
}

.depthcontainer {
	 position: relative;
	 margin: auto;
	 overflow: hidden;
	 width: 650px;
   height: auto;
   max-height: 700px;
	 background: #f5f5f5;
	 box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.5);
	 border-radius: 10px;
}
.product {
	 position: absolute;
	 width: 40%;
	 top: 0%;
	 left: 57%;
}

.product_content{
  height: 240px;
}

.product h1{
  text-align: center;
  margin: 15px;
}
.product p{
  text-align: center;
}

.add {
  border-top-left-radius: 10px;
  border-bottom-left-radius: 10px;
  width: 70%;
}
.like {
  border-top-right-radius: 10px;
  border-bottom-right-radius: 10px;
  width: 30%;
}

.desc {
	 text-transform: none;
	 letter-spacing: 0;
	 color: #4e4e4e;
	 font-size: 0.9em;
	 line-height: 1.6em;
	 text-align: justify;
}
 .sizes {
	 display: grid;
	 color: #4e4e4e;
	 grid-template-columns: repeat(auto-fill, 30px);
	 grid-gap: 4px;
	 margin-left: 15px;
	 margin-top: 5px;
}
 .pick {
	 margin-bottom: 0;
}
.yellowInner{
  background: #ffeaa750;
}
.size_yellow {
	 padding: 8px;
	 border: 1px solid #4e4e4e;
	 font-size: 0.7em;
	 text-align: center;
}
.size_yellow_check{
  padding: 8px;
  border: 1px solid #4e4e4e;
  font-size: 0.7em;
  text-align: center;
  background: #ffeaa7;
  color: #4e4e4e;
	transition: all 0.4s ease-in-out;
}
.greenInner{
  background: #00adab50;
}
.size_green {
	 padding: 8px;
	 border: 1px solid #4e4e4e;
	 font-size: 0.7em;
	 text-align: center;
}
.size_green_check{
  padding: 8px;
  border: 1px solid #4e4e4e;
  font-size: 0.7em;
  text-align: center;
  background: #00adab;
  color: #f5f5f5;
	transition: all 0.4s ease-in-out;
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
.blueInner{
  background: #74baff60;
}
.redInner{
  background: #ff767550;
}
.size_red {
  padding: 8px;
  border: 1px solid #4e4e4e;
  font-size: 0.7em;
  text-align: center;
}
.size_red_check{
  padding: 8px;
  border: 1px solid #4e4e4e;
  font-size: 0.7em;
  text-align: center;
  background: #ff7675;
  color: #f5f5f5;
	transition: all 0.4s ease-in-out;
}

</style>