import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-resources',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './resources.component.html',
  styleUrl: './resources.component.scss'
})
export class ResourcesComponent {
faqs= [
{ question: 'How do I place an order?', answer: 'To place an order, add products to your cart and proceed to checkout.' },
{ question: 'What is the return policy?', answer: 'You can return items within 30 days of purchase if they are unused and in their original packaging.' },
{ question: 'How can I track my order?', answer: 'You will receive an email with tracking information once your order ships.' }
];

}
