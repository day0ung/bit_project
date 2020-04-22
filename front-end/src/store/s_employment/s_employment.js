import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)


export default new Vuex.Store({
    namespaced: true,
    state: {
        RecruitingList: [],
        getOneRecruit : "",
        cvDetail : "",
        showCVList : false,
        showCVDetail : false,
        loadingCVList : false,
        loadingCVDetail : false,

    },
    mutations: {
        
    }, 
    actions: {
    }  
})