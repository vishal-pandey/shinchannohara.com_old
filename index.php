<head>
<title>Shinchan Nohara</title>
																								
<link rel="stylesheet" type="text/css" href="navigation.css">
<link rel="stylesheet" type="text/css" href="shin.css">
<link rel="stylesheet" type="text/css" href="comments.css">
<link rel="stylesheet" type="text/css" href="w3.css">

</head>
					

<body>

	<div class="main_page">
		
		<div id="header">
			<div class="box">
				<h1><a href="http://shinchannohara.com">Shinchan Nohara </a></h1>
			</div>
		</div> 
		





		<div class="menu">
			<ul class="two">

				<?php

					include 'mennu.txt';

				?>
	        </ul>
		</div>





		<div id="section">
			<img src="shinchan.jpg" width="800px" height="400px">
				<!-- <iframe width="420" height="315" src="https://www.youtube.com/embed/X9R029JAI2Q" frameborder="0" allowfullscreen></iframe> -->
				<!-- <iframe width="420" height="315" src="https://www.youtube.com/embed/OtO-muBtPw8" frameborder="0" allowfullscreen></iframe> -->
		</div>	



		<div class="goo">
					
								<!-- Place this tag where you want the widget to render. -->
					<div class="g-person" data-width="180" data-href="//plus.google.com/u/0/109712308677416674874" data-theme="dark" data-rel="author"></div>

					<!-- Place this tag after the last widget tag. -->
					<script type="text/javascript">
				  		(function() {
				    	var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
				   		 po.src = 'https://apis.google.com/js/platform.js';
				    	var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
				  		})();
					</script>

				</div>




		<div id="comment" class="comment">
			

			<div class="heading">
				Comments
			</div>

			<?php include 'name.txt';  ?>
				








			<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method = "post">
				Name:<input type="text" name="name" id="name"></input><br>
				Your comment:<br><textarea rows="10" cols="40" name="your_comment" id="your_comment"></textarea>
				<br><input type="submit" value="submit" onClick="location.reload()"></input><br>

				<!-- START OF HIT COUNTER CODE --><br><script language="JavaScript" src="http://www.counter160.com/js.js?img=15"></script><br><a href="https://www.000webhost.com"><img src="http://www.counter160.com/images/15/left.png" alt="Free web hosting" border="0" align="texttop"></a><a href="http://www.hosting24.com"><img alt="Web hosting" src="http://www.counter160.com/images/15/right.png" border="0" align="texttop"></a><!-- END OF HIT COUNTER CODE -->



		<?php

			


			$towrite = "<div id='sample_comment' class='sample_comment'>
				<div id='sample_name' class='sample_name'>
					".$_POST['name']."
				</div>

				<div id='test_comment' class='test_comment'>
					".$_POST['your_comment']."
				</div>

			</div>
			<br>
			";

			// $towrite = "<div id='sample_comment' class='sample_comment'><div id='sample_name' class='sample_name'>".$_POST['name']."</div>";









			if(isset($_POST['name'])){

			$name = fopen('name.txt', 'a');
			fwrite($name ,  $towrite);

			}


		  ?>









		  <br>




			
		</div>

		<div id="footer">
			&copy; This site is created by Vishal Pandey
		</div>











		
	</div>
</body>
    

    <style type="text/css">
    div.site{

    }





    </style>