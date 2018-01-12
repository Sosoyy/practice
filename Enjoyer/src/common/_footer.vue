<template lang="html">
  <!-- gotoRouter:点击后路由跳转到与id名相同的route.name所对应的路径 -->
  <div class="footer" @click.stop='gotoRouter'>
    test
  </div>
</template>

<script>
  export default {
    methods: {
      gotoRouter() {
        this.$router.push({
          name: this.selected
        })
      }
    },
    data() {
      return {
        //对应mt-tab-item 的id值
        selected: ''
      }
    },
    mounted() {

      //获取当前路由名称，根据该名称给当前footer添加is-selected
      let Rname = this.$route.name;
      switch (Rname) {
        case '首页':
          this.selected = '首页';
          break;
        case '分类页':
          this.selected = '分类页';

          break;
        case '购物车页':
          this.selected = '购物车页';

          break;
        case '用户页':
          this.selected = '用户页';
          break;
      }
    }

  }
</script>

<style lang="less" scoped>
  @import '../assets/common.less';
  @import '../assets/index/style.css';

.mint-tab-item-label:hover {
  color:#333;

}
  .footer {


    .mint-tabbar {
      background-color: #fff;
      background-image: none;
      box-shadow: 0 0 2.2vw 0 hsla(0, 6%, 50%, .13);
      -webkit-box-shadow: 0 0 2.2vw 0 hsla(0, 6%, 50%, .13);
      .is-selected {
        color: @cl;
        background-color: #fff;
        i {
          &::before {
            color: @cl;
          }
        }
      }
      i {
        .fz(font-size, 42);
      }
    }
  }
</style>
