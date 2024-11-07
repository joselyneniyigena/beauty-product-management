import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logout',
  standalone: true,
  imports: [],
  template: '<p>You have been logged out. Redirecting to sign-in...</p>',
  styleUrl: './logout.component.scss'
})
export class LogoutComponent {
  constructor(private router: Router) {
    
    setTimeout(() => {
      this.router.navigate(['/signin']); 
    }, 1000); 
  }
}
