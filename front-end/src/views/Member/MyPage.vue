<template>
  <div>
	  <div class="myPageHeader">
		  <h1>마이페이지</h1>
		<div class="tabBox">
			<button class="myStudy">내 스터디</button>
			<button class="myStudy">내 일정</button>
			<button class="myStudy">내 관심분야</button>
			<button class="myStudy">내 이력서</button>
			<button class="myStudy">내 구매내역</button>
			<button class="myStudy">내 정보수정</button>
		</div>
		  <div></div>
		  <div></div>	
	  </div>
	  <div class="myPageContent">

	  </div>	
  </div>
</template>

<script>

export default {
	data(){
		return{
			myinfo: [],
			
		}
	}, 
	 mounted(){
		 var loginData = sessionStorage.getItem("loginUser");
		 var login = JSON.parse(loginData); 
		 var seq = login.memberSeq

		 var params = new URLSearchParams();
		 params.append('memberSeq', seq)
		 axios.post('http://localhost:9000/selectMember', params)
		 .then(res => {
				this.myinfo = res.data
		 }) 
	}, 
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
.myPageHeader{
	padding-top: 35px;
    padding-left: 83px;
    height: 169px;
    width: 100%;
}
.tabBox{
	margin-top: 30px;
	height: 70px;
	line-height: 70px;
}
.myStudy{
	display: inline-block;
    width: 80pt;
    height: 50px;
    line-height: 50px;
    color: #717477;
    font-size: 20px;
	text-align: center;
	margin-right: 30px;
	
}
.myStudy:hover {color:#ff5151;}
</style>