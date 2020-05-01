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
        labels: ['January', 'February'],
        datasets: [
          {
            label: 'Data One',
            backgroundColor: '#4CAF50',
            pointBackgroundColor: 'white',
            borderWidth: 1,
            pointBorderColor: '#249EBF',
            //Data to be represented on y-axis
            data: [11, 8]
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
      }
    }
  },
  mounted() {
    //renderChart function renders the chart with the datacollection and options object.
    this.renderChart(this.datacollection, this.options)
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
        
        console.log("오류발생! 오류내용 : "+error)

        // this.loading=false;
      })
    },
      pickGender(){
        this.getRawData;
        this.setGenderData;

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
        testList.push(mancheck);
        testList.push(womancheck);
        console.log(testList)
        this.datacollection.datasets[0].data=testList

        console.log("durlaslkjasdfl;asdfasfdasfdasfdasdfasfdsafdasdfasfdjasdfjlljkafsljk;afljk;")
        console.log(this.datacollection.datasets[0].data);
        // console.log("mmmmmmmmmmmman check = " + mancheck);
        // console.log("wwwwwwwwwwwomen check = " + womancheck);
        // this.datacollection.datasets[0].data.push(mancheck);
        // this.datacollection.datasets[0].data.push(womancheck);
        // this.datacollection.datasets[0].data.push(40)

        // console.log(this.datacollection.datasets[0].data);


        

        // var testListToJsonData = JSON.stringify(testList);
        // console.log("testList : ");
        // console.log(testList);
        // console.log("json.stringify : ");
        // console.log(testListToJsonData);
      }

  }
}

</script>