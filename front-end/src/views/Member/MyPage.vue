<template>
  <div class="myPageWrap">
			<h4 style="margin-left: 29px; padding-top: 5px;" > <strong>{{name}}</strong>님</h4>
		<br>
	  <div class="mymenu">
			<el-menu
			class="el-menu-vertical-demo"
			active-text-color="#ff674b">
			<el-menu-item index="1" v-model="auth" v-if="auth == '1' | auth == '0' " @click="$router.push({name:'MyStudy', params: { seq: seq }}), show = false" >
				<i class="el-icon-edit"></i>
				<span>내 스터디</span>
			</el-menu-item>
			<el-menu-item index="2" v-model="auth" v-if="auth == '1' | auth == '0' "  @click="$router.push({name:'MySchedule', params: { seq: memSeq }}), show = false">
				<i class="el-icon-postcard"></i>
				<span>내 일정</span>
			</el-menu-item>
			<el-menu-item index="3" v-model="auth"  @click="$router.push({name:'MyResume', params: { seq: memSeq }}) ,show = false">
				<i class="el-icon-document"></i>
				<span>내 이력서</span>
			</el-menu-item>
			<el-menu-item index="4" v-model="auth" v-if="auth == '1' | auth == '0' "  @click="$router.push({name:'MyInter',  params: { seq: memSeq }}), show = false">
				<i class="el-icon-star-off"></i>
				<span>내 관심분야</span>
			</el-menu-item>
			<el-menu-item index="5" v-model="auth"  @click="$router.push({name:'MyInfo', params: { seq: memSeq }}), show = false" >
				<i class="el-icon-setting"></i>
				<span>내 정보수정</span>
			</el-menu-item>
			</el-menu>
	 </div>
	 <div class="myContent" v-if="show">
		 <h1>dkanrjsk</h1>
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
			memSeq: '',
			show: true,
			auth: '',
		}
	}, 
	 mounted(){
		 var loginData = sessionStorage.getItem("loginUser");
		 var login = JSON.parse(loginData); 
		 this.name = login.memberName
		 this.memSeq = login.memberSeq
		 this.auth = login.auth
	}, 
	methods:{
	
	}
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