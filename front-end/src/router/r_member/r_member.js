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
    }

]