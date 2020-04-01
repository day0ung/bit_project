<template>
<div>
  <div class="depth02"> 
      <router-link to="/aboutus" >게시판</router-link>
  </div>
</div>
</template>

<script>

$("document").ready(function(){
    $(".depth2").on("click", function() {
        if (window.location.href.indexOf("employment") > -1) {
            alert("employment");
        } 
        else if(window.location.href.indexOf("group") > -1){
            alert("group");
        }
        else if(window.location.href.indexOf("private") > -1){
            alert("private");
        }           

    });
})
 
export default {
    
        
        
    
}
</script>

<style>

</style>