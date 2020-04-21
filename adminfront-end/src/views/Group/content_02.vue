<template>
    <div class="content02_view">
        <h1> {{title}} group 22222222222222222221122222222222222222222222221</h1>
        
            <el-select v-model="selectedvalue" placeholder="Select" value-key="selectedvalue">
                <el-option
                v-for="item in options"
                :key="item.value"
                :label="item.label"
                :value="item.value">
                </el-option>
            </el-select>
    




        <el-table 
        :data="adminAllStudyGroupList"
        stripe
        style="width:100%"
        >
        <!-- @row-click="eventReceiver" -->
        <!-- @cell-click="inputcellclick()" -->

            <el-table-column
            prop="currMember"
            label="currMember"
            width="100">
            </el-table-column>

            <el-table-column
            prop="del"
            label="del"
            width="100">
            </el-table-column>

            <el-table-column
            prop="startDate"
            label="startDate"
            width="100">
            </el-table-column>

            <el-table-column
            prop="endDate"
            label="endDate"
            width="100">
            </el-table-column>

            <el-table-column
            prop="groupInfoSeq"
            label="groupInfoSeq"
            width="100">
            </el-table-column>

            <el-table-column
            prop="groupLocation"
            label="groupLocation"
            width="100">
            </el-table-column>

            <el-table-column
            prop="groupMemberDto"
            label="groupMemberDto"
            width="100">
            </el-table-column>

            <el-table-column
            prop="groupName"
            label="groupName"
            width="100">
            </el-table-column>
            
            <el-table-column
            prop="groupSchedule"
            label="groupSchedule"
            width="100">
            </el-table-column>

            <el-table-column
            prop="image"
            label="image"
            width="100">
                <div slot-scope="{row}" class="img-container">
                    <img :src="row.image" alt="Agenda"
                    style="width:100px; height:100px;"
                    >
                </div>
            </el-table-column>

            <el-table-column
            prop="info"
            label="info"
            width="100">
            </el-table-column>

            <el-table-column
            prop="interBigDto"
            label="interBigDto"
            width="100">
            </el-table-column>

            <el-table-column
            prop="interBigSeq"
            label="interBigSeq"
            width="100">
            </el-table-column>

            <el-table-column
            prop="interSmallDto"
            label="interSmallDto"
            width="100">
            </el-table-column>

            <el-table-column
            prop="interSmallSeq"
            label="interSmallSeq"
            width="100">
            </el-table-column>

            <el-table-column
            prop="maxMember"
            label="maxMember"
            width="100">
            </el-table-column>

            <el-table-column
            prop="memberDto"
            label="memberDto"
            width="100">
            </el-table-column>

            <el-table-column
            prop="memberSeq"
            label="memberSeq"
            width="100">
            </el-table-column>

            <el-table-column
            prop="permission"
            label="permission"
            width="100">
            </el-table-column>

            <el-table-column
            prop="smallInfo"
            label="smallInfo"
            width="100">
            </el-table-column>

            <el-table-column
              prop=""
              label="button"
              width="100" >
                <template slot-scope="scope">
                    <el-button
                        size="mini"
                        @click="handleEdit(scope.$index, scope.row)">Edit</el-button>
                    <el-button
                        size="mini"
                        type="danger"
                        @click="handleDelete(scope.$index, scope.row)">Delete</el-button>
                </template>






            </el-table-column>



      </el-table>



         <button v-on:click="changePermission"> 1/1 권한 설정 </button>
    </div>
</template>

<script>
import 'element-ui/lib/theme-chalk/display.css';
import 'element-ui/lib/theme-chalk/index.css';


const path = "http://localhost:9000";

export default {
    data(){
        return {
            title:'group2',
            adminAllStudyGroupList:[],


            selectedvalue:'전체보기',
            options: [{
            value: '전체보기',
            label: '전체보기'
            }, {
            value: '승인완료',
            label: '승인완료'
            }, {
            value: '비승인',
            label: '비승인'
            }],
            value: '전체보기',
            label:'전체보기'



        }
    },
    watch:{
        selectedvalue(input){
            //this.$emit('onchange', input)
            console.log("들어온값 바뀐값 : " + input)
            console.log(" 저장된값 : " + this.selectedvalue)
        }

    },
    created(){
        axios.post("http://localhost:9000/AdmingetAllStudyGroup")
        .then(res => {
            console.log("admin all group print ")
            this.adminAllStudyGroupList = res.data
            console.log(this.adminAllStudyGroupList)
            
            console.log("base selected value : " + this.selectedvalue)

        })



    },
    methods:{
        changePermission(){
            const confirmflag = confirm("그룹개설신청 허가하시겠습니까");
            if(confirmflag){

            var params = new URLSearchParams();	// post 방식으로 받아야함.
            // params.append('groupInfoSeq', this.listQuery.page);
            // params.append('memberSeq', this.listQuery.limit);

            //TestCode <<< START >>>
            params.append('groupInfoSeq', 1);
            params.append('memberSeq', 1);
            //TestCode <<< END >>>

            axios.post(path+"/AdminAcceptCreateGroup",params)
            .then(res=>{
                console.log(res.data)
                //$router.path.push('/managemember2')
            })

            }else{
            alert("그룹개설신청 거부");
            }
        },
        eventReceiver(row, column, event){
        console.log(row);
        console.log(column);
        console.log(event);

        const row1 = JSON.stringify(row);
        console.log(row1)
        

        // this.$router.push({
        //   path : "/group/board/detail/" + row.boardSeq
        // })
        },
        inputcellclick(row, column, cell, event){
        console.log(row);
        console.log(column);
        console.log(event);
        console.log(event);
        },
         handleEdit(index, row) {
        console.log(index) 
        console.log(row.memberDto.address);
      },
      handleDelete(index, row) {
        console.log(index, row);
      }


    }

}
</script>

<style>

</style>