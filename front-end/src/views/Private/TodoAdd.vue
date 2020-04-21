<template>
  <div>
      <h1>리스트 추가하는 곳</h1>
      <el-input placeholder="TODO LIST를 작성해주세요. 예)매일 독서, #공부" v-model="list"></el-input>
      <el-button type="success" plain @click="listAdd">할일 추가</el-button>
      <el-button plain @click="cancle">취소</el-button>
  </div>
</template>

<script>
export default {
    data(){
        return{
            list: null
        }
    },
    methods:{
        cancle(){
            this.$emit("cancle")
        },
        listAdd(){
            if(this.list == null){
                alert('할일을 작성해주세요')
            }else{
                this.$emit("listAdd", this.list)
                this.list = null
            }
        },

    }
}
</script>

<style>

</style>