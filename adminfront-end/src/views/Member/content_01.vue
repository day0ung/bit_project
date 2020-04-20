<template>
    <div class="content01_view">
        <h1> manager member 11111111111111111111111</h1>
        

        <h3>그룹게시판</h3>
        <br>
        <br>
       


<!-- 
        <button v-on:click="showTestResult">test ajax start area</button>
        <p v-for="outdata in output_data" :key="outdata.boardSeq"> {{outdata}} </p> -->

        <button v-on:click="showMemberList">member List recive </button>
        <p v-for="memdata in member_data" :key="memdata.memberSeq"> {{memdata}} </p>

        <button v-on:click="adminGetOneMember">one member info print </button>
            <p> {{onemember_data}} </p>
        
        




        
    </div>
</template>

<script scoped>
var output_data;
import 'element-ui/lib/theme-chalk/index.css';

export default {
    data(){
        return {
            output_data:'',
            member_data:'',

            tableData: [],
            currentPage: 1,
            search: '',
            totalItem: 0,
            itemsPerPage: 10,

            onemember_data:[]

        }
    },
    methods:{

        // axios data processing

        // showTestResult(){
        //     axios.get("http://localhost:9000/getTestString")
        //         .then(res => {
        //         console.log(JSON.stringify(res.data))
        //         this.output_data=res.data;
        //     })
        // },
        showMemberList(){
             axios.get("http://localhost:9000/getOneMember")
                .then(res => {
                console.log(JSON.stringify(res.data))
                this.member_data=res.data;
            })

        },
        adminGetOneMember(){
            var loginchk =new URLSearchParams();
            const id=114;
            const pwd=114;
            loginchk.append('memberId', id);
            loginchk.append('pwd', pwd);
            id == null ? alert('아이디를 입력해주세요'):
            pwd == null ? alert('비밀번호를 입력해 주세요'):
            // loginchk.append('memberId', this.id);
            // loginchk.append('pwd', this.pwd);
            // this.id == null ? alert('아이디를 입력해주세요'):
            // this.pwd == null ? alert('비밀번호를 입력해 주세요'):
            axios.post("http://localhost:9000/adminGetOneMember", loginchk)
            .then(res => {
                console.log("성공후 데이터 출력부분 " + res.data.memberSeq)
              if(res.data.memberId == undefined){
                alert("id나 password가 틀렸습니다.");
                this.$store.state.isLogin = true;
                return;
              }
              //session사용시 -> vuex 사용, 혹은 html에서 사용 ->sessionStorage(objec저장)/ localstorage(string저장) -> cookie(String만 됨)
                //세션에 저장						//json으로 넘어옴 세션에 저장할때는 
                sessionStorage.setItem("loginUser", JSON.stringify(res.data)); //String
                console.log(res.data.memberId);
                var loginData = sessionStorage.getItem("loginUser"); //세션가져오기
                //alert('세션가져오기' + loginData)
                var login = JSON.parse(loginData); //JSON
                this.$store.commit('loginSuccess', login )
                console.log('로그인성공')
                this.$router.push ({path:'/'})
                this.$emit('close')
            })

        },


        
        gotoClick(row, column, event){
        this.$router.push({
            path : "/group/detail2/depth2/" + row.boardSeq
        })
        },
        clickableRows :function (row, rowIndex) {
        //alert(row.rowIndex)
        return "clickableRows";
        },
        handleSizeChange(val) {
            this.itemsPerPage = val
            console.log(`${val} items per page`);
        },
        handleCurrentChange(val) {
        this.currentPage = val
        console.log(`current page: ${val}`);
        }
    },
//   mounted(){
//       this.$store.state.currpage = this.$route.path
//       var params = new URLSearchParams();
//       params.append('itemsPerPage', this.itemsPerPage);
//       params.append('currentPage', this.currentPage);
//       axios.post("http://localhost:9000/groupBoardList", params)
//                 .then(res => {
//             this.tableData = res.data
//             this.totalItem = res.data.length
//           })
//   }
}
</script>


<style scoped>
.boardTableFrom{
  width: 80%;
  margin: auto;
}
.boardSearchBar{
  width: 45%;
  float: right;
}
</style>
