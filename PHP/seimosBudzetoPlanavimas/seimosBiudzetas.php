<!DOCTYPE html>
<html lang="lt">
  <head>
      <link rel="stylesheet" href="./css/css.css">
    <meta charset="utf-8" />
    <title>Simpsonų šeimos biudžetas</title>
  </head>
  <body>
    <h1>Simpsonų šeimos biudžetas</h1>
    <table>
      <tr>
        <th>Nuotrauka</th>
        <th>Narys</th>
      </tr>
      <tr>
        <td><a href="./Islaidos.php?name=Homer"><img class="thumb" src="./images/homer.png" alt="Homer" /></a></td>
        <td><a href="./Islaidos.php?name=Homer">Homer</a></td>
      </tr>
      <tr>
        <td><a href="./Islaidos.php?name=Marge"><img class="thumb" src="./images/marge.png" alt="Marge" /></a></td>
        <td><a href="./Islaidos.php?name=Marge">Marge</a></td>
      </tr>
      <tr>
        <td><a href="./Islaidos.php?name=Bart"><img class="thumb" src="./images/bart.png" alt="Bart" /></a></td>
        <td><a href="./Islaidos.php?name=Bart">Bart</a></td>
      </tr>
      <tr>
        <td><a href="./Islaidos.php?name=Liza"><img class="thumb" src="./images/liza.png" alt="Liza" /></a></td>
        <td><a href="./Islaidos.php?name=Liza">Liza</a></td>
      </tr>
    </table>
    <?php 
      include ($_SERVER['DOCUMENT_ROOT'].'/gitTag.php'); 
      git(str_replace($_SERVER['DOCUMENT_ROOT'], "", __DIR__)); 
      ?>
  </body>
</html>
