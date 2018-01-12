<template lang="html">

  <v-header title="电商联盟">

</v-header>
</template>

<script>
import Header from '@/common/_header.vue'
export default {
  components: {
    'v-header': Header,
  },
}
</script>

<style lang="less" scoped>
@import '../../assets/common.less';
@import '../../assets/index/style.css';
.mint-header {
    padding: 6.8vw 4.8vw;
    background-color: #fff;
    color: #333!important;
    .fz(font-size, 40)!important;
}
</style>
