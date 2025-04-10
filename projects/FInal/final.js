document.getElementById('myForm').addEventListener('submit', function(event) {
    event.preventDefault(); 

    const full = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const age = document.getElementById('age').value;

    if (!full || !email || !age) {
        alert("Please fill out all required fields.");
        return; 
    }

    const formData = {
        name: full,
        email: email,
        age: age
    };

    const xhr = new XMLHttpRequest();
    xhr.open("GET", "final.json", true);  
    xhr.setRequestHeader("Content-Type", "application/json"); 

    xhr.onload = function() {
        if (xhr.status === 200) {
            const response = JSON.parse(xhr.responseText); 
            document.getElementById("message").innerHTML = `<p>${response.message}</p>`; 
            document.getElementById('myForm').reset();
        } else {
            alert("An error occurred while submitting the form.");
        }
    };

    // Handle errors with the request
    xhr.onerror = function() {
        alert("There was an error submitting the form.");
    };

    // Send the form data as a JSON string in the request body
    xhr.send(JSON.stringify(formData));
});
