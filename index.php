<?php?>
<!DOCTYPE html>
<html lang="lt">
  <head>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="css.css" />
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
        </ol>
      </div>
      <div class="box">
        <h2>CSS</h2>
        <ol>
          <li><a href="./Web dev/CSS Įvadas/index.html">CSS įvadas</a></li>
        </ol>
      </div>
    </div>
      <!-- <span class="phpFooter"
        ><a
          href="https://github.com/xeffire/Mokymai/<?php __DIR__?>"
          target="_blank"
          >Git nuodora >>></a
        ></span
      > -->
      <?php 
      include 'gitTag.php'; 
      git($variable = substr(__DIR__, strpos(__DIR__, "Mokymai") + 7, strlen(__DIR__))); 
      ?>
  </body>
</html>
