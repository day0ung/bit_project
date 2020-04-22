<template>
  <div class="reference_write">
        <br>
        <br>
        <el-button @click="showGroupReference" round>목록으로</el-button>
        <quillexamplesnow @contentS="textContent" />
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
        showGroupReference(){
            this.$emit("showGroupReference")
        },
        textContent(value){
            this.content = value
        }
    }
}
</script>

<style>

</style>