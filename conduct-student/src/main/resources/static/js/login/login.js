$(document).ready(function(){
	$("#image").click(function(){

		var userid = $("#uid").val();  
	    var password = $("#passwd").val();        
	    userid = userid.replace(/(^\s*)|(\s*$)/g,"");
	    password = password.replace(/(^\s*)|(\s*$)/g,"");
	    var quan = $("#quan").val();        
	    //var quan = $("input[name='quan']:checked").val();    
	    if($.trim(userid) == "" || $.trim(password) == ""){  
	    	$("#message").empty();
	    	$("#message").append("账户或密码不能为空");  
	    	return false;  
	    }                     
	    
	    $("#message").empty();         
	    $("#message").append("<span id='load' style='margin-left:140px;'><img src='css/img/load.gif'></img></span>");
	    $("#load").fadeIn("normal");
	    $.post("Login.action", {
	    	"userid":userid,
	        "password":password,
	        "quan":quan
	    },function(data, status){
	            		
	    	data = eval("("+data+")");
	        if(data == 0){
	        	$("#message").empty();
	            $("#message").append("账户不存在，请检查后登录");
	        }
	        else if(data == 1){
	        	//$("#load").fadeOut("fast");
	            window.location = "admin.action";
	        }
	        else if(data == 2){
	            //$("#load").fadeOut("fast");
	            window.location = "teacher.action";
	        }
	        else if(data == 3){
	        	//$("#load").fadeOut("fast");
	            window.location = "student.action";    		
	        }
	        else if(data == 4){
	            $("#message").empty();
	            $("#message").append("账户或密码错误，请重新登录");
	        }
	  });  
   });  
});  