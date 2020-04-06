import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'


import 'expose-loader?$!expose-loader?jQuery!jquery' 
// 위에서 추가했던 jQuery 밑에 코드를 작성하세요 
// import  'bootstrap' 
// import 'bootstrap/dist/css/bootstrap.min.css'


// import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'
import { BootstrapVue, BootstrapVueIcons } from 'bootstrap-vue'
// Install BootstrapVue
Vue.use(BootstrapVue)
// Optionally install the BootstrapVue icon components plugin
// Vue.use(IconsPlugin)



import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

// Vue.use(BootstrapVue)
Vue.use(BootstrapVueIcons)



//portal-vue
import PortalVue from 'portal-vue'
Vue.use(PortalVue)

//google chart
import VueGoogleCharts from 'vue-google-charts'
Vue.use(VueGoogleCharts)



Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
