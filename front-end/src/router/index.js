import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import('../views/Home/Home.vue')
  },
  {
    path: '/aboutus',
    name: 'AboutUs',
    component: () => import('../views/AboutUs/AboutUs.vue')
  },
  {
    path: '/private',
    name: 'Private',
    component: () => import('../views/Private/Private.vue')
  },
  {
    path: '/group',
    name: 'Group',
    component: () => import('../views/Group/Group.vue')
  },
  {
    path: '/group/detail',
    name: 'Group_detail',
    component: () => import('../views/Group/Group_detail.vue')
  },
  {
    path: '/employment',
    name: 'Employment',
    component: () => import('../views/Employment/Employment.vue')
  },
  {
    path: '/notice',
    name: 'Notice',
    component: () => import('../views/Notice/Notice.vue')
  },
  {
    path: '/search',
    name: 'Search',
    component: () => import('../views/Search/Search.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
