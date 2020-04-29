export default [{
    path: '/notice',
    name: 'Notice',
    component: () => import('@/views/Notice/NoticeComponent.vue')
},
{
    path: '/notice/noticeWriting',
    name: 'noticeWriting',
    component: () => import('@/views/Notice/NoticeWriting.vue'),
},
]