console.log(x);

function setcookie(){
    document.cookie = "username=root"
}

function getCookie(){
    let x = document.cookie;
}



function checkCookie(){
    let username = getCookie("username");
    if(username != "") alert("not empty")
}