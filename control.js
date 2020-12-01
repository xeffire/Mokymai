
function elemBuilder(obj) {
    let elem = document.createElement(obj.elem);
    for(key of Object.keys(obj)){
        if(key === 'elem'){continue};
        elem[key] = obj[key];
    }
    return elem;
}

function gitTag() {
    //objektai apibudinantys elementus
    let gitLink = {
        elem: "a",
        href: "https://github.com/xeffire/Mokymai/tree/master"+window.location.pathname,
        target: "_blank",
    }
    let gitDiv = {
        elem: "div",
        id: "phpFooter",
    }
    let gitImg = {
        elem: "img",
        id:'gitIcon',
        src:'/github-brands.svg',
        alt:'',
    }
    // building elements and nesting
    let resNode = elemBuilder(gitLink);
    resNode.appendChild(elemBuilder(gitDiv));
    resNode.firstElementChild.appendChild(elemBuilder(gitImg));
    resNode.firstElementChild.appendChild(document.createTextNode('Git nuoroda'))
    //returning elements branch
    return resNode;
}

function commentTag() {
    let feedbackDiv = {
        elem: "div",
        className: 'feedback nonactive'
    }
    let textarea = {
        elem: "textarea",
        name: "mess",
        id: "mess",
        placeholder:"Komentarai, pastabos, pasiūlymai, bet neprivaloma :)" 
    }
    let responseText = {
        elem: "p",
        className: "responseText"
    }
    let commentImg = {
        elem: "img",
        className: "comment",
        src: "/comment.svg",
        onclick: () => toggleActive(document.querySelector(".feedback")),
    } 
    let submitButton = {
        elem: "button",
        className: 'submit',
        onclick: () => feedbackSubmit(document.querySelector('.feedback')),
        innerHTML: 'Patvirtinti',
    }
    let thumbsUpButton = {
        elem: "img",
        className: "thumbsUpButton nonactive",
        src: "/up-arrow.svg",
        onclick: () => {toggleActive(document.querySelector(".thumbsUpButton")); toggle(document.querySelector(".thumbsUpButton"))}
    }
    let thumbsDownButton = {
        elem: "img",
        className: "thumbsDownButton nonactive",
        src: "/up-arrow.svg",
        onclick: () => {toggleActive(document.querySelector(".thumbsDownButton")); toggle(document.querySelector(".thumbsDownButton"))}
    }
        // building elements and nesting
        let resNode = elemBuilder(feedbackDiv);
        resNode.appendChild(elemBuilder(textarea));
        resNode.appendChild(elemBuilder(responseText));
        resNode.appendChild(elemBuilder(commentImg));
        resNode.appendChild(elemBuilder(submitButton));
        resNode.appendChild(elemBuilder(thumbsUpButton));
        resNode.appendChild(elemBuilder(thumbsDownButton));
        //returning elements branch
        return resNode;
}

function linkResources() {
    var head = document.getElementsByTagName("head")[0],
    cssLink = document.createElement("link");
    cssLink.href = "/gitTag.css";
    cssLink.rel = "stylesheet";
    jsComment = document.createElement("script");
    jsComment.src = "/comment.js";
    head.appendChild(cssLink);
    head.appendChild(jsComment);
}
function load() {
    document.body.appendChild(gitTag());
    document.body.appendChild(commentTag());
    linkResources();
}

document.addEventListener("DOMContentLoaded", load);
