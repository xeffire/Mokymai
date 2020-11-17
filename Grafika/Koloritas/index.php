<!DOCTYPE html>
<html>
    <head>
        <title>Koloritas</title>
        <link rel="stylesheet" href="css.css">
        <script src="./js.js"></script>
    </head>
    <body>
        <div class="cont">
            <img src="./img/Grass.jpg" alt="Grass">
            <div class="pallet">
                <div style="background: rgb(188,212,3);">
                <span>rgb(188,212,3)</span>
                </div>
                <div style="background: #183B02;">#183B02</div>
                <div style="background: #E4DE60;">#E4DE60</div>
                <div style="background: #1D1607;">#1D1607</div>
            </div>
        </div>
        <span class="left" onclick="change(-1)"><</span>
        <span class="right" onclick="change(1)">></span>
        <h1>Grass</h1>
        <?php 
      include ($_SERVER['DOCUMENT_ROOT'].'/gitTag.php'); 
      git(str_replace($_SERVER['DOCUMENT_ROOT'], "", __DIR__)); 
      ?>
    </body>
</html>