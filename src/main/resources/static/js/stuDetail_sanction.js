/*
 * 获取奖罚信息
 * */
var getSanctionsByStuId = function(){
    httpGet('/student/sanction?stuId='+getRequestParam()['stuid']).then(function(sanctions){
        if (sanctions.length > 0){
            var tr = '';
            for (var sa in sanctions){
                var sanction = sanctions[sa];
                tr += '<tr sanid='+sanction.id+
                    ' santime='+sanction.time+
                    ' sanrank='+sanction.sanctionrank+
                    ' sanname='+sanction.sanctionname+
                    ' sanlevel='+sanction.level+
                    ' sanother='+sanction.other+'>' +
                    '<td>'+sanction.time+'</td>' +
                    '<td>'+sanction.sanctionrank+'</td>' +
                    '<td>'+sanction.sanctionname+'</td>' +
                    '<td>'+sanction.level+'</td>' +
                    '<td>'+sanction.other+'</td>' +
                    '</tr>'
            }
            $('.sanction table tbody').html(tr)
            $('.sanction table tbody tr').click(function () {
                var id = $(this).attr('sanid')
                var santime = $(this).attr('santime')
                var sanrank = $(this).attr('sanrank')
                var sanname = $(this).attr('sanname')
                var sanlevel = $(this).attr('sanlevel')
                var sanother = $(this).attr('sanother')
                setSanctionEditValue(new Sanction(id,santime,sanrank,sanname,sanlevel,sanother,null,null,getRequestParam()['stuid']));
                sanctionEditMaskDisplay(true)
            })
        }
    }).catch(function(err){
        dealHttpErr(err)
    })
}
getSanctionsByStuId()

//奖罚添加按钮
$('.sanction .add').click(function(){
    sanctionEditMaskDisplay(true)
})
/*
*关闭奖罚弹窗
* */
$('.sanctionEditMask .close ').click(function(){
    sanctionEditMaskDisplay(false)
})
$('.sanctionEditMask .confirm').click(function(){
    sanctionEditMaskConfirm()
})
var sanctionEditMaskDisplay = function(isOpen){
    if (isOpen) {
        $('.sanctionEditMask').css('display','block')
    }else {
        $('.sanctionEditMask').css('display','none')
        cleanSanctionEditValue()
    }
}
var cleanSanctionEditValue = function(){
    $('.sanctionEdit input[name="id"]').val('')
    $('.sanctionEdit input[name="time"]').val('')
    $('.sanctionEdit input[name="rank"]').val('')
    $('.sanctionEdit input[name="name"]').val('')
    $('.sanctionEdit input[name="level"]').val('')
    $('.sanctionEdit input[name="other"]').val('')
}
var setSanctionEditValue = function(sanction){
    $('.sanctionEdit input[name="id"]').val(sanction.id)
    $('.sanctionEdit input[name="time"]').val(sanction.time)
    $('.sanctionEdit input[name="rank"]').val(sanction.sanctionrank)
    $('.sanctionEdit input[name="name"]').val(sanction.sanctionname)
    $('.sanctionEdit input[name="level"]').val(sanction.level)
    $('.sanctionEdit input[name="other"]').val(sanction.other)
}
var sanctionEditMaskConfirm = function(){
    var id = $('.sanctionEdit input[name="id"]').val()
    var time = $('.sanctionEdit input[name="time"]').val()
    if (!time) {alert('请填写时间');return;}
    var rank = $('.sanctionEdit input[name="rank"]').val()
    if (!rank) {alert('请填写奖罚级别');return}
    var name = $('.sanctionEdit input[name="name"]').val()
    if (!name) {alert('请填写名称');return;}
    var level = $('.sanctionEdit input[name="level"]').val()
    if (!level) {alert('请填写等级');return;}
    var other = $('.sanctionEdit input[name="other"]').val()
    postSanction(new Sanction(id,time,rank,name,level,other,null,null,getRequestParam()['stuid']))
}
var postSanction = function(sanction){
    httpPost('/student/sanction',sanction).then(function(san){
        if (san.id==sanction.id){
            alert('修改成功')
        }else {
            alert('增加成功')
        }
        getSanctionsByStuId()
        sanctionEditMaskDisplay(false)
    }).catch(function(err){
        dealHttpErr(err)
    })
}