<template>
    <div class="about-us">
    <h1>{{ this.$store.getters.pageName }}</h1>
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
  },
  mounted(){
    this.$store.state.currpage = this.$route.path
  }
}
</script>

<style>

</style>