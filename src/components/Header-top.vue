<template>
    <div class="HeaderTop">
        <h1>Header-top</h1>
        <div style="float: right">
            <router-link to="/">Login</router-link> |
            <router-link to="/">Logout</router-link> |
            <router-link to="/">MyPage</router-link>
        </div>
    </div>
</template>

<script>
export default {
    name : "HeaderTop"
}
</script>

<style>

</style>