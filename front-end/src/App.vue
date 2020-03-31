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
html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p,
	blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn,
	em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var,
	b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend,
	table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas,
	details, embed, figure, figcaption, footer, header, hgroup, menu, nav,
	output, ruby, section, summary, time, mark, audio, video {
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
	font: inherit;
	vertical-align: baseline;
} /* HTML5 display-role reset for older browsers */
article, aside, details, figcaption, figure, footer, header, hgroup,
	menu, nav, section {
	display: block;
}

body {
	line-height: 1;
}

ol, ul {
	list-style: none;
}

blockquote, q {
	quotes: none;
}

blockquote:before, blockquote:after, q:before, q:after {
	content: '';
	content: none;
}

table {
	border-collapse: collapse;
	border-spacing: 0;
}

#wrap {
	width: 100%
}

#header {
	width: 100%;
	height: 140px;
	background: #111;
}

#banner {
	width: 100%;
	height: 450px;
	line-height: 450px;
	background: #4dd0e1;
}

#contents {
	width: 100%;
	height: 950px;
	background: #26c6da;
}

#footer {
	width: 100%;
	height: 220px;
	background: #444;
}

#header-top {
	width: 100%;
	height: 70px;
	background: #b2ebf2;
}

#header-nav {
	width: 100%;
	height: 70px;
	background: #80deea;
}

#footer-nav {
	width: 100%;
	height: 60px;
	background: #0097a7;
}

#footer-info {
	width: 100%;
	height: 160px;
	line-height: 160px;
	background: #00838f;
}

.container {
	width: 1000px;
	margin: 0 auto;
	height: inherit;
	background: rgba(0, 0, 0, 0.3);
}
</style>

<script>
// @ is an alias to /src
import HeaderTop from '@/components/Header-top.vue'
import HeaderNav from '@/components/Header-nav.vue'
import FooterNav from '@/components/Footer-nav.vue'
import FooterInfo from '@/components/Footer-info.vue'
import Contents from '@/components/Contents.vue'

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