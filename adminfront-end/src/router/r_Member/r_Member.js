// import {requireAuth} from '../r_index.js'

export default[{
    path:'/member',
    name:'Member',
    component:() => import('@/views/Member/member.vue'),
    // beforeEnter: requireAuth,
    children:[
        {
            path:'/managemember1',
            name:'managemember1',
            component:() => import('@/views/Member/content_01.vue'),
            // beforeEnter: requireAuth,
        },
        {
            path:'/managemember2',
            name:'managemember2',
            component:() => import('@/views/Member/content_02.vue'),
            // beforeEnter: requireAuth,
        },
        {
            path:'/managemember3',
            name:'managemember3',
            component:() => import('@/views/Member/content_03.vue'),
            // beforeEnter: requireAuth,
        },
        {
            path:'/managemember4',
            name:'managemember4',
            component:() => import('@/views/Member/content_04.vue'),
            // beforeEnter: requireAuth,
        },
        
    ]

}]