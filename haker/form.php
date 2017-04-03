<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method = "post">
	Enter the title of the page<input type="text" name="title"></input><br>
	Enter the heading of the page<input type="text" name="heading" id="heading"></input><br>
	Enter the question<br><textarea name="question" id="question" rows="30" cols="130"></textarea><br>
	Enter the  input<br><textarea name="input" id="input" rows="20" cols="130"></textarea><br>
	Enter the  output<br><textarea name="output" id="output" rows="20" cols="130"></textarea><br>
	Enter the constraints<br><textarea name="constraint" id="constraint" rows="10" cols="130"></textarea><br>
	Enter the sample input<br><textarea name="sample_input" id="sample_input" rows="10" cols="130"></textarea><br>
	Enter the sample output<br><textarea name="sample_output" id="sample_output" rows="10" cols="130"></textarea><br>
	Enter the solution<br><textarea name="solution" id="solution" rows="30" cols="130"></textarea><br>
	Enter the link<br><textarea name="link" id="link" rows="10" cols="130"></textarea><br>
	<input type="submit" value="submit"></input>



</form>








<?php
	

	$vtitle = $_POST['title'];
	$vheading = $_POST['heading'];
	$vquestion = $_POST['question'];
	$vinput = $_POST['input'];
	$voutput = $_POST['output'];
	$vconstraint= $_POST['constraint'];
	$vsample_input = $_POST['sample_input'];
	$vsample_output = $_POST['sample_output'];
	$vsolution = stripslashes(htmlspecialchars($_POST['solution']));
	$vlink = stripslashes($_POST['link']);


	$fquestion = fopen($vtitle."_question", 'w');
	$finput = fopen($vtitle."_input", 'w');
	$foutput  = fopen($vtitle."_output", 'w');
	$fconstraint = fopen($vtitle."_constraint", 'w');
	$fsample_input = fopen($vtitle."_sample_input", 'w');
	$fsample_output = fopen($vtitle."_sample_output", 'w');
	$fsolution = fopen($vtitle."_solution", 'w');
	$flink = fopen($vtitle."_link", 'w');
	$ffinal = fopen($vtitle.'.php','w');
	$fmenu = fopen('menu.txt', a);


	fwrite($fquestion, $vquestion);
	fwrite($finput, $vinput);
	fwrite($foutput, $voutput);
	fwrite($fconstraint, $vconstraint);
	fwrite($fsample_input, $vsample_input);
	fwrite($fsample_output, $vsample_output);
	fwrite($fsolution, $vsolution);
	fwrite($flink, $vlink);








	$final = "

 <!DOCTYPE html>
<html>
<head>

<meta name='description' content='programming problem from haker earth with solution' />

<meta name='robots' content='index,follow' />

<meta name='googlebot' content='index,follow	' />

<meta http-equiv='Content-Type' content='best site for programming solutions ; charset= Unicode/UTF-8 ' />

<meta charset=' Unicode/UTF-8 '>
<title>
".$vtitle."

</title>
<link rel='stylesheet' type='text/css' href='sample.css'>



</head>

<body>


<div id='header'>
<h1>
".$vheading."

</h1>
</div>


<div class='qlist'>

<a href='index.php'>List Of Questions</a>

</div>




<div id='ques'>

<?php

include $vtitle.'_question';


?>

<br><br>


<div id='input'>
<h2>Input format:</h2>


<?php

include $vtitle.'_input';


?>



</div>

<div id='output'>
<h2>Output format:</h2>

<?php

include $vtitle.'_output';


?>


</div>



<div id = 'constraints'>
<h2>Constraints:</h2>

<?php

include $vtitle.'_constraint';


?>




</div>

</div>

<br>
<br>

<div id='sampleinp'>
<h3 align='center'>sample input</h3>
<kbd>
<?php

include $vtitle.'_sample_input';


?>



</kbd>
</div>
<br>
<div id='sampleopt'>
<h3 align='center'>sample output</h3>
<samp>			

<?php

include $vtitle.'_sample_output';


?>


</samp>
	
</div>
<br>



<div id='solh'>

<h2>Solution</h2>
</div>
<div id='sol'>
<pre>
<code>

<?php

include $vtitle.'_solution';


?>



</code>
</pre>
</div>
<br>
<br>
<div id='link'>

<?php

include $vtitle.'_link';


?>


</div>





</body>

</html> 










	";

if(isset($_POST['title']))
{
fwrite($ffinal, $final);
}

$menu_item = "<tr> <td> <a href=$vtitle.php>$vtitle</a> </td> </tr>";

fwrite($fmenu, $menu_item);








?>




