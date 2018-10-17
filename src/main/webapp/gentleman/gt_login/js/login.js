var login = {
	init:function(){
		var me = this;
		me.login();
	},

	login:function (){
		$("#login").click(function () {
           // window.location.href="gt_portal/home/index.html";
            var number = $("#number").val();
            var password = $("#password").val();
            var params = {};
            params.account = number;
            params.password = password;
            invoker("login/login",params,login);
            function login(data) {
                console.log(data);
            }
        })
	}
};

$(function (){
	login.init();
});