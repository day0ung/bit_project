<template>
<div>
  <div id="ndls">
	<p class="tar mb10"><span class="red">*</span> 표시가 된 곳은 필수 항목입니다.</p>


	<div>
	<input type="hidden" name="name" value="정다영">
	<input type="hidden" name="ipin_hash" value="K1By+AYOFAxfKDKKLhUfPOBe4Bw64je2LNA3DCJApPbJu/n2XEMEowBKKYdP47pX5ZBpkQRYoeep2S22+mgzew==">
	<input type="hidden" name="gpin_sex" value="1">
	<input type="hidden" name="gpin_hash" value="MC0GCCqGSIb3DQIJAyEAsr2qWn8IFHcTbpb44iNZtwErFUL0MYGzOgoJjSEYQ/Q=">
	<input type="hidden" name="idchk" value="N">
	<input type="hidden" name="prepage" value="">
	</div>
	
	<div class="ndls_bwrite join_write">
		<div class="box w100">
			<ul>
				<li>
					<dl>
						<dt>이름</dt>
						<dd>
							정다영
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="user_id">아이디</label></dt>
						<dd class="pw_wrap">
							<input type="text" id="user_id" name="user_id" onchange="idCheckReset();" maxlength="20" class="ndls_input mr5">
							<a href="#idcheck" onclick="idCheck();" class="ndls_btn2 gray" style="text-decoration:none;">아이디중복확인</a>
							<span class="text1">※ 영문, 숫자 혼용 8자리이상</span>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="user_pwd">비밀번호</label></dt>
						<dd class="pw_wrap">
							<input type="password" id="user_pwd" name="user_pwd" maxlength="20" class="ndls_input" onkeyup="checkNumber();"><span class="text1">※ 영문, 숫자, 특수문자 혼용 8자리이상</span>
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="user_pwd_chk">비밀번호확인</label></dt>
						<dd>
							<input type="password" id="user_pwd_chk" name="user_pwd_chk" maxlength="20" class="ndls_input">
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="birthday_year">생년월일</label></dt>
						<dd>
							<span class="select_style">
							<select id="birthday_year" name="birthday_year">
							
								<option value="1920">1920년</option>
							
								<option value="1921">1921년</option>
							
								<option value="1922">1922년</option>
							
								<option value="1923">1923년</option>
							
								<option value="1924">1924년</option>
							
								<option value="1925">1925년</option>
							
								<option value="1926">1926년</option>
							
								<option value="1927">1927년</option>
							
								<option value="1928">1928년</option>
							
								<option value="1929">1929년</option>
							
								<option value="1930">1930년</option>
							
								<option value="1931">1931년</option>
							
								<option value="1932">1932년</option>
							
								<option value="1933">1933년</option>
							
								<option value="1934">1934년</option>
							
								<option value="1935">1935년</option>
							
								<option value="1936">1936년</option>
							
								<option value="1937">1937년</option>
							
								<option value="1938">1938년</option>
							
								<option value="1939">1939년</option>
							
								<option value="1940">1940년</option>
							
								<option value="1941">1941년</option>
							
								<option value="1942">1942년</option>
							
								<option value="1943">1943년</option>
							
								<option value="1944">1944년</option>
							
								<option value="1945">1945년</option>
							
								<option value="1946">1946년</option>
							
								<option value="1947">1947년</option>
							
								<option value="1948">1948년</option>
							
								<option value="1949">1949년</option>
							
								<option value="1950">1950년</option>
							
								<option value="1951">1951년</option>
							
								<option value="1952">1952년</option>
							
								<option value="1953">1953년</option>
							
								<option value="1954">1954년</option>
							
								<option value="1955">1955년</option>
							
								<option value="1956">1956년</option>
							
								<option value="1957">1957년</option>
							
								<option value="1958">1958년</option>
							
								<option value="1959">1959년</option>
							
								<option value="1960">1960년</option>
							
								<option value="1961">1961년</option>
							
								<option value="1962">1962년</option>
							
								<option value="1963">1963년</option>
							
								<option value="1964">1964년</option>
							
								<option value="1965">1965년</option>
							
								<option value="1966">1966년</option>
							
								<option value="1967">1967년</option>
							
								<option value="1968">1968년</option>
							
								<option value="1969">1969년</option>
							
								<option value="1970">1970년</option>
							
								<option value="1971">1971년</option>
							
								<option value="1972">1972년</option>
							
								<option value="1973">1973년</option>
							
								<option value="1974">1974년</option>
							
								<option value="1975">1975년</option>
							
								<option value="1976">1976년</option>
							
								<option value="1977">1977년</option>
							
								<option value="1978">1978년</option>
							
								<option value="1979">1979년</option>
							
								<option value="1980">1980년</option>
							
								<option value="1981">1981년</option>
							
								<option value="1982">1982년</option>
							
								<option value="1983">1983년</option>
							
								<option value="1984">1984년</option>
							
								<option value="1985">1985년</option>
							
								<option value="1986">1986년</option>
							
								<option value="1987">1987년</option>
							
								<option value="1988">1988년</option>
							
								<option value="1989">1989년</option>
							
								<option value="1990">1990년</option>
							
								<option value="1991">1991년</option>
							
								<option value="1992">1992년</option>
							
								<option value="1993">1993년</option>
							
								<option value="1994" selected="selected">1994년</option>
							
								<option value="1995">1995년</option>
							
								<option value="1996">1996년</option>
							
								<option value="1997">1997년</option>
							
								<option value="1998">1998년</option>
							
								<option value="1999">1999년</option>
							
								<option value="2000">2000년</option>
							
								<option value="2001">2001년</option>
							
								<option value="2002">2002년</option>
							
								<option value="2003">2003년</option>
							
								<option value="2004">2004년</option>
							
								<option value="2005">2005년</option>
							
								<option value="2006">2006년</option>
							
								<option value="2007">2007년</option>
							
								<option value="2008">2008년</option>
							
								<option value="2009">2009년</option>
							
								<option value="2010">2010년</option>
							
								<option value="2011">2011년</option>
							
								<option value="2012">2012년</option>
							
								<option value="2013">2013년</option>
							
								<option value="2014">2014년</option>
							
								<option value="2015">2015년</option>
							
								<option value="2016">2016년</option>
							
								<option value="2017">2017년</option>
							
								<option value="2018">2018년</option>
							
								<option value="2019">2019년</option>
							
								<option value="2020">2020년</option>
							
							</select>
							</span>
							/ 
							<span class="select_style">
							<select id="birthday_month" name="birthday_month">
							
								
								
								<option value="01">01월</option>
							
								
								
								<option value="02">02월</option>
							
								
								
								<option value="03" selected="selected">03월</option>
							
								
								
								<option value="04">04월</option>
							
								
								
								<option value="05">05월</option>
							
								
								
								<option value="06">06월</option>
							
								
								
								<option value="07">07월</option>
							
								
								
								<option value="08">08월</option>
							
								
								
								<option value="09">09월</option>
							
								
								
								<option value="10">10월</option>
							
								
								
								<option value="11">11월</option>
							
								
								
								<option value="12">12월</option>
							
							</select>
							</span>
							/ 
							<span class="select_style">
							<select id="birthday_day" name="birthday_day">
							
								
								
								<option value="01">01월</option>
							
								
								
								<option value="02">02월</option>
							
								
								
								<option value="03">03월</option>
							
								
								
								<option value="04">04월</option>
							
								
								
								<option value="05">05월</option>
							
								
								
								<option value="06" selected="selected">06월</option>
							
								
								
								<option value="07">07월</option>
							
								
								
								<option value="08">08월</option>
							
								
								
								<option value="09">09월</option>
							
								
								
								<option value="10">10월</option>
							
								
								
								<option value="11">11월</option>
							
								
								
								<option value="12">12월</option>
							
								
								
								<option value="13">13월</option>
							
								
								
								<option value="14">14월</option>
							
								
								
								<option value="15">15월</option>
							
								
								
								<option value="16">16월</option>
							
								
								
								<option value="17">17월</option>
							
								
								
								<option value="18">18월</option>
							
								
								
								<option value="19">19월</option>
							
								
								
								<option value="20">20월</option>
							
								
								
								<option value="21">21월</option>
							
								
								
								<option value="22">22월</option>
							
								
								
								<option value="23">23월</option>
							
								
								
								<option value="24">24월</option>
							
								
								
								<option value="25">25월</option>
							
								
								
								<option value="26">26월</option>
							
								
								
								<option value="27">27월</option>
							
								
								
								<option value="28">28월</option>
							
								
								
								<option value="29">29월</option>
							
								
								
								<option value="30">30월</option>
							
								
								
								<option value="31">31월</option>
							
							</select>
							</span>
							<input type="hidden" name="birthday_type" value="+">
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="exchange_mobile">핸드폰</label></dt>
						<dd>
							<span class="select_style">
							<select id="exchange_mobile" name="exchange_mobile">
								<option value="010">010</option>
								<option value="011">011</option>
								<option value="016">016</option>
								<option value="017">017</option>
								<option value="018">018</option>
								<option value="019">019</option>
							</select>
							</span>
							- <input type="text" size="5" id="mobile1" name="mobile1" style="width:50px;" onblur="setNumber(this);" maxlength="4" class="ndls_input">
							- <input type="text" size="5" id="mobile2" name="mobile2" style="width:50px;" onblur="setNumber(this);" maxlength="4" class="ndls_input">
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="sms_use_y">SMS수신여부</label></dt>
						<dd>
							<input type="radio" id="sms_use_y" name="sms_use_yn" value="Y" checked="checked"><label for="sms_use_y">허용</label>
							<input type="radio" id="sms_use_n" name="sms_use_yn" value="N"><label for="sms_use_n">거부</label>
						</dd>
					</dl>
				</li>
				
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="home_exchange_phone">전화번호</label></dt>
						<dd>
							
					
							<span class="select_style">
							<select id="home_exchange_phone" name="home_exchange_phone">
							
								<option value="02">02</option>
							
								<option value="051">051</option>
							
								<option value="053">053</option>
							
								<option value="032">032</option>
							
								<option value="062">062</option>
							
								<option value="042">042</option>
							
								<option value="052">052</option>
							
								<option value="044">044</option>
							
								<option value="031">031</option>
							
								<option value="033">033</option>
							
								<option value="043">043</option>
							
								<option value="041">041</option>
							
								<option value="063" selected="selected">063</option>
							
								<option value="061">061</option>
							
								<option value="054">054</option>
							
								<option value="055">055</option>
							
								<option value="064">064</option>
							
								<option value="070">070</option>
							
								<option value="010">010</option>
							
								<option value="011">011</option>
							
								<option value="016">016</option>
							
								<option value="017">017</option>
							
								<option value="018">018</option>
							
								<option value="019">019</option>
							
							</select>
							</span>
							- <input type="text" size="5" id="home_phone1" name="home_phone1" style="width:50px;" onblur="setNumber(this);" class="ndls_input" maxlength="4">
							- <input type="text" size="5" id="home_phone2" name="home_phone2" style="width:50px;" onblur="setNumber(this);" class="ndls_input" maxlength="4">
						</dd>
					</dl>
				</li>
				
				<li>
					<dl>
						<dt><label for="user_pwd_chk">E-MAIL</label></dt>
						<dd>
							<input type="text" style="width:50%;" id="email" name="email" maxlength="100" class="ndls_input">
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><label for="mailing_use_y">E-MAIL수신여부</label></dt>
						<dd>
							<input type="radio" id="mailing_use_y" name="mailing_use_yn" value="Y" checked="checked"><label for="mailing_use_y">허용</label>
							<input type="radio" id="mailing_use_n" name="mailing_use_yn" value="N"><label for="mailing_use_n">거부</label>
						</dd>
					</dl>
				</li>
				
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="zipcode">주소</label></dt>
						<dd class="col3">
							<input type="text" class="ndls_input mb5" id="zipcode" name="zipcode" style="width:40%;" maxlength="5" placeholder="우편번호" readonly="readonly">
							<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기" class="ndls_btn2 gray" style=""><br>
							<input type="text" class="ndls_input" id="addr1" name="addr1" style="width:80%; margin-bottom:5px;" placeholder="주소" readonly="readonly">
							<input type="text" class="ndls_input" id="addr2" name="addr2" style="width:80%;" placeholder="상세주소">
						</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt><span class="red">*</span> <label for="manage_code">도서관</label></dt>
						<dd>
							
								
									<span class="select_style">
									<select id="manage_code" name="manage_code" class="cus_selt">
										<option value="">도서관선택</option>
									
										<option value="MA">무주형설지공군립도서관</option>
									
										<option value="MB">무주만나작은도서관</option>
									
										<option value="MC">무주반딧불작은도서관</option>
									
										<option value="MD">무주안성작은도서관</option>
									
										<option value="ME">무주샘누리작은도서관</option>
									
									</select>
									</span>
								
								
							
						</dd>
					</dl>
				</li>
				
				
			</ul>
		</div>
	</div>
	
	<p class="btn_w">
		<input type="submit" value="회원가입" class="ndls_btn violet">
		<a href="/" class="ndls_btn gray">취소</a>
	</p>

	
</div>
</div>
</template>

<script>
export default {

}
</script>

<style>
@charset "utf-8";


/*******************base*************************/


img, input.type-image { border: 0 none; }
ol, ul, li {list-style:none;}
blockquote, q {quotes:none;}
ins {text-decoration:none;}
del {text-decoration:line-through;}
table {border-spacing:0;} 
address,caption,cite,code,dfn,em,strong,th,var {font-style:normal;}
select{font-size:13px;}
.radio {margin-bottom:-2px;}

hr {display: none;}
legend {visibility:hidden; display:none; height:0; width:0; font-size:0;}
noscript{display:none;}
caption{visibility:hidden; height:0; width:0; font-size:0;}

.fl{float:left;}
.fr{float:right;}




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
input{}/*font-family: 'Nanum Gothic', sans-serif;*/
.input_box {height:45px;padding:0 15px;line-height:45px;color:#757575;border:1px solid #d5dbde;cursor:text;background:#fff;}
.input_box:focus{border:1px solid #3db6ed;background-color:#f0f7fa;}
.ndls_input {height:35px;padding:0 15px;line-height:35px;color:#757575;border:1px solid #d5dbde;cursor:text;background:#fff;}
.ndls_input:focus{border:1px solid #3db6ed;background-color:#f0f7fa;}
.none_put{height:38px;line-height:38px;padding:0 5px;border:0 none;font-size:12px;background:none;vertical-align:middle;}

/*안내문구*/
.info_txt{padding-left:30px;background: url(/nanum/ndls/imgs/common/tok_ico.png) no-repeat 0 3px;font-size: 14px;color: #333;}

/**********************셀렉트스타일**********************/
/* 하단 관련사이트 */
/*.select_style{display:inline-block;position:relative;min-width:70px;height:45px;padding:0 15px 0 15px;line-height:40px;border:1px solid #dadada;background:#fff;}
.select_style select{display: inline-block;width:100%;cursor: pointer;outline:0;border:0;font-size:14px;border-radius: 0;background: white;color: black;appearance: none; 
-webkit-appearance: none; -moz-appearance: none;height: 100%;background:#fff url(/nanum/ndls/imgs/common/select_style_bu.gif) no-repeat right 50%;}
.select_style select::-ms-expand {display: none;}
.select_style select:disabled {opacity: 0.5;pointer-events: none;}*/

.select_style{display:inline-block;position:relative;min-width:80px;height:45px;line-height:40px;border:1px solid #dadada;background:#fff;}
.select_style select{display: inline-block;width:100%;cursor: pointer;outline:0;padding:0 25px 0 10px;border:0;font-size:13px;border-radius: 0;background: white;color: black;appearance: none;
-webkit-appearance: none; -moz-appearance: none;height: 100%;background:#fff url(/nanum/ndls/imgs/common/select_style_bu.gif) no-repeat right 50%;}
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
.ndlstab{width:100%;}
.ndlstab ul{overflow:hidden;clear:both;width:100%;}
.ndlstab ul li{float:left;width:50%;}
.ndlstab ul li a{display:block;width:100%;padding: 15px 0;color:#333;text-align:center;border:1px solid #dfdfdf;background: #f3f3f3;box-sizing:border-box;}
.ndlstab ul li a.on{position:relative;color: #222;font-weight:bold;border:1px solid #222;background:#fff;z-index:1;}
.ndlstab ul li a,
.ndlstab ul li a.on:hover a {border-bottom: 1px solid #d6d6d6;}
.ndlstab ul.no2 li{width:50%;}
.ndlstab ul.no3 li{width:33.2%;}
.ndlstab ul.no4 li{width:25%;}
.ndlstab ul.no5 li{width:20%;}
.ndlstab_b{margin-bottom:45px;}

/*style2*/
.ndlstab2{width:100%;}
.ndlstab2 ul{width:100%;display:inline-block;}
.ndlstab2 ul li{float:left;width:50%;}
.ndlstab2 ul.no2 li{width:50%;}
.ndlstab2 ul.no3 li{width:33.3%;}
.ndlstab2 ul.no4 li{width:25%;}
.ndlstab2 ul.no5 li{width:20%;}
.ndlstab2 ul li a{display:block;padding:12px 0;text-align:center;font-weight:bold;border:1px solid #fff;color:#fff;background:#a5acb2;}
.ndlstab2 ul li a{
  vertical-align: middle;
  -webkit-transform: perspective(1px) translateZ(0);
  transform: perspective(1px) translateZ(0);
  box-shadow: 0 0 1px transparent;
  overflow: hidden;
  -webkit-transition-duration: 0.3s;
  transition-duration: 0.3s;
  -webkit-transition-property: color, background-color;
  transition-property: color, background-color;}
.ndls_tab ul li a:hover{background:#868f96;}
.ndls_tab ul li a.on,
.ndls_tab ul li a.on:hover{background:#ffb400;}
.ndls_tab ul li:first-child a{border-left:none;}

.tab_b{margin-bottom:25px;}

/**********************버튼스타일**********************/
.btn_w{width:100%;text-align:center;padding:20px 0;}
.ndls_btn{display:inline-block;height:45px;margin:0 3px;line-height:45px;font-size:15px;text-align:center;padding:0 30px;vertical-align:middle;cursor:pointer;border:0 none;}
.ndls_btn2{display:inline-block;height:35px;margin:0 3px;line-height:35px;font-size:12px;text-align:center;padding:0 15px;vertical-align:top;cursor:pointer;border:0 none;}
.excel_btn{display:inline-block;height:35px;margin:0 3px;line-height:35px;font-size:12px;text-align:center;padding:0 45px 0 15px;vertical-align:middle;cursor:pointer;border:1px solid #4a802a;background:#fff url(/nanum/ndls/imgs/common/excel_icon.gif) no-repeat 95% 50%;;color:#4a802a;}
.excel_btn:hover{background-color:#f5f5f5;}
.ndls_btn.green,
.ndls_btn2.green{color:#fff;background:#17a981;}
.ndls_btn.green:hover,
.ndls_btn2.green:hover{background:#009069;}
.ndls_btn.gray,
.ndls_btn2.gray{color:#fff;background:#8b95a3;}
.ndls_btn.gray:hover,
.ndls_btn2.gray:hover{background:#5e6a7c;}
.ndls_btn.black,
.ndls_btn2.black{color:#fff;background:#222;}
.ndls_btn.black:hover,
.ndls_btn2.black:hover{background:#000;}
.ndls_btn.mint,
.ndls_btn2.mint{color:#fff;background:#44b2d1;}
.ndls_btn.mint:hover,
.ndls_btn2.mint:hover{background:#208aa7;}
.ndls_btn.blue,
.ndls_btn2.blue{color:#fff;background:#3053c7;}
.ndls_btn.blue:hover,
.ndls_btn2.blue:hover{background:#2648bc;}
.ndls_btn.orange,
.ndls_btn2.orange{color:#fff;background:#ff7e00;}
.ndls_btn.orange:hover,
.ndls_btn2.orange:hover{color:#fff;background:#ea9500;}
.ndls_btn.red,
.ndls_btn2.red{color:#fff;background:#e02e2e;}
.ndls_btn.red:hover,
.ndls_btn2.red:hover{background:#cd2626;}

.ndls_btn.pink,
.ndls_btn2.pink{color:#fff; background:#e3409a;}
.ndls_btn.pink:hover,
.ndls_btn2.pink:hover{background:#e3409a;}

.ndls_btn.violet,
.ndls_btn2.violet{color:#fff;background:#8f4ac4;}
.ndls_btn.violet:hover,
.ndls_btn2.violet:hover {color:#fff;background:#c366e8;}

.ndls_btn2.post_search {width:20%; margin-bottom:5px;}

.ndls_btn:hover, 
.ndls_btn:focus, 
.ndls_btn:active,
.ndls_btn2:hover, 
.ndls_btn2:focus, 
.ndls_btn2:active{color:#fff;}




/**********************테이블**********************/
table.ndls_table1{width:100%;border-collapse:collapse;border-top:2px solid #000;}
table.ndls_table1 th{font-weight:bold;}
table.ndls_table1 th,
table.ndls_table1 td{padding:12px 10px;border:1px solid #c9e1de;text-align:center;}
table.ndls_table1 th input,
table.ndls_table1 td input{vertical-align:middle;}
table.ndls_table1 thead th{color:#333;background:#e8f3f9; font-size:13px;}
table.ndls_table1 tbody th{color:#333; letter-spacing:-1px;}
table.ndls_table1 tbody td{color:#444;}
table.ndls_table1 .left{padding:10px 15px;text-align:left;}
table.ndls_table1 .right{padding:8px;text-align:right;}
table.ndls_table1 .bg{background:#e8f3f9;}
/* table.ndls_table1 .first{border-top:2px solid #222;} */
table.ndls_table1 tbody a.view{color:#000;text-decoration:underline;}
table.ndls_table1 .title_name{text-align:left;padding-left:15px;font-weight:bold;color:#0066cc;}
table.ndls_table1 .title_name a{font-weight:bold;color:#0066cc;}
table.ndls_table1 .title_name a:hover{text-decoration:underline;}

table.ndls_table1 .tit_group {text-align:left;padding:10px 20px;}
table.ndls_table1 .tit_group p{padding-bottom:8px;margin-bottom:8px;font-weight:bold;color:#000;border-bottom:1px dashed #ccc;}
table.ndls_table1 .tit_group p a{color:#0066cc;}
table.ndls_table1 .tit_group p a:hover{text-decoration:underline;}
table.ndls_table1 .tit_group dl{overflow:hidden;clear:both;width:100%;font-size:11px;color:#000;}
table.ndls_table1 .tit_group dl dt{float:left;font-weight:bold;padding-left:8px;background:url(/nanum/ndls/imgs/booksearch/bl_dot.gif) no-repeat 0 10px;}
table.ndls_table1 .tit_group dl dd {float:left;margin:0 10px 0 8px;}


/**********************페이징**********************/

/* Paginate */
.ndls_paginate {clear:both; position:relative; text-align:center;margin-top:35px;}
.ndls_paginate *{margin:0; padding:0;}
.ndls_paginate a,
.ndls_paginate strong {_position:relative; display:inline-block; width:35px;height:35px;line-height:35px;padding:0;vertical-align:middle;color:#222;font-family: 'Roboto', sans-serif;font-weight:500;font-size:12px;letter-spacing:0;}
.ndls_paginate strong {color:#fff !important;background:#696969;vertical-align:middle;}
.ndls_paginate a:hover {color:#4c5fbb;}
.ndls_paginate a.pre {border:none;height:16px; font-weight:normal; vertical-align:middle; padding:4px 8px 0 8px; background:none; margin:-1px 1px 0 1px; border:1px solid #dfdfdf;}
.ndls_paginate a.next {border:none;height:16px; font-weight:normal; vertical-align:middle; padding:4px 8px 0 8px; background:none; margin:-1px 1px 0 1px; border:1px solid #dfdfdf;}




/**********기본리스트**********/
.ndlstit{padding-top:17px;margin-bottom:30px;background:url(/nanum/site/builder/skin/skin01/img/content/h3_bar.gif) no-repeat 0 0;font-weight:normal;font-family:'NanumSquareB';font-size:23px;font-weight:normal;color:#222;line-height:1.2;letter-spacing:-0.05em;}



/********************게시판형식********************/
#ndls{width:100%;margin-top:0px;}

#ndls .ndls_total {width:100%;}
#ndls .ndls_total_left {float:left; font-size:0.95em; padding-top:5px; height:22px;}
#ndls .ndls_total_right {float:right; padding-bottom:5px;}
#ndls .ndls_total_right li {float:left;}
#ndls .ndls_total_right li img {height:20px;}
#ndls .ndls_total img {padding-left:3px;}
#ndls div.ndls_total .ndls_orange{color:#F96F00;}
#ndls div.ndls_total .ndls_red{color:#e02e2e;}
#ndls .ndls_button {width:100%; margin-top:5px; text-align:right;}
#ndls span.category_color {color:#979797;}

img.ndls_loading1{width:11px;height:11px;}

/* List */
#ndls .ndls_blist {clear:both;}
#ndls .ndls_blist table {width:100%; line-height:16px; border-collapse:collapse; border-top:1px solid #e5e5e5; border-bottom:1px solid #e5e5e5;}
#ndls .ndls_blist table caption {display:none;}
#ndls .ndls_blist thead th {text-align:center; border-bottom:1px solid #5b5b5b; padding:15px 0;color:#333; font-size:14px;line-height:160%; background:url(/nanum/ndls/imgs/common/tit_line.gif) no-repeat right;}
#ndls .ndls_blist thead th:last-child {background-image:none;}
#ndls .ndls_blist thead th.th_none {background-image:none;}
#ndls .ndls_blist tbody td {white-space:nowrap;padding:15px 0;border-bottom:1px solid #e5e5e5; text-align:center; line-height:140%;}
#ndls .ndls_blist tbody td img {vertical-align:middle;}
#ndls .ndls_blist tbody td span.reply_count {color:#EE5A00; font-size:0.9em; font-weight:normal; letter-spacing:-0.1em;}
#ndls .ndls_blist tbody td.notice {background-color:#FBFBFB;}
#ndls .ndls_blist tbody td.title {white-space:normal; text-align:left;}
#ndls .ndls_blist tbody td.title_bookimage {padding-top:5px; padding-bottom:5px;}
#ndls .ndls_blist tbody td.center {text-align:center;}
#ndls .ndls_blist tbody td .jsInfo0{color:#222;font-size:17px;}
#ndls .ndls_blist tbody td .jsInfo0 b{font-weight:normal;text-decoration:underline;color:#3053c7;}
div.ndls_kdc_div img{vertical-align:middle;}



/**********글쓰기**********/
/***(무조건 셀제목에 색상을 넣거나 line을 넣고싶으면 bg로 조정. 반응형의 작업으로 ul li로 작업된 이유로 dd와 height를 딱 맞춰 작업하기가 어렵다.)***/
/***(또한 w100은 두칸이 아니라 아예 한줄내용만 나올때를 의미하며 세칸나올때, 네칸나올때는 class값을 추가하여 작업할수 있도록 한다.
w100은 위에 테이블셀 크기에 맞춰서 가면 안되기 때문에 box에다가 값을 주고, 다른 칸수 역시 box자체에 class값을 주어 작업한다.)***/
#ndls .ndls_bwrite{width:100%;border:1px solid #dfdfdf;border-top:2px solid #222; line-height:0;}
/*#ndls .ndls_bwrite .box{padding:20px 30px;}*/
#ndls .ndls_bwrite .box.w100{width:auto; line-height:0;}
#ndls .ndls_bwrite .box ul{display:inline-block;width:100%;}
#ndls .ndls_bwrite .box ul li{border-top:1px solid #dfdfdf;vertical-align:middle;font-size:13px; font-family: 'NotoKrR', sans-serif;}
#ndls .ndls_bwrite .box ul li:first-child{border-top:0 none;}
#ndls .ndls_bwrite .box ul li.bg_none{padding:12px 12px;text-align:left;background:none; }
#ndls .ndls_bwrite .box ul li dl{width:100%;font-size:15px; display: table;}
#ndls .ndls_bwrite .box ul li dl dt{display: table-cell; width:25%; box-sizing:border-box;vertical-align:middle;text-align:center;  font-family: 'NotoKrM', sans-serif; color:#222;  background:#f9fafa; 
padding: 20px 10px; *float:left; line-height:1; }
.graybg {background:#f5f5f5;}
.lh12 {line-height:1.2 !important;}

#ndls .ndls_bwrite .box ul li dl dd{position:relative; vertical-align:middle;  display:table-cell; padding:15px 10px;}
#ndls .ndls_bwrite .box ul li input,
#ndls .ndls_bwrite .box ul li span,
#ndls .ndls_bwrite .box ul li strong,
#ndls .ndls_bwrite .box ul li a,
#ndls .ndls_bwrite .box ul li img{vertical-align:middle;}
#ndls .ndls_bwrite .box ul li input{margin-right:5px;}
#ndls .ndls_bwrite .box ul li .text1 {font-size:12px; line-height:1.3; display:inline-block;}
#ndls .ndls_bwrite .ndls_input {height:35px; line-height:35px; width:40%;}

#ndls .ndls_bwrite .select_style {height:35px; line-height:35px; overflow:hidden;}
#ndls .ndls_bwrite .select_style select {height:100%;}
.agree_w{padding:30px;margin-top:30px;border-top:1px dashed #ccc;border-bottom:1px dashed #ccc;background:#f6f6f6;text-align:center;}


/* file */
#ndls .ndls_bwrite .box ul li.filetable table {width:100%; line-height:16px; border-collapse:collapse; border:none; border-top:1px solid #DEDEDE;}
#ndls .ndls_bwrite .box ul li.filetable table th{padding:5px 0; white-space:nowrap; border:none; border-right:1px solid #DEDEDE; background:#F6F6F6; color:#666666; text-align:center; letter-spacing:-0.1em; line-height:140%; vertical-align:top;}
#ndls .ndls_bwrite .box ul li.filetable table td{padding:5px 0 5px 10px; border:none; background: #ffffff; text-align:left; }


/**********글상세**********/
#ndls .ndls_bview{width:100%;border:1px solid #dfdfdf;border-top:2px solid #222;}
#ndls .ndls_bview .box{padding:20px 30px;}
#ndls .ndls_bview .box.w100{width:auto;}
#ndls .ndls_bview .box ul{display:inline-block;width:100%;}
#ndls .ndls_bview .box ul li{border-top:1px solid #dfdfdf;vertical-align:middle;font-size:13px;}
#ndls .ndls_bview .box ul li:first-child{border-top:0 none;}
#ndls .ndls_bview .box ul li.bg_none{padding:12px 12px;text-align:left;background:none;}
#ndls .ndls_bview .box ul li dl{position:relative;width:100%;font-size:15px;overflow:hidden;}
#ndls .ndls_bview .box ul li dl dt{position:absolute;top:0;left:0;width:120px;height:100%;padding:8px 0;min-height:45px;line-height:45px;vertical-align:middle;text-align:center;font-weight:bold;color:#222;}
#ndls .ndls_bview .box ul li dl dd{margin-left:120px;position:relative;padding:8px 20px;min-height:45px;line-height:45px;vertical-align:middle;}
#ndls .ndls_bview .box ul li input,
#ndls .ndls_bview .box ul li span,
#ndls .ndls_bview .box ul li strong,
#ndls .ndls_bview .box ul li a,
#ndls .ndls_bview .box ul li img{vertical-align:middle;}
#ndls .ndls_bview .box ul li input{margin-right:5px;}


/* Comment */
#ndls .ndls_comment {clear:both; padding-top:20px;}
#ndls .ndls_comment table{width:100%; background-color:#FAFAFA; margin-bottom:15px}
#ndls .ndls_comment table caption{display:none;}
#ndls .ndls_comment tbody td {height:31px; text-align:left; line-height:140%;}
#ndls .ndls_comment tbody td.dr01 {height:5px; background:url(/nanum/ndls/imgs/common/dr01.gif); background-repeat:no-repeat;}
#ndls .ndls_comment tbody td.dr02 {height:5px; background:url(/nanum/ndls/imgs/common/dr02.gif); background-repeat: repeat-x;}
#ndls .ndls_comment tbody td.dr03 {height:5px; background:url(/nanum/ndls/imgs/common/dr03.gif); background-repeat:no-repeat;}
#ndls .ndls_comment tbody td.dr04 {background:url(/nanum/ndls/imgs/common/dr04.gif); background-repeat: repeat-y;}
#ndls .ndls_comment tbody td.text {padding:0; margin:0; height:20px;}
#ndls .ndls_comment tbody td dl.info {margin:0; padding-left:10px;}
#ndls .ndls_comment tbody td dl.info dt {float:left; letter-spacing:-0.1em; padding:0; font-size:0.9em; padding-top:4px;}
#ndls .ndls_comment tbody td dl.info dd {float:left; padding:0 10px 0 4px;}
#ndls .ndls_comment tbody td.dr05 {text-align:center; padding-top:4px; padding-bottom:4px;}
#ndls .ndls_comment tbody td.dr05 textarea {width:88%;height:38px;}
#ndls .ndls_comment tbody td.dr06 {background:url(/nanum/ndls/imgs/common/dr06.gif); background-repeat: repeat-y;}
#ndls .ndls_comment tbody td.dr07 {height:5px; background:url(/nanum/ndls/imgs/common/dr07.gif); background-repeat:no-repeat;}
#ndls .ndls_comment tbody td.dr08 {height:5px; background:url(/nanum/ndls/imgs/common/dr08.gif);  background-repeat: repeat-x;}
#ndls .ndls_comment tbody td.dr09 {height:5px; background:url(/nanum/ndls/imgs/common/dr09.gif); background-repeat:no-repeat;}

.cmt_list {margin-top:5px;}
.cmt_list div.h {margin:0 0 1px; background:transparent url(/nanum/ndls/imgs/common/human_ic.gif) no-repeat scroll 0 0.1em; text-align:left; padding-left:15px;}
.cmt_list p {line-height:1.6em; margin:0; padding:5px 0 0 12px; text-align:left;}
.cmt_list  li.line {height:1px; background:transparent url(/nanum/ndls/imgs/common/dr_line_bg.gif);  background-repeat: repeat-x; margin:0; padding-top:15px;}




/* Button */
.ndls_button {clear:both;}
.ndls_button .fl {float:left; /*background:transparent url(/nanum/ndls/imgs/common/ndls_ldot.gif) no-repeat 25px 5px;*/}
.ndls_button .fr {float:right; overflow:hidden;}
.ndls_button .pt10 {padding-top:10px;}


.ndls_button ul li {float:left;}
.ndls_button ul li.pl {padding-left:10px;}
.ndls_button ul li.pt {padding-top:7px;}
.ndls_button span.bt {padding-top:10px; padding-left:4px; text-align:right;}
.ndls_button2 {margin:0 auto; text-align:center; padding-top:10px; padding-left:4px;}



a.ndls_lbtn {display:inline-block; height:22px; padding-left:20px; background:url(/nanum/ndls/imgs/common/ndls_lbtn_l.gif) no-repeat 0 0; margin-right:3px;}
a.ndls_lbtn span {display:inline-block; height:22px; line-height:23px; padding-right:14px; background:url(/nanum/ndls/imgs/common/ndls_lbtn_r.gif) no-repeat right 0; letter-spacing:-1px;}
.ndls_bt01 {display:inline;}
.ndls_bt01 a{display:inline; overflow:hidden; float:left; height:22px; padding-left:13px; margin-right:3px; font:12px dotum; letter-spacing:-1px; color:#6B6B6B; text-decoration:none; background:url(/nanum/ndls/imgs/common/bt01_bg.gif) left 0; cursor:pointer;}
.ndls_bt01 a:hover{background:url(/nanum/ndls/imgs/common/bt01_bg.gif) left -22px; text-decoration:none;}
.ndls_bt01 a span{display:inline; overflow:hidden; float:left; height:22px; padding-right:10px; line-height:200%; background:url(/nanum/ndls/imgs/common/bt01_bg.gif) right 0;}
.ndls_bt01 a:hover span{color:#6B6B6B; background:url(/nanum/ndls/imgs/common/bt01_bg.gif) right -22px;}


/* Search */
.ndls_search {width:510px; margin:0 auto; margin-top:18px;}
.ndls_search ul {float:left;}
.ndls_search ul li {float:left; height:35px;}
.ndls_search ul li.ndls_search_start {float:left; width:18px; height:35px; background:url(/nanum/ndls/imgs/common/search_left.gif); background-repeat:no-repeat;}
.ndls_search ul li.ndls_search_end {float:left; width:18px; height:35px; background:url(/nanum/ndls/imgs/common/search_right.gif); background-repeat:no-repeat;}
.ndls_search ul li select {float:left;}
.ndls_search ul li input.search_input {float:left; margin-left:5px; background:#e5e5e5; border:1px solid #bebebe; border-right:1px solid #e1e1e1; border-bottom:1px solid #e1e1e1; height:24px; padding:2px 0 0 3px;}
.ndls_search ul li input.search_bt {float:left;}


.command_pwd {position:absolute; border:2px solid #C6C6C6; background-color:#ffffff; padding:8px 15px 8px 15px; text-align:center; vertical-align:middle; font-weight:bold; color:#313131; line-height:140%;}
.command_pwd li.text {float:left; letter-spacing:-0.1em; padding:0; font-size:0.9em; padding-top:4px;padding-right:4px;}
.command_pwd li {float:left; padding-left:3px;}
.command_pwd li img {height:20px;padding-top:1px;}


.pwd_check {margin:0 auto; text-align:center; border-top:1px solid #e5e5e5; border-bottom:1px solid #e5e5e5; padding:25px; font-weight:bold; color:#313131; line-height:140%;}
.pwd_check *{margin:0; padding:0;}
.pwd_check label {color:#7D7D7D; letter-spacing:-1px; font-size:11px;}
.pwd_check li.text {letter-spacing:-0.1em; font-size:0.9em;}
.pwd_check_button {width:90%;margin:0 auto; text-align:center; padding-top:10px;}

.login_check {width:100%; margin:0 auto; margin-top:20px; text-align:center; border-top:2px solid #C8C8C8; border-bottom:2px solid #DEDEDE; background-color:#ffffff; padding:25px; font-weight:bold; color:#313131; line-height:140%;}
.login_check *{margin:0; padding:0;}
.login_check span{color:#7D7D7D; letter-spacing:-1px; font-size:11px;}
.login_check li.text {letter-spacing:-0.1em; font-size:0.9em;}
.login_check li.id {padding-right:26px; padding-bottom:4px;}
.login_check_button {width:90%;margin:0 auto; text-align:center; padding-top:10px;}



/* 주소찾기 */
.post_search2{border:1px solid #CDCDCD;height:80px;margin-right:10px;margin-top:3px;overflow:auto;padding:6px;}

a.ndls_btn_b  {display:inline-block; background:#000; color:#fff !important; text-align:center; min-width:40px; height:36px; font-size:13px; padding:0 15px 0 15px; font-weight:600; letter-spacing:-1px; line-height:36px;}
a.ndls_btn_b:hover {background:#404040; text-decoration:none;}

a.ndls_btn_g  {display:inline-block; background:#7e7e7e; color:#fff !important; text-align:center; min-width:40px; height:36px; font-size:13px; padding:0 15px 0 15px; font-weight:600; letter-spacing:-1px; line-height:36px;}
a.ndls_btn_g:hover {background:#666; text-decoration:none;}

a.ndls_btn_point  {display:inline-block; background:#e77272; color:#fff !important; text-align:center; min-width:40px; height:36px; font-size:13px; padding:0 15px 0 15px; font-weight:600; letter-spacing:-1px; line-height:36px;}
a.ndls_btn_point:hover {background:#d44c4c; text-decoration:none;}

input.ndls_btn_b  {vertical-align:middle;background:#000; color:#fff; min-width:70px; height:36px; font-size:13px; padding:0 15px 0 15px; border:none; cursor:pointer; font-weight:600; letter-spacing:-1px;}
input.ndls_btn_b:hover {background:#666;}

input.ndls_btn_g  {vertical-align:middle;background:#7e7e7e; color:#fff; min-width:70px; height:36px; font-size:13px; padding:0 15px 0 15px; border:none; cursor:pointer; font-weight:600; letter-spacing:-1px;}
input.ndls_btn_g:hover{background:#666;}

input.ndls_btn_point  {vertical-align:top;background:#e77272; color:#fff; min-width:70px; height:36px; font-size:14px; border:none;cursor:pointer; font-weight:600; letter-spacing:-0.5px;}
input.ndls_btn_point:hover {background:#d44c4c; text-decoration:none;}

input.ndls_btn_save  {vertical-align:middle;background:#e77272; color:#fff;font-size:12px;padding:8px 12px 6px 12px;border:none; cursor:pointer; font-weight:600; letter-spacing:-1px;font-family:돋움;}
input.ndls_btn_save:hover {background:#d44c4c;}


a.ndls_btn_mini {display:inline-block; color:#e77272; font-size:11px; font-family:'돋움', Dotum, sans-serif;letter-spacing:0; line-height:15px; height:15px; border-bottom:1px solid #f45246; background:url('/img/common/bl_arrow2.gif') no-repeat right 3px;padding-right:10px;padding-left:2px;}
a.ndls_btn_mini:hover{color:#f45246;border-color:#f45246;font-weight:bold;letter-spacing:-1px;}
</style>