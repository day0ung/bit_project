<template>
    <div class="about-us">
    <h1>This is an about page</h1>
    <button @click="onclick">버튼</button>

  </div>
</template>

<script>
export default {
    data(){
      return{

      }
    },
    methods:{
      onclick: function(){
        
        axios.get("http://localhost:9000/register")
                       .then(res => {
                    alert("회원가입이 완료되었습니다.")
                    //alert(JSON.stringify(res))
                 })
      }

    }

}
</script>

<style>

</style>