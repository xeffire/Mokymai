<?php function git($dir){
    echo (
        "<span class='phpFooter'><a href='https://github.com/xeffire/Mokymai/$dir'target='_blank'>Git nuodora >>></a></span>"
    );
    echo ('<script>console.log("OK");
    var head = document.getElementsByTagName("head")[0],
    cssLink = document.createElement("link");

cssLink.href = "/gitTag.css";
cssLink.rel = "stylesheet";

head.appendChild(cssLink); </script>');
} ?>