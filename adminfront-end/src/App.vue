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
          <li><router-link class="active" to="/homes">Home</router-link></li>
          <li><router-link to="/group">GROUP</router-link></li>
          <li><router-link to="/contact">Contact</router-link></li>
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