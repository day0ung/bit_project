<template>
  <div id="sri_layout_popup">
    <section id="sri_section">
      <div id="sri_wrap">
        <div id="content">
    123
        </div>
      </div>
    </section>
  </div>
</template>

<script>
export default {
  data(){
    return{
      empBoardSeq : "",
      getOneRecruit : ""
    }
  },
  mounted(){
    // 구인공고 리스트에서 공고를 클릭시 게시판seq를 파라미터로 가지고 와서 DTO를 불러와서 getOneRecruit에 담는다.
    this.empBoardSeq = this.$route.params.boardId
      var params = new URLSearchParams()
      params.append("empBoardSeq", this.empBoardSeq)
      axios.post("http://localhost:9000/getOneRecruit", params)
          .then(res =>{
            this.getOneRecruit = res.data
            this.$store.state.s_employment.getOneRecruit = res.data
      })
  }
}
</script>

<style scoped>

/* 팝업뷰 */
#sri_layout_popup {
    min-width: 960px
}

#sri_layout_popup .wrap_jview {
    padding: 0
}

#sri_layout_popup .jv_remote {
    top: 39px;
    margin-left: -549px
}

#sri_layout_popup .jv_remote.shrink {
    margin-left: -472px
}

#sri_layout_popup .jv_remote.fix_pop {
    top: 99px
}

#sri_layout_popup .jview_floating .jv_header_float {
    margin-left: -435px
}

#sri_section {
    display: table;
    overflow: hidden;
    position: relative;
    z-index: 1;
    width: 100%;
    height: 100%;
    box-sizing: border-box
}

body.has_lnb #sri_section {
    padding-left: 220px
}

#sri_wrap {
    display: table-row;
    width: 100%;
    height: 100%
}

#content {
    position: relative;
    z-index: 1;
    margin: 44px auto 80px auto;
    width: 960px
}


</style>