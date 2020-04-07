<template>
    <div class="group">
        <div class="leftBar">
            <ul>
                <li><router-link class="active" to="/search">서치 </router-link></li>
                <li><a href="/search">News</a></li>
                <li><a href="#contact">Contact</a></li>
                <li><a href="#about">About</a></li>
            </ul>
        </div> 
        <div style="margin-left:25%;">
            <router-view ></router-view>
        </div>
    </div>
</template>

<script>
export default {
    data(){
        return{

        }
    },
    methods:{
        
    }

}
</script>

<style>

</style>