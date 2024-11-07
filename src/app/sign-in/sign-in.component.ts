import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-sign-in',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './sign-in.component.html',
  styleUrl: './sign-in.component.scss'
})
export class SignInComponent {
  username: string = '';
  password: string = '';

  constructor(private router: Router) {}
  
onSubmit() {
  if (this.username === 'admin' && this.password === 'admin') {
    localStorage.setItem('userToken', 'loggedIn');
    this.router.navigate(['/home']);
  } else {
    alert('Invalid credentials');
  }
}

}
