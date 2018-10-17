var login = {
	init:function(){
		var me = this;
		me.login();
	},

	login:function (){
		$("#login").click(function () {
            window.location.href="gt_portal/home/index.html";
            var number = $("#number").val();
            var password = $("#password").val();
            var params = {};
            params.account = number;
            params.password = password;
            setCookie("username",number);
            invoker("login/login",params,login);
            function login(data) {
                console.log(data);
                console.log(getCookie("username"));
                delCookie("username");
                console.log(getCookie("username"))
            }
        })
	}
};

$(function (){
	login.init();
});