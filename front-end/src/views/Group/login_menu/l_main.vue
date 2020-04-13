<template>
    <div class="l_main">
        <p>신종하: 일반회원이 그룹 신청 양식을 작성하여 관리자에게 제출 시, 승인 받으면 자동으로 그룹장이 되는 방식</p>
        <button class="btn btn-primary" @click="createGroup" style="float: right;">Group Create</button>

        

    </div>
</template>

<script>
export default {
    data(){
        return{
            loginId:'',
        }
    },
    methods:{
        createGroup() {
        this.$router.push({
                name: "Create"
            })
        },
    }
}
</script>

<style>

</style>