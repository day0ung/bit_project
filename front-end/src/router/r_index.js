import Vue from 'vue'
import VueRouter from 'vue-router'

import r_home from '@/router/r_home/r_home.js'
import r_aboutus from '@/router/r_about/r_aboutus.js'
import r_private from '@/router/r_private/r_private.js'
import r_group from '@/router/r_group/r_group.js'
import r_notice from '@/router/r_notice/r_notice.js'
import r_employment from '@/router/r_employment/r_employment.js'
import r_search from '@/router/r_search/r_search.js'


Vue.use(VueRouter)

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    ...r_home,
    ...r_aboutus,
    ...r_private,
    ...r_group,
    ...r_notice,
    ...r_employment,
    ...r_search
  ],
  scrollBehavior (to, from, savedPosition) {
    return { x: 0, y: 0 }
  }
})

export default router
