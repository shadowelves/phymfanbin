var SUCCESS = 0;


$(function(){
	$("#logbtn").click(userGGLogin);
	$("#logbtn1").click(userMTLogin);
	
	
	
});

function userGGLogin(){
	
	//alert(123);
	//清空提示
	
	//获取用户名
	var name = $("#txtUser").val().trim();
	//获取密码
	var password = $("#Userpwd").val().trim();
	console.log(name+"====="+password);
	var ok = true;
	if(name ==""){
		//$(".tishi").text("请输入用户名");
		ok= false;
		return;
	}
	if(password == ""){
		//$(".tishi").text("请输入密码");
		ok= false;
		return;
	}
	
	if(ok){
		$.ajax({
			url:base_path+"/user/gglogin.do",
			Type:"post",
			data:{"name":name,"password":password},
			dataType:"json",
			success:function(result){
				if(result.status == SUCCESS){
					//alert(123456);
					var user = result.data;										
					window.location.href = "edit.html";														
				}else{
					//alert(123);
					$(".tishi").show().text(result.msg);
				}
			},
			error:function(result){					
				alert("登录失败");
			}
		});
	}
};

function userMTLogin(){
	
	//alert(123);
	//清空提示	
	//获取用户名
	var name = $("#txtUser1").val().trim();
	//获取密码
	var password = $("#Userpwd1").val().trim();
	console.log(name+"====="+password);
	var ok = true;
	if(name ==""){
		//$(".tishi").text("请输入用户名");
		ok= false;
		return;
	}
	if(password == ""){
		//$(".tishi").text("请输入密码");
		ok= false;
		return;
	}
	
	if(ok){
		$.ajax({
			url:base_path+"/user/mtlogin.do",
			Type:"post",
			data:{"name":name,"password":password},
			dataType:"json",
			success:function(result){
				if(result.status == SUCCESS){
					//alert(123456);
					var user = result.data;									
					window.location.href = "log_in.html";										
				}else{
					//alert(123);
					$(".tishi").show().text(result.msg);
				}
			},
			error:function(result){					
				alert("登录失败");
			}
		});
	}
};



