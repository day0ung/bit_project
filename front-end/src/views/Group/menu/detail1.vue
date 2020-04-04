<template>
  <div class="detail1">
    <br>
    <br>
    <div style="display: flow-root;">
      <div class="btn-group btn-group-toggle" data-toggle="buttons">
        <label class="btn btn-primary">
          <input type="radio" name="options" id="option1" autocomplete="off"> 대학생/취업
        </label>
        <label class="btn btn-info">
          <input type="radio" name="options" id="option2" autocomplete="off"> 공무원/임용
        </label>
        <label class="btn btn-success">
          <input type="radio" name="options" id="option3" autocomplete="off"> 어학/회화
        </label>
        <label class="btn btn-warning">
          <input type="radio" name="options" id="option3" autocomplete="off"> 라이프/취미
        </label>
      </div>
    <button class="btn btn-primary" @click="createGroup" style="float: right;">Group Create</button>
    </div>
    <div style="display: flex; flex-wrap: wrap;">
      <aside class="profile-card shadow-drop-br" v-for="groupInfo in list" :key="groupInfo.groupInfoSeq" style="margin: 20px auto;">
        <div class="blue" v-if="groupInfo.interBigSeq === 1">
          <header>
            <div style="height: 30px;"></div>
            <router-link :to="{ name: 'depth1', params: { contentId: groupInfo.groupInfoSeq }}">
              <img src="@/assets/Awesome.png">
            </router-link>
            <div style="height: 30px;"></div>
            <h4>{{groupInfo.name}}</h4>
          </header>
          <div class="profile-bio">
            <p>스터디 시작일 : {{groupInfo.startDate}}</p>
            <p>스터디 종료일 : {{groupInfo.endDate}}</p>
          </div>
        </div>

        <div class="red" v-if="groupInfo.interBigSeq === 2">
          <header>
            <div style="height: 30px;"></div>
            <router-link :to="{ name: 'depth1', params: { contentId: groupInfo.groupInfoSeq }}">
              <img src="@/assets/Awesome.png">
            </router-link>
            <div style="height: 30px;"></div>
            <h4>{{groupInfo.name}}</h4>
          </header>
          <div class="profile-bio">
            <p>스터디 시작일 : {{groupInfo.startDate}}</p>
            <p>스터디 종료일 : {{groupInfo.endDate}}</p>
          </div>
        </div>

        <div class="green" v-if="groupInfo.interBigSeq === 3">
          <header>
            <div style="height: 30px;"></div>
            <router-link :to="{ name: 'depth1', params: { contentId: groupInfo.groupInfoSeq }}">
              <img src="@/assets/Awesome.png">
            </router-link>
            <div style="height: 30px;"></div>
            <h4>{{groupInfo.name}}</h4>
          </header>
          <div class="profile-bio">
            <p>스터디 시작일 : {{groupInfo.startDate}}</p>
            <p>스터디 종료일 : {{groupInfo.endDate}}</p>
          </div>
        </div>
        
        <div class="yellow" v-if="groupInfo.interBigSeq === 4">
          <header>
            <div style="height: 30px;"></div>
            <router-link :to="{ name: 'depth1', params: { contentId: groupInfo.groupInfoSeq }}">
              <img src="@/assets/Awesome.png">
            </router-link>
            <div style="height: 30px;"></div>
            <h4>{{groupInfo.name}}</h4>
          </header>
          <div class="profile-bio">
            <p>스터디 시작일 : {{groupInfo.startDate}}</p>
            <p>스터디 종료일 : {{groupInfo.endDate}}</p>
          </div>
        </div>
      </aside>
    </div>
  </div>
</template>

<script>
export default {
  data(){
    return{
      list: this.$store.state.s_group.groupList,
      key: this.$store.state.s_group.groupList.groupInfoSeq
    }
  },
  methods:{
    createGroup() {
      this.$router.push({
        path: "create"
      })
    }
  },
  mounted(){
      this.$store.state.currpage = this.$route.path
      axios.get("http://localhost:9000/getAllGroup")
                .then(res => {
            //alert(JSON.stringify(res.data))
            this.list = res.data
            this.$store.state.s_group.groupList = res.data
          })
  }
}
</script>

<style scope>
@-webkit-keyframes shadow-drop-br{0%{-webkit-box-shadow:0 0 0 0 transparent;box-shadow:0 0 0 0 transparent}100%{-webkit-box-shadow:12px 12px 20px -12px rgba(0,0,0,.35);box-shadow:12px 12px 20px -12px rgba(0,0,0,.35)}}@keyframes shadow-drop-br{0%{-webkit-box-shadow:0 0 0 0 transparent;box-shadow:0 0 0 0 transparent}100%{-webkit-box-shadow:12px 12px 20px -12px rgba(0,0,0,.35);box-shadow:12px 12px 20px -12px rgba(0,0,0,.35)}}
.shadow-drop-br{-webkit-animation:shadow-drop-br .4s cubic-bezier(.25,.46,.45,.94) both;animation:shadow-drop-br .4s cubic-bezier(.25,.46,.45,.94) both}

header img {
  border-radius: 50%;
  width: 150px;
  height: 150px;
  border: 5px solid rgba(0, 0, 0, 0.11);
}

aside {
  border-top: 0px solid rgba(0, 0, 0, 0.22);
  border-bottom: 0px solid rgba(0, 0, 0, 0.33);
  border-radius: 50%;
  margin: 0 auto;
  display: block;
  height: 210px;
  width: 210px;
  background-size: cover;
  overflow: hidden;
  transition: all ease 0.3s;
}

aside .blue{
  background: #74b9ff;
}

aside .red{
  background: #ff7675;
}

aside .green{
  background: #00cec9;
}

aside .yellow{
  background: #ffeaa7;
}

aside:hover {
  border-top: 4px solid rgba(0, 0, 0, 0.22);
  border-bottom: 4px solid rgba(0, 0, 0, 0.44);
  border-radius: 5px;
  height: 320px;
  width: 250px;
}

aside:hover header img {
  animation: profile_image 2000ms linear both;
  animation-delay: 0.5s;
}

header {
  text-align: center;
}


.profile-bio {
  text-align: center;
  margin-top: 20px;
  padding: 1px 20px 10px 20px !important;
  transition: all linear 1.5s;
  font-size: 14px;
  opacity: 0;
  background: linear-gradient(
    to bottom,
    rgba(0, 0, 0, 0) 0%,
    rgba(0, 0, 0, 0.22) 49%,
    rgba(0, 0, 0, 0.44) 100%
  );
}

aside:hover .profile-bio {
  opacity: 1;
}

.profile-social-links {
  position: relative;
  margin-top: -440px;
  margin-left: -100px;
  list-style-type: none;
  opacity: 0;
  transition: all ease 0.5s;
}

aside:hover .profile-social-links {
  margin-left: -30px;
  opacity: 1;
}
/*PROFILE IMAGE ANIMATE */
@keyframes profile_image{0%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1)}3.4%{transform:matrix3d(1.032,0,0,0,0,1.041,0,0,0,0,1,0,0,0,0,1)}4.7%{transform:matrix3d(1.045,0,0,0,0,1.06,0,0,0,0,1,0,0,0,0,1)}6.81%{transform:matrix3d(1.066,0,0,0,0,1.089,0,0,0,0,1,0,0,0,0,1)}9.41%{transform:matrix3d(1.088,0,0,0,0,1.117,0,0,0,0,1,0,0,0,0,1)}10.21%{transform:matrix3d(1.094,0,0,0,0,1.123,0,0,0,0,1,0,0,0,0,1)}13.61%{transform:matrix3d(1.112,0,0,0,0,1.133,0,0,0,0,1,0,0,0,0,1)}14.11%{transform:matrix3d(1.114,0,0,0,0,1.133,0,0,0,0,1,0,0,0,0,1)}17.52%{transform:matrix3d(1.121,0,0,0,0,1.124,0,0,0,0,1,0,0,0,0,1)}18.72%{transform:matrix3d(1.121,0,0,0,0,1.119,0,0,0,0,1,0,0,0,0,1)}21.32%{transform:matrix3d(1.12,0,0,0,0,1.107,0,0,0,0,1,0,0,0,0,1)}24.32%{transform:matrix3d(1.115,0,0,0,0,1.096,0,0,0,0,1,0,0,0,0,1)}25.23%{transform:matrix3d(1.113,0,0,0,0,1.094,0,0,0,0,1,0,0,0,0,1)}29.03%{transform:matrix3d(1.106,0,0,0,0,1.09,0,0,0,0,1,0,0,0,0,1)}29.93%{transform:matrix3d(1.105,0,0,0,0,1.09,0,0,0,0,1,0,0,0,0,1)}35.54%{transform:matrix3d(1.098,0,0,0,0,1.096,0,0,0,0,1,0,0,0,0,1)}36.74%{transform:matrix3d(1.097,0,0,0,0,1.098,0,0,0,0,1,0,0,0,0,1)}41.04%{transform:matrix3d(1.096,0,0,0,0,1.102,0,0,0,0,1,0,0,0,0,1)}44.44%{transform:matrix3d(1.097,0,0,0,0,1.103,0,0,0,0,1,0,0,0,0,1)}52.15%{transform:matrix3d(1.099,0,0,0,0,1.101,0,0,0,0,1,0,0,0,0,1)}59.86%{transform:matrix3d(1.101,0,0,0,0,1.099,0,0,0,0,1,0,0,0,0,1)}63.26%{transform:matrix3d(1.101,0,0,0,0,1.099,0,0,0,0,1,0,0,0,0,1)}75.28%{transform:matrix3d(1.1,0,0,0,0,1.1,0,0,0,0,1,0,0,0,0,1)}85.49%{transform:matrix3d(1.1,0,0,0,0,1.1,0,0,0,0,1,0,0,0,0,1)}90.69%{transform:matrix3d(1.1,0,0,0,0,1.1,0,0,0,0,1,0,0,0,0,1)}100%{transform:matrix3d(1.1,0,0,0,0,1.1,0,0,0,0,1,0,0,0,0,1)}}aside:hover header h1{animation:name_and_job 1.5s linear both;animation-delay:.4s}@keyframes name_and_job{0%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,-300,0,0,1)}1.3%{transform:matrix3d(3.905,0,0,0,0,1,0,0,0,0,1,0,-237.02,0,0,1)}2.55%{transform:matrix3d(4.554,0,0,0,0,1,0,0,0,0,1,0,-182.798,0,0,1)}4.1%{transform:matrix3d(4.025,0,0,0,0,1,0,0,0,0,1,0,-125.912,0,0,1)}5.71%{transform:matrix3d(3.039,0,0,0,0,1,0,0,0,0,1,0,-79.596,0,0,1)}8.11%{transform:matrix3d(1.82,0,0,0,0,1,0,0,0,0,1,0,-31.647,0,0,1)}8.81%{transform:matrix3d(1.581,0,0,0,0,1,0,0,0,0,1,0,-21.84,0,0,1)}11.96%{transform:matrix3d(1.034,0,0,0,0,1,0,0,0,0,1,0,4.825,0,0,1)}12.11%{transform:matrix3d(1.023,0,0,0,0,1,0,0,0,0,1,0,5.53,0,0,1)}15.07%{transform:matrix3d(.947,0,0,0,0,1,0,0,0,0,1,0,12.662,0,0,1)}16.12%{transform:matrix3d(.951,0,0,0,0,1,0,0,0,0,1,0,13.007,0,0,1)}27.23%{transform:matrix3d(1.001,0,0,0,0,1,0,0,0,0,1,0,2.352,0,0,1)}27.58%{transform:matrix3d(1.001,0,0,0,0,1,0,0,0,0,1,0,2.121,0,0,1)}38.34%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,-.311,0,0,1)}40.09%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,-.291,0,0,1)}50%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,-.048,0,0,1)}60.56%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,.007,0,0,1)}82.78%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1)}100%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1)}}aside:hover ul li:first-child{animation:social_animation 2s ease-in-out both;animation-delay:.75s}aside:hover ul li:nth-child(2){animation:social_animation 2s ease-in-out both;animation-delay:1s}aside:hover ul li:nth-child(3){animation:social_animation 2s ease-in-out both;animation-delay:1.25s}@keyframes social_animation{0%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,-300,0,0,1)}1.3%{transform:matrix3d(3.905,0,0,0,0,1,0,0,0,0,1,0,-237.02,0,0,1)}2.55%{transform:matrix3d(4.554,0,0,0,0,1,0,0,0,0,1,0,-182.798,0,0,1)}4.1%{transform:matrix3d(4.025,0,0,0,0,1,0,0,0,0,1,0,-125.912,0,0,1)}5.71%{transform:matrix3d(3.039,0,0,0,0,1,0,0,0,0,1,0,-79.596,0,0,1)}8.11%{transform:matrix3d(1.82,0,0,0,0,1,0,0,0,0,1,0,-31.647,0,0,1)}8.81%{transform:matrix3d(1.581,0,0,0,0,1,0,0,0,0,1,0,-21.84,0,0,1)}11.96%{transform:matrix3d(1.034,0,0,0,0,1,0,0,0,0,1,0,4.825,0,0,1)}12.11%{transform:matrix3d(1.023,0,0,0,0,1,0,0,0,0,1,0,5.53,0,0,1)}15.07%{transform:matrix3d(.947,0,0,0,0,1,0,0,0,0,1,0,12.662,0,0,1)}16.12%{transform:matrix3d(.951,0,0,0,0,1,0,0,0,0,1,0,13.007,0,0,1)}27.23%{transform:matrix3d(1.001,0,0,0,0,1,0,0,0,0,1,0,2.352,0,0,1)}27.58%{transform:matrix3d(1.001,0,0,0,0,1,0,0,0,0,1,0,2.121,0,0,1)}38.34%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,-.311,0,0,1)}40.09%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,-.291,0,0,1)}50%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,-.048,0,0,1)}60.56%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,.007,0,0,1)}82.78%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1)}100%{transform:matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1)}}

</style>