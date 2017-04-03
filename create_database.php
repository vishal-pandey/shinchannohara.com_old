<!DOCTYPE html>
<html>
<head>
	<title>create database</title>
</head>
<body>


	<?php 

		$host = "shinchannohara.com";
		$user = 'u889818432_nisha';	
		$pass = 'vishal';
		$dbname = 'u889818432_64742';

		$conn = mysqli_connect($host,$user,$pass,$dbname);

		if (! $conn) {
			die('could not connect'.mysql_error());		
		}

		echo 'succesfully connected';

		// $sql = 'CREATE DATABASE TEST';

		// $retval = mysql_query($sql, $conn);

		// if (! $retval) {
		// 	die('could not create database');
		// }

		// echo "database created succesfully";
	
		mysql_close($conn);

	?>	








</body>
</html>