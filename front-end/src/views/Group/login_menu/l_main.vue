<template>
    <div class="l_main">
        <h3>l_main 페이지</h3>

        <h5>로그인 이용자의 그룹스터디가 있으면 있는것 표시</h5>

        <h5>그룹장이면 그룹스터디 개설 버튼 추가?</h5>
        <h5>그룹개설신청시 그룹장 신청도 동시?</h5>
        <p>신종하: 일반회원이 그룹 신청 양식을 작성하여 관리자에게 제출 시, 승인 받으면 자동으로 그룹장이 되는 방식</p>

        <button class="btn btn-primary" @click="createGroup" style="float: right;">Group Create</button>
    </div>
</template>

<script>
export default {
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