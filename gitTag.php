<?php function git($dir){
    echo (
        "<a href='https://github.com/xeffire/Mokymai/tree/master/$dir'target='_blank'><div id='phpFooter'><img id='gitIcon' src='/github-brands.svg' alt=''>Git nuoroda</div></a>"
    );
    echo ('<script>
        var head = document.getElementsByTagName("head")[0],
        cssLink = document.createElement("link");
        cssLink.href = "/gitTag.css";
        cssLink.rel = "stylesheet";
        head.appendChild(cssLink);
    </script>');
} ?>