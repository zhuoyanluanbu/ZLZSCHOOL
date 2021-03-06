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
* http请求
* */
var httpGet = function(url){
    var pro = new Promise(function(resolve,reject){
        $.ajax({
            url:url,
            success:function(data){
                resolve(data)
            },error:function(err){
                reject(err)
            }
        })
    })
    return pro
}
var httpPost = function(url,dataReq){
    var pro = new Promise(function(resolve,reject){
        $.ajax({
            url:url,
            type:'post',
            data:JSON.stringify(dataReq),
            dataType:'json',
            contentType:'application/json;charset=utf-8',
            success:function(data){
                resolve(data)
            },error:function(err){
                reject(err)
            }
        })
    })
    return pro
}

/*
* 处理http请求错误
* */
var dealHttpErr = function(err){
    alert('['+err.status+']\n'+err.responseText)
}

/*
* 学生对象
* */
var Student = function(id,studentnum,studentName,birthday,politicalstatus,educationallevel,
                       idnumber,phone,homeaddress,qqnumber,wechatnumber,smokeage,whysmoke,whylove,
                       loverinformation,violence,whyviolence,medicalhistory,lifeexpenses,
                       homeincome,hobby,performance,state,sex,issmoke,islove,remark){
    this.id = id;
    this.studentnum = studentnum;//学号
    this.studentName = studentName;
    this.birthday = birthday;
    this.politicalstatus = politicalstatus;//政治面貌
    this.educationallevel = educationallevel;//学历
    this.idnumber = idnumber;
    this.phone = phone;
    this.homeaddress = homeaddress;
    this.qqnumber = qqnumber;
    this.wechatnumber = wechatnumber;
    this.whysmoke = whysmoke;
    this.smokeage = smokeage
    this.whylove = whylove;
    this.loverinformation = loverinformation;//恋爱对象信息
    this.violence = violence;
    this.whyviolence = whyviolence;
    this.medicalhistory = medicalhistory;//病史
    this.lifeexpenses = lifeexpenses;//生活开销
    this.homeincome = homeincome;//家庭收入
    this.hobby = hobby;//兴趣爱好
    this.performance = performance;//表现
    this.remark = remark;
    this.state = state;
    this.sex = sex || 2;
    this.issmoke = issmoke||-1;
    this.smokeage = smokeage||0;
    this.islove = islove||-1;
}

/*
* 奖罚对象
* */
var Sanction = function (id,time,sanctionrank,sanctionname,level,other,remark,state,stu_id) {
    this.id = id || 0;
    this.time = time;
    this.sanctionrank = sanctionrank;//奖罚级别
    this.sanctionname = sanctionname;//将罚名
    this.level = level;
    this.other = other;//其他
    this.remark = remark || '';//备注
    this.state = state || 0;//状态
    this.stu_id = stu_id;
}

/*
* 个人规划对象
* */
var PersonalPlan = function(id,goal,finished_time,remark,stu_id){
    this.id = id || 0;
    this.goal = goal;
    this.finished_time = finished_time;
    this.remark = remark;
    this.state = 0;
    this.stu_id = stu_id;
}

/*
* 学生家庭成员
* */
var FamilyMember = function(id, relationship, name, workunit, phone, remark, stu_id){
    this.id = id || 0;
    this.relationship = relationship;
    this.name = name;
    this.workunit = workunit;
    this.phone = phone;
    this.remark = remark;
    this.state = 0;
    this.stu_id = stu_id;
}