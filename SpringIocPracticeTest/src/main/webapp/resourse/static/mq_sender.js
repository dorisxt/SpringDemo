jQuery(document).ready(function(){
	
	$('#send').click(function(){
		
	   var message = $("[name='msg']").val();
	  
		
 		$.ajax({
             cache: true,
             type: "post",
             url:'http://localhost:8082/SpringIocPracticeTest/amqMessage/send',
             data:{msg: message},
             success: function(response){
            	 alert(response);
             }
             
	 });
	})
}); 