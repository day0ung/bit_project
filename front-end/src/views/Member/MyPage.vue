<template>
  <div class="myPageWrap">
			<h5>만나서 반가워요 <strong>{{name}}</strong>님</h5>
			<br>
	  <div class="mymenu">
			<el-menu
			class="el-menu-vertical-demo"
			active-text-color="#ff674b">
			<el-menu-item index="1" @click="$router.push({name:'MyStudy', params: { seq: seq }}), show = false" >
				<i class="el-icon-edit"></i>
				<span>내 스터디</span>
			</el-menu-item>
			<el-menu-item index="2" @click="$router.push({name:'MySchedule', params: { seq: seq }}), show = false">
				<i class="el-icon-postcard"></i>
				<span>내 일정</span>
			</el-menu-item>
			<el-menu-item index="3" @click="$router.push({name:'MyResume', params: { seq: seq }}) ,show = false">
				<i class="el-icon-document"></i>
				<span>내 이력서</span>
			</el-menu-item>
			<el-menu-item index="4" @click="$router.push({name:'MyInter',  params: { seq: seq }}), show = false">
				<i class="el-icon-star-off"></i>
				<span>내 관심분야</span>
			</el-menu-item>
			<el-menu-item index="5"  @click="$router.push({name:'MyInfo', params: { seq: seq }}), show = false" >
				<i class="el-icon-setting"></i>
				<span>내 정보수정</span>
			</el-menu-item>
			</el-menu>
	 </div>
	 <div class="myContent" v-if="show">
			<h2>default 뿌려줄것,,</h2>
	 </div>
	 <div class="myContent" v-else>
		 	<router-view :key="$route.fullPath">
			</router-view> 
	 </div>
  </div>
</template>

<script>

export default {
	data(){
		return{
			myinfo: [],
			name: '',
			seq: '',
			show: true
			
		}
	}, 
	 mounted(){
		 var loginData = sessionStorage.getItem("loginUser");
		 var login = JSON.parse(loginData); 
		 this.name = login.memberName
		 this.seq = login.memberSeq
	}, 
	methods:{
	
	}
	// computed(){
	// 	function noEvent() { // 새로 고침 방지
    //         if (event.keyCode == 116) {
    //             alert("새로고침을 할 수 없습니다.");
    //             event.keyCode = 2;
    //             return false;
    //         } else if (event.ctrlKey
    //                 && (event.keyCode == 78 || event.keyCode == 82)) {
    //             return false;
    //         }
    //     }
   	// 	 document.onkeydown = noEvent;
	// }
}
</script>

<style scoped>
.myPageWrap{
	min-height: 120vh;
}

.mymenu{
	float: left;
	width: 15%;
}
.myContent{
	float: left;
	width: 85%;
	padding-left: 25px;
}
.el-menu-item:hover{
	background-color: #fbfbfb;
}
.el-menu-item:focus{
	background-color: #fbfbfb;
}

</style>