<template>
  <div id="ViewStart">

    <!-- end top area -->

    <div class="topArea">
      <div class="header">
        <h2>Scroll Down</h2>
        <p>Scroll down to see the sticky effect.</p>
      </div>

      <div class="topNavBar">
        <ul>
          <li><router-link class="active" to="/">Home</router-link></li>
          <li><router-link class="" to="/member">회원관리</router-link></li>
          <li><router-link class="active" to="/group">소모임관리</router-link></li>
          <li><router-link class="" to="/board">게시판관리</router-link></li>
          <li><router-link class="active" to="/statisticsNresearch">통계 및 설문조사</router-link></li>
          <li><router-link class="" to="/accept">승인</router-link></li>
          <li><router-link class="active" to="/recyclebin">휴지통</router-link></li>
        </ul>
      </div>

      <router-view></router-view>


      <!-- <div class="leftBar">
        <ul>
            <li><a class="active" href="#home">Home</a></li>
            <li><a href="#news">News</a></li>
            <li><a href="#contact">Contact</a></li>
            <li><a href="#about">About</a></li>
        </ul>
      </div> -->
    </div>
    <!-- end top area -->
    

    <!-- content start -->
    <div class="mainContnet">
    </div>
    <!-- end content start -->
</div>
</template>

<script>

import global from '@/assets/css/mainStruct.css'





export default {
  name:'dashboard',
  components:{
    

  }
}


</script>















<style>

</style>