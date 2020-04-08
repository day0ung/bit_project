<template>
    <div class="content01_view">
        <h1> manager member11111111111111111111111111111111111111111111111111111111111111</h1>


        <button v-on:click="showTestResult">test ajax start area</button>
        <p v-for="outdata in output_data" :key="outdata.boardSeq"> {{outdata}} </p>

                <button v-on:click="showMemberList">member List recive </button>
        <p v-for="memdata in member_data" :key="memdata.memberSeq"> {{memdata}} </p>


        
    </div>
</template>

<script>
var output_data;

export default {
    data(){
        return {
            output_data:'',
            member_data:''
        }
    },
    methods:{
        showTestResult(){
            axios.get("http://localhost:9000/getTestString")
                .then(res => {
                console.log(JSON.stringify(res.data))
                this.output_data=res.data;
            })
    
        },
        showMemberList(){
             axios.get("http://localhost:9000/getMemberListAll")
                .then(res => {
                console.log(JSON.stringify(res.data))
                this.member_data=res.data;
            })

        }


    },
    mounted(){
    

  },

}
</script>

<style>

</style>