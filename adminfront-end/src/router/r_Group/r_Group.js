export default[{
    path:'/group',
    name:'Group',
    component:() => import('@/views/Group/group.vue'),
    children:[
        {
            path:'/search',
            name:'search',
            component:() => import('@/views/Group/search.vue'),
        }
    ]

}]