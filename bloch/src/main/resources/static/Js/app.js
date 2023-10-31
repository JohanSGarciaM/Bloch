


//Navigation
function sendToNameWindow(){
    window.location.href = "nameWindow.html";
}




//functions
function checkName(){
    if ((document.getElementById("inputName").value) === ""){
        alert("You have to insert a valid name");
    }else{
        alert("You are a don");
    }
}