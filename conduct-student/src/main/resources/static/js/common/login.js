$(document).ready(function(){
		
		$("#button1").click(function(){
			this.disabled = true;	
			setdisabled(this);
			$.post("User_verificate",{
				'username':$("#username").val(),
				'password':$("#password").val(),
				'verifi':$("#verifi").val()
			},function(data,status){
				$("#prompt").empty();
				if(data == 1){
					$("#prompt").append("<font color='red'>帐号或密码错误,请重新输入");
				}else if(data == 2){
					$("#prompt").append("<font color='red'>验证码错误,请重新输入");
				}else if(data == 3){
					$("#prompt").append("<font color='red'>验证正确");
					$("#form1").submit();	
				}
			});
			
		});
		
		$(document).ready(function(){
			$("#button2").click(function(){
				$("#username").val("");
				$("#password").val("");
				$("#verifi").val("");
			});
		});
		
	});
	
	function setdisabled(obj) {
		setTimeout(function() { obj.disabled = false; }, 100);
	} 
	
	function changeValidateCode(obj) {   
		//获取当前的时间作为参数，无具体意义   
		var timenow = new Date().getTime();   
		//每次请求需要一个不同的参数，否则可能会返回同样的验证码   
		//这和浏览器的缓存机制有关系，也可以把页面设置为不缓存，这样就不用这个参数了。   
		obj.src="rand.action?d="+timenow;   
	}   