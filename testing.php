<!DOCTYPE html>
<html>
<head>
	<title>vishal</title>
</head>
<body>

<form action="testing.php" method="post" enctype="multipart/form-data">
	<select name="cars">
		<?php

		$dire= getcwd();

		$dir = scandir($dire);



		for ($i=0; $i < 50; $i++) { 

			if (is_dir($dir[$i])) {
	
			echo "<option value = '".$dir[$i]."'>".$dir[$i]."</option>";
			}
		}
		?>
	</select>

	<!-- <input type="submit"></input> -->

	<?php

	

	$dire = getcwd()."/".$_POST['cars'];
	$dir = scandir($dire);

	echo "The content  of the directory are";

	for ($i=0; $i < 50; $i++) 
	{ 

		if (is_dir($dir[$i])) 
		{
	
			echo "$dir[$i]"."<br>";
		}
	}



	?>









	Upload file <br><input type="file" name="fileto" id="fileto"></input>
<br><br>
	Or create drectory
<br>
	Enter the name of directory
	<input type="text" name="dir"></input>
	<input type="submit" value="submit" >
</form>
<?php

chdir($dire);


mkdir($_POST['dir']);

// $dire= getcwd();

// $dir = scandir($dire);

// print_r($dir);

?>

<?php
$target_dir = getcwd()."/";
$target_file = $target_dir . basename($_FILES["fileto"]["name"]);
$uploadOk = 1;

    if (move_uploaded_file($_FILES["fileto"]["tmp_name"], $target_file)) 
    {
        echo "The file ". basename( $_FILES["fileto"]["name"]). " has been uploaded.";
    }

echo $_POST['cars'];
?> 
</body>
</html>




