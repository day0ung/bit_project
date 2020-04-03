<template>
<div>
    <div class="header_top">
        <div class="searchWrap">
            <form name="serach" method="get" action="#">
                <input type="text" maxlength="20" name="mainSearchWord" placeholder="검색어를 입력해주세요">
                <button type="submit"></button>
            </form>
        </div>
        <div class="inner">
            <div style="margin-right: 30px;">
            <span><router-link to="/login">로그인</router-link></span> |
            <span><router-link to="/join">회원가입</router-link></span>
            </div>
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