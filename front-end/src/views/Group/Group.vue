<template>
  <div class="Group">
    <br>
    <div class="group_detail bounce-top">
      <router-link to="/group">나의 그룹 스터디</router-link> |
      <router-link to="/group/board">그룹 게시판</router-link> |
      <router-link to="/group/schedule">그룹 스터디 일정</router-link> |
      <router-link to="/group/detail4">그룹 투표</router-link>
    </div>
    <br>
    <div class="text-focus-in">
    <div class="groupcontent">
      <router-view></router-view>
    </div>
    </div>
  </div>
</template>

<script>

export default {
  data(){
    return{
      list: this.$store.state.s_group.groupList
    }
  },
  mounted(){
    this.$store.state.currpage = this.$route.path
    axios.get("http://localhost:9000/getAllGroup")
                      .then(res => {
                  //alert(JSON.stringify(res.data))
                  this.$store.state.s_group.groupList = res.data
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

div.group_detail
{
  margin: 0 auto;
	padding: 1em 3em;
	text-align: center;
}

div.group_detail a
{
    text-decoration: none;
    margin: 0px 10px;
    padding: 10px 10px;
    position: relative;
    z-index: 0;
    cursor: pointer;
}

</style>