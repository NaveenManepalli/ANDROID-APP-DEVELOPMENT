document.addEventListener('deviceready', onDeviceReady, false); 
function onDeviceReady() { 
document.getElementById('resetBtn').addEventListener('click', function() { 
document.getElementById('username').value = ''; 
document.getElementById('password').value = ''; 
}); 
document.getElementById('submitBtn').addEventListener('click', function() { 
var username = document.getElementById('username').value; 
var password = document.getElementById('password').value; 
// Implement your login logic here 
console.log('Username: ' + username); 
console.log('Password: ' + password); 
}); 
} 
