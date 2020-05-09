<template>
        <div class="chartArea">
          <div>
            <h3> 그룹별 소분류 비율(DonutChart) </h3>
          </div>
          <div class="set_one">
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
// import DonutChart from './ChartDataArea/content_06_DonutChart'
import DonutChart1 from './ChartDataArea/content_06_DonutChart_value01'
import DonutChart2 from './ChartDataArea/content_06_DonutChart_value02'
import DonutChart3 from './ChartDataArea/content_06_DonutChart_value03'
import DonutChart4 from './ChartDataArea/content_06_DonutChart_value04'

//Exporting this so it can be used in other components
export default {
  components:{
    // HorizontalBar,
    // DonutChart,
    DonutChart1,
    DonutChart2,
    DonutChart3,
    DonutChart4
  },
    data() {
      return {
        receive_data:[]

      }
    },
    created() {
    
   
    },
    mounted(){
      // this.getGenderDataMethod();
    },

  methods : {
    
  }
}
</script>

<style>

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