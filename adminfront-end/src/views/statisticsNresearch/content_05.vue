<template>
        <div class="small">

          <div v-loading="loading">

            <div class="Chart">
              <h1 style="text-align:center;">DoughnutchartExample</h1>
              <doughnut/>
            </div>

          </div>


            <button @click="fillData()">Randomize</button>
            <div class="content01_view">
                <h1> {{title}} member333333333333333333</h1>
            </div>
        </div>
</template>

<script>






export default {
    components:{
       Doughnut

    },
      



  data () {
    return {
      loading:false,
      datacollection: null,
      title:'statisticsNresearch1',
      getRawData:'',
      setGenderData:[],
      SetMan:[],
      setWoman:[],
      

    }
  },
    methods() {

    },
    mounted () {
    this.renderChart({
      labels: ['VueJs', 'EmberJs', 'ReactJs', 'AngularJs'],
      datasets: [
        {
          backgroundColor: [
            '#41B883',
            '#E46651',
            '#00D8FF',
            '#DD1B16'
          ],
          data: [40, 20, 80, 10]
        }
      ]
    }, {responsive: true, maintainAspectRatio: false})
  }

}
</script>

<style>

</style>