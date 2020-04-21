<template>
  <div class="CV">
    <!-- 일반 회원 / CV 없을 때 -->
    <div v-if="(login1.auth === 0 | login1.auth === 1) & login1.cv === 0" class="writeNewCV">
      <el-button type="primary" round @click="writeCV">새로운 이력서 작성</el-button>
    </div>
    <!-- 일반 회원 / CV 있을 때 -->
    <div v-else-if="(login1.auth === 0 | login1.auth === 1) & login1.cv === 1" class="updateCV">
      <el-button type="primary" round @click="test">이력서 수정하기</el-button>
    </div>
    <!-- 기업 회원 -->
    <div v-else class="CVList">
      
      <div class="boardTableFrom">
      <h3>이력서 열람</h3>
        <div class="boardSearchBar">
          <el-input
            v-model="search"
            size="large"
            placeholder="미완성">
            <el-button slot="append" icon="el-icon-search"></el-button>
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
            width="150px">
          </el-table-column>
          <el-table-column
            prop="title"
            label="글제목"
            width="470px"
            >
          </el-table-column>
          <el-table-column
            prop="memberDto.memberName"
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
        </el-table> <br>
        <div class="pageination">
          <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />
        </div>
      </div>
    </div>
  </div>

    
  
  

</template>

<script>
import { loading } from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import Pagination from '@/components/Pagination'
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
      login1 : "",
      search:"",
      loading: true,
    }
  },
  methods:{
    test(){
      this.$router.push({
        name: "test"
        })
    },
    writeCV(){
      this.$router.push({
        name: "CvWriting"
        })
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
      axios.post("http://localhost:9000/CVPagingList", params)
              .then(res => {
          this.tableData = res.data
          this.loading = false
        })
    },
  },
  mounted(){
    this.loading = true;
    this.groupInfoSeq = this.$route.params.contentId
    var params = new URLSearchParams();	// post 방식으로 받아야함.
    params.append('groupInfoSeq', this.groupInfoSeq);
    axios.post("http://localhost:9000/getOneMember", params)
                .then(res => {
            this.groupOne = res.data
            this.loading = false;
          })
  },
  created(){
		let sMemberSeq = sessionStorage.getItem("loginUser")
    this.login1 = JSON.parse(sMemberSeq)
    
    //페이징
    axios.get("http://localhost:9000/CVList")
                .then(res => {
            this.total = res.data.length
          })
      this.getList()
    
		// this.memberSeq = this.$store.state.loginUser.memberSeq
  }
}
</script>

<style scoped>

@import url("https://fonts.googleapis.com/css?family=Lato:400,700");
/* center container in the middle */

/* CV 버튼 */
.CV{
  width: 950px;
  margin: auto;
}

.writeNewCV {
  text-align: center;
  padding: 35px;
}

.updateCV{
  text-align: center;
  padding: 35px;
}

/* 테이블 */
.boardTableFrom{
  margin: auto;
}

/* 검색바 */
.boardSearchBar{
  width: 45%;
  float: right;
}

/* 페이징 */
.pageination{
  margin: auto;
  display: table;
}







</style>
