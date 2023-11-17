document.getElementById('loginForm').addEventListener('submit', function(event) 
{
    event.preventDefault();
    
    const username = document.getElementById('username').value;

    const password = document.getElementById('password').value;
    
    if (username === 'demo' && password === 'password') 
    {
      alert('Login successful!');
    } else 
      {
      alert('Invalid credentials. Please try again.');
      }
  });
  