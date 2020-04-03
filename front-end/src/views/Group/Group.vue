<template>
  <div class="Group">
    <div class="group_detail circleBehind">
    <br>
    <h1 id="classs">{{ this.$store.getters.pageName }}</h1>
    <br>
    <router-link to="/group/detail1">detail1</router-link> |
    <router-link to="/group/detail2">detail2</router-link> |
    <router-link to="/group/detail3">detail3</router-link> |
    <router-link to="/group/detail4">detail4</router-link>
    </div>
    <br>
    <router-view></router-view>
  </div>
</template>

<script>

export default {
  mounted(){
    this.$store.state.currpage = this.$route.path
  }
}
</script>

<style scope>

div.group_detail
{
  font-family: Raleway;
  margin: 0 auto;
	padding: 1em 3em;
	text-align: center;
}

div.group_detail a
{
    text-decoration: none;
    font: 20px Raleway;
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