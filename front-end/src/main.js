import Vue from 'vue'
import App from '@/App.vue'
import router from '@/router/r_index.js'
import store from '@/store/s_index.js'

Vue.config.productionTip = true

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
