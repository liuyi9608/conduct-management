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
					$("#prompt").append("<font color='red'>�ʺŻ��������,����������");
				}else if(data == 2){
					$("#prompt").append("<font color='red'>��֤�����,����������");
				}else if(data == 3){
					$("#prompt").append("<font color='red'>��֤��ȷ");
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
		//��ȡ��ǰ��ʱ����Ϊ�������޾�������   
		var timenow = new Date().getTime();   
		//ÿ��������Ҫһ����ͬ�Ĳ�����������ܻ᷵��ͬ������֤��   
		//���������Ļ�������й�ϵ��Ҳ���԰�ҳ������Ϊ�����棬�����Ͳ�����������ˡ�   
		obj.src="rand.action?d="+timenow;   
	}   