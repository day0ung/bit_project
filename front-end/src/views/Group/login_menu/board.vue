<template>
  <div class="groupboard">
    <br>
    <br>
    <div class="boardTableFrom">
    <h3>그룹게시판</h3>
      <div class="boardSearchBar">
        <el-input
          v-model="search"
          size="large"
          placeholder="Search">
          <el-button slot="append" icon="el-icon-search"  @click="displayData" round></el-button>
        </el-input>
      </div>
      <el-table 
        v-loading="loading"
        :row-class-name="clickableRows"
        :data="tableData.filter( data => !search || data.title.toLowerCase().includes(search.toLowerCase())
                                                || data.memberDto.memberId.toLowerCase().includes(search.toLowerCase()) )"
        stripe
        style="width: 100% cursor:pointer"
        @row-click="gotoClick"
       >
        <el-table-column
          prop="finalnum"
          label="글번호"
          width="150px">
        </el-table-column>
        <el-table-column
          prop="title"
          label="글제목"
          width="470px"
          >
        </el-table-column>
        <el-table-column
          prop="memberDto.memberId"
          label="작성자"
          width="100px"
          >
        </el-table-column>
        <el-table-column
          prop="readCount"
          label="조회수"
          width="100px"
          >
        </el-table-column>
        <el-table-column
          prop="writeDate"
          label="작성일"
          width="170px"
          >
        </el-table-column>
      </el-table>
      <div class="pageination">
        <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />
      </div>
    </div>
  </div>
</template>

<script scoped>
import 'element-ui/lib/theme-chalk/index.css';
import Pagination from '@/components/Pagination'
import { loading } from 'element-ui';

export default {
  name: 'GroupBoard',
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
      axios.get("http://localhost:9000/groupBoardList")
                .then(res => {
              this.tableData = res.data
            this.total = res.data.length
            this.loading = false
          })
     
      // listQuery
      // var params = new URLSearchParams();	// post 방식으로 받아야함.
      // params.append('page', this.listQuery.page);
      // params.append('limit', this.listQuery.limit);
      // axios.post("http://localhost:9000/groupPagingList", params)
      //         .then(res => {
      //     this.tableData = res.data
      //     this.loading = false
      //   })
    },
     handleFilter() {
      this.listQuery.page = 1
      this.getList()
    },
    gotoClick(row, column, event){
      this.$router.push({
        path : "/group/board/detail/" + row.boardSeq
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
  margin: auto;
}
.boardSearchBar{
  width: 45%;
  float: right;
}
.pageination{
  margin: auto;
  display: table;
}
</style>
