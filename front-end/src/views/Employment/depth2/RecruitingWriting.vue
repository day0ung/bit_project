<template>
<div>
  <div id="recruitWrite">
	<p class="tar mb10"><span class="red">*</span> 표시가 된 곳은 필수 항목입니다.</p>
	
	<div class="recruitWrite_bwrite">
		<div class="box w100">
			<ul>
				<li>
					<dl>
						<dt><span>기업명</span></dt>
						<dd>
              <span class="ml10">종근당</span>
							<!-- <input type="text" v-model="memberNum" onchange="idCheckReset();" maxlength="20" class="recruitWrite_input mr5">
							<button class="recruitWrite_btn2 gray" style="text-decoration:none;" 
							@click="idcheck">
							아이디 중복확인</button>
							<span class="text1">※ 영문, 숫자 혼용 8자리이상</span> -->
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <span>공고 제목</span></dt>
						<dd>
							<input type="text" v-model="title" class="recruitWrite_input" :focusout="checkblank1()">
              <span class="text1">123</span>
              <span class="text1">456</span>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <span for="user_pwd_chk">비밀번호확인</span></dt>
						<dd>
							<input type="password" v-model="pwdchk" maxlength="20" class="recruitWrite_input">
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <span for="birthday_year">생년월일</span></dt>
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
						<dt><span class="red">*</span> <span for="exchange_mobile">핸드폰</span></dt>
						<dd>
							<input type="text" size="5" v-model="phone1" style="width:75px;" onblur="setNumber(this);" maxlength="4" class="recruitWrite_input">
							- <input type="text" size="5" v-model="phone2" style="width:75px;" onblur="setNumber(this);" maxlength="4" class="recruitWrite_input">
							- <input type="text" size="5" v-model="phone3" style="width:75px;" onblur="setNumber(this);" maxlength="4" class="recruitWrite_input">
						</dd>
					</dl>
				</li>

				<li>
					<dl>
						<dt><span for="user_pwd_chk">E-MAIL</span></dt>
						<dd>
							<input type="text" style="width:50%;" v-model="email" maxlength="100" class="recruitWrite_input">
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span for="mailing_use_y">성별</span></dt>
						<dd>
							<input type="radio" id="mailing_use_y" name="mailing_use_yn" value="Y" checked="checked"><span for="mailing_use_y">여자</span>
							<input type="radio" id="mailing_use_n" name="mailing_use_yn" value="N"><span for="mailing_use_n">남자</span>
						</dd>
					</dl>
				</li>
				
				<li>
					<dl>
						<dt><span class="red">*</span> <span for="zipcode">주소</span></dt>
						<dd class="col3">
							<input type="text" class="recruitWrite_input mb5" v-model="postcode" style="width:40%;" maxlength="5" placeholder="우편번호" readonly="readonly">
							<input type="button" @click="execDaumPostcode" value="우편번호 찾기" class="recruitWrite_btn2 gray" style=""><br>
							<input type="text" class="recruitWrite_input" v-model="address" style="width:80%; margin-bottom:5px;" placeholder="주소" readonly="readonly">
							<input type="text" class="recruitWrite_input" v-model="extraAddress" ref="extraAddress" style="width:80%;" placeholder="상세주소">
						</dd>
					</dl>
				</li>

			</ul>
		</div>
	</div>
	
	<p class="btn_w">
		<input type="button" value="회원가입" class="recruitWrite_btn red" @click="regi">
		<a href="/" class="recruitWrite_btn gray">취소</a>
	</p>
	<Interest v-if="show">
	</Interest>

	
</div>
</div>
</template>

<script>


import 'element-ui/lib/theme-chalk/index.css';
export default {
	
	data(){
		return{
    show: false,
    title : "",
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
	
	regi(){
		alert()
		this.show = true
  },
  checkblank1(){
    if(this.title == ""){
      alert("123")
    }
  }
	
  }
}
</script>

<style scoped>

/* font color */
.orange {color:#f96f00;}
.red{color:#ff4646;}
.black {color:#000000;}
.sky_blue {color:#0085c9;}
.blue {color:#0773c7;}
.gray {color:#C2C2C2;}
.gray2 {color:#9B9B9B;}
.green {color:#80a344;}


/* Padding */
.pt0 {padding-top:0px;}
.pt1 {padding-top:1px;}
.pt2 {padding-top:2px;}
.pt3 {padding-top:3px;}
.pt4 {padding-top:4px;}
.pt5 {padding-top:5px;}
.pt6 {padding-top:6px;}
.pt7 {padding-top:7px;}
.pt8 {padding-top:8px;}
.pt9 {padding-top:9px;}
.pt10 {padding-top:10px;}
.pt20 {padding-top:20px;}
.pt30 {padding-top:30px;}

.pr0 {padding-right:0px;}
.pr1 {padding-right:1px;}
.pr2 {padding-right:2px;}
.pr3 {padding-right:3px;}
.pr4 {padding-right:4px;}
.pr5 {padding-right:5px;}
.pr6 {padding-right:6px;}
.pr7 {padding-right:7px;}
.pr8 {padding-right:8px;}
.pr9 {padding-right:9px;}
.pr10 {padding-right:10px;}

.pl0 {padding-left:0px;}
.pl1 {padding-left:1px;}
.pl2 {padding-left:2px;}
.pl3 {padding-left:3px;}
.pl4 {padding-left:4px;}
.pl5 {padding-left:5px;}
.pl6 {padding-left:6px;}
.pl7 {padding-left:7px;}
.pl8 {padding-left:8px;}
.pl9 {padding-left:9px;}
.pl10 {padding-left:10px;}
.pl12 {padding-left: 12px;}
.pl20 {padding-left:20px;}
.pl30 {padding-left:30px;}

.pb0 {padding-bottom:0px;}
.pb1 {padding-bottom:1px;}
.pb2 {padding-bottom:2px;}
.pb3 {padding-bottom:3px;}
.pb4 {padding-bottom:4px;}
.pb5 {padding-bottom:5px;}
.pb6 {padding-bottom:6px;}
.pb7 {padding-bottom:7px;}
.pb8 {padding-bottom:8px;}
.pb9 {padding-bottom:9px;}
.pb10 {padding-bottom:10px;}

/* Margin */
.mt5 {margin-top:5px;}
.mt10 {margin-top:10px;}
.mt15 {margin-top:15px;}
.mt20 {margin-top:20px;}
.mt25 {margin-top:25px;}
.mt30 {margin-top:30px;}
.mt35 {margin-top:35px;}
.mt40 {margin-top:40px;}

.ml10 {margin-left:10px;}
.ml15 {margin-left:15px;}
.ml20 {margin-left:20px;}
.ml25 {margin-left:25px;}
.ml30 {margin-left:30px;}
.ml35 {margin-left:35px;}
.ml40 {margin-left:40px;}

.mr5 {margin-right:5px;}
.mr10 {margin-right:10px;}
.mr15 {margin-right:15px;}
.mr20 {margin-right:20px;}
.mr25 {margin-right:25px;}
.mr30 {margin-right:30px;}
.mr35 {margin-right:35px;}
.mr40 {margin-right:40px;}

.mb5 {margin-bottom:5px;}
.mb10 {margin-bottom:10px;}
.mb15 {margin-bottom:15px;}
.mb20 {margin-bottom:20px;}
.mb25 {margin-bottom:25px;}
.mb30 {margin-bottom:30px;}
.mb35 {margin-bottom:35px;}
.mb40 {margin-bottom:40px;}

.eng{font-family: 'Titillium Web', sans-serif;}

/**********************디폴트스타일**********************/
/* Input,textarea,select */
select{position:relative;}
.input_box {height:45px;padding:0 15px;line-height:45px;color:#757575;border:1px solid #d5dbde;cursor:text;background:#fff;}
.input_box:focus{border:1px solid #3db6ed;background-color:#f0f7fa;}
.recruitWrite_input {height:30px;padding:0 10px;line-height:30px;color:#757575;border:1px solid #d5dbde;cursor:text;background:#fff;}
.recruitWrite_input:focus{border:1px solid #3db6ed;background-color:#f0f7fa;}
.none_put{height:38px;line-height:38px;padding:0 5px;border:0 none;font-size:12px;background:none;vertical-align:middle;}




.select_style{display:inline-block;position:relative;min-width:80px;height:45px;line-height:40px;border:1px solid #dadada;background:#fff;}
.select_style select{display: inline-block;width:100%;cursor: pointer;outline:0;padding:0 25px 0 10px;border:0;font-size:13px;border-radius: 0;background: white;color: black;appearance: none;
-webkit-appearance: none; -moz-appearance: none;height: 100%;background:#fff url(/nanum/recruitWrite/imgs/common/select_style_bu.gif) no-repeat right 50%;}
.select_style select::-ms-expand {display: none;}
.select_style select:disabled {opacity: 0.5;pointer-events: none;}
.select_style.middle select{width:100px;}



.select_style2{display:inline-block;position:relative;min-width:60px;height:40px;padding:0 15px 0 15px;line-height:35px;border:1px solid #dadada;background:#fff;}
.select_style2.w100 {width:100%;}
.select_style2 select{display: inline-block;width:100%;cursor: pointer;outline:0;border:0;font-size:14px;border-radius: 0;background: white;color: black;appearance: none; 
-webkit-appearance: none; -moz-appearance: none;height: 100%;background:#fff url(/nanum/site/builder/skin/skin01/img/content/select_style_bu.gif) no-repeat right 50%;}
.select_style2 select::-ms-expand {display: none;}
.select_style2 select:disabled {opacity: 0.5;pointer-events: none;}
.select_style2.middle {width:194px;}




/**********************탭스타일**********************/
/*style1*/
.recruitWritetab{width:100%;}
.recruitWritetab ul{overflow:hidden;clear:both;width:100%;}
.recruitWritetab ul li{float:left;width:50%;}
.recruitWritetab ul li a{display:block;width:100%;padding: 15px 0;color:#333;text-align:center;border:1px solid #dfdfdf;background: #f3f3f3;box-sizing:border-box;}
.recruitWritetab ul li a.on{position:relative;color: #222;font-weight:bold;border:1px solid #222;background:#fff;z-index:1;}
.recruitWritetab ul li a,
.recruitWritetab ul li a.on:hover a {border-bottom: 1px solid #d6d6d6;}
.recruitWritetab ul.no2 li{width:50%;}
.recruitWritetab ul.no3 li{width:33.2%;}
.recruitWritetab ul.no4 li{width:25%;}
.recruitWritetab ul.no5 li{width:20%;}
.recruitWritetab_b{margin-bottom:45px;}

/*style2*/
.recruitWritetab2{width:100%;}
.recruitWritetab2 ul{width:100%;display:inline-block;}
.recruitWritetab2 ul li{float:left;width:50%;}
.recruitWritetab2 ul.no2 li{width:50%;}
.recruitWritetab2 ul.no3 li{width:33.3%;}
.recruitWritetab2 ul.no4 li{width:25%;}
.recruitWritetab2 ul.no5 li{width:20%;}
.recruitWritetab2 ul li a{display:block;padding:12px 0;text-align:center;font-weight:bold;border:1px solid #fff;color:#fff;background:#a5acb2;}
.recruitWritetab2 ul li a{
  vertical-align: middle;
  -webkit-transform: perspective(1px) translateZ(0);
  transform: perspective(1px) translateZ(0);
  box-shadow: 0 0 1px transparent;
  overflow: hidden;
  -webkit-transition-duration: 0.3s;
  transition-duration: 0.3s;
  -webkit-transition-property: color, background-color;
  transition-property: color, background-color;}
.recruitWrite_tab ul li a:hover{background:#868f96;}
.recruitWrite_tab ul li a.on,
.recruitWrite_tab ul li a.on:hover{background:#ffb400;}
.recruitWrite_tab ul li:first-child a{border-left:none;}

.tab_b{margin-bottom:25px;}

/**********************버튼스타일**********************/
.btn_w{width:100%;text-align:center;padding:20px 0;}
.recruitWrite_btn{display:inline-block;height:45px;margin:0 3px;line-height:45px;font-size:15px;text-align:center;padding:0 30px;vertical-align:middle;cursor:pointer;border:0 none;}
.recruitWrite_btn2{display:inline-block;height:35px;margin:0 3px;line-height:35px;font-size:12px;text-align:center;padding:0 15px;vertical-align:top;cursor:pointer;border:0 none;}
.excel_btn{display:inline-block;height:35px;margin:0 3px;line-height:35px;font-size:12px;text-align:center;padding:0 45px 0 15px;vertical-align:middle;cursor:pointer;border:1px solid #4a802a;background:#fff url(/nanum/recruitWrite/imgs/common/excel_icon.gif) no-repeat 95% 50%;;color:#4a802a;}
.excel_btn:hover{background-color:#f5f5f5;}
.recruitWrite_btn.green,
.recruitWrite_btn2.green{color:#fff;background:#17a981;}
.recruitWrite_btn.green:hover,
.recruitWrite_btn2.green:hover{background:#009069;}
.recruitWrite_btn.gray,
.recruitWrite_btn2.gray{color:#fff;background:#8b95a3;}
.recruitWrite_btn.gray:hover,
.recruitWrite_btn2.gray:hover{background:#5e6a7c;}
.recruitWrite_btn.black,
.recruitWrite_btn2.black{color:#fff;background:#222;}
.recruitWrite_btn.black:hover,
.recruitWrite_btn2.black:hover{background:#000;}
.recruitWrite_btn.mint,
.recruitWrite_btn2.mint{color:#fff;background:#44b2d1;}
.recruitWrite_btn.mint:hover,
.recruitWrite_btn2.mint:hover{background:#208aa7;}
.recruitWrite_btn.blue,
.recruitWrite_btn2.blue{color:#fff;background:#3053c7;}
.recruitWrite_btn.blue:hover,
.recruitWrite_btn2.blue:hover{background:#2648bc;}
.recruitWrite_btn.orange,
.recruitWrite_btn2.orange{color:#fff;background:#ff7e00;}
.recruitWrite_btn.orange:hover,
.recruitWrite_btn2.orange:hover{color:#fff;background:#ea9500;}
.recruitWrite_btn.red,
.recruitWrite_btn2.red{color:#fff;background:#bf3731;}
.recruitWrite_btn.red:hover,
.recruitWrite_btn2.red:hover{background:#bf3731;}

.recruitWrite_btn.pink,
.recruitWrite_btn2.pink{color:#fff; background:#e3409a;}
.recruitWrite_btn.pink:hover,
.recruitWrite_btn2.pink:hover{background:#e3409a;}

.recruitWrite_btn.violet,
.recruitWrite_btn2.violet{color:#fff;background:#8f4ac4;}
.recruitWrite_btn.violet:hover,
.recruitWrite_btn2.violet:hover {color:#fff;background:#c366e8;}

.recruitWrite_btn2.post_search {width:20%; margin-bottom:5px;}

.recruitWrite_btn:hover, 
.recruitWrite_btn:focus, 
.recruitWrite_btn:active,
.recruitWrite_btn2:hover, 
.recruitWrite_btn2:focus, 
.recruitWrite_btn2:active{color:#fff;}




/**********************테이블**********************/
table.recruitWrite_table1{width:100%;border-collapse:collapse;border-top:2px solid #000;}
table.recruitWrite_table1 th{font-weight:bold;}
table.recruitWrite_table1 th,
table.recruitWrite_table1 td{padding:12px 10px;border:1px solid #c9e1de;text-align:center;}
table.recruitWrite_table1 th input,
table.recruitWrite_table1 td input{vertical-align:middle;}
table.recruitWrite_table1 thead th{color:#333;background:#e8f3f9; font-size:13px;}
table.recruitWrite_table1 tbody th{color:#333; letter-spacing:-1px;}
table.recruitWrite_table1 tbody td{color:#444;}
table.recruitWrite_table1 .left{padding:10px 15px;text-align:left;}
table.recruitWrite_table1 .right{padding:8px;text-align:right;}
table.recruitWrite_table1 .bg{background:#e8f3f9;}
/* table.recruitWrite_table1 .first{border-top:2px solid #222;} */
table.recruitWrite_table1 tbody a.view{color:#000;text-decoration:underline;}
table.recruitWrite_table1 .title_name{text-align:left;padding-left:15px;font-weight:bold;color:#0066cc;}
table.recruitWrite_table1 .title_name a{font-weight:bold;color:#0066cc;}
table.recruitWrite_table1 .title_name a:hover{text-decoration:underline;}

table.recruitWrite_table1 .tit_group {text-align:left;padding:10px 20px;}
table.recruitWrite_table1 .tit_group p{padding-bottom:8px;margin-bottom:8px;font-weight:bold;color:#000;border-bottom:1px dashed #ccc;}
table.recruitWrite_table1 .tit_group p a{color:#0066cc;}
table.recruitWrite_table1 .tit_group p a:hover{text-decoration:underline;}
table.recruitWrite_table1 .tit_group dl{overflow:hidden;clear:both;width:100%;font-size:11px;color:#000;}
table.recruitWrite_table1 .tit_group dl dt{float:left;font-weight:bold;padding-left:8px;background:url(/nanum/recruitWrite/imgs/booksearch/bl_dot.gif) no-repeat 0 10px;}
table.recruitWrite_table1 .tit_group dl dd {float:left;margin:0 10px 0 8px;}




/**********기본리스트**********/
.recruitWritetit{padding-top:17px;margin-bottom:30px;background:url(/nanum/site/builder/skin/skin01/img/content/h3_bar.gif) no-repeat 0 0;font-weight:normal;font-family:'NanumSquareB';font-size:23px;font-weight:normal;color:#222;line-height:1.2;letter-spacing:-0.05em;}



/********************게시판형식********************/
#recruitWrite{width:100%;margin-top: 59px}

#recruitWrite .recruitWrite_total {width:100%;}
#recruitWrite .recruitWrite_total_left {float:left; font-size:0.95em; padding-top:5px; height:22px;}
#recruitWrite .recruitWrite_total_right {float:right; padding-bottom:5px;}
#recruitWrite .recruitWrite_total_right li {float:left;}
#recruitWrite .recruitWrite_total_right li img {height:20px;}
#recruitWrite .recruitWrite_total img {padding-left:3px;}
#recruitWrite div.recruitWrite_total .recruitWrite_orange{color:#F96F00;}
#recruitWrite div.recruitWrite_total .recruitWrite_red{color:#e02e2e;}
#recruitWrite .recruitWrite_button {width:100%; margin-top:5px; text-align:right;}
#recruitWrite span.category_color {color:#979797;}


/* List */
#recruitWrite .recruitWrite_blist {clear:both;}
#recruitWrite .recruitWrite_blist table {width:100%; line-height:16px; border-collapse:collapse; border-top:1px solid #e5e5e5; border-bottom:1px solid #e5e5e5;}
#recruitWrite .recruitWrite_blist table caption {display:none;}
#recruitWrite .recruitWrite_blist thead th {text-align:center; border-bottom:1px solid #5b5b5b; padding:15px 0;color:#333; font-size:14px;line-height:160%; background:url(/nanum/recruitWrite/imgs/common/tit_line.gif) no-repeat right;}
#recruitWrite .recruitWrite_blist thead th:last-child {background-image:none;}
#recruitWrite .recruitWrite_blist thead th.th_none {background-image:none;}
#recruitWrite .recruitWrite_blist tbody td {white-space:nowrap;padding:15px 0;border-bottom:1px solid #e5e5e5; text-align:center; line-height:140%;}
#recruitWrite .recruitWrite_blist tbody td img {vertical-align:middle;}
#recruitWrite .recruitWrite_blist tbody td span.reply_count {color:#EE5A00; font-size:0.9em; font-weight:normal; letter-spacing:-0.1em;}
#recruitWrite .recruitWrite_blist tbody td.notice {background-color:#FBFBFB;}
#recruitWrite .recruitWrite_blist tbody td.title {white-space:normal; text-align:left;}
#recruitWrite .recruitWrite_blist tbody td.title_bookimage {padding-top:5px; padding-bottom:5px;}
#recruitWrite .recruitWrite_blist tbody td.center {text-align:center;}
#recruitWrite .recruitWrite_blist tbody td .jsInfo0{color:#222;font-size:17px;}
#recruitWrite .recruitWrite_blist tbody td .jsInfo0 b{font-weight:normal;text-decoration:underline;color:#3053c7;}
div.recruitWrite_kdc_div img{vertical-align:middle;}



/**********글쓰기**********/
/***(무조건 셀제목에 색상을 넣거나 line을 넣고싶으면 bg로 조정. 반응형의 작업으로 ul li로 작업된 이유로 dd와 height를 딱 맞춰 작업하기가 어렵다.)***/
/***(또한 w100은 두칸이 아니라 아예 한줄내용만 나올때를 의미하며 세칸나올때, 네칸나올때는 class값을 추가하여 작업할수 있도록 한다.
w100은 위에 테이블셀 크기에 맞춰서 가면 안되기 때문에 box에다가 값을 주고, 다른 칸수 역시 box자체에 class값을 주어 작업한다.)***/
#recruitWrite .recruitWrite_bwrite{width:100%;border:1px solid #dfdfdf;border-top:2px solid #222; line-height:0;}
/*#recruitWrite .recruitWrite_bwrite .box{padding:20px 30px;}*/
#recruitWrite .recruitWrite_bwrite .box.w100{width:auto; line-height:0;}
#recruitWrite .recruitWrite_bwrite .box ul{display:inline-block;width:100%;}
#recruitWrite .recruitWrite_bwrite .box ul li{border-top:1px solid #dfdfdf;vertical-align:middle;font-size:13px; font-family: 'NotoKrR', sans-serif;}
#recruitWrite .recruitWrite_bwrite .box ul li:first-child{border-top:0 none;}
#recruitWrite .recruitWrite_bwrite .box ul li.bg_none{padding:12px 12px;text-align:left;background:none; }
#recruitWrite .recruitWrite_bwrite .box ul li dl{width:100%;font-size:15px; display: table;}
#recruitWrite .recruitWrite_bwrite .box ul li dl dt{display: table-cell; width:25%; box-sizing:border-box;vertical-align:middle;text-align:center;  font-family: 'NotoKrM', sans-serif; color:#222;  background:#f9fafa; 
padding: 10px 10px; *float:left; line-height:1; }
.graybg {background:#f5f5f5;}
.lh12 {line-height:1.2 !important;}

#recruitWrite .recruitWrite_bwrite .box ul li dl dd{position:relative; vertical-align:middle;  display:table-cell; padding:10px 10px;}
#recruitWrite .recruitWrite_bwrite .box ul li input,
#recruitWrite .recruitWrite_bwrite .box ul li span,
#recruitWrite .recruitWrite_bwrite .box ul li strong,
#recruitWrite .recruitWrite_bwrite .box ul li a,
#recruitWrite .recruitWrite_bwrite .box ul li img{vertical-align:middle;}
#recruitWrite .recruitWrite_bwrite .box ul li input{margin-right:5px;}
#recruitWrite .recruitWrite_bwrite .box ul li .text1 {font-size:12px; line-height:1.3; display:inline-block;}
#recruitWrite .recruitWrite_bwrite .recruitWrite_input {height:30px; line-height:30px; width:60%;}

#recruitWrite .recruitWrite_bwrite .select_style {height:35px; line-height:35px; overflow:hidden;}
#recruitWrite .recruitWrite_bwrite .select_style select {height:100%;}
.agree_w{padding:30px;margin-top:30px;border-top:1px dashed #ccc;border-bottom:1px dashed #ccc;background:#f6f6f6;text-align:center;}






/* Button */
.recruitWrite_button {clear:both;}
.recruitWrite_button .fl {float:left; /*background:transparent url(/nanum/recruitWrite/imgs/common/recruitWrite_ldot.gif) no-repeat 25px 5px;*/}
.recruitWrite_button .fr {float:right; overflow:hidden;}
.recruitWrite_button .pt10 {padding-top:10px;}


.recruitWrite_button ul li {float:left;}
.recruitWrite_button ul li.pl {padding-left:10px;}
.recruitWrite_button ul li.pt {padding-top:7px;}
.recruitWrite_button span.bt {padding-top:10px; padding-left:4px; text-align:right;}
.recruitWrite_button2 {margin:0 auto; text-align:center; padding-top:10px; padding-left:4px;}



a.recruitWrite_lbtn {display:inline-block; height:22px; padding-left:20px; background:url(/nanum/recruitWrite/imgs/common/recruitWrite_lbtn_l.gif) no-repeat 0 0; margin-right:3px;}
a.recruitWrite_lbtn span {display:inline-block; height:22px; line-height:23px; padding-right:14px; background:url(/nanum/recruitWrite/imgs/common/recruitWrite_lbtn_r.gif) no-repeat right 0; letter-spacing:-1px;}
.recruitWrite_bt01 {display:inline;}
.recruitWrite_bt01 a{display:inline; overflow:hidden; padding-left:13px; margin-right:3px; font:12px dotum; letter-spacing:-1px; color:#6B6B6B; text-decoration:none; background:url(/nanum/recruitWrite/imgs/common/bt01_bg.gif) left 0; cursor:pointer;}
.recruitWrite_bt01 a:hover{background:url(/nanum/recruitWrite/imgs/common/bt01_bg.gif) left -22px; text-decoration:none;}
.recruitWrite_bt01 a span{display:inline; overflow:hidden; padding-right:10px; line-height:200%; background:url(/nanum/recruitWrite/imgs/common/bt01_bg.gif) right 0;}
.recruitWrite_bt01 a:hover span{color:#6B6B6B; background:url(/nanum/recruitWrite/imgs/common/bt01_bg.gif) right -22px;}





/* 주소찾기 */
.post_search2{border:1px solid #CDCDCD;height:80px;margin-right:10px;margin-top:3px;overflow:auto;padding:6px;}

a.recruitWrite_btn_b  {display:inline-block; background:#000; color:#fff !important; text-align:center; min-width:40px; height:36px; font-size:13px; padding:0 15px 0 15px; font-weight:600; letter-spacing:-1px; line-height:36px;}
a.recruitWrite_btn_b:hover {background:#404040; text-decoration:none;}

a.recruitWrite_btn_g  {display:inline-block; background:#7e7e7e; color:#fff !important; text-align:center; min-width:40px; height:36px; font-size:13px; padding:0 15px 0 15px; font-weight:600; letter-spacing:-1px; line-height:36px;}
a.recruitWrite_btn_g:hover {background:#666; text-decoration:none;}

a.recruitWrite_btn_point  {display:inline-block; background:#e77272; color:#fff !important; text-align:center; min-width:40px; height:36px; font-size:13px; padding:0 15px 0 15px; font-weight:600; letter-spacing:-1px; line-height:36px;}
a.recruitWrite_btn_point:hover {background:#d44c4c; text-decoration:none;}

input.recruitWrite_btn_b  {vertical-align:middle;background:#000; color:#fff; min-width:70px; height:36px; font-size:13px; padding:0 15px 0 15px; border:none; cursor:pointer; font-weight:600; letter-spacing:-1px;}
input.recruitWrite_btn_b:hover {background:#666;}

input.recruitWrite_btn_g  {vertical-align:middle;background:#7e7e7e; color:#fff; min-width:70px; height:36px; font-size:13px; padding:0 15px 0 15px; border:none; cursor:pointer; font-weight:600; letter-spacing:-1px;}
input.recruitWrite_btn_g:hover{background:#666;}

input.recruitWrite_btn_point  {vertical-align:top;background:#e77272; color:#fff; min-width:70px; height:36px; font-size:14px; border:none;cursor:pointer; font-weight:600; letter-spacing:-0.5px;}
input.recruitWrite_btn_point:hover {background:#d44c4c; text-decoration:none;}

input.recruitWrite_btn_save  {vertical-align:middle;background:#e77272; color:#fff;font-size:12px;padding:8px 12px 6px 12px;border:none; cursor:pointer; font-weight:600; letter-spacing:-1px;font-family:돋움;}
input.recruitWrite_btn_save:hover {background:#d44c4c;}


a.recruitWrite_btn_mini {display:inline-block; color:#e77272; font-size:11px; font-family:'돋움', Dotum, sans-serif;letter-spacing:0; line-height:15px; height:15px; border-bottom:1px solid #f45246; background:url('/img/common/bl_arrow2.gif') no-repeat right 3px;padding-right:10px;padding-left:2px;}
a.recruitWrite_btn_mini:hover{color:#f45246;border-color:#f45246;font-weight:bold;letter-spacing:-1px;}
</style>

