<template>
    <div class="Header-nav">
        <div id="nav" style="display: table; margin: auto;">
            <router-link to="/home">Home</router-link> |
            <router-link to="/aboutus">About Us</router-link> |
            <router-link to="/private">개인스터디</router-link> |
            <router-link to="/group">그룹스터디</router-link> |
            <router-link to="/employment">취업</router-link> |
            <router-link to="/notice">게시판</router-link> |
            <router-link to="/search">검색</router-link>
        </div>
    </div>
</template>

<script>
export default {
    name: "HeaderNav"
}
</script>

<style>

</style>