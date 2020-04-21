export default {
    namespaced: true,
    state: {
        groupList: [],
        detailSeq: 0,
        groupBoardDetail: [],
        groupReferenceDetail: [],
        grouDetail: [],
        showBoardDetail: false,
        showReferenceDetail: false,
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