<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="css.css" />
    <link rel="preconnect" href="https://fonts.gstatic.com" />
    <link
      href="https://fonts.googleapis.com/css2?family=Lato:wght@700&display=swap"
      rel="stylesheet"
    />
    <script src="js.js"></script>
  </head>
  <body>
    <div>
        <button onClick="handleDisp('kontrastas')">Kontrastas</button>
        <button onClick="handleDisp('vibracija')">Vibracija</button>
        <button onClick="handleDisp('geras')">Geras skaitomumas</button>
        <button onClick="handleDisp('blogas')">Blogas skaitomumas</button>
        <button onClick="handleDisp('geras2')">Geras skaitomumas, analoginės spalvos</button>
        <button onClick="handleDisp('blogas2')">Blogas skaitomumas, analoginės spalvos</button>
    </div>
    <div>
      <div class="box">Vibrating</div>
      <div class="box">colors</div>
      <div class="box">makes</div>
      <div class="box">your</div>
      <div class="box">eyes</div>
      <div class="box">hurt</div>
    </div>
    <!-- gitTag -->
    <?php 
      include ($_SERVER['DOCUMENT_ROOT'].'/gitTag.php'); 
      git(str_replace($_SERVER['DOCUMENT_ROOT'], "", __DIR__)); 
      ?>
  </body>
</html>
