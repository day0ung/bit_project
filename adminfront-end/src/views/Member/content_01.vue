<template>
    <div class="content01_view">
        <h1> manager member11111111111111111111111111111111111111111111111111111111111111</h1>
       <p v-for="outdata in output_data" :key="outdata.boardSeq">
           {{outdata}}
       </p>
        
        {{output_data}}
    </div>
</template>

<script>
var output_data;

export default {
    data(){
        return {
            
            output_data: output_data
        }
    },
    methods:{


    },
    mounted(){
    
    this.$store.state.currpage = this.$route.path
    axios.get("http://localhost:9000/getTestString")
                      .then(res => {
                // console.log(JSON.stringify(res.data))
                output_data=res.data;
                })
    
  },

}
</script>

<style>

</style>