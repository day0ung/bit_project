<script>
//Importing Bar class from the vue-chartjs wrapper
import {Bar} from 'vue-chartjs'
//Exporting this so it can be used in other components
export default {
  extends: Bar,
  data() {
    return {
      datacollection: {
        //Data to be represented on x-axis
        labels: ['Man', 'woman'],
        datasets: [
          {
            label: 'Data One',
            backgroundColor: '#4CAF50',
            pointBackgroundColor: 'white',
            borderWidth: 1,
            pointBorderColor: '#249EBF',
            //Data to be represented on y-axis
            data: [0,0 ]
          }
        ]
      },
      //Chart.js options that controls the appearance of the chart
      options: {
        scales: {
          yAxes: [{
            ticks: {
              beginAtZero: true
            },
            gridLines: {
              display: true
            }
          }],
          xAxes: [ {
            gridLines: {
              display: false
            }
          }]
        },
        legend: {
            display: true
          },
        responsive: true,
        maintainAspectRatio: false
      },

      // setting receive data area
      getRawData:'',

    }
  },
  mounted() {
    //renderChart function renders the chart with the datacollection and options object.
    this.renderChart(this.datacollection, this.options);
    this.getGenderDataMethod();
    
    
  },



  methods : {
    getGenderDataMethod () {  //axios process
        //getMemberGenderInfo
      axios.post("http://localhost:9000/getMemberGenderInfo")
      .then(res=>{
        this.loading=true;
        this.getRawData=res.data;
        console.log("getRawData");
        console.log(this.getRawData);
        console.log("only gender : ");
        console.log(this.getRawData[0]);

        // for(var i=0; i<this.getRawData.length; i++){
        //   console.log("genderdata = "+ i + "["+this.getRawData[i].gender+"]")
        //   // console.log(this.getRawData[i].gender);
        // }

        this.pickGender();

        this.loading=false;
      }).catch(error=>{
        // this.loading=true;
        
        console.log("????????????! ???????????? : "+error)

        // this.loading=false;
      })
    },
      pickGender(){
        this.getRawData;

        var testList = new Array();
        var mancheck = 0;
        var womancheck=0;


        for(var i=0; i<this.getRawData.length; i++){
          // console.log("genderdata = "+ i + "["+this.getRawData[i].gender+"]")
          // testList.push(this.getRawData[i].gender);
          if(this.getRawData[i].gender == 1){
              mancheck++;
          }else{
            womancheck++;
          }
        }
        testList.push(JSON.stringify(mancheck));
        testList.push(JSON.stringify(womancheck));
        this.datacollection.datasets[0].data= testList
        console.log("=========================checkdata=====================")
        console.log(testList)
        console.log(this.datacollection.datasets[0].data)
        this.$data._chart.update()
        console.log("=========================checkdata=====================")
      }

  },
    watch: {
    data: function() {
      this._chart.destroy();
      //this.renderChart(this.data, this.options);
      this.getGenderDataMethod()
      
    }
  },
  
}

</script>