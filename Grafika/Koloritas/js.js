let gallery;
let n = 0;
fetch('./gallery.json').then(response => response.json()).then(data => {gallery = data}).then(() => change(0));
console.log(gallery);
function change(num) {
    console.log(n);
    n += num;
    if(n > gallery.length-1) {
        n = 0;
    } else if (n < 0) {
        n = gallery.length -1;
    }
    //create new elements
    let imgElem = document.createElement('img');
    imgElem.setAttribute('src', gallery[n][1]);
    imgElem.setAttribute('alt', gallery[n][0]);
    let palletElem = [];
    gallery[n][2].map((color, i) => {
        palletElem[i] = document.createElement('div');
        palletElem[i].style.backgroundColor = color;
        palletElem[i].innerHTML = gallery[n][3][i];
    });
    console.log('New elements created');
    //gets old elements
    let cont = document.getElementsByClassName('cont')[0];
    let img = document.getElementsByTagName('img')[0];
    let pallet = document.getElementsByClassName('pallet')[0];
    let title = document.getElementsByTagName('h1')[0];
    console.log("Got new elements");
    //removes elements
    cont.removeChild(img);
    pallet.innerHTML = '';
    title.innerHTML = gallery[n][0];
    console.log("old elements removed");
    //repopulates
    cont.insertBefore(imgElem, cont.childNodes[0]);
    palletElem.map(elem => pallet.appendChild(elem));
    console.log("document repopulaated with new elements");
    console.log(gallery);
 }