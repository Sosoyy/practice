# practice
vue/vue-router/vuex

1. cd Enjoyer

2. npm install 更新下载相关以来

运行：

1. mock数据

* npm install -g json-server
* npm run mock

··
可在mockData/data.json 中添加模拟数据
··

2. 本地链接本地tomcat的接口 进行测试

* 需先修改config 中，dev下的 proxyTable.target 改为本地测试需要访问的地址
* http/api.js 中的 当 process.env.NODE_ENV === 'development' 下的api.defaults.baseURL 修改为你的API地址

*npm run dev

3.将文件打包到tomcat下，进行运行

*npm run build


