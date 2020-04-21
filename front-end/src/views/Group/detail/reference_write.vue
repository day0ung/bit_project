<template>
  <div class="reference_write">
        <el-button @click="showGroupReference" round>돌아가기</el-button>
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