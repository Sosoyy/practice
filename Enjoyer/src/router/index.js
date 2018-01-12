import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);
//按需加载,当渲染其他页面时才加载其组件,并缓存,减少首屏加载时间
const Index = resolve => require(['@/views/Index.vue'], resolve)
// const Category = resolve => require(['@/views/Category.vue'], resolve)
// const CategoryMain = resolve => require(['@/components/category/main.vue'], resolve)
// const Car = resolve => require(['@/views/Car.vue'],resolve)
// const User = resolve => require(['@/views/User.vue'], resolve)
// const Detail = resolve => require(['@/views/Detail.vue'], resolve)
// const Search = resolve => require(['@/views/Search.vue'], resolve)
// const Pay = resolve => require(['@/components/car/pay/pay.vue'], resolve)
// const Login = resolve => require(['@/views/login.vue'], resolve)


export default new Router({
  routes: [{
    path: '/t1',
    name: '首页',
    component: Index
  },
  {
    path: '/t2',
    name: '首页2',
    component: Index
  },
  {
    path: '/t3',
    name: '首页3',
    component: Index
  }
  ]
})
