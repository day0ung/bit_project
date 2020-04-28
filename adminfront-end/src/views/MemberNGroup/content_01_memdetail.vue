<template>
  <div>
<el-form ref="form" :model="form" label-width="120px">
  <el-form-item label="memberSeq">
    <el-input v-model="form.name"></el-input>
  </el-form-item>
  
  <el-form-item label="memberId">
    <el-input v-model="form.name"></el-input>
  </el-form-item>

  <el-form-item label="pwd">
    <el-input v-model="form.name"></el-input>
  </el-form-item>

  <el-form-item label="member Name">
    <el-input v-model="form.name"></el-input>
  </el-form-item>

  <el-form-item label="address">
    <el-input v-model="form.name"></el-input>
  </el-form-item>

  <el-form-item label="interArea">
    <el-input v-model="form.name"></el-input>
  </el-form-item>

  <el-form-item label="email">
    <el-input v-model="form.name"></el-input>
  </el-form-item>

  <el-form-item label="age">
    <el-input v-model="form.name"></el-input>
  </el-form-item>

  <el-form-item label="gender">
    <el-input v-model="form.name"></el-input>
  </el-form-item>

  <el-form-item label="myMoney">
    <el-input v-model="form.name"></el-input>
  </el-form-item>

  <el-form-item label="cv">
    <el-input v-model="form.name"></el-input>  
  </el-form-item>

  <el-form-item label="auth">
    <el-input v-model="form.name"></el-input>
  </el-form-item>

  <el-form-item label="del">
    <el-input v-model="form.name"></el-input>
  </el-form-item>

  <el-form-item label="dislike">
    <el-input v-model="form.name"></el-input>
  </el-form-item>
  

  <el-form-item>
    <el-button type="primary" @click="onSubmit">Create</el-button>
    <el-button>Cancel</el-button>
  </el-form-item>
</el-form>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        form: {
          name: '',
          region: '',
          date1: '',
          date2: '',
          delivery: false,
          type: [],
          resource: '',
          desc: ''
        }
      }
    },
    created(){

    },
    methods: {
      onSubmit() {
        console.log('submit!');
      }
    }
  }
</script>

<style>

</style>


