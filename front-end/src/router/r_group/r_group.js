export default [
    {
        path: '/group',
        name: 'Group',
        component: () => import('@/views/Group/Group.vue'),
        children:[
            {
                path: '/group/detail1',
                component: () => import('@/views/Group/menu/detail1')
            },
            {
                path: 'detail2',
                component: () => import('@/views/Group/menu/detail2')
            },
            {
                path: 'detail3',
                component: () => import('@/views/Group/menu/detail3')
            },
            {
                path: 'detail4',
                component: () => import('@/views/Group/menu/detail4')
            }
        ]
    }
]