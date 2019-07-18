var userRegister = new Vue({
	el:"#user-register",
	data:{
		userName:'',
		password:'',
		confirmPassword:'',
		confirmClass:'form-group',
		userClass:'form-group',
		passwordClass:'form-group'
	},
	methods:{
		/**
		 * 非空判断
		 * @param {Object} type
		 */
		confirmBlur:function(type){
			switch (type){
				case 1:
					if(isEmpty(this.userName)){
						this.userClass = 'form-group has-error';
					}else{
						this.userClass = 'form-group';
					}
					break;
				case 2:
					if(this.password == null || this.password == '' || this.password == undefined){
						this.passwordClass = 'form-group has-error';
					}else{
						this.passwordClass = 'form-group';
					}
					break;
				case 3:
					var password = this.password;
					var confirmPassword = this.confirmPassword;
					if(password != confirmPassword){
						this.confirmClass = 'form-group has-error';
					}else{
						this.confirmClass = 'form-group'
					}
					break;
				default:
					break;
			}
		},
		/**
		 * 注册
		 */
		registerClick:function(){
			if (isEmpty(this.userName) || isEmpty(this.password) || isEmpty(this.confirmPassword)) {
				operateSuccessfully("请将用户名密码完善！");
				return;
			}
			var url = url_head+"/user/registered";
			$.ajax({
					type: "POST",
					url: url,
					data:{
						userName:userRegister.userName,
						password:userRegister.password
					},
					async: true,
					dataType:'json',
					success: function(data) {
						var data = parsingData(data);
						operateSuccessfully("操作成功！");
						window.location.href = '../login/login.html'
					},
					error: function() {
						operateSuccessfully("未知错误！");
					}
			})
		},
		cancelClick:function() {
			window.location.href = '../login/login.html'
		}
	}
})