export default {
    namespaced: true,
    state: {
        groupSeq: 0,
        groupList: [],
        detailSeq: 0,
        groupBoardList: [],
        groupBoardDetail: [],
        groupReferenceDetail: [],
        grouDetail: [],
        showBoardList: false,
        showBoardDetail: false,
        showReferenceDetail: false,
        total: 0,
        listQuery:{
          page: 1,
          limit: 5,
        },
        searchWord:'',
        s_keyWord:'',
    },
    getters: {
        getDetailSeq(){
            this.detailSeq
        }
    },
    mutations: {
    },
    actions: {
    }
}