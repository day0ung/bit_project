<template>
  <div>
    <input 
      style="display: none" 
      type="file" 
      @change="onFileSelected" 
      ref="fileInput">
    <button @click="$refs.fileInput.click()">Pick File</button>
    <button @click="onUpload">Upload</button>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  data(){
    return{
      selectedFile : null
    }
  },
  methods:{
    onFileSelected(event){
      this.selectedFile = event.target.files[0]
    },
    onUpload(){
      const fd = new FormData();
      fd.append('imagme', this.selectedFile, this.selectedFile.name)
       axios.post('url', fd, {
         onUploadProgress: uploadEvent => {
           console.log('Upload Progress: ' +  Math.round((uploadEvent.loaded / uploadEvent.total *100) + '%') 
           )}
       
       })
        .thne(res =>{
          console.log(res)
        }) 
    }
  }
}   
</script>

<style>

</style>