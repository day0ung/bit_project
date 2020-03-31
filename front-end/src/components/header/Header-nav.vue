<template>
<!-- <router-link to="/home">HOME</router-link> |
<router-link to="/aboutus">About Us</router-link> |
<router-link to="/private">개인스터디</router-link> |
<router-link to="/group">그룹스터디</router-link> |
<router-link to="/employment">취업</router-link> |
<router-link to="/notice">게시판</router-link> |
<router-link to="/search">검색</router-link> -->
    <div class="header-btm">
			<div class="inner">
				<ul class="gnb clfix">
                    <li class="navi_btn"><a href="#none">
                        <div class="hamburger">
                        <span class="line"></span>
                        <span class="line"></span>
                        <span class="line"></span>
                        </div>
                        전체메뉴
                    </a></li>
                    <li><a href="#">ABOUT US</a></li>
                    <li><a href="#">개인스터디</a></li>
                    <li><a href="#">그룹스터디</a></li>
                    <li><a href="#">취업</a></li>
                    <li><a href="#">게시판</a></li>					
                </ul>	

                <div class="all_menu">
                    <div class="inner">
                        <ul>
                            <li>
                                <strong>ABOUT US</strong>
                                <a href="<%=request.getContextPath()%>/aboutusentrance">모두의 전시</a>
                            </li>
                            <li>
                                <strong>EXHIBIT</strong>
                                <a href="/AgencyBgencyy/exhibitlist?choice=now">현재전시</a>
                                <a href="/AgencyBgencyy/exhibitlist?choice=fut">예정전시</a>
                                <a href="/AgencyBgencyy/exhibitlist?choice=past">지난전시</a>
                            </li>
                            <li>
                                <strong>SCHEDULE</strong>
                                <a href="/AgencyBgencyy/exhibitschedule">월별 전시</a>
                            </li>
                            <li>
                                <strong>COMMUNITY</strong>
                                <a href="/AgencyBgencyy/community/notice.jsp">공지사항</a>
                                <a href="/AgencyBgencyy/community/faq.jsp">자주묻는질문</a>
                                <a href="/AgencyBgencyy/showReviewList?pageNum=0">리뷰</a>
                            </li>
                        </ul>
                    </div>
                </div>
				<div class="searchWrap">
					<form name="serach" method="get" action="<%=request.getContextPath() %>/mainSearch">
						<input type="text" maxlength="20" name="mainSearchWord" placeholder="검색어를 입력해주세요">
						<button type="submit"></button>
					</form>
				</div>
			</div><!-- //inner -->
		</div><!-- //header-btm -->
</template>

<script>
export default {
    name: "HeaderNav"
}
</script>

<style>

</style>