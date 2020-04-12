import store from "@/store/s_index.js"

const group = (to, from , next) => {
    if(store.state.isLogin === true){ //아직 로그인이 안된 유저니까 막음
        //alert("로그인이 안되어있음")
        next('/group/main')
    }else{
        next()
    }
  }

export default [

    {
    path: '/group',
    name: 'Group',
    beforeEnter: group,
    component: () => import('@/views/Group/Group.vue'),
    children:[
        {
            path: '',
            component: () => import('@/views/Group/login_menu/l_main'),
        },
        {
            path: 'board',  /* 게시판 이동 시 그룹 seq가지고 가야 함 */
            component: () => import('@/views/Group/login_menu/board')
        },
        {
            path: 'schedule',
            component: () => import('@/views/Group/login_menu/schedule')
        },
        {
            path: 'detail4',
            component: () => import('@/views/Group/login_menu/detail4')
        },
        {
            name: 'Create',
            path: 'create',
            component: () => import('@/views/Group/detail/group_create')
        },
        {
            name: 'board_detail',
            path: '/group/board/detail/:contentId',
            component: () => import('@/views/Group/detail/board_detail')
        },
        ]
    },
    {
    path: '/group/main',
    name: 'Non_login_group',
    component: () => import('@/views/Group/Non_login_menu/n_main'),
    children: [
        ]
    },
    {
    name: 'groupdetail',
    path: '/group/main/detail/:contentId',
    component: () => import('@/views/Group/detail/group_detail')
    },
]
