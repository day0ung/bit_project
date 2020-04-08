export default [
    {
        path: '/login',
        name: 'login',
        component: () => import('@/views/Member/Login.vue')
    },
    {
        path:'/join',
        name: 'join',
        component: () => import('@/views/Member/Join.vue')
    },
    {
        path:'/memberJoin',
        name: 'memberJoin',
        component: () => import('@/views/Member/Member_Join.vue')
    },
    {
        path:'/companyJoin',
        name:'companyJoin',
        component: () => import('@/views/Member/Company_Join.vue')
    }

]