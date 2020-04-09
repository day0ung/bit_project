import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)


export default new Vuex.Store({
    namespaced: true,
    state: {
      loginUser : null,
      isLogin : true
    },
    mutations: {
        LoginSave(state, payload){
            this.state.loginUser = payload
            this.state.isLogin = false
        }
    },
    actions: {
   
    }


    
})

