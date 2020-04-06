<template>
    <div class="create">
        <div class="createContainer">
            <h5>대분류</h5>
            <select class="custom-select custom-select interBig" @change="interBig" required>
                <option selected>-- 선택해주세요 --</option>
                <option v-for="bigInter in bigInterList" :key="bigInter.interBigSeq" :value="bigInter.interBigSeq">{{ bigInter.bigName }}</option>
            </select>
            <h5>소분류</h5>
            <select class="custom-select custom-select" required>
                <option selected>-- 선택해주세요 --</option>
                <option v-for="smallInter in smallInterList" :key="smallInter.interSmallSeq">{{ smallInter.smallName }}</option>
            </select>
            <div style="text-align: center;">
                <button class="btn btn-primary" @click="gruopCreateApply">Group Create Apply</button>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data(){
        return{
            bigInterList: "",
            smallInterList: "",
            bigValue: 0,
        }
    },
    methods:{
        gruopCreateApply: function (event) {
            alert("그룹신청이 완료되었습니다.\n심사 후 그룹개설이 완료됩니다.")
            this.$router.push({
                path: "/group"
            })
        },
        interBig(){
            this.bigValue = document.querySelector(".interBig").value
            var params = new URLSearchParams();
            params.append('interBigSeq', this.bigValue);
            axios.post("http://192.168.2.43:9000/getSmallIndex", params)
                .then(res => {
                    this.smallInterList = res.data
                })
        }
    },
    mounted(){
        axios.post("http://192.168.2.43:9000/getBigIndex")
            .then(res => {
                this.bigInterList = res.data
        })

    }

}
</script>

<style scope>

.createContainer {
    position: relative;
    margin: auto;
    overflow: hidden;
    width: 650px;
    height: auto;
    max-height: 700px;
    background: #f5f5f5;
    box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.5);
    border-radius: 10px;
}

</style>