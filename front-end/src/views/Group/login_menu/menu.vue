<template>
<div class="menu">
    <br>
    <el-tabs tab-position="top" style="height: auto;">
        <el-tab-pane label="그룹 정보"><GroupInfo></GroupInfo></el-tab-pane>
        <el-tab-pane label="그룹 일정"><GroupSchedule></GroupSchedule></el-tab-pane>
        <el-tab-pane label="그룹 게시판">
            <boardDetail v-show="boardDetail" v-on:showBoard="showBoard"/>
            <GroupBoard v-show="groupBoard" v-on:showDetail="showDetail"/>
        </el-tab-pane>
        <el-tab-pane label="그룹 자료실"><detail4></detail4></el-tab-pane>
    </el-tabs>
</div>
</template>

<script>
import GroupInfo from '@/views/Group/login_menu/groupInfo.vue'
import GroupBoard from '@/views/Group/login_menu/groupBoard.vue'
import GroupSchedule from '@/views/Group/login_menu/schedule.vue'

import boardDetail from '@/views/Group/detail/board_detail.vue'

import detail4 from '@/views/Group/login_menu/detail4.vue'

export default {
    components:{ GroupInfo, GroupBoard, GroupSchedule, boardDetail, detail4 },
    data() {
        return {
            groupBoard: true,
            boardDetail: false,
        };
    },
    methods:{
        showDetail() {
            this.groupBoard = false
            this.boardDetail = true
        },
        showBoard(){
            this.groupBoard = true
            this.boardDetail = false
        }
    }

}
</script>

<style>

</style>