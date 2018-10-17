var login = {
	init:function(){
		var me = this;
		me.login();
	},

	login:function (){
		$("#login").click(function () {
            var number = $("#number").val();
            var password = $("#password").val();
            var params = {};
            params.account = number;
            params.password = password;
            invoker("login/login",params,login);
            function login(data) {

            }
        })
	}
};

$(function (){
	login.init();
});