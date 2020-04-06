<template>
  <div class="depth1">
    <br>
    <br>
    <div class="depthcontainer" v-if="groupOne.interBigSeq == 1">
      <div class="depthimages">
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
            <p>분류: {{groupOne.interBigSeq}} > {{groupOne.interSmallSeq}}</p>
            <p>그룹장 : {{groupOne.memberSeq}}</p>
            <p> { 현재인원 } / {{ groupOne.maxMember}} </p>
          </div>
          <p class="pick">그룹 주간일정</p>
          <div class="sizes">
            <div class="size">월</div>
            <div class="size">화</div>
            <div class="size">수</div>
            <div class="size">목</div>
            <div class="size">금</div>
            <div class="size">토</div>
            <div class="size">일</div>
          </div>
        </div>
      </div>
      <div class="dpeth_buttons blue">
        <button class="join">그룹 스터디 참여하기</button>
        <button class="join_like"><span>♥</span></button>
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

<style scope>

@import url("https://fonts.googleapis.com/css?family=Lato:400,700");
/* center container in the middle */

.group_info{
  height: 90px;
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
	 left: 55%;
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

.desc {
	 text-transform: none;
	 letter-spacing: 0;
	 color: #4e4e4e;
	 font-size: 0.9em;
	 line-height: 1.6em;
	 text-align: justify;
}
.dpeth_buttons button {
	 background: #cda9ac;
	 padding: 10px;
	 display: inline-block;
	 outline: 0;
	 border: 0;
	 margin: -1px;
	 border-radius: 2px;
	 text-transform: uppercase;
	 letter-spacing: 1px;
	 color: #f5f5f5;
   cursor: pointer;
   margin-bottom: 10px;
}
.dpeth_buttons button:hover {
	 background: #ba7e7e;
	 transition: all 0.4s ease-in-out;
}
 .join {
	 width: 70%;
}
 .join_like {
	 width: 30%;
}
 .sizes {
	 display: grid;
	 color: #4e4e4e;
	 grid-template-columns: repeat(auto-fill, 30px);
	 grid-gap: 4px;
	 margin-left: 15px;
	 margin-top: 5px;
}
 .sizes:hover {
	 cursor: pointer;
}
 .pick {
	 margin-bottom: 0;
}
 .size {
	 padding: 8px;
	 border: 1px solid #4e4e4e;
	 font-size: 0.7em;
	 text-align: center;
}
 .size:hover {
	 background: #ba7e7e;
	 color: #f5f5f5;
	 transition: all 0.4s ease-in-out;
}
 .focus {
	 background: #ba7e7e;
	 color: #f5f5f5;
}
 

</style>