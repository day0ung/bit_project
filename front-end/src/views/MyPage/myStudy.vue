<template>
  <div>
      <button class="btn btn-primary" @click="createGroup" style="float: right;">그룹개설 신청</button>
    <div class="slib">
      <div class="slib_info">
          <div class="tit">
            <img src='../../assets/css/images/networking.png'>
          </div>
          <div class="titup">
              <table class="table1" style="margin-left: 55px" v-loading="this.$store.state.s_member.MyPageInterLikeListLoading">
                <colgroup>
              <col style="width: 270px">
              <col style="width: 30px">
              <col style="width: 50px">
              </colgroup>
                <thead>
                  <tr>
                    <th style="text-align: center;">가입한 스터디 그룹</th>
                    <th></th>
                    <th></th>
                  </tr>
                </thead>
                <tbody>
                  <tr v-for="groupOne in this.$store.state.s_member.MyPageGroupList" :key="groupOne.groupInfoSeq">
                    <td colspan="3">{{groupOne.groupName}}</td>
                    <td><i class="el-icon-paperclip" style="color: #ff5151"></i> </td>
                    <td style="width: 100px; text-align: left;">
                      <el-button v-if="groupOne.memberSeq === loginSeq" type="text" style="color: #ff5151; font-size: 16px">그룹장</el-button>
                      <el-button v-else="" type="text" style="color: #ff5151; font-size: 16px">멤버</el-button>
                    </td>
                    <td style="width: 100px; text-align: left;">
                      <el-button v-if="groupOne.memberSeq === loginSeq" type="text" style="color: #ff5151; font-size: 16px" @click="gotoDetail(groupOne.groupInfoSeq)">| 관리하기</el-button>
                      <el-button v-else="" type="text" style="color: #ff5151; font-size: 16px" @click="gotoDetail(groupOne.groupInfoSeq)">| 활동하기</el-button>
                    </td>
                  </tr>                   
                </tbody>
              </table>
              <table class="table1" v-if="addr">
                <tbody>
                  <tr>
                        <el-button type="info" plain style="width: 100px; padding: 11px;" @click="execDaumPostcode">우편번호 찾기</el-button>
                  </tr>
                  <tr>
                    <td>
                      <el-input  placeholder="주소" readonly="readonly" v-model="address"></el-input>
                    </td>
                    <td>
                      <el-input  placeholder="상세주소" style="width: 300px" v-model="extraAddress"></el-input>
                    </td>
                    <td style="width: 14px"></td>
                    <td><i class="el-icon-s-tools" style="color: #d77f4a"></i> </td>
                    <td>
                      <el-button type="text" @click="editArea" style="color: #d77f4a; font-size: 16px">수정하기</el-button>
                    </td>
                  </tr>                   
                </tbody>
              </table>
          </div>
      </div>
    </div>
    <div class="slib">
  </div>
  </div>
</template>

<script>
export default {
  data(){
    return{
      loginSeq: 0,
    }
  },
    methods:{
      createGroup(){
        this.$router.push({name :"Create"})
      },
      // management(seq){
      //   alert("관리하기" + seq)
      // },
      // groupActive(seq){
      //   alert("활동하기" + seq)
      // },
      gotoDetail(groupSeq){
        //alert("groupSeq=" + groupSeq + "loginSeq" + this.loginSeq)
        this.$router.push('/group/menu/'+ groupSeq)
      },
    },
    mounted(){
      this.loginSeq = this.$store.state.loginUser.memberSeq
      let params = new URLSearchParams();
      params.append("memberSeq", this.$store.state.loginUser.memberSeq)
      axios.post("http://localhost:9000/getMyGroup", params).then(res => {
        console.log("getMyGroup()")
        console.log(res.data)
        this.$store.state.s_member.MyPageGroupList = res.data
      })
    }
}
</script>

<style>

</style>