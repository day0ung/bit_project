import Vue from 'vue'
import Vuex from 'vuex'
import sample from '@/store/sampleStore.js'

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
    sample
  }
})
