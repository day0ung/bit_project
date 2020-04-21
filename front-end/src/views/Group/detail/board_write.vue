<template>
    <div class="board_write">
        <quillexamplesnow @contentS="textContent" />
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
            content: '',

        }
    },
    methods:{
        showList(){
            this.loading = true
            this.$emit("showBoard")
        },
        textContent(value){
            this.content = value
        }
    }
}
</script>

<style>

</style>