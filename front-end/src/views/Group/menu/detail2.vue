<template>
  <div class="detail2">
    <h3>그룹게시판</h3>
    <br>
    <br>
    <el-table
      :row-class-name="clickableRows"
      :data="tableData"
      stripe
      style="width: 100% cursor:pointer"
      @row-click="gotoClick"
      >
      <el-table-column
        prop="boardSeq"
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
        prop="memberSeq"
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
    </el-table>
  </div>
</template>

<script scoped>
import 'element-ui/lib/theme-chalk/index.css';

export default {
  data(){
    return{
      boardList: [],
      tableData: []
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
    }
  },
  mounted(){
      this.$store.state.currpage = this.$route.path
      axios.get("http://localhost:9000/groupBoardList")
                .then(res => {
            this.boardList = res.data
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
