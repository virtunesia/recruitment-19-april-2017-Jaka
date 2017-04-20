<?php 
$host = mysql_connect("localhost","root","");
$db = mysql_select_db("test");
?>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
	
	<h3>Input data baru</h3>
	<form action="" method="post">		
		<table>
			<tr>
				<td>Request</td>
				<td><input type="text" name="request"></td>					
			</tr>	
			<tr>
				<td></td>
				<td><input type="submit" value="Simpan"></td>					
			</tr>
		</table>
	</form>
</body>
</html>
<?php 
if(isset($_POST['request'])){
$request= $_POST['request'];
mysql_query("INSERT INTO request (string) VALUES ('$request')");
echo "Data ".$request." Berhasil Disimpan";
}
?>