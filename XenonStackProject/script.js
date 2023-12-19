function validateForm(event) {
    event.preventDefault();
    
    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;
    const errorElement = document.getElementById('error');
    
    if (password !== confirmPassword) {
      errorElement.textContent = 'Passwords do not match';
    } else {
      errorElement.textContent = '';
      // Here you can add code to submit the form or perform further actions
      console.log('Username:', username);
      console.log('Email:', email);
      console.log('Password:', password);
      // Add your logic here, like sending form data to a server using AJAX/fetch
    }
  }

  function goToPage() {
    window.location.href = 'login.html';
  }