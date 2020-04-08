<template>
    <div class="memberManage">
        <div class="leftBar">
            <ul>
                <li> <h2> {{title}} </h2> </li>
                <li><router-link class="active" to="/managemember1"> 회원관리1 </router-link></li>
                <li><router-link  to="/managemember2">  회원관리2 </router-link></li>
                <li><router-link  to="/managemember3">  회원관리3 </router-link></li>
                <li><router-link  to="/managemember4">  회원관리4 </router-link></li>
            </ul>
        </div> 
        <div  class="margin-L_25 contentPadding" >
            <router-view ></router-view>
        </div>
    </div>
</template>

<script>
export default {
    data(){
        return{
            title:"회원관리"

        }
    },
    methods:{
        
    }

}
</script>

<style>

</style>