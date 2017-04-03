<title>vishal</title>

<body>

<form action ="vishal.php" method = "post">

<input type="test" name = "file_name">	<br>
<textarea name="message" rows="35" cols="100">
</textarea>

<br>
<input type="submit">
</form>



<?php

$txt = "vishal is the great";

$myfile = fopen('textfile.txt' , 'w');


echo $_POST['message'];	

?>



</body>

<style>

textarea{
	color:black;
	background:yellow;
	border-color:black;	
	border-style:solid;
	border-width:10px;
	border-radius:10px;

}

body{
	