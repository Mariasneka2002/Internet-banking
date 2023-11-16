document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the default form submission
    
    // Fetch the username and password values
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    
    // For demo purposes, you might check the credentials here
    // In a real project, this should be handled on the server-side securely
    
    // Example: Check if username is 'demo' and password is 'password'
    if (username === 'demo' && password === 'password') {
      alert('Login successful!');
      // Redirect to dashboard or perform other actions here
    } else {
      alert('Invalid credentials. Please try again.');
    }
  });
  