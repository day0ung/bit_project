
 import {requireAuth} from '../r_index.js'
const requireAuth1 = require('../r_index.js')

export default[{
    // path:'/',
    // name:'dashboard',
    // component:()=>('@/view/home/dashboard.vue')
    path: '/',
    name: 'dashboard',
    component:()=> import('@/views/home/dashboard.vue'),
    beforeEnter: requireAuth,
    
    children:[
        {
            path:'',
            name:'dashboardContents',
            component:() => import('@/views/home/dashboardContents.vue'),
            beforeEnter: requireAuth1.requireAuth
            
        }
    ]

}]