import Vue from 'vue'
import Vuex from 'vuex'
import sample from '@/store/sampleStore.js'

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
