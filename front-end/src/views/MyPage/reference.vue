<template>
  <div class="reference">
        <h1>자료실</h1>
        <div v-for="reference in  this.$store.state.s_group.MypageReferenceList" :key="reference.boardSeq">
            <a :href="reference.url">{{ reference.fileName }}</a>
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

    },
    mounted(){
        let params = new URLSearchParams();
        params.append("memberSeq", this.$store.state.loginUser.memberSeq)
        axios.post("http://localhost:9000/MypageReferenceList", params).then(res => {
            this.$store.state.s_group.MypageReferenceList = res.data
        })
    }
}
</script>



<style>

</style>