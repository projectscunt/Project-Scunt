<?php 
  header('Content-type: image/png');
  $f = fopen('wpe-avatar.png','r');
  $bytes[] = fread($f, filesize('thumb.php'));
  $l = count($bytes);
  for($i=0; $i<$l; $i++)
  {
    echo $bytes[$i];
  }

?>
