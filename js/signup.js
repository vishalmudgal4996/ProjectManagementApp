var xhr = new XMLHttpRequest();

function signUpSubmit(firstName, lastName, email, password, mobile) {
  var params = {
    first_name: firstName.value,
    last_name: lastName.value,
    email_address: email.value,
    password: password.value,
    mobile_number: mobile.value,
  };

  //making ajax calls to send data to the server

  xhr.open("POST", "http://localhost:8080/api/v1/signup");
  xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  xhr.send(JSON.stringify(params));
  xhr.onreadystatechange = sendRequest;
}

function sendRequest() {
  console.log(xhr.readyState);
}
