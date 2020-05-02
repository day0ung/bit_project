<template>
  <div>
      <h5><p>관리할 그룹 (그룹장)</p><p>가입한 그룹 (그룹원)</p></h5>
      <button class="btn btn-primary" @click="createGroup" style="float: right;">그룹개설 신청</button>
  </div>
</template>

<script>
export default {
    methods:{
      createGroup(){
        this.$router.push({name :"Create"})
      }
    }

}
</script>

<style>

</style>