<template>
  <div class="employment">
    
    <div class="employment_detail circleBehind bounce-top">
      <br>
      <br>
      <router-link to="/employment/recruiting">구인 공고</router-link>
      <router-link to="/employment/CVpage">이력서 작성</router-link>
      
    </div>
    <br>
    <div class="text-focus-in">
      <router-view></router-view>
    </div>
  </div>
</template>

<script>

export default {
  data(){
    return{
      list: this.$store.state.s_employment.RecruitingList
    }
  },

  mounted(){
    this.$store.state.currpage = this.$route.path
    axios.get("http://localhost:9000/getAllRecuritingInfo")
                      .then(res => {
                  //alert(JSON.stringify(res.data))
                  this.$store.state.s_employment.s_employment = res.data
                })
  }
}
</script>

<style scope>
@-webkit-keyframes text-focus-in{0%{-webkit-filter:blur(12px);filter:blur(12px);opacity:0}100%{-webkit-filter:blur(0);filter:blur(0);opacity:1}}@keyframes text-focus-in{0%{-webkit-filter:blur(12px);filter:blur(12px);opacity:0}100%{-webkit-filter:blur(0);filter:blur(0);opacity:1}}
.text-focus-in{-webkit-animation:text-focus-in .3s cubic-bezier(.55,.085,.68,.53) .8s both;animation:text-focus-in .3s cubic-bezier(.55,.085,.68,.53) .8s both}

@-webkit-keyframes bounce-top{0%{-webkit-transform:translateY(-45px);transform:translateY(-45px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in;opacity:1}24%{opacity:1}40%{-webkit-transform:translateY(-24px);transform:translateY(-24px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in}65%{-webkit-transform:translateY(-12px);transform:translateY(-12px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in}82%{-webkit-transform:translateY(-6px);transform:translateY(-6px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in}93%{-webkit-transform:translateY(-4px);transform:translateY(-4px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in}25%,55%,75%,87%{-webkit-transform:translateY(0);transform:translateY(0);-webkit-animation-timing-function:ease-out;animation-timing-function:ease-out}100%{-webkit-transform:translateY(0);transform:translateY(0);-webkit-animation-timing-function:ease-out;animation-timing-function:ease-out;opacity:1}}@keyframes bounce-top{0%{-webkit-transform:translateY(-45px);transform:translateY(-45px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in;opacity:1}24%{opacity:1}40%{-webkit-transform:translateY(-24px);transform:translateY(-24px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in}65%{-webkit-transform:translateY(-12px);transform:translateY(-12px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in}82%{-webkit-transform:translateY(-6px);transform:translateY(-6px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in}93%{-webkit-transform:translateY(-4px);transform:translateY(-4px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in}25%,55%,75%,87%{-webkit-transform:translateY(0);transform:translateY(0);-webkit-animation-timing-function:ease-out;animation-timing-function:ease-out}100%{-webkit-transform:translateY(0);transform:translateY(0);-webkit-animation-timing-function:ease-out;animation-timing-function:ease-out;opacity:1}}
.bounce-top{-webkit-animation:bounce-top .9s both;animation:bounce-top .9s both}

.gradientBorder:hover::before {
    transform: translateX(0);
}

div.employment_detail
{
  margin: 0 auto;
	padding: 1em 3em;
	text-align: center;
}

div.employment_detail a
{
    text-decoration: none;
    margin: 0px 10px;
    padding: 10px 10px;
    position: relative;
    z-index: 0;
    cursor: pointer;
}

/* Circle behind */
div.circleBehind a:before, div.circleBehind a:after
{
    position: absolute;
    top: 22px;
    left: 50%;
    width: 40px;
    height: 40px;
    border: 2px solid #0277bd;
    transform: translateX(-50%) translateY(-50%) scale(0.8);
    border-radius: 50%;
    background: transparent;
    content: "";
    opacity: 0;
    transition: all 0.3s;
    z-index: -1;
}

div.circleBehind a:after
{
    border-width: 1px;
    transition: all 0.4s;
}

div.circleBehind a:hover:before
{
    opacity: 1;
    transform: translateX(-50%) translateY(-50%) scale(0.8);
}

div.circleBehind a:hover:after
{
    opacity: 1;
    transform: translateX(-50%) translateY(-50%) scale(1.1);
}
</style>


