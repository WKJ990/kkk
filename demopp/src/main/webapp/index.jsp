<%@ page  contentType="text/html; charset=utf-8" %>
<html>
<body>
<h2>Hello</h2>
<a href="/demopp/list.sw">....</a>
<table id="emplist">
<thead>
<tr><td>ID</td><td>部门</td><td>姓名</td><td>时间</td></tr>
</thead>
<tbody></tbody>
</table>
</body>
<script type="text/javascript" src="/demopp/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
        $.getJSON('/demopp/list.sw',{},function(data){
        	console.log(data);
        	for(var i=0;i<data.length;i++){
        		var emp = data[i];
        	$('<tr></tr>')
        	.append($('<td></td>').html(emp.eid))
        	.append($('<td></td>').html(emp.dept.dname))
        	.append($('<td></td>').html(emp.ename))
        	.append($('<td></td>').html(emp.joindate))
        	.appendTo('#emplist tbody');
        	};
        });
</script>
</html>
