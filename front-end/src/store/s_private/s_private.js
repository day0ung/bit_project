export default {
    namespaced: true,
    state: {
        todoList:[],
        memberCalendar:[], 
        memberCalendarDetail:[],
        memberCalendarStartDate:'',  
        memberCalendarEndDate:'',  
        BoardData:[], //게시판List
        list: true, //자료실 리스트 view
        write: false, //자료실 글쓰기 view
        detail: false, //자료실 글보기 view
        boardDetail: [], //상세보기  게시판
        fileDetail:[] //상세보기 파일
    },
    mutations: {
    },
    actions: {
    }  
}