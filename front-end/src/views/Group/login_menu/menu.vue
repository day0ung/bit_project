<template>
<div class="menu">
    <br>
    <el-tabs tab-position="top" style="height: auto;">
        <el-tab-pane label="그룹 정보"><GroupInfo></GroupInfo></el-tab-pane>
        <el-tab-pane label="그룹 일정"><GroupSchedule></GroupSchedule></el-tab-pane>
        <el-tab-pane label="그룹 게시판">
            <GroupBoard v-show="groupBoard" v-on:showDetail="showDetail" v-on:showWrite="showWrite"/>
            <boardDetail v-show="boardDetail" v-on:showBoard="showBoard"/>
            <boardWrite v-show="boardWrite" v-on:showBoard="showBoard"/>
        </el-tab-pane>
        <el-tab-pane label="그룹 자료실">
            <GroupReference v-show="groupBoard" v-on:showDetail="showDetail"/>
            <boardDetail v-show="boardDetail" v-on:showBoard="showBoard"/>
        </el-tab-pane>
    </el-tabs>
</div>
</template>

<script>
import GroupInfo from '@/views/Group/login_menu/groupInfo.vue'
import GroupBoard from '@/views/Group/login_menu/groupBoard.vue'
import GroupSchedule from '@/views/Group/login_menu/schedule.vue'
import GroupReference from '@/views/Group/login_menu/groupReference.vue'

import boardDetail from '@/views/Group/detail/board_detail.vue'
import boardWrite from '@/views/Group/detail/board_write.vue'


export default {
    components:{ GroupInfo, GroupBoard, GroupSchedule, boardDetail, GroupReference, boardWrite },
    data() {
        return {
            groupBoard: true,
            boardDetail: false,
            boardWrite: false,
            loading: true,
        };
    },
    methods:{
        showDetail() {
            this.boardDetail = true
            this.boardWrite = false
            this.groupBoard = false
        },
        showBoard(){
            this.groupBoard = true
            this.boardDetail = false
            this.boardWrite = false
        },
        showWrite(){
            this.boardWrite = true
            this.groupBoard = false
            this.boardDetail = false
        }
    },
    mounted(){

    }
}
</script>

<style>

</style>