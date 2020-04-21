<template>
  <div class="reference_write">
      <h1>reference_write.vue</h1>
        <quillexamplesnow @contentS="textContent" />
        <el-button type="primary" @click="showGroupReference" round>돌아가기</el-button>
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