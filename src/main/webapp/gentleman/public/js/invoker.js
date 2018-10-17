
/* 封装好的ajax，传参：
* URL：地址
* objects：参数对象
* callback:调用的函数，调用的时候直接callback（data）即可取到数据
* */

function invoker(url,objects,callback) {
	invoke.invokeRequest(url,objects,callback);
}
var invoke = {
    invokeRequest:function (url,objects,callback){
        var root = "http://localhost:8888/gentleman/";
        $.ajax({
            type : 'post',
            url : root+url,
            contentType : 'application/json;charset=utf-8',
            withCredentials: true,
            data : JSON.stringify(objects),
            success : callback
        });
    }
};



