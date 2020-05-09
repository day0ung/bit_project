<template>
  <div class="login">
    <h2>Log in Page</h2>
    <form @submit.prevent="onSubmit">
      <div class="form_id">
        <label for="email">ID</label>
        <input class="form-control" type="text" name="email" 
          v-model="email" autofocus placeholder="e.g., test@test.com" />
      </div>
      <div class="form_pw">
        <label for="password">Passwrod</label>
        <input class="form-control" type="password" 
          v-model="password" placeholder="123123" />
      </div>
      <button  class="btn" :class="{'btn-success': !invalidForm}" type="submit" :disabled="invalidForm">Log In</button>
    </form>
    <p class="error" v-if="error">{{error}}</p>
  </div>
</template>

<script>
import {auth} from '../api/api_index.js'

export default {
  data() {
    return {
      email: '',
      password: '',
      error: '',
      rPath:''
    }
  },
  computed: {
    invalidForm() {
      return !this.email || !this.password
    }
  },
  //rpath로 리다이렉트
  created(){
    this.rPath = this.$route.query.rPath || '/'
  },
  methods: {
    onSubmit() {
      console.log(this.email, this.password)
      var params = new URLSearchParams();
      params.append('memberId', this.email)
      params.append('pwd', this.password)

      axios.post('http://localhost:9000/adminLoginCheck',params).then(
        res => {
        console.log(res.data)
        console.log(res.data)
        //this.$router.push(this.rPath)//rPath로 redirect
          if(res.data.memberId == undefined){
            alert("id나 password가 틀렸습니다.");
            this.$store.state.isLogin = true;//로그인 미완료시 true로 처리.
            return;
          }
          if(res.data.auth == 4){
            sessionStorage.setItem("loginUser", JSON.stringify(res.data.memberId)); //String
            //alert(res.data.memberId)
            var loginData = sessionStorage.getItem("loginUser"); //세션가져오기
            // console.log('세션가져오기' + loginData)
            var login = JSON.parse(loginData); //JSON
            this.$store.commit('loginSuccess', login)
            // console.log('로그인성공');

            // console.log("출력 : " + this.$store.state.loginUser);
            // console.log("출력 : " + this.$store.state.isLogin);

            this.$router.push ({path:'/'})
            this.$emit('close')
          }else{
            alert(" 관리자 로그인에 실패하였습니다.\n 서버 관리자에게 문의 바랍니다 ");
          }


      })
      .catch(err =>{
        console.log(err)
      })
    }
  }
}
</script>

<style>
.login {
  width: 400px;
  margin: 120px auto;
}
.error {
  color: #f00;
}

  


 
.form_id, .form_pw, .btn{
  margin-top:30px;
}


</style>
