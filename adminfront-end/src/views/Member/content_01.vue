<template>
    <div class="content01_view">
        <h1> manager member 11111111111111111111111</h1>
        

        <h3>그룹게시판</h3>
        <br>
        <br>
        <div class="boardTableFrom">
            <div class="boardSearchBar">
                <el-input
                v-model="search"
                size="large"
                placeholder="Search">
                <el-button slot="append" icon="el-icon-search"></el-button>
                </el-input>
            </div>
            <el-table 
                :row-class-name="clickableRows"
                :data="tableData.filter(data => !search || data.title.toLowerCase().includes(search.toLowerCase())
                                                        || data.memberDto.memberId.toLowerCase().includes(search.toLowerCase()))"
                stripe
                style="width: 100% cursor:pointer"
                @row-click="gotoClick"
                >
                <el-table-column
                prop="finalnum"
                label="글번호"
                width="90px">
                </el-table-column>
                <el-table-column
                prop="title"
                label="글제목"
                width="380px"
                >
                </el-table-column>
                <el-table-column
                prop="memberDto.memberId"
                label="작성자"
                width="90px"
                >
                </el-table-column>
                <el-table-column
                prop="readCount"
                label="조회수"
                width="80px"
                >
                </el-table-column>
                <el-table-column
                prop="writeDate"
                label="작성일"
                width="170px"
                >
                </el-table-column>
            </el-table> <br>
            <div class="block" align="center">
                <el-pagination
                @size-change="handleSizeChange"
                @current-change="handleCurrentChange"
                :current-page.sync="currentPage"
                :page-sizes="[5, 10, 20, 50]"
                :page-size="5"
                layout="total, sizes, prev, pager, next, jumper"
                :total="totalItem">
                </el-pagination>
            </div>
        </div>




        <button v-on:click="showTestResult">test ajax start area</button>
        <p v-for="outdata in output_data" :key="outdata.boardSeq"> {{outdata}} </p>

                <button v-on:click="showMemberList">member List recive </button>
        <p v-for="memdata in member_data" :key="memdata.memberSeq"> {{memdata}} </p>


        
    </div>
</template>

<script scoped>
var output_data;
import 'element-ui/lib/theme-chalk/index.css';

export default {
    data(){
        return {
            output_data:'',
            member_data:'',

            tableData: [],
            currentPage: 1,
            search: '',
            totalItem: 0,
            itemsPerPage: 10,


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

        },
        gotoClick(row, column, event){
        this.$router.push({
            path : "/group/detail2/depth2/" + row.boardSeq
        })
        },
        clickableRows :function (row, rowIndex) {
        //alert(row.rowIndex)
        return "clickableRows";
        },
        handleSizeChange(val) {
            this.itemsPerPage = val
            console.log(`${val} items per page`);
        },
        handleCurrentChange(val) {
        this.currentPage = val
        console.log(`current page: ${val}`);
        }
    },
  mounted(){
      this.$store.state.currpage = this.$route.path
      var params = new URLSearchParams();
      params.append('itemsPerPage', this.itemsPerPage);
      params.append('currentPage', this.currentPage);
      axios.post("http://localhost:9000/groupBoardList", params)
                .then(res => {
            this.tableData = res.data
            this.totalItem = res.data.length
          })
  }
}
</script>


<style scoped>
.boardTableFrom{
  width: 80%;
  margin: auto;
}
.boardSearchBar{
  width: 45%;
  float: right;
}
</style>
