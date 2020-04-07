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
            <span>
                <button id="show-modal" @click="showModal = true" style="padding-bottom: 3px;
                 font-weight: 300;
                 font-size: unset">로그인</button>
                <Modal v-if="showModal" @close="showModal = false">
                
                </Modal>
            </span> |
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
import Modal from "@/views/Member/modal.vue";

export default {
    name : "headerTop",
        data(){
            return{
                showModal: false
            }
    },
    components:{
        Modal
    },
    methdos:{
        
    }
}
</script>

<style>

</style>