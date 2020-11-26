<?php function git($dir){
    echo "<a href='https://github.com/xeffire/Mokymai/tree/master/$dir'target='_blank'><div id='phpFooter'><img id='gitIcon' src='/github-brands.svg' alt=''>Git nuoroda</div></a>
    <div class='feedback nonactive'>
      <textarea
        name='mess'
        id='mess'
        placeholder='Komentarai, pastabos, pasiūlymai, bet neprivaloma :)'
      ></textarea>
      <p class='responseText'></p>
      <img
        onClick='toggleActive(this.parentElement);'
        class='comment'
        src='/comment.svg'
        alt=''
      /><button class='submit' onClick='feedbackSubmit(this.parentElement)'>
        Patvirtinti</button
      ><img
        onClick='toggleActive(this); toggle(this)'
        class='thumbsUpButton nonactive'
        src='/up-arrow.svg'
        alt=''
      /><img
        onClick='toggleActive(this); toggle(this)'
        class='thumbsDownButton nonactive'
        src='/up-arrow.svg'
        alt=''
      /></div>";
    echo ('<script>
        var head = document.getElementsByTagName("head")[0],
        cssLink = document.createElement("link");
        cssLink.href = "/gitTag.css";
        cssLink.rel = "stylesheet";
        jsComment = document.createElement("script");
        jsComment.src = "/comment.js";
        head.appendChild(cssLink);
        head.appendChild(jsComment);
    </script>');
} ?>