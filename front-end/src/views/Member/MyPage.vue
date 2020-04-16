<template>
  <div>
	<h1>마이페이지</h1>
	<p>{{myinfo}}</p>
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

<style>

</style>