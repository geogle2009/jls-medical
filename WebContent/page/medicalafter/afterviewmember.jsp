<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" href="../css/table-style.css" type="text/css"></link>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>医后报销审批信息</title>
</head>
<script type="text/javascript">
	function apply(m1,m2){
		var url="afterapplyinit.action?baseInfoDTO.memberId="+m1+"&baseInfoDTO.ds="+m2;
		var f="dialogWidth=950px;dialogHeight=440px;status=no;help=no;scroll=auto";
		window.showModalDialog(url,window,f);
	}
</script>
<body style="padding:35px  35px  35px   35px;">

<table align="center" width="100%" class="t1" border="0" cellpadding="0"
	cellspacing="0">
<caption style="font-size: 12px">人员信息</caption>
	<tr>
		<th width="90">家庭编号</th>
		<th width="90">姓名</th>
		<th width="90">身份证号码</th>
		<th width="90">与户主关系</th>
		<th width="90">来源</th>
		<th width="90">当前人员状态</th>
		<th width="120">身份类别</th>
		<th width="200">操作</th>
	</tr>
	<s:iterator value="baseinfos">
	<tr>
		<td width="90"><s:property value="familyno"/></td>
		<td width="90"><s:property value="membername"/></td>
		<td width="90"><s:property value="paperid"/></td>
		<td width="90"><s:property value="relmaster"/></td>
		<td width="90">
			<s:if test="ds==1">城市</s:if>
			<s:elseif test="ds==2">农村</s:elseif>
		</td>
		<td width="90"><s:property value="personstate"/></td>
		<td width="120">
			<s:if test="assistType==11||assistType==10">在保户</s:if>
			<s:else>停保户</s:else>
			<s:if test="asort==1">; 再保障</s:if>
		</td>
		<td width="200">
		<button type="button" onclick="apply('<s:property value="memberId"/>','<s:property value="ds"/>')">添加业务</button>
		</td>
	</tr>
	</s:iterator>
</table>
<br>
<br>
<table align="center" width="100%" class="t1" border="0" cellpadding="0"
	cellspacing="0">
	<caption style="font-size: 12px">业务信息</caption>
	<tr>
		<th>姓名</th>
		<th>业务类别</th>
		<th>救助时间</th>
		<th>总费用（元）</th>
		<th>统筹费用（元）</th>
		<th>目录外费用（元）</th>
		<th>大病保险金额（元）</th>
		<th>商业保险金额（元）</th>
		<th>救助金额（元）</th>
		<th>保险类型</th>
		<th>审批状态</th>
	</tr>
	<s:iterator value="medicalafterbizs">
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</s:iterator>
</table>
<p align="center" style="color: red"><s:property value="result" /></p>
</body>
</html>