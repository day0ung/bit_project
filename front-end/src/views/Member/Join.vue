<template>
    <div>
        <h1>회원가입 페이지</h1>
          <button id="show-modal" @click="showModal">Show Modal</button>
          <Modal v-if="showModal" @close="showModal = false">
        <!--
        you can use custom content here to overwrite
        default content
        -->
           <h3 slot="header">custom header</h3>
        </Modal>
    
    </div>
</template>

<script>
// import Modal from "@/views/Member/modal.vue";
export default {
    // data(){
    //     showModal: false
    // },
    // components:{
    //     Modal
    // },
    // methods:{
    //     showModal(){
    //         showModal: true
    //     }
    // }
}
</script>

<style>

</style>