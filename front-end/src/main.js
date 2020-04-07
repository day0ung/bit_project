import Vue from 'vue'
import App from '@/App.vue'
import router from '@/router/r_index.js'
import store from '@/store/s_index.js'
import moment from "moment"
import VueMomentJS from "vue-momentjs"

Vue.use(VueMomentJS, moment)

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
