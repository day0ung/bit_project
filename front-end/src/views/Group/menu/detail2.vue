<template>
  <div class="detail2">
    <h3>그룹게시판</h3>
    <br>
    <br>
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
        width="200px">
      </el-table-column>
      <el-table-column
        prop="title"
        label="글제목"
        width="500px"
        >
      </el-table-column>
      <el-table-column
        prop="memberDto.memberId"
        label="작성자"
        >
      </el-table-column>
      <el-table-column
        prop="readCount"
        label="조회수"
        >
      </el-table-column>
      <el-table-column
        prop="writeDate"
        label="작성일"
        >
      </el-table-column>
      <el-table-column
        align="right">
      <template slot="header" slot-scope="scope">
        <el-input
          v-model="search"
          size="mini"
          placeholder="Type to search"/>
      </template>
      </el-table-column>
    </el-table> <br>
    <div class="block" align="center">
      <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page.sync="currentPage"
        :page-sizes="[100, 200, 300, 400]"
        :page-size="100"
        layout="total, sizes, prev, pager, next, jumper"
        :total="400">
      </el-pagination>
    </div>
  </div>
</template>

<script scoped>
import 'element-ui/lib/theme-chalk/index.css';

export default {
  data(){
    return{
      tableData: [],
      currentPage: 1,
      search: '',
    }
  },
  methods:{
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
        console.log(`${val} items per page`);
      },
      handleCurrentChange(val) {
        console.log(`current page: ${val}`);
      }
  },
  mounted(){
      this.$store.state.currpage = this.$route.path
      axios.get("http://localhost:9000/groupBoardList")
                .then(res => {
            this.tableData = res.data
          })
  }
}
</script>

<style scoped>
.clickableRows{
    cursor: pointer !important;
}
</style>
