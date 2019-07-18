var userInfo = new Vue({
	el:"#user-info",
	data:{
		userName:'',
		password:'',
	},
	methods:{
		login:function(){
			$.ajax({
						type: "POST",
						url: "http://localhost:8762/yach/user/login",
						async: true,
						success: function(data) {
							if (data) {
								//取出用户名，保存cookie，
							}
						},
						error: function() {
							
						}
					})
		},
		toRegister:function () {
			window.location.href = '../register/register.html'
		}
	},
})