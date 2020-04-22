export default [{
    path: '/employment',
    name: 'Employment',
    component: () => import('@/views/Employment/Employment.vue'),
    children:[
        {
            path: '',
            name: '',
            component: () => import('@/views/Employment/depth2/Recruiting_list')
        },
        {
            path: 'recruiting',
            name: 'recruiting',
            component: () => import('@/views/Employment/depth2/Recruiting_list')
        },
        {
            path: 'CVpage',
            name: 'CVpage',
            component: () => import('@/views/Employment/depth2/CVMain.vue')
        },
    ]
},
{
    path: '/RecruitingDetail/:boardId',
    name: 'RecruitingDetail',
    component: () => import('@/views/Employment/depth2/RecruitingDetail')
},
{
    path: '/RecruitingWriting/',
    name: 'RecruitingWriting',
    component: () => import('@/views/Employment/depth2/RecruitingWriting')
},
{
    path: '/recruitUpdate/:boardSeq',
    name: 'recruitUpdate',
    component: () => import('@/views/Employment/depth2/RecruitingUpdating')
},
{
    path: '/CvWriting/',
    name: 'CvWriting',
    component: () => import('@/views/Employment/depth2/CVWriting')
},
{
    path: '/test/',
    name: 'test',
    component: () => import('@/views/Employment/depth2/test')
},
{
    path: '/CVDetail/:cvSeq',
    name: 'CVDetail',
    component: () => import('@/views/Employment/depth2/CVDetail')
},
]