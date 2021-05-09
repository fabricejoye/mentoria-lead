import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';
import { Pizza } from '../../../_models/pizza';
import { Pizza_size } from '../../../_models/pizza_size';

@Component({
  selector: 'app-montarpizza',
  templateUrl: './montarpizza.component.html',
  styleUrls: ['./montarpizza.component.css']
})
export class MontarpizzaComponent implements OnInit {

  @Input() pizzas: Pizza;
  @Input() pizzaSizes: Pizza_size;

  pizzaSizeId: number;
  pizzaId: number;
  value: string;

  // Send pizza e pizza_size to pedido
  @Output() newItemEvent = new EventEmitter();

  addNewPizza() {
    this.value = this.pizzaId + "-" + this.pizzaSizeId;
    this.newItemEvent.emit(this.value);
  }

  pizzaSizeCheck(id) {
    this.pizzaSizeId = id;
  }

  pizzaCheck(id) {
    this.pizzaId = id;
  }

  constructor() { }

  ngOnInit(): void {

  }

  ngAfterViewInit(): void {
    // Hide time if time = 0
    document.querySelectorAll(".tempo").forEach((item) => {
      let n = item.textContent.search(" 0 ");
      if (n > -1)
      {
        item.classList.add("d-none")};
    })
  }

}
