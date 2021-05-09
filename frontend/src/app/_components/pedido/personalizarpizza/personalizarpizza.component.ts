import { Component, Input, OnInit } from '@angular/core';
import { Order } from 'src/app/_models/order';

@Component({
  selector: 'app-personalizarpizza',
  templateUrl: './personalizarpizza.component.html',
  styleUrls: ['./personalizarpizza.component.css']
})
export class PersonalizarpizzaComponent implements OnInit {

  @Input() order: Order;

  constructor() { }

  ngOnInit(): void {
  }

}
