/*
工具类js，包含cookie方法，时间处理等
*/

//设置cookie
function setCookie(name,value){
            var Days = 30;
            var exp = new Date();
            exp.setTime(exp.getTime() + Days*24*60*60*1000);
            document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString()+";Path="+escape("/");
        }
//获取cookie
    function getCookie(name){
            var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
            if(arr=document.cookie.match(reg))
                return unescape(arr[2]);
            else
                return null;
        }
//删除cookie
    function delCookie(name) {
            setCookie(name,'',-1);
    }

