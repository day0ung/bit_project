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
                <button style="    vertical-align: baseline; font-size: 20px; padding-left: 5px; color: blue;" @click="$router.push({name:'join'})">회원가입
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
                        <label id="id-label" for="id" style="display: block;">아이디</label>
                        <input type="text" id="id" name="id" class="txt_tool" value="">
                    </div>
                    <div class="pw-input-box">
                        <label id="password-label" for="password" style="display: block;">비밀번호</label>
                        <input type="password" id="password" name="password" class="txt_tool" value="" maxlength="32">
                    </div>
                    <button type="submit" class="btn-login">로그인</button>
                </div>
                <p class="signup-forgotten">
                    <a id="a_join" href="/zf_user/member/registration/join" onclick="return false;" class="sign-up" onmousedown="try{n_trackEvent('login', 'pc_login_page' , 'join', '');}catch(e){}">회원가입</a>
                    <span></span>
                    <a href="/zf_user/helpdesk/idpw-find" class="forgotten" onmousedown="try{n_trackEvent('login', 'pc_login_page' , 'find', '');}catch(e){}">아이디/비밀번호 찾기</a>
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
    
}
</script>

<style>

</style>