
export default[{
    // path:'/',
    // name:'dashboard',
    // component:()=>('@/view/home/dashboard.vue')
    path: '/',
    name: 'dashboard',
    component:()=> import('@/views/home/dashboard.vue')
    ,
    children:[
        {
            path:'',
            name:'dashboardContents',
            component:() => import('@/views/home/dashboardContents.vue')
        }
    ]

}]