document.getElementById('myForm').addEventListener('submit', function(event) {
    event.preventDefault(); 
    const full = document.getElementById('name').value;  
    const email = document.getElementById('email').value;
    const age = document.getElementById('age').value;

    if (!full || !email) {
        alert("Please provide your correct personal information");
        return;
    }

    if (!age || age < 18) {
        alert("You must be 18 years or older to register and submit this form.");
        return;
    }

    const data = {
        fullName: full,
        email: email,
        age: age
    }

    const xhr = new XMLHttpRequest();
    xhr.open("POST", "forms.json", true); 
    xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            const response = JSON.parse(xhr.responseText);
            document.getElementById("message").innerHTML = response.message;
            document.getElementById('myForm').innerHTML = "";
        } else if (xhr.readyState === 4) {
            alert("Error submitting form. Please try again.");
        }
    };
    xhr.send(JSON.stringify(data));
    console.log(data);
});