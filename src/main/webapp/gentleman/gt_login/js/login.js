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
        });

		$(".login_way_left").mouseover(function () {
            $(".login_way_left").css('background','#8B8682');
        });
        $(".login_way_left").mouseleave(function () {
            $(".login_way_left").css('background','#CDC5BF');
        });
        $(".login_way_right").mouseover(function () {
            $(".login_way_right").css('background','#8B8682');
        });
        $(".login_way_right").mouseleave(function () {
            $(".login_way_right").css('background','#CDC5BF');
        });

	}
};

$(function (){
	login.init();
});