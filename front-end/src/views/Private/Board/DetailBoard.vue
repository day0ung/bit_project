<template>
  <div class="reference_detail">
    <br>
    <br>
    <div class="groupDetailcCntainer" v-loading="this.$store.state.s_group.showReferenceDetail">
      <div class="groupName">
        <h1>{{ this.$store.state.s_group.groupReferenceDetail.title }}</h1>
      </div>
      <div class="hr"></div>
      <div class="groupInfoTitle">
        <h5>자료</h5>
      </div>
      <div class="groupInfoContent">
        <a v-for="file in this.$store.state.s_group.groupReferenceDetailFileList" :key="file.boardSeq" :href="file.url" download>{{file.fileName}}</a>
      </div>
      <div class="hr"></div>
      <div class="groupInfoTitle">
        <h5><span>상세 정보</span></h5>
      </div>
      <div class="groupInfoContent">
        <div><span>파일정보</span>{{ this.$store.state.s_group.groupReferenceDetail.content }}</div>
        <div><span>작성자</span> {{ this.$store.state.s_group.groupReferenceDetail.memberSeq }}</div>
        <div><span>작성일</span> {{ this.$store.state.s_group.groupReferenceDetail.writeDate }}</div>
        <div><span>조회수</span> {{ this.$store.state.s_group.groupReferenceDetail.readCount }}</div>
      </div>
      <div class="hr"></div>
      <div class="groupName">
        <el-button type="primary" @click="showGroupReference" round>돌아가기</el-button>
        <el-button type="primary" v-show="this.$store.state.s_group.showUpdateBtn" @click="referenceUpdate" round>수정하기</el-button>
        <el-button type="primary" v-show="this.$store.state.s_group.showDeleteBtn" @click="referenceDelete" round>삭제하기</el-button>
      </div>
    </div>
    <br>
    <br>
  </div>
</template>

<script>
import { loading } from 'element-ui';
export default {
  data(){
    return{
        boardOne: "",
        boardSeq: ""
      }
  },
  methods:{
    getList(){
      this.$store.state.s_group.showGroupReferenceList = true
      var params = new URLSearchParams()
      params.append('groupSeq', this.$store.state.s_group.groupSeq);
      axios.post("http://localhost:9000/groupPdsList", params)
                  .then(res => {
              this.$store.state.s_group.groupReferenceList = res.data
              this.$store.state.s_group.showGroupReferenceList = false
            })
    },
    showGroupReference(){
      this.getList()
      this.$emit("showGroupReference")
    },
    showGroupReferenceWrive(){
      this.getList()
      this.$emit("showGroupReference")
    },
    referenceUpdate(){
      this.$emit("showGroupReferenceUpdate")
    },
    referenceDelete(){
      var params = new URLSearchParams()
      params.append('boardSeq', this.$store.state.s_group.groupReferenceDetail.boardSeq);
      axios.post("http://localhost:9000/groupReferenceDelete", params).then(res => {
        alert("자료가 삭제되었습니다.")
        this.showGroupReference()
      })
    },
  },
  mounted(){

  },
}
</script>

<style>

</style>