<template>
        <div class="chartArea">
          <div class="set_one">
            <div class="barchartArea">
              <h3> line graph </h3>
              <bar-chart></bar-chart>
            </div>


            <div class="dounutChartArea">
              <h3> doughnut graph </h3>
              <DonutChart width="500"></DonutChart>
            </div>
          </div>
            <div class="content01_view">
                <!-- <h1> {{title}} member333333333333333333</h1> -->
            </div>
        </div>

</template>

<script>
//Importing Bar class from the vue-chartjs wrapper
// import {Bar} from 'vue-chartjs'
import BarChart from './ChartDataArea/content_08_BarChart'
import DonutChart from './ChartDataArea/content_08_DonutChart'
//Exporting this so it can be used in other components
export default {
  components:{
    BarChart,
    DonutChart
  },
    data() {
      return {
        datacollection: null // instantiating datacollection with null
      }
    },
    created() {
      this.fillData() //anytime the vue instance is created, call the fillData() function.
    },
    methods: {
      fillData() {
        this.datacollection = {
          // Data for the y-axis of the chart
          labels: ['January', 'February'],
          datasets: [
            {
              label: 'Data One',
              backgroundColor: '#f87979',
              // Data for the x-axis of the chart
              data: [this.getRandomInt(), this.getRandomInt()]
            }
          ]
        }
      },
      getRandomInt() {
        // JS function to generate numbers to be used for the chart
        return Math.floor(Math.random() * (50 - 5 + 1)) + 5
      }
    },
    watch: {
    data: function() {
      this._chart.destroy();
      //this.renderChart(this.data, this.options);
      this.getGenderDataMethod()
      this.renderChart()
      }
    },
  
}
</script>

<style>

 /* .small {
    max-width: 600px;
    margin:  150px auto;
  } */

  .dounutChartArea{
  max-block-size: 300px;
  
}

</style>