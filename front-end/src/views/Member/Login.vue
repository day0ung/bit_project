<template>
  <transition name="modal">
    <div class="modal-mask">
      <div class="modal-wrapper">
        <div class="modal-container">

          <div class="modal-header">
            <slot name="header">
   
            </slot>
          </div>

          <div class="modal-body">
            <slot name="body">
                    <div class="login_page_wrap">
            <div class="login_message">
              <p> 회원이 아니면, 지금 <span><strong>
                <button style="    vertical-align: baseline; font-size: 20px; padding-left: 5px; color: blue;" @click="regi">회원가입
               </button></strong></span>을 해주세요.
               </p>        
            </div>
            <div class="login_input_wrap">         
                <!-- input box -->
                <div class="setting">
                    <input id="id_save" name="id_save" type="checkbox" onmousedown="try{n_trackEvent('login', 'pc_login_page' , 'id_save', '');}catch(e){}">
                    <label for="id_save" onmousedown="try{n_trackEvent('login', 'pc_login_page' , 'id_save', '');}catch(e){}">아이디 저장</label>
                </div>
                <div class="login-form">
                    <div class="id-input-box focus">
                        <input type="text" v-model="id" class="txt_tool" placeholder="아이디">
                    </div>
                    <div class="pw-input-box">
                        <input type="password" v-model="pwd" class="txt_tool" placeholder="비밀번호" maxlength="32">
                    </div>
                    <button @click="login" class="btn-login">로그인</button>
                </div>
                <p class="signup-forgotten">
                 
                   <span></span>
                   <button class="forgotten" @click="join" style="font-weight: 5px">아이디/비밀번호 찾기</button>
                </p>
                 </div>
             </div>
            </slot>
          </div>

          <div class="modal-footer">
            <slot name="footer">
              <button class="modal-default-button" @click="$emit('close')">
                      CLOSE
              </button>
            </slot>
          </div>
        </div>
      </div>
    </div>
  </transition>
</template>
<script>

import logincss from '@/assets/css/member/login.css'
export default {

    data(){
      return{
          id: null,
          pwd: null
      }
    },
    methods:{
       
        regi(){
          this.$router.push({name:'join'});
          this.$emit('close')
        },
        login(){
           var params = new URLSearchParams();
           params.append('memberId', this.id)
           params.append('pwd', this.pwd)

          this.id == null ? alert('아이디를 입력해주세요'):
          this.pwd == null ? alert('비밀번호를 입력해 주세요'):
          axios.post('http://localhost:9000/getOneMember', params).then(
    				res => {
              if(res.data.memberId == undefined){
                alert("id나 password가 틀렸습니다.");
                return false;
              }
                //session사용시 -> vuex 사용, 혹은 html에서 사용 ->sessionStorage(objec저장)/ localstorage(string저장) -> cookie(String만 됨)
                //세션에 저장						//json으로 넘어옴 세션에 저장할때는 
                sessionStorage.setItem("loginUser", JSON.stringify(res.data)); //String
                //alert(res.data.memberId)
                var loginData = sessionStorage.getItem("loginUser"); //세션가져오기
                //alert('세션가져오기' + loginData)
                var login = JSON.parse(loginData); //JSON
                //alert(login.memberId);  
                this.$store.state.s_member.isLogin = false
                alert(this.$store.state.s_member.isLogin)
                //this.$store.s_member.commit('LoginSave',login)
                
                this.$emit('close')   
            })
                          

        },
        join(){
          alert('마이페이지로 이동')
        }
    }
}

</script>
<style>

</style>