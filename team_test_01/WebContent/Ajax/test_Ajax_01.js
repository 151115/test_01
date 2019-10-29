$('document').ready(function() {
	$.ajax({
		url : '../test_Ajax_01?',
		data : 'num=123&num2=456',
		dataType:'json',
		success : function(resData) {
				// 
			//alert(resData);	
				
			// 오브젝트 > 스트링 : JSON.stringify() 사용
			// 스트링 > 오브젝트 : JSON.parse()
			//let jsonObj = JSON.parse(resData);
			//alert('서버요청성공 >  ' + resData);
			
			
		}
	});
});