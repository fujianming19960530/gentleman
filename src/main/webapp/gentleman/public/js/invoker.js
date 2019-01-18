
/* 封装好的ajax，传参：
* URL：地址
* objects：参数对象
* callback:调用的函数，调用的时候直接callback（data）即可取到数据
* */

(function($){
    window.Invoker = {
        invokeRequest:function (url,objects,callback){
            //本地测试地址就用这个，线上的自己设置
            var root = "http://localhost:8888/gentleman/";
            console.log(objects);
            $.ajax({
                type : 'post',
                url : root+url,
                contentType : 'application/json;charset=utf-8',
                //contentType:'application/x-www-form-urlencoded;charset=utf-8',
                withCredentials: true,
                data : JSON.stringify(objects),
                //data:objects,
                success : callback
            });
        }
    };

    $(document).keydown(function(e){
        try{
            if(e.which === 8){//退格
                var doPrevent = true;
                if(e.target.nodeName.toLowerCase() === "input" || e.target.nodeName.toLowerCase() === "textarea"){
                    if(!$(e.target).prop("readonly") && !$(e.target).prop("disabled")){
                        doPrevent = false;
                    }
                }
                if(doPrevent){
                    e.preventDefault();
                }
            }
        }
        catch(exception){
        }
    });
})(jQuery);

function invoker(url,objects,callback) {
	invoke.invokeRequest(url,objects,callback);
}
var invoke = {

};



