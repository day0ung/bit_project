<template>
    <div class="content01_view">
        <h1> {{title}} show Group list</h1>
        
    </div>
</template>

<script>
export default {
    data(){
        return {
            title:'group1',
            adminAllStudyGroupList:[]
        }
    },
created(){

    // axios.post("http://localhost:9000/AdmingetTESTAllGroup")
    // .then(res => {
    //     console.log("admin all group print ")
    //     this.adminAllGroupList = res.data
    //     console.log(this.adminAllGroupList)
    // })



    // 

},
methods:{
    




  }


}
</script>

<style>

</style>