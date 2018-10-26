/*
 * 获取get参数
 * */
var getRequestParam = function(){
    var pk_pv = {};
    var param = location.href.split('?')[1];//param=xxx
    var pKVs = param.split('&');
    for (var pa in pKVs){
        var pKey = pKVs[pa].split('=')[0];
        var pVal = pKVs[pa].split('=')[1];
        pk_pv[pKey] = pVal;
    }
    return pk_pv;
}

/*
* 处理http请求错误
* */
var dealHttpErr = function(err){
    alert('['+err.status+']\n'+err.responseText)
}