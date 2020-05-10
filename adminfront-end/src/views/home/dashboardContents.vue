<template>
  <div class="adminMain">
    <div>
      <div id="main-view" style="display: block;">
<!-- 
        <ul id="background" class="background">
          <li class="background-item fadein" :style="{ backgroundImage: 'url(' + require('./goldenbridge.jpeg') + ')' }"></li>
        </ul> -->

  <div id="bg"> 
    <!-- <img src="images/bg.jpg" alt="">  -->
    <!-- <div class="background-item" :style="{ backgroundImage: 'url(' + require('./goldenbridge.jpeg') + ')' }"></div> -->
  </div>


      </div>
    </div>
    <div>
      
    </div>

      
  </div>
</template>

<script>
// import {board} from '@/api/api_index.js'

export default {
  data(){
    return{
      image:'./goldenbridge.jpeg'

    }
  },

}
</script>

<style>

#bg { 
  position: fixed; top: -50%; left: -50%; width: 200%; height: 200%; }

#bg .background-item { 
  position:absolute; top:0; left:0; right:0; bottom:0; margin:auto; min-width:50%; min-height:50%; border-image-repeat: stretch;   
  }



</style>