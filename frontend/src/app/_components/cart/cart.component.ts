import { Component, Input, OnInit } from '@angular/core';
import { Order } from 'src/app/_models/order';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  @Input() order: Order;

  constructor() { }

  ngOnInit(): void {
  }

}
