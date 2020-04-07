export default [{
    path: '/employment',
    name: 'Employment',
    component: () => import('@/views/Employment/Employment.vue'),
    children:[
        {
            path: '',
            name: '',
            component: () => import('@/views/Employment/menu/Recruiting_menu')
        },
        {
            path: 'recruiting',
            name: 'recruiting',
            component: () => import('@/views/Employment/menu/Recruiting_menu')
        },
        {
            path: 'CVpage',
            name: 'CVpage',
            component: () => import('@/views/Employment/menu/CV_menu.vue')
        }
        
    ]
}]