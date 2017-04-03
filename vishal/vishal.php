
<?php
$servername = "shinchannohara.com.com";
$username = "u889818432_nisha";
$password = "vishal";

// Create connection
$conn = mysqli_connect($servername, $username, $password);

// Check connection
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}
echo "Connected successfully";
?>