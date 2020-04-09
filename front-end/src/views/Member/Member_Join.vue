<template>
<div>
	<Interest v-if="show">
	</Interest>
  <div id="ndls" v-if="regipage">
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
						<dt><span class="red">*</span> <label for="birthday_year">생년월일</label></dt>
						<dd>
							<span class="select_style">
								<el-date-picker
								v-model="value2"
								type="date" 
								placeholder="날짜를 입력해주세요"
								:picker-options="pickerOptions">
								</el-date-picker>
							</span>
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
				<li>
					<dl>
						<dt><label for="mailing_use_y">성별</label></dt>
						<dd>
							<input type="radio" id="mailing_use_y" name="mailing_use_yn" value="Y" checked="checked"><label for="mailing_use_y">여자</label>
							<input type="radio" id="mailing_use_n" name="mailing_use_yn" value="N"><label for="mailing_use_n">남자</label>
						</dd>
					</dl>
				</li>
				
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="zipcode">주소</label></dt>
						<dd class="col3">
							<input type="text" class="ndls_input mb5" v-model="postcode" style="width:40%;" maxlength="5" placeholder="우편번호" readonly="readonly">
							<input type="button" @click="execDaumPostcode" value="우편번호 찾기" class="ndls_btn2 gray" style=""><br>
							<input type="text" class="ndls_input" v-model="address" style="width:80%; margin-bottom:5px;" placeholder="주소" readonly="readonly">
							<input type="text" class="ndls_input" v-model="extraAddress" ref="extraAddress" style="width:80%;" placeholder="상세주소">
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
	<el-steps :active="active" finish-status="success" style="padding-top: 50px">
		<el-step title="Step 1"></el-step>
		<el-step title="Step 2"></el-step>
		<el-step title="Step 3"></el-step>
	</el-steps>
</div>
</template>

<script>
import Interest from '@/views/Member/memberInterest.vue'
import dayoung from '@/assets/css/member/memberJoin.css'

export default {
	components:{
      Interest
    },
	data(){
		return{
		active: 0,
		regipage: true,
		show: false,
		memberId: null,
		pickerOptions: {
          disabledDate(time) {
            return time.getTime() > Date.now();
          },
          shortcuts: [{
            text: 'Today',
            onClick(picker) {
              picker.$emit('pick', new Date());
            }
          }, {
            text: 'Yesterday',
            onClick(picker) {
              const date = new Date();
              date.setTime(date.getTime() - 3600 * 1000 * 24);
              picker.$emit('pick', date);
            }
          }, {
            text: 'A week ago',
            onClick(picker) {
              const date = new Date();
              date.setTime(date.getTime() - 3600 * 1000 * 24 * 7);
              picker.$emit('pick', date);
            }
          }]
        },
        value1: '',
		value2: '',
		postcode: '',
      	address: '',
     	extraAddress: '',
      };
		
	},
	  methods: {
		execDaumPostcode() {

		new daum.Postcode({
			onComplete: (data) => {
			if (data.userSelectedType === 'R') {
				this.address = data.roadAddress;
			} else {
				this.address = data.jibunAddress;
			}
			if (data.userSelectedType === 'R') {
				if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
				this.extraAddress += data.bname;
				}
				if (data.buildingName !== '' && data.apartment === 'Y') {
				this.extraAddress +=
					this.extraAddress !== ''
					? `, ${data.buildingName}`
					: data.buildingName;
				}
				if (this.extraAddress !== '') {
				this.extraAddress = ` (${this.extraAddress})`;
				}
			} else {
				this.extraAddress = '';
			}
			},
		}).open();
	
	},
	idcheck(){
		alert(this.memberId)
	},
	regi(){
		if (this.active++ > 2) this.active = 0;
		this.regipage = false
		this.show = true
		scrollIntoView
		 // $('html, body').stop().animate({scrollTop: 0}, delay);
	
		


	},
	
  }
}
</script>

