import Vue from 'vue'
import Vuex from 'vuex'
import aboutus from '@/store/AboutUs/aboutus.js'
import employment from '@/store/Employment/employment.js'
import groupstudy from '@/store/GroupStudy/groupstudy.js'
import privatestudy from '@/store/PrivateStudy/privatestudy.js'
import notice from '@/store/Notice/notice.js'

import subStore from '@/store/subStore.js'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    currpage: "/"
  },
  getters:{
    pageName(state){
      if(state.currpage.indexOf("group") > -1){
        if(state.currpage.indexOf("detail") > -1){
          return "그룹 > 상세페이지"
        }
        return "그룹"
      }
      if(state.currpage.indexOf("private") > -1){
        return "개인"
      }
      if(state.currpage.indexOf("aboutus") > -1){
        return "AboutUs"
      }
      if(state.currpage.indexOf("emplo") > -1){
        return "취업"
      }
    }
  },
  mutations: {
  },
  actions: {
  },
  modules: {
    subStore,
    aboutus,
    employment,
    groupstudy,
    privatestudy,
    notice
  }
})
