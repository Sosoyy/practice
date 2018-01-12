<template lang="html">
  <!-- 在首页父组件发送http请求,后将数据通过props传递给子组件,可减少请求次数,减少服务器压力 -->
  <div class="index">
    <v-header :breadcrumb='breadcrumb'></v-header>
    index{{datas}}
  </div>
</template>

<script>
import Header from "@/components/Header.vue";
export default {
  components: {
    "v-header": Header
  },
  data() {
    return {
      datas: "aaa",
      loading: true,
      breadcrumb: [
        {
          url: "/t1",
          title: "hahah",
          icon: "aaaa"
        },
        {
          url: "/t2",
          title: "hahah",
          icon: "aaaa"
        }
      ]
    };
  },
  beforeCreate() {
    this.$api({
      method: "get",
      url: "/index"
    })
      .then(response => {
        this.datas = response.data.title;
      })
      .catch(function(error) {
        alert(error);
      });
  }
};
</script>



<style lang="less" scoped>
.index {
  width: 100%;
  padding-bottom: 14vw;
  background-color: #f8fcff;
}
</style>
