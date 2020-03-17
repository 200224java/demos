let form = document.getElementsByTagName("form")[0];

let usernameElement = form.getElementsByName("username")[0];
let passwordElement = form.getElementsByName("password")[0];


function sendData() {
  let url = "localhost:8080/ServletIntro/login";

  let data = {
    username: usernameElement.value,
    password: passwordElement.value,
  };

  let xhr = new XMLHttpRequest();
  
  xhr.onreadystatechange = function() {
	  if(this.readyState == 4 && this.status == 200) {
		  let employee = JSON.parse(this.responseText);
		  console.log(employee);
	  }
  }
  xhr.open("POST", url);
  xhr.send(JSON.stringify(data));
}
