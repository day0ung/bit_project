<template>

<div class="login_page_wrap">
  <div class="login_message">
            <h2>로그인이 필요한 서비스입니다.</h2><p>사람인 회원이 아니면, 지금 <span><a href="/zf_user/member/registration/join">회원가입</a></span>을 해주세요.</p>        </div>
            <div class="login_input_wrap">         
                <!-- input box -->
                <div class="setting">
                    <input id="autologin" name="autologin" type="checkbox" onclick="if (this.checked) { jQuery('#wrap_autologin').show() } else { jQuery('#wrap_autologin').hide() }" onmousedown="try{n_trackEvent('login', 'pc_login_page' , 'login_save', '');}catch(e){}">
                    <label for="autologin" onmousedown="try{n_trackEvent('login', 'pc_login_page' , 'login_save', '');}catch(e){}"> 로그인 유지 </label>
                    <div class="dsc_ly" id="wrap_autologin" style="display:none;">
                        <button class="btn_ly_close" type="button" onclick="jQuery('#wrap_autologin').hide()">닫기</button>
              
                    </div>
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

                <ul class="social_login" id="wrap_social_login">
               
                </ul>

            </div>
        </div>
</template>

<script>
export default {


}
</script>

<style scoped>


/* auth-index */
.login_message {padding:0 0 18px;text-align:left}
.login_message h2 {margin:0;padding:0;height:28px;color:#444;font-size:30px;font-weight:bold;letter-spacing:-2px;line-height:28px}
.login_message p {margin:0;padding:0;height:24px;color:#777;font-size:14px;letter-spacing:-1px;line-height:24px}
.login_message p a {color:#586cdc}
.login_page_wrap {clear:both;text-align:left; padding-top: 100px;}
.login_page_wrap:after {display:block;clear:both;content:""}
.margin_control {margin:36px auto 50px !important}
.login_page_wrap p {margin:0;padding:0}
.login_input_wrap {float:left;box-sizing:border-box}
.login_input_wrap .login_check_terms {margin-top:23px}
.login_input_wrap .login_check_terms label {margin-right:4px;letter-spacing:-1px;vertical-align:top}
.login_input_wrap .tab_member_type {width:100%;height:45px;background-color:#fbfbfb}
.login_input_wrap .tab_member_type:after {display:block;clear:both;content:""}
.login_input_wrap .tab_member_type li {float:left;width:194px;height:43px;border:1px solid #e6e6e6;border-bottom:1px solid #666;border-collapse:collapse;font-size:16px;letter-spacing:-1px;text-align:center}
.login_input_wrap .tab_member_type .t_per {border-right:0}
.login_input_wrap .tab_member_type .t_com {border-left:0}
.login_input_wrap .tab_member_type li a {display:inline-block;zoom:1;padding-top:10px;width:100%;height:34px;color:#999}
.login_input_wrap .tab_member_type li a:hover {text-decoration:none}
.login_input_wrap .tab_member_type li.t_on {height:44px;border:1px solid #666;border-bottom:0;background-color:#fff}
.login_input_wrap .tab_member_type li.t_on a {color:#444;font-weight:bold}
.login_input_wrap .setting:after {display:block;visibility:hidden;clear:both;height:0;content:"."}
.login_input_wrap .setting {display:inline-block;position:relative;margin-top:28px;margin-bottom:7px;height:20px;line-height:20px}
.login_input_wrap .setting {display:block}
.login_input_wrap .setting label {display:block;float:left;margin-right:15px;height:16px;color:#666;font-size:12px;letter-spacing:-1px;line-height:16px;vertical-align:top}
.login_input_wrap .setting input {display:block;float:left;margin-top:3px;margin-right:5px;vertical-align:top}
.login_input_wrap .setting .dsc_ly {display:block;position:absolute;bottom:30px;left:-12px;z-index:10;width:272px;height:55px}
.login_input_wrap .setting .dsc_ly .btn_ly_close {overflow:hidden;position:absolute;top:0;right:0;width:17px;height:17px;border:0 none;color:transparent;font-size:0;line-height:0;text-indent:-100%;text-shadow:none;white-space:nowrap;background:url(//www.saraminimage.co.kr/ui/common/btn_login_ly_close.png) 50% 50% no-repeat;cursor:pointer}
.login_input_wrap .setting .dsc_ly .dsc_arr {display:block;position:absolute;top:53px;left:12px;width:13px;height:8px;line-height:normal;background:url(//www.saraminimage.co.kr/ui/common/btn_login_ly_arr.png) 0 0 no-repeat}
.login_input_wrap .setting .dsc_ly .dsc_txt {margin:0;padding:6px 10px 7px;border:1px solid #bababa;color:#888;font-size:11px;letter-spacing:-1px;line-height:20px;background-color:#fff}
.login_input_wrap .setting .dsc_ly .dsc_txt strong {color:#555;font-weight:normal}
.login_input_wrap .setting .ssl_login_box {display:block;overflow:hidden;float:left;position:relative;padding-right:33px;width:60px;height:20px;box-sizing:border-box;color:#666;font-size:12px;line-height:16px;vertical-align:top}
.login_input_wrap .setting .ssl_login_hide {position:absolute;top:-25px;left:0;z-index:-1;width:0;height:0;line-height:0}
.login_input_wrap .setting .ssl_login_box .label_type {display:block;position:absolute;top:2px;right:0;margin:0;padding:0;width:29px;height:16px;text-indent:-9999px;vertical-align:top;background:url(//www.saraminimage.co.kr/ui/common/btn_autologin2_off.png) 0 0 no-repeat;cursor:pointer}
.login_input_wrap .setting .ssl_login_box .label_type.on {background:url(//www.saraminimage.co.kr/ui/common/btn_autologin2_on.png) 0 0 no-repeat}
.login_input_wrap .login-form {position:relative;width:392px;height:85px}
.login_input_wrap .login-form label {position:absolute;top:0;left:0;z-index:2;margin:0;padding:8px 20px;width:294px;height:40px;box-sizing:border-box;color:#959595;font-size:14px;font-weight:bold;line-height:23px}
.login_input_wrap .login-form input {position:absolute;z-index:1;margin:0;padding:8px 20px;width:293px;height:40px;border:none;outline:0;box-sizing:border-box;color:#444;font-size:14px;font-weight:bold;letter-spacing:0;line-height:23px;background-color:transparent}
.login_input_wrap .login-form .id-input-box {position:absolute;top:0;left:0;width:294px;height:43px;border-top:1px solid #cdcdcd;border-bottom:1px solid #e4e4e4;border-left:1px solid #cdcdcd;box-sizing:border-box}
.login_input_wrap .login-form .pw-input-box {position:absolute;top:43px;left:0;width:294px;height:42px;border-bottom:1px solid #cdcdcd;border-left:1px solid #cdcdcd;box-sizing:border-box}
.login_input_wrap .login-form .btn-login {position:absolute;top:0;left:294px;width:98px;height:85px;border:none;color:#fff;font-size:16px;font-weight:bold;background:#6b80f1;cursor:pointer}
.login_input_wrap .signup-forgotten {overflow:hidden;position:relative;margin:18px 0 29px;width:100%;height:16px;font-size:13px;letter-spacing:-1px}
.login_input_wrap .signup-forgotten .sign-up {float:left;margin-right:10px;color:#666;font-weight:bold;text-decoration:none}
.login_input_wrap .signup-forgotten .forgotten {float:left;color:#666;text-decoration:none}
.login_input_wrap .signup-forgotten span {float:left;position:relative;margin-right:8px;width:1px;height:16px;background:url(//www.saraminimage.co.kr/ui/common/bg_vline.png) no-repeat 0 50%}
.login_input_wrap .signup-forgotten .service_info_txt {float:right}
.login_input_wrap .signup-forgotten .service_info_txt img {margin-top:2px;margin-left:6px;vertical-align:top}
.login_input_wrap .signup-forgotten .service_info_txt:hover {color:#555}
.login_input_wrap .signup-forgotten .link_rater {float:right;position:relative;margin-right:4px;padding-right:7px;}
.login_input_wrap .signup-forgotten .link_rater:after {display:inline-block;position:absolute;top:50%;right:0;margin-top:-5px;width:1px;height:11px;background-color:#dedede;content:""}
.login_input_wrap .social_login {display:inline-block;overflow:hidden;zoom:1;width:100%;height:82px}
.login_input_wrap .social_login:after {display:block;clear:both;content:""}
.login_input_wrap .social_login li {display:block;float:left;zoom:1;position:relative;margin-bottom:6px;width:50%;height:38px;box-sizing:border-box;background-color:#fff}
.login_input_wrap .social_login a {display:block;zoom:1;padding-left:50px;height:38px;border:1px solid #ddd;box-sizing:border-box;color:#666;font-size:12px;letter-spacing:-1px;line-height:34px;text-decoration:none}
.login_input_wrap .social_login .sl_naver {margin-right:3px;background:url(//www.saraminimage.co.kr/ui/social_login/icon_sns_naver_m.png) 20px 12px no-repeat}
.login_input_wrap .social_login .sl_facebook {margin-left:3px;background:url(//www.saraminimage.co.kr/ui/social_login/icon_sns_facebook_m.png) 22px 9px no-repeat}
.login_input_wrap .social_login .sl_kakao {margin-right:3px;background:url(//www.saraminimage.co.kr/ui/social_login/icon_sns_kakao_m.png) 17px 9px no-repeat}
.login_input_wrap .social_login .sl_google {margin-left:3px;background:url(//www.saraminimage.co.kr/ui/social_login/icon_sns_google_m.png) 18px 9px no-repeat}
.login_input_wrap .com_noti_list {display:inline-block;overflow:hidden;zoom:1;width:100%;height:82px;padding-top:20px}
.login_input_wrap .com_noti_list .cn_tit {display:block;margin-bottom:7px;height:17px;color:#444;font-size:15px;font-weight:bold;letter-spacing:-1px;line-height:17px}
.login_input_wrap .com_noti_list .cn_list {font-size:12px;letter-spacing:-1px;line-height:18px}
.login_input_wrap .com_noti_list .cn_list li {overflow:hidden;width:90%;text-overflow:ellipsis;white-space:nowrap}
.login_input_wrap .com_noti_list .cn_list a {color:#666;text-decoration:none}
.clear_both {display:block;clear:both;zoom:1;font-size:0;content:""}



/* 회원가입영역 & 로그인 하단 안내 영역 & 마이 - 로그인영역 과 동일한 내용 css v1002 (box_bottom_info 는 로그인화면만) */
.box_bottom_info {margin:0 0 63px 0;text-align:center}
.box_bottom_info .txt {padding-bottom:14px;font-size:17px;color:#2f4685;letter-spacing:-1px}
.box_bottom_info .btn_bottom_info {display:block;margin:0 auto;width:72px;height:72px;box-sizing:border-box;border:1px solid #2f4685;background-color:#fff}
.box_bottom_info .btn_bottom_info .ico_bottom {display:block;width:25px;height:30px;margin:0 auto;background:url(//www.saraminimage.co.kr/sri/common/img/btn_member_info_all.png) no-repeat -56px -257px #fff;font-size:0;animation:bounce 3s infinite;-webkit-animation:bounce 3s infinite}
@keyframes bounce {
    0%, 100% {transform: translateY(-8px)}
    50%{transform: translateY(8px)}
}

</style>