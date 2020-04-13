<template>
<div>
<el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="120px" class="demo-ruleForm">
  <div id="ndls">
	<p class="tar mb10"><span class="red">*</span> 표시가 된 곳은 필수 항목입니다.</p>
	
	<div class="ndls_bwrite join_write">
		<div class="box w100">
			<ul>
		
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="user_id">아이디</label></dt>
						<dd class="pw_wrap">
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
							<el-input type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="user_pwd_chk">비밀번호확인</label></dt>
						<dd>
						    <el-input type="password" v-model="ruleForm.checkPass" autocomplete="off"></el-input>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><label for="user_pwd_chk">E-MAIL</label></dt>
						<dd>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="manage_code">나이</label></dt>
						<dd>
							<el-select v-model="ruleForm.region" placeholder="나이대를 선택해주세요">
								<el-option label="10대" value="10대"></el-option>
								<el-option label="20-24" value="20-24"></el-option>
								<el-option label="25-29" value="25-29"></el-option>
								<el-option label="30-34" value="30-34"></el-option>
								<el-option label="40대" value="40대"></el-option>
							</el-select>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="exchange_mobile">핸드폰</label></dt>
						<dd>
						</dd>
					</dl>
				</li>

				
				<li>
					<dl>
						<dt><label for="radioLable">성별</label></dt>
						<dd>
							  <el-radio v-model="radio1" label="1" border>남자</el-radio>
  							  <el-radio v-model="radio1" label="2" border>여자</el-radio>
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
							</div>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="zipcode">상세분야</label></dt>
						<dd class="col3">
							
						</dd>
					</dl>
				</li>
			</ul>
		</div>
	</div>
	
		<p class="btn_w">
			
		</p>
	</div>
</el-form>
</div>
</template>

<script>
import dayoung from '@/assets/css/member/memberJoin.css'

export default {
	data(){
		return{
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
		
		ruleForm: {
          name: '',
          region: '',
          date1: '',
		  date2: '',
          delivery: false,
          type: [],
          resource: '',
          desc: ''
		},
		radio1: '1',
		rules: {
          name: [
            { required: true, message: 'Please input Activity name', trigger: 'blur' },
            { min: 3, max: 5, message: 'Length should be 3 to 5', trigger: 'blur' }
          ],
          region: [
            { required: true, message: 'Please select Activity zone', trigger: 'change' }
          ],
          date1: [
            { type: 'date', required: true, message: 'Please pick a date', trigger: 'change' }
          ],
          date2: [
            { type: 'date', required: true, message: 'Please pick a time', trigger: 'change' }
          ],
          type: [
            { type: 'array', required: true, message: 'Please select at least one activity type', trigger: 'change' }
          ],
          resource: [
            { required: true, message: 'Please select activity resource', trigger: 'change' }
          ],
          desc: [
            { required: true, message: 'Please input activity form', trigger: 'blur' }
          ]
        }
	  }
		
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

  }
}
</script>
