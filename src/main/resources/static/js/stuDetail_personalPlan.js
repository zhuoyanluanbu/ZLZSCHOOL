/*
        * 获取个人规划
        * */
var getPersonalPlansByStuId = function(){
    httpGet('/student/personalplan?stuId='+getRequestParam()['stuid']).then(function(plans){
        if (plans.length > 0){
            var tr = ''
            for (var p in plans){
                var pl = plans[p];
                tr += '<tr planid="'+pl.id+'"plangoal="'+pl.goal+'" planfitime="'+pl.finished_time+'" planremark="'+pl.remark+'">' +
                    '<td>'+pl.goal+'</td>'+
                    '<td>'+pl.finished_time+'</td>'+
                    '<td>'+pl.remark+'</td>'+
                    '</tr>'
            }
            $('.personalPlan tbody').html(tr);
            $('.personalPlan table tbody tr').click(function () {
                var id = $(this).attr('planid')
                var plangoal = $(this).attr('plangoal')
                var planfitime = $(this).attr('planfitime')
                var planremark = $(this).attr('planremark')
                setPersonalPlanEditValue(new PersonalPlan(id,plangoal,planfitime,planremark,getRequestParam()['stu_id']))
                personalPlanEditMaskDisplay(true);
            })
        }
    }).catch(function(err){
        dealHttpErr(err)
    })
}
getPersonalPlansByStuId()

//个人规划添加按钮
$('.personalPlan .add').click(function(){
    personalPlanEditMaskDisplay(true)
})
/*
*关闭个人规划弹窗
* */
$('.personalPlanEditMask .close').click(function(){
    personalPlanEditMaskDisplay(false)
})
$('.personalPlanEditMask .confirm').click(function(){
    personalPlanEditMaskConfirm()
})
var personalPlanEditMaskDisplay = function(isOpen){
    if (isOpen) {
        $('.personalPlanEditMask').css('display','block')
    }else {
        $('.personalPlanEditMask').css('display','none')
        cleanPersonalPlanEditValue()
    }
}
var cleanPersonalPlanEditValue = function(){
    $('.personalPlanEdit input[name="id"]').val('')
    $('.personalPlanEdit input[name="goal"]').val('')
    $('.personalPlanEdit input[name="finishTime"]').val('')
    $('.personalPlanEdit input[name="remark"]').val('')
}
var setPersonalPlanEditValue = function(per){
    $('.personalPlanEdit input[name="id"]').val(per.id)
    $('.personalPlanEdit input[name="goal"]').val(per.goal)
    $('.personalPlanEdit input[name="finishTime"]').val(per.finish_time)
    $('.personalPlanEdit input[name="remark"]').val(per.remark)
}
var personalPlanEditMaskConfirm = function(){
    var id = $('.personalPlanEdit input[name="id"]').val()
    var goal = $('.personalPlanEdit input[name="goal"]').val()
    if (!goal) {alert('请填写目标');return;}
    var finishTime = $('.personalPlanEdit input[name="finishTime"]').val()
    if (!finishTime) {alert('请填写完成时间');return}
    var remark = $('.personalPlanEdit input[name="remark"]').val()
    postPersonalPlan(new PersonalPlan(id,goal,finishTime,remark,getRequestParam()['stuid']))
}
var postPersonalPlan = function(personalPlan){
    httpPost('/student/personalplan',personalPlan).then(function(per){
        if (per.id==personalPlan.id){
            alert('修改成功')
        }else {
            alert('增加成功')
        }
        getPersonalPlansByStuId()
        personalPlanEditMaskDisplay(false)
    }).catch(function(err){
        dealHttpErr(err)
    })
}