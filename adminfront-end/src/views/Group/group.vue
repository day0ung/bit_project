<template>
    <div class="group">

        
        <div class="leftBar">
            <ul>
                <li> <h2> {{title}} </h2> </li>
                <li><router-link class="active" to="/search"> 검색0 </router-link></li>
                <li><router-link  to="/search"> 검색1 </router-link></li>
                <li><router-link  to="/search"> 검색2 </router-link></li>
                <li><router-link  to="/search"> 검색3 </router-link></li>
                
            </ul>
        </div> 
        <div class="margin-L_25" >
            <router-view ></router-view>
        </div>


    </div>
</template>

<script>
export default {
    data(){
        return{
            title:'소모임 관리'

        }
    },
    methods:{
        
    }

}
</script>

<style>

</style>