import Vue from 'vue'
import App from './App.vue'
import router from '@/router/r_index.js'
import store from '@/store/s_index.js'


import 'expose-loader?$!expose-loader?jQuery!jquery' 
// import  'bootstrap' 
// import 'bootstrap/dist/css/bootstrap.min.css'


// import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'
import { BootstrapVue, BootstrapVueIcons } from 'bootstrap-vue'
// Install BootstrapVue
Vue.use(BootstrapVue)
// Optionally install the BootstrapVue icon components plugin
// Vue.use(IconsPlugin)

//https://element.eleme.io/#/en-US //element 등록

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
