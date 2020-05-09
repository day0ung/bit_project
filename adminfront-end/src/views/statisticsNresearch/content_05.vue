<template>
        <div class="chartArea">
          <div class="set_one">
            <div class="barchartArea">
              <!-- <h3> 남여 가입자 비율(lineChart) </h3>
              <HorizontalBar></HorizontalBar> -->
            </div>
            <div class="dounutChartArea">
              <h3> 그룹별 대분류 비율(DonutChart) </h3>
              <DonutChart  @on-receive="updateValue1"></DonutChart>
            </div>
          </div>
          <div class="set_two">
        
              <div class="set_two_1">
                <div class="show_small">
                  <p>대학생/취업</p>
                  <DonutChart1></DonutChart1>
                </div>
                
                <div class="show_small">
                  <p>공무원/임용</p>
                  <DonutChart2></DonutChart2>
                </div>

                <div class="show_small">
                  <p>어학/회화</p>
                  <DonutChart3></DonutChart3>
                </div>

                <div class="show_small">
                  <p>라이프/취미</p>
                  <DonutChart4></DonutChart4>
                </div>


              </div>
        
          </div>
          <div class="content01_view">
              <!-- <h1> {{title}} member333333333333333333</h1> -->
          </div>
        </div>

</template>

<script>
//Importing Bar class from the vue-chartjs wrapper

// import HorizontalBar from './ChartDataArea/content_05_horizontalBarChart'
import DonutChart from './ChartDataArea/content_05_DonutChart'
import DonutChart1 from './ChartDataArea/content_06_DonutChart_value01'
import DonutChart2 from './ChartDataArea/content_06_DonutChart_value02'
import DonutChart3 from './ChartDataArea/content_06_DonutChart_value03'
import DonutChart4 from './ChartDataArea/content_06_DonutChart_value04'

//Exporting this so it can be used in other components
export default {
  components:{
    // HorizontalBar,
    DonutChart,   //대분류
    DonutChart1,  //소분류 대학생/취업
    DonutChart2,  //소분류 공무원 임용
    DonutChart3,  //소분류 어학/회화
    DonutChart4   //소분류 라이프/취미
  },
    data() {
      return {

      }
    },
    created() {
   
    },
    mounted(){

    },
    methods: {

    //   handle (point, event) {
    // 	const item = event[0]
    // 	this.$emit('on-receive', {
    //   	index: item._index,
    //     backgroundColor: item._view.backgroundColor,
    //     value: this.values[item._index]
    //   })
    // },


      updateValue1(data1){
        // DonutChart.updateValue(data1);
        console.log(data1.value);
      }

    },
}
</script>

<style>

 /* .small {
    max-width: 600px;
    margin:  150px auto;
  } */

.set_one{
  display:flex;
}
.dounutChartArea{
  margin:auto;
}

.set_two{
  display: flex;
}

.set_two_1 .show_small{
  float:left;
  margin-top:50px;
}

.show_small p{
      text-align: center;
}


</style>