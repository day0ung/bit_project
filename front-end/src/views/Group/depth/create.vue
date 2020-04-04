<template>
  <div class="create">
        <h5>create</h5>
        <div style="text-align: center;">
            <button class="btn btn-primary" @click="gruopCreateApply">Group Create Apply</button>
        </div>
  </div>
</template>

<script>
export default {
    methods:{
        gruopCreateApply: function (event) {
            alert("그룹신청이 완료되었습니다.\n심사 후 그룹개설이 완료됩니다.")
            this.$router.push({
                path: "/group"
            })
        }
    }

}
</script>

<style>

</style>