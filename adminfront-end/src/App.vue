<template>
  <div id="ViewStart">

    <!-- end top area -->
    <!-- <div class="topArea"> -->
      <!-- <div class="header">
        <h2>Scroll Down</h2>
        <p>Scroll down to see the sticky effect.</p>
      </div> -->
      <!-- <div class="topNavBar">
        <ul>
          <li><router-link class="active" to="/">Home</router-link></li>
          <li><router-link class="" to="/memberNGroup">회원 및 소모임관리</router-link></li>
          <li><router-link class="active" to="/group">소모임관리</router-link></li>
          <li><router-link class="" to="/board">게시판관리</router-link></li>
          <li><router-link class="active" to="/statisticsNresearch">통계 및 설문조사</router-link></li>
          <li><router-link class="" to="/accept">승인</router-link></li>
          <li><router-link class="active" to="/recyclebin">휴지통</router-link></li>
          <li>&nbsp;</li>
          <li>
            <div v-if="isLogin">
              <router-link class="active" to="/login">로그인</router-link>
            </div>
            <div v-else>
              <router-link class="" to="/logout">로그아웃 </router-link>
            </div>
          </li>
        </ul>
      </div> -->

      <!-- <router-view></router-view> -->


      <!-- <div class="leftBar">
        <ul>
            <li><a class="active" href="#home">Home</a></li>
            <li><a href="#news">News</a></li>
            <li><a href="#contact">Contact</a></li>
            <li><a href="#about">About</a></li>
        </ul>
      </div> -->
    <!-- </div> -->
    <!-- end top area -->
    <div class="topArea">
      <div class="topContainer">
        <div class="topLeft">
          <h2>Palette AdminPage</h2>
          <p>관리자 페이지 입니다.</p>
        </div>
        <div class="topRight">
          <div>
            <div v-if="isLogin">
              <router-link class="logBtn" to="/login" >로그인</router-link>
            </div>
            <div v-else>
              <p class="welcomeName"> 
                <!-- <span>{{loginId}}</span>  -->
                환영합니다.</p>
              <router-link class="logBtn" to="/logout">로그아웃 </router-link>
            </div>
          </div>
        </div>
      </div>
    </div>

<!-- middle area -->
    <div class="middle_area">

      <div class="middle_left">
        <!-- 화면 좌측 navigation Bar-->
        <LeftNavBar></LeftNavBar>
      </div>
      <!-- content start -->
      <div class="AppvueMainContnet">
        <router-view></router-view>
      </div>
    </div>
    <!-- end content start -->
</div>
</template>

<script>

import global from '@/assets/css/mainStruct.css'
import {mapState, mapMutations} from 'vuex'
import LeftNavBar from "./views/home/LeftNavBar.vue"



export default {
  data(){
    return{
      // loginId:''
    }
  },
  
  name:'dashboard',
  components:{
    LeftNavBar
    

  },
  computed:{
    ...mapState(['isLogin', 'loginUser'])
  },
  methods:{
    ...mapMutations(['logout']),

    // receiveId(){
    //   var resId = sessionStorage.getItem("loginUser")

    //   this.loginId = resId;
    // }
  },
  watch: {
    
  }
}
</script>


<style>

/* .AppvueMainContnet h1, .AppvueMainContnet h2, {

}   */


.topArea{
  width:100%;
  height:80px;
  
}
.topContainer{
  background-color:#000;
  width: 100%;
  height: 80px;
  position: fixed;
  z-index: 10000;
}
.topLeft{
  width:300px;
  position: fixed;
  margin-left: 260px;
  color:#fff;
  
}

.topLeft p{
  color:#ccc;
}




.topRight{
  width:300px;
  float:right;
  margin: 38px 0px 0px 75%;
  position: fixed;
}

.AppvueMainContnet{
  /* float: left; */
  margin-left: 235px;
  display: grid;
  padding: 40px 0px 0px 40px;
}

.ViewStart{
  width:100%;
}
.middle_area{
  width:auto;
}

.middle_left{
  float:left;
  position: fixed;
  width: 235px;
  overflow-y: auto;
  /* overflow-x: hidden; */
  top: 0;
  bottom: 0;
  margin-top:80px;

  background-color: #383838;
  z-index:9999;
}

.welcomeName{
  color: white;
  float: left;
  margin-right: 100px;
}
.welcomeName span{
  color:aqua;
}

.logBtn{
  padding: 5px 10px;
  background: #ccc;
  border-radius: 5px;
  color: #000;
  font-weight: bold;
}
.logBtn:hover{
  background:#484848;
}





</style>