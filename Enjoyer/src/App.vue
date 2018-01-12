<template>
  <div id="app">
    <v-leftRight>
      <div slot="lnb">
        <v-lnb></v-lnb>
      </div>
      <div slot="content">
        <router-view></router-view>
      </div>
    </v-leftRight>
    <v-loading v-show="fetchLoading"></v-loading>
  </div>
</template>

<script>
  import Loading from '@/common/_loading'
  import Header from "@/components/Header.vue";
  import LeftRight from "@/components/leftRight.vue";
  import LNB from "@/components/lnb.vue";
  export default {
    components: {
      'v-loading': Loading,
      "v-header": Header,
      "v-leftRight": LeftRight,
      "v-lnb": LNB
    },
    data() {
      return {
        datas: "aaa",
        loading: true,
      };
    },
    computed: {
      fetchLoading() {
        return this.$store.state.detail.fetchLoading
      }
    }
  }
</script>

<style lang="less">
  @import "./assets/common.less";
</style>
