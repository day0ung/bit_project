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
            list:[]
        }
    },
created(){

    axios.post("http://localhost:9000/AdmingetAllGroup")
    .then(res => {
    this.list = res.data
    })

},
methods:{
    




  }


}
</script>

<style>

</style>