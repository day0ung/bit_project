import Vue from 'vue'
import VueRouter from 'vue-router'

import r_Board from '@/router/r_Board/r_Board.js'
import r_Accept from '@/router/r_Accept/r_Accept.js'
import r_Group from '@/router/r_Group/r_Group.js'
import r_Member from '@/router/r_Member/r_Member.js'
import r_recyclebin from '@/router/r_recyclebin/r_recyclebin.js'
import r_statisticsNresearch from '@/router/r_statisticsNresearch/r_statisticsNresearch.js'
import r_DashBoard from '@/router/r_DashBoard/r_DashBoard.js'
import r_Login from '@/router/r_Login/r_Login.js'
import r_Home from './r_Home/r_Home'


Vue.use(VueRouter)

const requireAuth = (to, from, next) =>{
  //isAuth를 조회시, 토큰값이 있다면 값이 나올것이고, 없다면 undefine이 나올것이다.
const isAuth = localStorage.getItem('token')
// const loginPath = `/login?rPath=${encodeURIComponent(to.path)}`
const loginPath = `/login?rPath=${encodeURIComponent(to.path)}`
//로그인을 하러 갔다가 로그인이 완료되면 현재 페이지로 돌아와라 (quary string 으로 리턴페스 정보를 작성해준다.)
//쿼리문자열이기 때문에 encodeURIComponent 아스키 문자로 인코딩해줘야한다.
isAuth ? next() : next(loginPath)
//어스값이 있으면(토큰값) next함수로 라우트 로직을 계속 수행하고, 아니면 loginpath로 이동하는것이다.
}



const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes:[
    ...r_Accept,
    ...r_Board,
    ...r_Group,
    ...r_Member,
    ...r_recyclebin,
    ...r_statisticsNresearch,
    ...r_DashBoard,
    ...r_Login,
    ...r_Home,
    { path: '*', component:() => import('@/components/NotFoundComponent.vue'),beforeEnter: requireAuth }


  ]
})

export default router
