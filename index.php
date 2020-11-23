<!DOCTYPE html>
<html lang="lt">
  <head>
    <!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=G-TTPDDPY2VX"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'G-TTPDDPY2VX');
</script>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="css.css" />
    <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
    <title>Praktiniai darbai</title>
  </head>
  <body>
    <main> 
      <h1>Praktiniai darbai</h1>
      <div class="box">
        <h2>PHP Objektinis programavimas</h2>
        <ol>
          <li><a href="./PHP/Forma/forma.php">Forma</a></li>
          <li>
            <a href="./PHP/seimosBudzetoPlanavimas/seimosBiudzetas.php"
              >Šeimos biudžetas</a
            >
          </li>
          <li><a href="./PHP/Pastas/index.php">Paštas</a></li>
        </ol>
      </div>
      <div class="box">
        <h2>CSS</h2>
        <ol>
          <li><a href="./WebDev/CSSPirmas/index.php">CSS įvadas</a></li>
          <li><a href="./WebDev/CSSTrecias/index.php">CSS Positions</a></li>
        </ol>
      </div>
      <div class="box">
        <h2>Grafinis dizainas</h2>
        <ol>
          <li><a href="./Grafika/Koloritas/index.php">Koloritas</a></li>
          <li><a href="./Grafika/SpalvosSkaitomumas/index.php">Spalvos skaitomumas</a></li>
        </ol>
      </div>
    </div>
      <?php 
      include ($_SERVER['DOCUMENT_ROOT'].'/gitTag.php'); 
      git(str_replace($_SERVER['DOCUMENT_ROOT'], "", __DIR__)); 
      ?>
  </body>
</html>
