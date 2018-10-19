$(document).ready(function() {
	
	$('a.ajax-link').click(function(even){
		var hash = $(this).attr('href');
		/*$('#content').remove();*/
		$("#load").empty();
		$("#rightFrame").css("display","none");
		$("#load").append('<img src="img/ajax-loaders/ajax-loader-4.gif" />');
		if(hash) {
			/*$("#main").load(hash, function(){
				$('#load').fadeOut('normal');			
			});*/	
			$("#rightFrame").attr("src",hash); 
			$("#rightFrame").css("display","block");
			$("#load").empty();
		} else {
			$("#rightFrame").load("error.jsp"); //default
		}
		return false;
	});
	
	/*$('#themes a').click(function(even){
		var linkHref = $(this).attr('data-value');
		var linkChild = document.getElementById('rightFrame').contentWindow.document.getElementById("bs-css");
		var linkParent = document.getElementById("bs-css");
		linkChild.href = "css/bootstrap-"+linkHref+".css";
		linkParent.href = "css/bootstrap-"+linkHref+".css";
	});*/
	
});