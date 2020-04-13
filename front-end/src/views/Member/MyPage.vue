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
						  <el-input v-model="ruleForm.name"  placeholder="아이디를 입력해주세요" style="width:300px"></el-input>
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
                <el-form-item label="Activity zone">
                  <el-select v-model="form.region" placeholder="나이대">
                    <el-option label="Zone one" value="10대"></el-option>
                    <el-option label="Zone two" value="20-24"></el-option>
                    <el-option label="Zone two" value="25-29"></el-option>
                    <el-option label="Zone two" value="30-34"></el-option>
                    <el-option label="Zone two" value="40대"></el-option>
                  </el-select>
                </el-form-item>
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
			<input type="button" value="회원가입" class="ndls_btn red" @click="regi">
			<a href="/" class="ndls_btn gray">취소</a>
		</p>
	</div>
    </el-form>
</div>
</template>

<script>
import dayoung from '@/assets/css/member/memberJoin.css'

 export default {
    data() {
      return {
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
      };
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            alert('submit!');
          } else {
            console.log('error submit!!');
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style>

</style>
