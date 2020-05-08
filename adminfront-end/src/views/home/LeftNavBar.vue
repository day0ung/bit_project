<template>
    <div class="LeftNavBar">
        <el-radio-group v-model="isCollapse" style="margin-top: 20px;" >
        <el-radio-button :label="false">expand</el-radio-button>
        <el-radio-button :label="true">collapse</el-radio-button>
        </el-radio-group>
        
        <el-menu default-active="2" class="el-menu-vertical-demo" 
        @open="handleOpen" @close="handleClose" :collapse="isCollapse" 
        background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">

      <el-menu-item index="1">
        <i class="el-icon-s-home" />
        <span>
            <router-link class="active" to="/">Home</router-link>
        </span>
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
          <span>회원, 기업, 소모임</span>
        </template>
        <el-menu-item-group title="회원관리">
            <el-menu-item index="1-1">
                <router-link class="active" to="/managemember1">일반회원관리</router-link>
            </el-menu-item>
          <!-- <el-menu-item index="1-2">item one</el-menu-item> -->
        </el-menu-item-group>
        <el-menu-item-group title="기업관리">
            <el-menu-item index="1-2">
                <router-link  to="/managemember2">기업회원관리 </router-link>
            </el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group title="소모임관리">
          <el-menu-item index="1-3">
              <router-link  to="/managemember3">소모임관리</router-link>
          </el-menu-item>
        </el-menu-item-group>
        <el-submenu index="1-4">
          <template slot="title">item four</template>
          <el-menu-item index="1-4-1">item one</el-menu-item>
        </el-submenu>
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
        isCollapse: true
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
  .el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 200px;
    min-height: 400px;
  }
  span a{
      color:white;
  }
</style>