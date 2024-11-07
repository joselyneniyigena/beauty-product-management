import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { RouterOutlet } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';


@Component({
    selector: 'app-root',
    standalone: true,
    imports: [RouterOutlet, HttpClientModule],
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.scss']
})
export class AppComponent {

  title = 'Beauty Product Management';
  
    constructor(private router: Router) {}

    ngOnInit() {
      this.router.navigate(['home']); 
  }

    navigateTo(page: string) {
        this.router.navigate([page]);
    }
}
