<template>
<div>
    <div class="header_top">
        <div class="inner">
            <span><router-link to="/login">로그인</router-link></span> |
            <span><router-link to="/join">회원가입</router-link></span>
            <h1 class="logo">
                <router-link to="/">
				    <img style="margin-left:-50px" src='../../assets/css/images/logo.png' alt="팔레트" />
			    </router-link>
            </h1>	
        </div>
    </div>
</div>

</template>

<script>


export default {
    name : "headerTop"
}
</script>

<style>

</style>