
import {onlyAuthUser} from '@/api/api_index.js'

export default[{
    // path:'/',
    // name:'dashboard',
    // component:()=>('@/view/home/dashboard.vue')
    path: '/',
    name: 'dashboard',
    component:()=> import('@/views/home/dashboard.vue'),
    beforeEnter: onlyAuthUser,
    
    children:[
        {
            path:'/',
            name:'dashboardContents',
            component:() => import('@/views/home/dashboardContents.vue'),
            beforeEnter: onlyAuthUser,
            
        }
    
    ]

}]