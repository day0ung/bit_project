<template>
    <div class="board_write">
        <h1>board_write</h1>
        <quillexamplesnow></quillexamplesnow>
        <el-button type="primary" @click="showList" round>돌아가기</el-button>

    </div>
</template>

<script>
import quillexamplesnow from '@/components/Qilledit'

export default {
    components:{
        quillexamplesnow
    },
    data(){
        return{

        }
    },
    methods:{
        showList(){
            this.loading = true
            this.$emit("showBoard")
        }
    }
}
</script>

<style>

</style>