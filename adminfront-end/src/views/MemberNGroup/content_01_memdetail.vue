<template>
  <div class="showMemberDetailFrom">
    <h1 v-loading="loading"> "{{ showAllMember.memberName }}"님의 상세정보 </h1>
    <el-form ref="form" :model="showAllMember" label-width="120px">
      

      <!-- <el-form-item label="memberSeq">
        <ul>
          <li>
            <div> {{showAllMember.memberSeq}} 을 </div>
            <div style="width:100px;">
              <el-input v-model="showAllMember.memberSeq"></el-input>
            </div>
            <div> 으로 변경 </div>
          </li>
        </ul>
      </el-form-item> -->
      
      <el-form-item label="회원번호">
        <div class="width80per"
          v-loading="loading">
          <p>{{ showAllMember.memberSeq }}</p>
        </div>
      </el-form-item>

      <el-form-item label="회원ID">
        <div class="width80per"
          v-loading="loading">
        <p>{{ showAllMember.memberId }}</p>
        </div>
      </el-form-item>

      <el-form-item
        v-loading="loading"
        label="회원명">
        <div class="width80per"
          v-loading="loading">
          <p>{{ showAllMember.memberName }}</p>
        </div>
      </el-form-item>

      <el-form-item 
        v-loading="loading"
        label="회원주소">
        <div class="width80per"
          v-loading="loading">
	        <p>{{ showAllMember.address }}</p>
        </div>
      </el-form-item>


      <el-form-item label="email">
        <div class="width80per"
          v-loading="loading">
	        <p>{{ showAllMember.email }}</p>
        </div>
      </el-form-item>

      <el-form-item label="나이">
        <div class="width80per"
          v-loading="loading">
	        <p>{{ showAllMember.age }}</p>
        </div>
      </el-form-item>

      <el-form-item label="성별">
        <div class="width80per"
          v-loading="loading">
	        <p>{{ showAllMember.gender }}</p>
        </div>
      </el-form-item>

      <el-form-item label="적립금">
        <div class="width80per"
          v-loading="loading">
	        <p>{{ showAllMember.myMoney }}</p>
        </div>
      </el-form-item>

      <el-form-item label="이력서여부">
        <div class="width80per"
          v-loading="loading">
	        <p>{{ showAllMember.cv }}</p>
        </div>
      </el-form-item>

      <el-form-item label="권한">
        <div class="width80per"
          v-loading="loading">
	        <p>{{ showAllMember.auth }}</p>
        </div>
      </el-form-item>

      <el-form-item label="탈퇴여부">
        <div class="width80per"
        v-loading="loading">
	        <p>{{ showAllMember.del }}</p>
        </div>
      </el-form-item>

      <el-form-item label="dislike">
        <div class="width80per"
          v-loading="loading">
	        <p>{{ showAllMember.dislike }}</p>
        </div>
      </el-form-item>


    <el-form-item>
      <!-- <el-button type="primary" @click="onSubmit">Create</el-button> -->
      <el-button @click="gobacksite">돌아가기</el-button>
    </el-form-item>

    </el-form>
  </div>
</template>

<script scoped>
import 'element-ui/lib/theme-chalk/index.css';
import { loading } from 'element-ui';
  export default {
    data() {
      return {

        showAllMember:[],
        form:[],
        loading:true
      }
    },
    created(){
      this.showMemberList();
      
    },
    methods: {
      // axios data processing
      showMemberList(){
        const getThisParam = this.$route.params.memid;
        var params = new URLSearchParams();
        params.append('memberId', getThisParam);
          axios.post("http://localhost:9000/TestAdminChangeDetail", params)
              .then(res => {
                this.loading=true
                console.log("디테일 출력 부분입니다. ")
                console.log(this.$route.params);
                console.log(JSON.stringify(res.data))
                console.log("디테일 출력 끝.  ")
                console.log(res.data)
                this.loading=false
                this.showAllMember=res.data;
                //attatch data source
                // this.form = this.showAllMember;

                // console.log("여기부터 다시시작 ")
                // console.log(this.form);
              
          })
      },


       //submit process 
      onSubmit() {
        console.log('submit!');
        //axios start
      },

      gobacksite(){
        this.$router.push('/managemember1')
        
      }


    }
  }
</script>

<style>
.width80per{
  width:80%;

}

</style>


