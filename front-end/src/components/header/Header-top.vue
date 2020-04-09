<template>
<div>
    <div class="header_top">
        <div class="searchWrap">
            <form name="serach" method="get" action="#">
                <input type="text" maxlength="20" name="mainSearchWord" placeholder="검색어를 입력해주세요">
                <el-button icon="el-icon-search" size="small" circle></el-button>
            </form>
        </div>
        <div class="inner">
            <div style="margin-right: 30px;">
            <span>
                <button id="show-modal" @click="showModal = true">로그인</button>
                <p>{{loginUser}}</p>
                <Modal v-if="showModal" @close="showModal = false">
                    
                </Modal>
            </span> |
            <span><button @click="$router.push({name:'join'})">회원가입</button></span>
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

import Modal from "@/views/Member/Login.vue";
import 'element-ui/lib/theme-chalk/index.css';
export default {
    name : "headerTop",
        data(){
            return{
                showModal: false,
                loginUser: this.$store.state.loginUser,
                isLogin: this.$store.state.isLogin
            }
    },
    components:{
        Modal
    },
    methdos:{

    },

    
}
</script>

<style>

</style>