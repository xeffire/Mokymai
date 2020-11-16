let myWindow = window.open("https://www.google.com");
console.log("Opened google");
let n = 590256; 
loop(n);
console.log("Loop started");

function loop(m) {
    setTimeout(() => del(m), 10000);
    console.log("Timeout set");
}



function del(j){
    myWindow.close();
    console.log("Window closed");
    myWindow = window.open(`http://www.mobili.lt/lt/forumas/mobilieji_telefonai/asus/asus_nexus_7.html?trinti=`+j);
    console.log("delete window opened: " + j);
    n++;
    if(n < 590900){
    loop(n)
    console.log("Restarting loop");
    }
}