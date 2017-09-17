<html>
<head>
    <meta charset="utf-8"/>
    <title>Vue 测试实例 - 菜鸟教程(runoob.com)</title>
    <script type="text/javascript" src="https://cdn.bootcss.com/vue/2.4.2/vue.min.js"></script>
</head>
<body>
<div id="app">
    <input type="text" v-model="message" placeholder="请输入"/>
    <p>{{message}}</p>
</div>

<script type="text/javascript">
    new Vue({
        el: '#app',
        data: {
            message: 'Hello Vue.js!'
        }
    })
</script>
</body>
</html>