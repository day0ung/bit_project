<template>
    <div class="memberManage">
        <div class="leftBar">
            <ul>
                <li> <h2> {{title}} </h2> </li>
                <li><router-link class="active" to="/managemember1"> 기타1 </router-link></li>
                <li><router-link  to="/managemember2">  기타2 </router-link></li>
                <li><router-link  to="/managemember3">  기타1 </router-link></li>
                <li><router-link  to="/managemember4">  기타2 </router-link></li>
                <li>
                        <el-button
                            size="mini"
                            @click="showNowPage()"> 콘솔로 페이지 주소 보기  </el-button>
                    
                </li>
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
            title:"회원관리",
            isActive:[]

        }
    },
    watch:{
        '$route':{
            handler:'showNowPage',
            immediate:true      //create()의 중복역할. $route()의 즉시실행역할을 한다.
        }
    },
    methods:{
        showNowPage(){
            console.log(this.$route);
        }
    }

}
</script>

<style>

</style>