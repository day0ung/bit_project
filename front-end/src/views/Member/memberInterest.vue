<template>
  <div>
  <div id="ndls">
	<p class="tar mb10"><span class="red">*</span> 표시가 된 곳은 필수 항목입니다.</p>
	
	<div class="ndls_bwrite join_write">
		<div class="box w100">
			<ul>
		
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="user_id">아이디</label></dt>
						<dd class="pw_wrap">
							<input type="text" v-model="memberId" onchange="idCheckReset();" maxlength="20" class="ndls_input mr5">
							<button class="ndls_btn2 gray" style="text-decoration:none;" 
							@click="idcheck">
							아이디 중복확인</button>
							<span class="text1">※ 영문, 숫자 혼용 8자리이상</span>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="user_pwd">비밀번호</label></dt>
						<dd class="pw_wrap">
							<input type="password" v-model="pwd" maxlength="20" class="ndls_input" onkeyup="checkNumber();"><span class="text1">※ 영문, 숫자, 특수문자 혼용 8자리이상</span>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="user_pwd_chk">비밀번호확인</label></dt>
						<dd>
							<input type="password" v-model="pwdchk" maxlength="20" class="ndls_input">
						</dd>
					</dl>
				</li>
			
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="exchange_mobile">핸드폰</label></dt>
						<dd>
							<input type="text" size="5" v-model="phone1" style="width:75px;" onblur="setNumber(this);" maxlength="4" class="ndls_input">
							- <input type="text" size="5" v-model="phone2" style="width:75px;" onblur="setNumber(this);" maxlength="4" class="ndls_input">
							- <input type="text" size="5" v-model="phone3" style="width:75px;" onblur="setNumber(this);" maxlength="4" class="ndls_input">
						</dd>
					</dl>
				</li>

				<li>
					<dl>
						<dt><label for="user_pwd_chk">E-MAIL</label></dt>
						<dd>
							<input type="text" style="width:50%;" v-model="email" maxlength="100" class="ndls_input">
						</dd>
					</dl>
				</li>

			</ul>
		</div>
	</div>
	
		<p class="btn_w">
			<input type="button" value="회원가입" class="ndls_btn red" @click="regi">
			<a href="/" class="ndls_btn gray">취소</a>
		</p>
	</div>
  </div>
</template>

<script>
import dayoung from '@/assets/css/member/memberJoin.css'
export default {

}
</script>

<style>

</style>