<template>
    <div class="content02_view">
        <h1> Company member Management tool </h1>
      <pre>
-> callList
/adminCompanyMemberShowAll
/showCompanyInfo  (Memberdto)
/adminGetCompanyInfoOne
/finishApprovalCompanyList
/adminGetCompanyLocationALl
/adminGetCompanyNmaeAll
      </pre>

      <el-table 
        :data="CompanyMemberAll"
        stripe
        style="width:100$">

            <el-table-column
              prop="memberSeq"
              label="memberSeq"
              width="100">
            </el-table-column>

            <el-table-column
              prop="memberId"
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
              prop="birth"
              label="birth"
              width="100">
            </el-table-column>

            <el-table-column
              prop="address"
              label="address"
              width="100">
            </el-table-column>

            <el-table-column
              prop="location"
              label="location"
              width="100">
            </el-table-column>

            <el-table-column
              prop="email"
              label="email"
              width="100">
            </el-table-column>

            <el-table-column
              prop="myMoney"
              label="myMoney"
              width="100">
            </el-table-column>

            <el-table-column
              prop="cv"
              label="cv"
              width="100">
            </el-table-column>

            <el-table-column
              prop="companyInfo"
              label="companyInfo"
              width="100">
            </el-table-column>
            <el-table-column
              prop="companyLogo"
              label="companyLogo"
              width="100">
            </el-table-column>

            <el-table-column
              prop="auth"
              label="auth"
              width="100">
            </el-table-column>

            <el-table-column
              prop="del"
              label="del"
              width="100">
            </el-table-column>
            <el-table-column
              prop="dislike"
              label="dislike"
              width="100">
            </el-table-column>



      </el-table>

      <br> <hr>
      <!-- <button v-on:click="showAdminCompanyMamberShowAll"> Call Company List All </button> -->
      <ul>
        <li v-for="item in CompanyMemberAll" :key="item.memberSeq">{{item}}</li>

      </ul>


      


    </div>
</template>

<script scoped>

import 'element-ui/lib/theme-chalk/display.css';
const path = "http://localhost:9000/";

export default {
    data(){
      return{
        CompanyMemberAll:[]

      }
        
    },
    created(){
      
        axios.get(path+"adminCompanyMemberShowAll")
        .then(res=>{
          console.log(res)
          this.CompanyMemberAll=res.data
        })
      
    },

    methods:{
      
        
          
     
    }

}
</script>

<style>

</style>


    <!-- <el-table
      :data="tableData"
      style="width: 100%">
      <el-table-column
        prop="date"
        label="Date"
        width="180">
      </el-table-column>
      <el-table-column
        prop="name"
        label="Name"
        width="180">
      </el-table-column>
      <el-table-column
        prop="address"
        label="Address">
      </el-table-column>
    </el-table> -->