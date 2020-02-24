
function validate() {

	let elements = document.forms['regform'].elements;
	let fullname = elements['fullname'].value;
	let email = elements['email'].value;
	let mobile = elements['mobile'].value;
	let username = elements['username'].value;
	let password = elements['password'].value;
	let confirmpassword = elements['confirmpassword'].value;

	if (fullname == '' || fullname.length == 0) {
		document.getElementById('fullnameerror').innerHTML = 'Enter the fullname';
		return false;
	}
	if (email == '' || email.length == 0) {
		document.getElementById('emailerror').innerHTML = 'Enter the email';
		return false;
	}
	if (mobile == '' || mobile.length == 0) {
		document.getElementById('mobileerror').innerHTML = 'Enter the mobile number';
		return false;
	}
	if (username == '' || username.length == 0) {
		document.getElementById('usernameerror').innerHTML = 'Enter the username';
		return false;
	}
	if (password == '' || password.length == 0) {
		document.getElementById('passworderror').innerHTML = 'Enter the password';
		return false;
	}
	if (confirmpassword == '' || confirmpassword.length == 0) {
		document.getElementById('confirmpassworderror').innerHTML = 'Enter the fullname';
		return false;
	}
	return true;

}

function logInValidate(){
	let elements = document.forms['loginform'].elements;
	let email = elements['email'].value;
	let password=elements['password'].value;
	
	if(email=='' || email.length==0){
		document.getElementById('emailerror').innerHTML = 'Enter the email';
		return false;
	}
	if (password == '' || password.length == 0) {
		document.getElementById('passworderror').innerHTML = 'Enter the password';
		return false;
	}
	return true;
}




