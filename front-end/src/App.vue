<template>
  <div id="app">
    <div id="wrap">
      <div id="header">
        <div id="header-top">
          <div class="container">
            <!-- header-top -->
            <HeaderTop></HeaderTop>
          </div>
        </div>
        <div id="header-nav">
          <div class="container">
            <!-- header-nav -->
            <HeaderNav></HeaderNav>
          </div>
        </div>
      </div>
      <div id="contents">
        <div class="container">
          <!-- contents -->
          <Contents></Contents>
        </div>
      </div>
      <div id="footer">
        <div id="footer-nav">
          <div class="container">
            <!-- footer-nav -->
            <FooterNav></FooterNav>
          </div>
        </div>
        <div id="footer-info">
          <div class="container">
            <!-- footer-info -->
            <FooterInfo></FooterInfo>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style>

</style>

<script>
// @ is an alias to /src
import HeaderTop from '@/components/Header-top.vue'
import HeaderNav from '@/components/Header-nav.vue'
import FooterNav from '@/components/Footer-nav.vue'
import FooterInfo from '@/components/Footer-info.vue'
import Contents from '@/components/Contents.vue'
import globalCSS from '@/assets/global.css'

export default {
  name: 'Home',
  components: {
    HeaderTop,
    HeaderNav,
    FooterNav,
    FooterInfo,
    Contents
  }
}
</script>