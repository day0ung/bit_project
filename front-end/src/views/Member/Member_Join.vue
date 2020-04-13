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
							<br>
							<p class="text1">※ 중복확인버튼을 눌러주세요</p>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="user_pwd">비밀번호</label></dt>
						<dd class="pw_wrap">
							<input type="password" v-model="pwd" maxlength="20" class="ndls_input" @keydown="checkpwd"><span class="text1">※ 영문, 숫자, 특수문자 혼용 8자리이상</span>
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
						<dt><label for="user_pwd_chk">E-MAIL</label></dt>
						<dd>
							<input type="text" style="width:50%;" v-model="email" maxlength="100" class="ndls_input">
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="manage_code">나이</label></dt>
						<dd>
							<span class="select_style">
							<select id="manage_code" name="manage_code" class="cus_selt">
								<option value="">나이대</option>
								<option value="MA">10대</option>
								<option value="MB">20-24</option>
								<option value="MC">25-29</option>
								<option value="MD">30-34</option>
								<option value="ME">40대</option>
							</select>
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
						<dt><label for="radioLable">성별</label></dt>
						<dd>
							<input type="radio" value="Y" name="gender"><label for="radioLable">여자</label>
							<input type="radio" value="N" name="gender"><label for="radioLable">남자</label>
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
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="zipcode">관심지역</label></dt>
						<dd class="col3">
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="zipcode">관심분야</label></dt>
						<dd class="col3">
							<div class="radios">
								<input type="radio" id="ex_rd" name="ex_rds" @click="sel0"> <label for="ex_rd">대학생/취업</label> 
							
								<input type="radio" id="ex_rd1" name="ex_rds" @click="sel1"> <label for="ex_rd1">공무원/임용</label> 
								<input type="radio" id="ex_rd2" name="ex_rds" @click="sel2"> <label for="ex_rd2">어학/회화</label> 
								<input type="radio" id="ex_rd3" name="ex_rds" @click="sel3"> <label for="ex_rd3">라이프/취미</label> 
							</div>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="zipcode">상세분야</label></dt>
						<dd class="col3">
							 <div class="checks" v-if="category == 1"> 
	  							<input type="checkbox" id="ex_chk1" v-model="checkedNames" value="1" > <label for="ex_chk1">공기업</label> 
	  							<input type="checkbox" id="ex_chk2" v-model="checkedNames" value="2"> <label for="ex_chk2">자격증</label> 
	  							<input type="checkbox" id="ex_chk3" v-model="checkedNames" value="3">  <label for="ex_chk3">자소서</label> 
	  							<input type="checkbox" id="ex_chk4" v-model="checkedNames" value="4"> <label for="ex_chk4">면접</label> 
	  							<input type="checkbox" id="ex_chk5" v-model="checkedNames" value="5"> <label for="ex_chk5">경영/사무</label> 
	  							<input type="checkbox" id="ex_chk6" v-model="checkedNames" value="6"> <label for="ex_chk6">디자인</label> 
	  							<input type="checkbox" id="ex_chk7" v-model="checkedNames" value="7"> <label for="ex_chk7">전문직</label> 
	  							<input type="checkbox" id="ex_chk8" v-model="checkedNames" value="8"> <label for="ex_chk8">IT/Internet</label> 
	  							<input type="checkbox" id="ex_chk9" v-model="checkedNames" value="9"> <label for="ex_chk9">유통/무역</label> 
	  							<input type="checkbox" id="ex_chk10" v-model="checkedNames" value="10"> <label for="ex_chk10">서비스</label> 
							</div>
							<div class="checks" v-if="category == 2" v-bind="check"> 
	  							<input type="checkbox" id="ex_chk11" v-model="checkedNames" value="11"> <label for="ex_chk11">일반행정</label> 
	  							<input type="checkbox" id="ex_chk12" v-model="checkedNames" value="12"> <label for="ex_chk12">세무</label> 
	  							<input type="checkbox" id="ex_chk13" v-model="checkedNames" value="13"> <label for="ex_chk13">교육행정</label> 
	  							<input type="checkbox" id="ex_chk14" v-model="checkedNames" value="14"> <label for="ex_chk14">교정</label> 
	  							<input type="checkbox" id="ex_chk15" v-model="checkedNames" value="15"> <label for="ex_chk15">군무원</label> 
	  							<input type="checkbox" id="ex_chk16" v-model="checkedNames" value="16"> <label for="ex_chk16">사회복지</label> 
	  							<input type="checkbox" id="ex_chk17" v-model="checkedNames" value="17"> <label for="ex_chk17">검찰사무</label> 
	  							<input type="checkbox" id="ex_chk18" v-model="checkedNames" value="18"> <label for="ex_chk18">소방</label> 
	  							<input type="checkbox" id="ex_chk19" v-model="checkedNames" value="19"> <label for="ex_chk19">경찰</label> 
							</div>
							<div class="checks" v-if="category == 3"> 
	  							<input type="checkbox" id="ex_chk20" v-model="checkedNames" value="20"> <label for="ex_chk20">토익</label> 
	  							<input type="checkbox" id="ex_chk21" v-model="checkedNames" value="21"> <label for="ex_chk21">토스/오픽</label> 
	  							<input type="checkbox" id="ex_chk22" v-model="checkedNames" value="22"> <label for="ex_chk22">기초영어회화</label> 
	  							<input type="checkbox" id="ex_chk23" v-model="checkedNames" value="23"> <label for="ex_chk23">일본어</label> 
	  							<input type="checkbox" id="ex_chk24" v-model="checkedNames" value="24"> <label for="ex_chk24">중국어</label> 
	  							<input type="checkbox" id="ex_chk25" v-model="checkedNames" value="25"> <label for="ex_chk25">제2외국어</label> 
							</div>
							<div class="checks" v-if="category == 4"> 
	  							<input type="checkbox" id="ex_chk26" v-model="checkedNames" value="26"> <label for="ex_chk26">여행/아웃도어</label> 
	  							<input type="checkbox" id="ex_chk27" v-model="checkedNames" value="27"> <label for="ex_chk27">운동</label> 
	  							<input type="checkbox" id="ex_chk28" v-model="checkedNames" value="28"> <label for="ex_chk28">봉사활동</label> 
	  							<input type="checkbox" id="ex_chk29" v-model="checkedNames" value="29"> <label for="ex_chk29">공예/만들기</label> 
	  							<input type="checkbox" id="ex_chk30" v-model="checkedNames" value="30"> <label for="ex_chk30">댄스/무용</label> 
							</div>
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
import Interest from '@/views/Member/memberInterest.vue'
import dayoung from '@/assets/css/member/memberJoin.css'

export default {
	components:{
      Interest
    },
	data(){
		return{
		category: 1,
		checkedNames : [],
		memberId: null,
		pwd: null, 
		pwdchk: null, 
		phone1: null, 
		phone2: null, 
		phone3: null, 
		email: null,
 		value1: '',
		value2: '',
		postcode: '',
      	address: '',
     	extraAddress: '',
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
	allSelect(){
		
	},
	idcheck(){
		alert(this.memberId)
		
	},
	checkpwd(){
		alert(this.pwd)
	},
	regi(){
	},
	sel0(){
		this.category = 1
		$("input[type=checkbox]").prop("checked", false);
	},
	sel1(){
		this.category = 2
		 $("input[type=checkbox]").prop("checked", false);
	},
	sel2(){
		this.category = 3
		 $("input[type=checkbox]").prop("checked", false);
	},
	sel3(){
		this.category = 4
		 $("input[type=checkbox]").prop("checked", false);
	}
  }
}
</script>
