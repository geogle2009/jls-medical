<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
		+ request.getServerName() + ":" + request.getServerPort()
		+ path + "/";
%>
<base href="<%=basePath%>">
<link rel="stylesheet" href="page/css/table-style.css" type="text/css"></link>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<META HTTP-EQUIV='pragma' CONTENT='no-cache'>
<META HTTP-EQUIV='Cache-Control' CONTENT='no-cache, must-revalidate'>
<META HTTP-EQUIV='expires' CONTENT='0'>
<title>核对医保卡号</title>
<script type="text/javascript">
	function savessn(){
			var arr = {
				"personDTO.ssn" : $('#ssn')[0].value,
				"personDTO.memberId" : $('#memberid')[0].value,
				"personDTO.masterName" : $('#picname')[0].value,
				"personDTO.rprtype" : $('#rprtype')[0].value,
				"personDTO.rprkind" : $('#n')[0].value
			};
			$.ajax( {
				type : "post",
				url : "page/business/applysalvation/checkasp.action",
				data : arr,
				timeout : 20000,
				error : function() {
					alert('服务器错误');
				},
				async : false,
				dataType : 'json',
				success : function(json) {
					json = eval('(' + json + ')');
				}
			});
	}
</script>
</head>
<body >
<table align="center" width="99%" class="t1" border="0" cellpadding="0"
	cellspacing="0" style="margin:10px 10px 10px 10px;">
	<tr>
		<th scope="col">民政端：</th>
		<th scope="col">医保端：</th>
	</tr>
	<tr>
		<td>
			<table align="center" width="99%" class="t1" border="0" cellpadding="10"
				cellspacing="1" >
				<tr>
					<td width="40%" style="text-align:right">家庭编号：</td>
					<td><s:property value="checkDTO.familyno"/>&nbsp;</td>
				</tr>
				<tr>
					<td width="40%" style="text-align:right">姓名：</td>
					<td><s:property value="checkDTO.membername"/>&nbsp;</td>
				</tr>
				<tr>
					<td width="40%" style="text-align:right">身份证号码：</td>
					<td><s:property value="checkDTO.paperid"/>&nbsp;</td>
				</tr>
				<tr>
					<td width="40%" style="text-align:right">医保卡号:</td>
					<td><s:property value="checkDTO.ssn"/>&nbsp;</td>
				</tr>
				<tr>
					<td width="40%" style="text-align:right">救助状态</td>
					<td>
						<s:if test="checkDTO.assistType==00">
							普通居民
						</s:if>
						<s:elseif test="checkDTO.assistType==10||checkDTO.assistType==11">
							在保户
						</s:elseif>
						&nbsp;
					</td>
				</tr>
				<tr>
					<td width="40%" style="text-align:right">再保障状态</td>
					<td>
						<s:if test="checkDTO.asort==1">
							是
						</s:if>
						<s:else>
							否
						</s:else>
						&nbsp;
					</td>
				</tr>
			</table>
		</td>
		<td>
			<table align="center" width="99%" class="t1" border="0" cellpadding="10"
				cellspacing="1" >
				<tr>
					<td width="40%" colspan="2" style="text-align:center;color:red"><s:property value="ybcheckDTO.message"/>&nbsp;</td>
				</tr>
				<tr>
					<td width="40%" style="text-align:right">姓名：</td>
					<td><s:property value="ybcheckDTO.ybmembername"/>&nbsp;</td>
				</tr>
				<tr>
					<td width="40%" style="text-align:right">身份证号码：</td>
					<td><s:property value="ybcheckDTO.ybpaperid"/>&nbsp;</td>
				</tr>
				<tr>
					<td width="40%" style="text-align:right">医保卡号1:</td>
					<td><s:property value="ybcheckDTO.ssn1"/>&nbsp;</td>
				</tr>
				<tr>
					<td width="40%" style="text-align:right">医保卡号2:</td>
					<td><s:property value="ybcheckDTO.ssn2"/>&nbsp;</td>
				</tr>
				<tr>
					<td width="40%" style="text-align:right">医保卡号3:</td>
					<td><s:property value="ybcheckDTO.ssn3"/>&nbsp;</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
<div align="right">
	<input type="button" name="savessn" value="保存医保卡号"
			onClick="javascript: savessn();"/>&nbsp;&nbsp;
	<input type="button" name="Submit" value="关闭"
			onClick="javascript: window.close();"/>
</div>
</body>
</html>