<template>
  <div>
      <h1>interesting</h1>
      <p>관심지역</p>
      <h4>{{myinfo.interArea}}</h4>
      <br>
      <el-button @click="editArea">수정하기</el-button>
      <table class="table1" v-if="addr">
        <tbody>
          <tr>
                <el-button type="info" plain style="width: 100px; padding: 11px;" @click="execDaumPostcode">우편번호 찾기</el-button>
          </tr>
          <tr>
            <td>
              <el-input  placeholder="주소" readonly="readonly" v-model="address"></el-input>
            </td>
            <td>
              <el-input  placeholder="상세주소" style="width: 300px" v-model="extraAddress"></el-input>
            </td>
            <td style="width: 14px"></td>
            <td><i class="el-icon-s-tools" style="color: #d77f4a"></i> </td>
              <td>
              <el-button type="text" @click="updateAdd" style="color: #d77f4a; font-size: 16px">수정하기</el-button>
            </td>
          </tr>                   
        </tbody>
      </table>

       
      <p>관심분야</p>
      <h3 v-for="big in myBig" :key="big.seq">
        {{big.bigName}}
      </h3>
      <br>
     <p>상세분야</p>
      <h3 v-for="small in mySmall" :key="small.seq">
        {{small.smallName}}
      </h3>
        


  </div>
</template>

<script>
export default {
  data(){
    const intBig = [
              {name:'대학생/취업', bigSeq: '1'},
              {name:'공무원/임용', bigSeq: '2'},
              {name:'어학/회화', bigSeq: '3'},
              {name:'라이프/취미', bigSeq: '4'}
                ]
      return{
          addr: false,
          address: '',
          extraAddress: '',
          postcode: '',
          myinfo: [],
          myBig: [],
          mySmall: [],
          bgSeq: [],
          intBigcheck: intBig,
          smSeq:[],
     
      }
    },
     mounted(){
		 var params = new URLSearchParams();
		 params.append('memberSeq', this.$route.params.seq)
        axios.post('http://localhost:9000/myPageMember', params)
        .then(res => {
            var smyinfo = res.data
            this.myinfo = smyinfo
            
            var bg = smyinfo.interBigDto
            var sm = smyinfo.interSmallDto
        
            var big;
            big = JSON.stringify(bg)
            big = JSON.parse(big)
            this.myBig = big

            var small;
            small = JSON.stringify(sm)
            small = JSON.parse(small)
            this.mySmall = small
            console.log(this.myBig)
            
            for (const key in small) {
                const element = small[key];
                this.smSeq = element.interSmallSeq
            } //smallSeq 할당

            for (const key in big) {
                const element = big[key];
                this.bgSeq = element.interBigSeq
            } //bigSeq 할당
        }) 
    },   

     methods: {
      editArea(){
        this.addr = true;
         params.append('memberSeq', this.$route.params.seq)
         if(this.address =='' || this.extraAddress ==''){
           alert('주소를 입력해주세요')
         }else{
         var params = new URLSearchParams();
         params.append('memberSeq', this.$route.params.seq)
         var realAddr = this.address + this.extraAddress
         axios.post('http://localhost:9000/updateArea', params)
            .then(res => {
            
            })
         }
      },
      handleCheckAllChange(val) {
        this.checkedCities = val ? cityOptions : [];
        this.isIndeterminate = false;
      },
      handleCheckedCitiesChange(value) {
        let checkedCount = value.length;
        this.checkAll = checkedCount === this.cities.length;
        this.isIndeterminate = checkedCount > 0 && checkedCount < this.cities.length;
        //alert(value) seq 가져옴
      },
       execDaumPostcode() {
            new daum.Postcode({
            onComplete: (data) => {
            if (data.userSelectedType === 'R') {
              this.address = data.roadAddress;
            } else {
              this.address = data.jibunAddress;
            }
            if (data.userSelectedType === 'R') {
              if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
              this.extraAddress += data.bname;
              }
              if (data.buildingName !== '' && data.apartment === 'Y') {
              this.extraAddress +=
                this.extraAddress !== ''
                ? `, ${data.buildingName}`
                : data.buildingName;
              }
              if (this.extraAddress !== '') {
              this.extraAddress = ` (${this.extraAddress})`;
              }
            } else {
              this.extraAddress = '';
            }
            },
          }).open(); 
        }
  }
}
</script>

<style>

</style>