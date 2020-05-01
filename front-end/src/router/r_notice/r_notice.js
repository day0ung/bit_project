export default [{
    path: '/notice',
    name: 'Notice',
    component: () => import('@/views/Notice/Notice.vue')
},
{
    path: '/notice/noticeWriting',
    name: 'noticeWriting',
    component: () => import('@/views/Notice/NoticeWriting.vue'),
},
{
    path: '/notice/detail/:ContentId',
    name: 'noticeDetail',
    component: () => import('@/views/Notice/NoticeDetail.vue'),
},
{
    path: '/notice/update/:ContentId',
    name: 'noticeUpdate',
    component: () => import('@/views/Notice/NoticeUpdate.vue'),
},
]