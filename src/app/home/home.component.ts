import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { routes } from '../app.routes';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'] 
})
export class HomeComponent {
featuredProducts: any;
  constructor(private router: Router) {}

  logout() {
    localStorage.removeItem('userToken');
    this.router.navigate(['/sign-in']);

    this.router.resetConfig(routes);
  }
}

