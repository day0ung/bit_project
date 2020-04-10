<template>
<div>
    <div class="header_top">
        <div class="header_component">
            <div class="searchWrap">
                <form name="serach" method="get" action="#">
                    <input type="text" maxlength="20" name="mainSearchWord" placeholder="검색어를 입력해주세요">
                    <el-button icon="el-icon-search" size="small" circle></el-button>
                </form>
            </div>
            <div class="logo">
                <router-link to="/">
                    <img style="height: 55px; margin-top: -10px;" src='../../assets/css/images/logo.png' alt="팔레트" />
                </router-link>
            </div>
            <div class="member">
                <span>
                    <button id="show-modal" @click="showModal = true">로그인</button>
                    <Modal v-if="showModal" @close="showModal = false">
                    <!--
                    you can use custom content here to overwrite
                    default contentzz
                    -->
                    </Modal>
                </span> |
                <span><button @click="$router.push({name:'join'})">회원가입</button></span> |
                <span><button @click="logOut">로그아웃</button></span>
            </div>
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
    methods:{
        logOut() {
            sessionStorage.removeItem("loginUser")
            this.$router.push({
                name: "Home"
            })
            alert("로그아웃 되었습니다.")
        },
    },
    mounted(){
    }
    
}
</script>

<style>

</style>