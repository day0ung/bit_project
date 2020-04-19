<template>
    <div class="content02_view">
        <h1> {{title}} show Group list</h1>
    <pre>
        groupInfoSeq
        memberSeq
        memberNAME
        interBigSeq
        Big_name
        interSmallSeq
        iss_small
        currMember
        <collection property="memberDto" resultMap="MemberInfo"/>
        <collection property="interBigDto" resultMap="InterBig"/>
        <collection property="interSmallDto" resultMap="InterSmall"/>
    </pre>
        
    <el-table 
    :data="list"
    stripe
    style="width:100%">

        <el-table-column
            prop="groupInfoSeq"
            label="memberSeq"
            width="100">
        </el-table-column>

        <el-table-column
            prop="memberSeq"
            label="memberId"
            width="100">
        </el-table-column>

        <el-table-column
            prop="pwd"
            label="pwd"
            width="100">
        </el-table-column>

        <el-table-column
            prop="memberName"
            label="memberName"
            width="100">
        </el-table-column>
        
        <el-table-column
            prop="Big_name"
            label="birth"
            width="100">
        </el-table-column>

        <el-table-column
            prop="interSmallSeq"
            label="address"
            width="100">
        </el-table-column>

        <el-table-column
            prop="iss_small"
            label="location"
            width="100">
        </el-table-column>

        <el-table-column
            prop="currMember"
            label="email"
            width="100">
        </el-table-column>

    </el-table>





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

    axios.get("http://localhost:9000/AdmingetAllGroup")
    .then(res => {
    this.list = res.data
    })

},
methods:{
    // shwoAll(){
    //   axios.post("http://localhost:9000/AdmingetAllGroup")
    //           .then(res => {
    //       this.list = res.data
    //     })
    // }
  }


}
</script>

<style>

</style>