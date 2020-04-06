<template>
  <div class="login-page">
        <div class="form">  
          <input type="text" v-model="memberId" placeholder="id" >
          <input type="password" v-model="pwd" placeholder="password" >
          <!-- id:id >>key:value 임 값이 같다면 하나만 써줘도됨 -->
          <button @click="login"> <!-- login함수()인자안에 들어갈것은 actions에 들어갈 인자값 -->
            login</button>
          <p class="message">Not registered?<router-link to="/join">Create an account</router-link></p>
        </div>
  </div>
</template>

<script>
//import { mapState } from "@/store/s_member/s_member.js";
export default {
  data(){
    return{
      memberId: null,
      pwd: null,
    }
  },
  computed:{

  },
  methods:{
    login(){
    var params = new URLSearchParams();
    params.append('memberId', this.memberId)
    params.append('pwd', this.pwd)
    axios.post("http://localhost:9000/getOneMember", params)
              .then(res => {
          alert("회원가입이 완료되었습니다.")
          alert(JSON.stringify(res.data))
        })
    }
  }
}
</script>

<style>
@import url(https://fonts.googleapis.com/css?family=Roboto:300);

.login-page {
  width: 360px;
  padding: 8% 0 0;
  margin: auto;
}
.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: #4CAF50;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background: #43A047;
}
.form .message {
  margin: 15px 0 0;
  color: #b3b3b3;
  font-size: 12px;
}
.form .message a {
  color: #4CAF50;
  text-decoration: none;
}
.form .register-form {
  display: none;
}


</style>