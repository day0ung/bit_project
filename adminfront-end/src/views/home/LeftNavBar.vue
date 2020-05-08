<template>
    <div class="LeftNavBar">
        <!-- <el-radio-group v-model="isCollapse" style="margin: 20px 0px 0px 9px;" >
        <el-radio-button :label="true">collapse</el-radio-button>
        <el-radio-button :label="false">expand</el-radio-button>
        </el-radio-group>
         -->
        <el-menu default-active="2" class="el-menu-vertical-demo" 
        @open="handleOpen" @close="handleClose" :collapse="isCollapse" 
        background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">

      <el-menu-item index="1">
        <i class="el-icon-s-home" />
          <span><router-link class="active" to="/">Home</router-link></span>
      </el-menu-item>
<!-- 
      <el-submenu index="1">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>Navigator One</span>
        </template>
        <el-menu-item-group title="Group One">
          <el-menu-item index="1-1">item one</el-menu-item>
          <el-menu-item index="1-2">item one</el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group title="Group Two">
          <el-menu-item index="1-3">item three</el-menu-item>
        </el-menu-item-group>
        <el-submenu index="1-4">
          <template slot="title">item four</template>
          <el-menu-item index="1-4-1">item one</el-menu-item>
        </el-submenu>
      </el-submenu>
-->


    <el-submenu index="2">
        <template slot="title">
            <i class="el-icon-user" />
            <span>회원 / 기업 / 소모임</span>
        </template>
        <el-menu-item-group title="회원관리">
            <el-menu-item index="1-1">
                <span><router-link class="active" to="/managemember1">일반회원관리</router-link></span>
            </el-menu-item>
            <el-menu-item index="1-2">
                <span><router-link  to="/managemember2">기업회원관리 </router-link></span>
            </el-menu-item>
            <!-- <el-menu-item index="1-2">item one</el-menu-item> -->
        </el-menu-item-group>
        <el-menu-item-group title="소모임 리스트">
            <el-menu-item index="1-3">
                <span><router-link  to="/managemember3">소모임관리</router-link></span>
            </el-menu-item>
        </el-menu-item-group>
    </el-submenu>

    <el-submenu index="3">
        <template slot="title">
            <i class="el-icon-s-claim" />
            <span>승인/개설</span>
        </template>
        <el-menu-item-group title="기업회원 전환">
            <el-menu-item index="1-1">
               <span><router-link to="/acceptlist1"> 기업회원승인 </router-link></span>
            </el-menu-item>
            <!-- <el-menu-item index="1-2">item one</el-menu-item> -->
        </el-menu-item-group>
        <el-menu-item-group title="스터디그룹 개설요청">
            <el-menu-item index="1-2">
                <span><router-link  to="/acceptlist2"> 스터디그룹 리스트 </router-link></span>
            </el-menu-item>
        </el-menu-item-group>
    </el-submenu>



    <el-submenu index="4">
        <template slot="title">
            <i class="el-icon-s-data" />
            <span>통계</span>
        </template>
        <el-menu-item-group title="대분류/소분류통계">
            <el-menu-item index="1-1">
               <span><router-link  to="/statisticsNresearch8">회원 남여비율</router-link></span>
            </el-menu-item>
            <!-- <el-menu-item index="1-2">item one</el-menu-item> -->
        </el-menu-item-group>
        <el-menu-item-group title="그룹별 비율">
            <el-menu-item index="1-2">
                <span><router-link  to="/statisticsNresearch5"> 대분류비율 </router-link></span>
            </el-menu-item>
            <el-menu-item index="1-3">
                <span><router-link  to="/statisticsNresearch6"> 소분류비율 </router-link></span>
            </el-menu-item>
        </el-menu-item-group>
    </el-submenu>

    <el-submenu index="5">
        <template slot="title">
            <i class="el-icon-circle-check" />
            <span>게시판관리</span>
        </template>
        <el-menu-item-group title="게시판보기">
            <el-menu-item index="1-1">
               <span><router-link class="active" to="/board1"> 회원관리1 </router-link></span>
            </el-menu-item>
            <el-menu-item index="1-2" disabled>
                <span><router-link  to="/managemember2">기업회원관리 </router-link></span>
            </el-menu-item>
            <!-- <el-menu-item index="1-2">item one</el-menu-item> -->
        </el-menu-item-group>
        <el-menu-item-group title="소모임 리스트">
            <el-menu-item index="1-3">
                <span>
                  <router-link  to="/managemember3">소모임관리</router-link>
                </span>
            </el-menu-item>
        </el-menu-item-group>
    </el-submenu>

<!-- 
      <el-submenu index="1">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>Navigator One</span>
        </template>
        <el-menu-item-group title="Group One">
          <el-menu-item index="1-1">item one</el-menu-item>
          <el-menu-item index="1-2">item one</el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group title="Group Two">
          <el-menu-item index="1-3">item three</el-menu-item>
        </el-menu-item-group>
        <el-submenu index="1-4">
          <template slot="title">item four</template>
          <el-menu-item index="1-4-1">item one</el-menu-item>
        </el-submenu>
      </el-submenu>
-->

      <el-menu-item index="2">
        <i class="el-icon-menu"></i>
        <span>Navigator Two</span>
      </el-menu-item>
      <el-menu-item index="3" disabled>
        <i class="el-icon-document"></i>
        <span>Navigator Three</span>
      </el-menu-item>
      <el-menu-item index="4">
        <i class="el-icon-setting"></i>
        <span>Navigator Four</span>
      </el-menu-item>
    </el-menu>
    </div>
  
</template>

<script>
import 'element-ui/lib/theme-chalk/index.css';

 export default {
    name: "HeaderNav",

    data() {
      return {
        isCollapse: false
      };
    },
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  }
</script>

<style>

  span a{
      color:white;
  }
</style>