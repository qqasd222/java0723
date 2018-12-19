<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>

<script type="text/javascript">
	function seacher(){
		var num = $("#num").val();
		$.ajax({
			type : 'GET',
			url : 'getMoblie.do',
			data : {"num":num},
			dataType : 'json',
			success : function(rs) {
			console.log(rs);
			var msg = "";
			if(rs){
				msg="地区:"+rs.area+"  运营商:"+rs.mobiletype;
			}else{
				msg="该号码查询不到";
			}
			$("#msg").text(msg);
			}
		})
	}

</script>

</head>
<body>
		请输入手机号:<input id="num" type="text" name="num">
		<b id="msg"></b>
		<br>
		<a href="javascript:seacher()">查询</a>
	
</body>
</html>