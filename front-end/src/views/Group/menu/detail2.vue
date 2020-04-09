<template>
  <div class="detail2">
    <h3>그룹게시판</h3>
    <br>
    <br>
    <div class="boardTableFrom">
      <div class="boardSearchBar">
        <el-input
          v-model="search"
          size="large"
          placeholder="Search">
          <el-button slot="append" icon="el-icon-search"  @click="displayData"></el-button>
        </el-input>
      </div>
      <el-table 
        v-loading="loading"
        :row-class-name="clickableRows"
        :data="tableData"
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

      <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />

    </div>
  </div>
</template>

<script scoped>
import 'element-ui/lib/theme-chalk/index.css';
import Pagination from '@/components/Pagination'
import { loading } from 'element-ui';

export default {
  components: { Pagination },
  data(){
    return{
      tableData: [],
      total: 0,
      listQuery:{
        page: 1,
        limit: 10,
        title: ""
      },
      search:"",
      loading: true,
    }
  },
  methods:{
    displayData(){
      this.tableData=this.tableData.filter((data, index) =>{ console.log(index); !this.search || data.title.toLowerCase().includes(this.search.toLowerCase())
                                                || data.memberDto.memberId.toLowerCase().includes(this.search.toLowerCase())})
    },
    getList(){
      this.loading = true
      this.$store.state.currpage = this.$route.path
      // axios.get("http://localhost:9000/groupBoardList")
      //           .then(res => {
        //       this.tableData = res.data
      //       this.total = res.data.length
      //     })
     
      // listQuery
      var params = new URLSearchParams();	// post 방식으로 받아야함.
      params.append('page', this.listQuery.page);
      params.append('limit', this.listQuery.limit);
      axios.post("http://localhost:9000/groupPagingList", params)
              .then(res => {
          this.tableData = res.data
          this.loading = false
        })
    },
     handleFilter() {
      this.listQuery.page = 1
      this.getList()
    },
    gotoClick(row, column, event){
      this.$router.push({
        path : "/group/detail2/depth2/" + row.boardSeq
      })
    },
    clickableRows :function (row, rowIndex) {
      //alert(row.rowIndex)
      return "clickableRows";
    }
  },
  computed:{
   
  },
  created(){
     axios.get("http://localhost:9000/groupBoardList")
                .then(res => {
            this.total = res.data.length
          })
      this.getList()
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
