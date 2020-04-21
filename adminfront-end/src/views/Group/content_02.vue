<template>
    <div class="content02_view">
        <h1> {{title}} group 22222222222222222221122222222222222222222222221</h1>




         <button v-on:click="changePermission"> 1/1 권한 설정 </button>
    </div>
</template>

<script>
import 'element-ui/lib/theme-chalk/display.css';
const path = "http://localhost:9000";

export default {
    data(){
        return {
            title:'group2'
        }
    },
    methods:{
        changePermission(){




            const confirmflag = confirm("그룹개설신청 허가하시겠습니까");
            if(confirmflag){

            var params = new URLSearchParams();	// post 방식으로 받아야함.
            // params.append('groupInfoSeq', this.listQuery.page);
            // params.append('memberSeq', this.listQuery.limit);

            //TestCode <<< START >>>
            params.append('groupInfoSeq', 1);
            params.append('memberSeq', 1);
            //TestCode <<< END >>>

            axios.post(path+"/AdminAcceptCreateGroup",params)
            .then(res=>{
                console.log(res.data)
                //$router.path.push('/managemember2')
            })

            }else{
            alert("그룹개설신청 거부");
            }
        }


    }

}
</script>

<style>

</style>