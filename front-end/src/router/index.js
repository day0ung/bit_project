import Vue from 'vue'
import VueRouter from 'vue-router'

import home from '@/router/Home/home.js'
import aboutus from '@/router/AboutUs/aboutus.js'
import privatestudy from '@/router/PrivateStudy/privatestudy.js'
import groupstudy from '@/router/GroupStudy/groupstudy.js'
import notice from '@/router/Notice/notice.js'
import employment from '@/router/Employment/employment.js'
import search from '@/router/Search/search.js'


Vue.use(VueRouter)

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    ...home,
    ...aboutus,
    ...privatestudy,
    ...groupstudy,
    ...notice,
    ...employment,
    ...search
  ]
})

export default router
