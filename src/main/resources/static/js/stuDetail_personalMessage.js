var getStuDetail = function(){
    httpGet('/student/stuid?stuId='+getRequestParam()['stuid'])
        .then(function(stu){
            $('title').html(stu.studentName)
            $('.pageTitle').html(stu.studentName)
            $('.stuName').html(stu.studentName)
            $('.stuSex').html(stu.sex==0?'女':'男')
            $('.stuBirthday').html(stu.birthday)
            $('.stuEducationallevel').html(stu.educationallevel)
            $('.stuPoliticalstatus').html(stu.politicalstatus)
            $('.stuIdNumber').html(stu.idnumber)
            $('.phone').html(stu.phone)
            $('.homeAddress').html(stu.homeaddress)
            $('.QQ').html(stu.qqnumber)
            $('.wechat').html(stu.wechatnumber)
            $('.isSmoke').html(stu.issmoke==-1?'未知':(stu.issmoke==0?'否':'是'))
            $('.smokeAge').html(stu.smokeage)
            $('.whySmoke').html(stu.whysmoke)
            $('.isLove').html(stu.islove==-1?'未知':(stu.islove==0?'否':'是'))
            $('.whyLove').html(stu.whylove)
            $('.lover').html(stu.loverinformation)
            $('.isViolence').html(stu.isviolence==-1?'未知':(stu.isviolence==0?'否':'是'))
            $('.whyViolence').html(stu.whyviolence)
            $('.medicalhistory').html(stu.medicalhistory)
            $('.lifeexpenses').html(stu.lifeexpenses)
            $('.homeincome').html(stu.homeincome)
            $('.hobby').html(stu.hobby)
            $('.performance').html(stu.performance)
            $('.remark').html(stu.remark)
        })
        .catch(function(err){dealHttpErr(err)})
}()

var personalBaseMessageDivSpreadHeight = $('.personalBaseMessage').css('height')
var personalBaseMessageDivShrinkHeight = '1.33em'
$('.pullPushPersonalBaseMessageBtn').click(function(){
    var state = $('.personalBaseMessage').attr('state')
    if (state === 'spread'){
        $('.personalBaseMessage').attr('state','shrink')
        $('.personalBaseMessage').animate({height:personalBaseMessageDivShrinkHeight},'fast')
        $('.pullPushPersonalBaseMessageBtn img').attr('src','img/pullPBM.png')
        $('.personalBaseMessage p:not(:first)').css('display','none')
    }else{
        $('.personalBaseMessage').attr('state','spread')
        $('.personalBaseMessage').animate({height:personalBaseMessageDivSpreadHeight},'fast')
        $('.pullPushPersonalBaseMessageBtn img').attr('src','img/pushPBM.png')
        $('.personalBaseMessage p:not(:first)').css('display','block')
    }
})

/*
 * 跳转到编辑
 * * */
$('.personalBaseMessage .editBtn').click(function(){
    location.href = '/studentEdit.html?stuid='+getRequestParam()['stuid']
})