<template>
  <div id="sri_layout_popup" style="height: 100%">
    <section id="sri_section">
      <div id="sri_wrap">
        <div id="content">
          <div class="jview_progress" style="display: none;">
            <div class="row"></div>
          </div>
          <div class="wrap_jview">
            <section class="jview">
              <div class="wrap_jv_cont">
                <div class="wrap_jv_header">
                  <div class="jv_header">
                    <a href="#" class="company" target="_blank" onclick="window.open(this.href, ''); return false;" >
                      <!-- 회사명 -->
                      {{getOneRecruit.memberDto.memberName}}
                    </a>
                    <button type="button" title="관심기업 등록" class="btn_jview spr_jview btn_interest" onclick="#" onmousedown="#" first_nudge="off">
                      <span>관심기업 등록</span>
                    </button>
                    <h1 class="tit_job">
                        <!-- 글제목 -->
                      {{getOneRecruit.title}}
                    </h1>
                    <div class="btn_apply">
                      <span class="dday">D-{{getOneRecruit.dDay}}</span>
                      <a class="sri_btn_lg for_btn_event" title="홈페이지 지원" href="http://ps.korchamhrd.net/" target="_blank" rel="nofollow" onclick="try{Saramin.updateHomepageLink(37953815, &quot;homepage&quot;);} catch(e) {}" onmousedown="try{n_trackEvent('homepage_apply', 'view', '37953815')}catch(e){}">
                        <span class="sri_btn_homepage_apply">홈페이지 지원</span>
                      </a>
                    </div>
                  </div>
                </div>
                <div class="jv_cont jv_summary">
                  <div class="jv_title blind">핵심 정보</div>
                  <div class="cont">
                    <div class="col">
                      <dl>
                        <dt>경력</dt>
                        <dd><strong>{{getOneRecruit.career}}</strong></dd>
                      </dl>            
                      <dl>
                        <dt>학력</dt>
                        <dd><strong>{{getOneRecruit.education}}</strong></dd>
                      </dl>                
                      <dl>
                        <dt>근무형태</dt>
                        <dd><strong>{{getOneRecruit.workingType}}</strong></dd>
                      </dl>
                    </div>
                    <div class="col">
                      <dl>
                        <dt>급여</dt>
                        <dd>{{getOneRecruit.salary}}</dd>
                      </dl>
                      <dl>
                        <dt>직급/직책</dt>
                        <dd>{{getOneRecruit.position}}</dd>
                      </dl>
                      <dl>
                        <dt>근무지역</dt>
                        <dd>{{getOneRecruit.workingLocation}}</dd>
                      </dl>
                    </div>
                    <ul class="meta">
                      <li>조회수 <strong>{{getOneRecruit.readCount}}</strong></li>
                      <!-- <li>홈페이지접속 <strong>105</strong></li> -->
                      <!-- <li class="txt_noti">특이사항</li> -->
                    </ul>
                  </div>
                </div>
                <div class="jv_cont jv_detail">
                  <div class="jv_title blind">상세요강</div>
                    <div class="cont">
                      <div class="iframe_content" width="860" scrolling="no" frameborder="0" marginheight="0" marginwidth="0" src="" title="상세요강" height="auto">
                        <p>안녕하세요</p>
                    
                      </div>
                    </div>
                  </div>
                  <div class="jv_cont jv_howto">
                    <div class="jv_title">접수기간 및 방법</div>
                    <div class="cont box">
                      <div class="status">
                        <div class="info_timer" data-remain-time="1429051">
                          <span class="txt">남은 기간</span>
                          <span class="day">{{getOneRecruit.dDay}}</span>
                          <span class="txt_day">일</span>
                          <span class="time">{{dTime}}</span>
                        </div>
                        <dl class="info_period">
                          <dt>시작일</dt>
                          <!-- <dd>{{getOneRecruit.cvStartDate}</dd> -->
                          <dd>{{startDate}}</dd>
                          <dt class="end">마감일</dt>
                          <dd>{{endDate}}</dd>
                        </dl>
                      </div>
                        <dl class="guide">
                          <dt>지원방법</dt>
                          <dd class="method">
                            <a href="http://ps.korchamhrd.net/" onmousedown="#" class="link" target="_blank">홈페이지 지원</a>                
                          </dd>
                        </dl>
                      <p class="noti">마감일은 기업의 사정, 조기마감 등으로 변경될 수 있습니다.</p>
                  </div>
                </div>

                </div>
            </section>
          </div> 
        </div>
      </div>
    </section>
  </div>
</template>

<script>
import Vue from "vue"
import moment from "moment"
import VueMomentJS from "vue-momentjs"
import rDetailcss from "@/assets/css/employment/RecruitingDetail.css"

Vue.use(VueMomentJS, moment)


export default {
  data(){
    return{
      empBoardSeq : "",
      getOneRecruit : "",
      nowDate : this.$moment(new Date()).format('YYYY.MM.DD HH:mm:ss'),
      startDate : "",
      endDate : "",
      nowMilliS : "",
      endMillis : "",
      
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
            this.startDate = this.$moment(res.data.cvStartDate).format('YYYY.MM.DD HH:mm')
            this.endDate = this.$moment(res.data.cvEndDate).format('YYYY.MM.DD HH:mm')
            
      })
     
      

  },
  computed:{
    
    dTime(){
      this.nowMilliS = moment(this.nowDate).valueOf()
      this.endMillis = moment(this.endDate).valueOf()
      alert(moment(this.endMillis - this.nowMilliS).format("hhmmss"))
      return setInterval(moment(this.endMillis - this.nowMilliS).format("hhmmss"), 1000)
      
    }
  }
  
  
    


  
}
</script>