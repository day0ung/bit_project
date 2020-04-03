<template>
  <div class="detail1 clfix">
      <br>
      <h5>detail1</h5>
      <br>
      <table>
        <tr v-for="member in memberlist" :key="member.id">
          <!-- <td>{{ member.id }}</td>
          <td>{{ member.name }}</td> -->
          <td>
            <figure class="snip1573">
              <h2>title</h2>
              <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/sample89.jpg" alt="sample89" />
              <figcaption>
                <h3>Join Now</h3>
              </figcaption>
              <router-link to="/group/detail1/depth1" v-model="member.id"></router-link>
            </figure>
          </td>
        </tr>
      </table>



  </div>
</template>

<script>
export default {
  data(){
    return{
      memberlist: this.$store.state.s_subStore.data
    }
  },
  mounted(){
      this.$store.state.currpage = this.$route.path
  }
}
</script>

<style scope>
.snip1573 {
  background-color: #7ab1d1;
  display: inline-block;
  font-family: 'Open Sans', sans-serif;
  font-size: 16px;
  margin: 10px;
  max-width: 315px;
  min-width: 230px;
  overflow: hidden;
  position: relative;
  text-align: center;
  width: 100%;
  border-radius: 1em;
}

.snip1573 * {
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  -webkit-transition: all 0.35s ease;
  transition: all 0.35s ease;
}

.snip1573:before,
.snip1573:after {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  -webkit-transition: all 0.35s ease;
  transition: all 0.35s ease;
  background-color: #000000;
  border-left: 3px solid #fff;
  border-right: 3px solid #fff;
  content: '';
  opacity: 0.44;
  z-index: 1;
}

.snip1573:before {
  -webkit-transform: skew(45deg) translateX(-155%);
  transform: skew(45deg) translateX(-155%);
}

.snip1573:after {
  -webkit-transform: skew(45deg) translateX(155%);
  transform: skew(45deg) translateX(155%);
}

.snip1573 img {
  backface-visibility: hidden;
  max-width: 100%;
  vertical-align: top;
}

.snip1573 figcaption {
  top: 50%;
  left: 50%;
  position: absolute;
  z-index: 2;
  -webkit-transform: translate(-50%, -50%) scale(0.5);
  transform: translate(-50%, -50%) scale(0.5);
  opacity: 0;
  -webkit-box-shadow: 0 0 10px #000000;
  box-shadow: 0 0 10px #000000;
}

.snip1573 h3 {
  background-color: #7ab1d1;
  border: 2px solid #fff;
  color: #fff;
  font-size: 1em;
  font-weight: 600;
  letter-spacing: 1px;
  margin: 0;
  padding: 5px 10px;
  text-transform: uppercase;
}

.snip1573 a {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  z-index: 3;
}

.snip1573:hover > img,
.snip1573.hover > img {
  opacity: 1;
}

.snip1573:hover:before,
.snip1573.hover:before {
  -webkit-transform: skew(45deg) translateX(-55%);
  transform: skew(45deg) translateX(-55%);
}

.snip1573:hover:after,
.snip1573.hover:after {
  -webkit-transform: skew(45deg) translateX(55%);
  transform: skew(45deg) translateX(55%);
}

.snip1573:hover figcaption,
.snip1573.hover figcaption {
  -webkit-transform: translate(-50%, -50%) scale(1);
  transform: translate(-50%, -50%) scale(1);
  opacity: 1;
}

</style>