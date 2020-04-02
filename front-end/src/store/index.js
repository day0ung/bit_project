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
    currpage: "/",
    depth1:"",
    depth2:"",
    depth3:"",
    totalDepth: ""
  },
  getters:{
    pageName(state){
      state.depth1 = state.currpage.split("/")[3]
      state.depth2 = state.currpage.split("/")[4]
      state.depth3 = state.currpage.split("/")[5]
     
      if (state.depth1 != undefined){
        state.totalDepth = state.depth1
      }
      if (state.depth2 != undefined){
        state.totalDepth = state.depth1 + " > " + state.depth2
      }
      if (state.depth3 != undefined){
        state.totalDepth = state.depth1 + " > " + state.depth2 + " > " + state.depth3
      }
      return state.totalDepth
    }
  },
  mutations: {
  },
  actions: {
  },
  modules: {
    aboutus,
    employment,
    groupstudy,
    privatestudy,
    notice,
    subStore
  }
})
