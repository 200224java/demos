


function sendData() {
  let form = document.getElementsByTagName("form")[0];

  let usernameElement = document.getElementsByName("username")[0];
  let passwordElement = document.getElementsByName("password")[0];
  let url = "http://localhost:8080/ServletIntro/login";

  let data = {
    username: usernameElement.value,
    password: passwordElement.value,
  };

  let xhr = new XMLHttpRequest();

  xhr.onreadystatechange = function() {
	  if(this.readyState == 4 && this.status == 200) {
		  let employee = JSON.parse(this.responseText);
		  console.log(employee);
		  sessionStorage.setItem("currentUser", this.responseText);
		  window.location = "http://localhost:8080/ServletIntro/profile.html";
		  // This is what you do to set a value into the client-side session
	  }
  }
  xhr.open("POST", url);
  xhr.send(JSON.stringify(data));
}
