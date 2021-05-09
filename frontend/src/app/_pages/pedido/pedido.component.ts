import { Component, OnInit } from '@angular/core';
import { clientMock } from '../../mocks/mock-client';
import { PIZZAS } from '../../mocks/mock_pizzas';
import { PIZZAS_EXTRA } from '../../mocks/mock_pizza_extra';
import { PIZZAS_SIZE } from '../../mocks/mock_pizza_size';
import { Order } from 'src/app/_models/order';
import { PizzaFlavor, PizzaService } from 'src/app/_services/pizza.service';


@Component({
  selector: 'app-pedido',
  templateUrl: './pedido.component.html',
  styleUrls: ['./pedido.component.css'],
  providers: [PizzaService]
})
export class PedidoComponent implements OnInit {

  client = clientMock;
  pizzas = PIZZAS;
  pizzas_extra = PIZZAS_EXTRA;
  pizzas_size = PIZZAS_SIZE;
  client_order = new Order(1, this.client.id);

  stepOrder: number;

  // Receive pizza and pizza_size from montarpizza
  addItem(newItem: string) {
    newItem.split("-");
    this.client_order.pizza = PIZZAS[parseInt(newItem[0], 10)-1];
    this.client_order.pizza_size = PIZZAS_SIZE[parseInt(newItem[2], 10)-1];
    this.stepOrder = 2;
    this.client_order.price = this.client_order.pizza_size.price;
    this.client_order.duration = this.client_order.pizza.duration + this.client_order.pizza_size.duration;
  }

  constructor(private _pizzaService: PizzaService) {
    this._pizzaService.getPizzaFlavor()
        .subscribe(data => console.log(data));
  }

  ngOnInit(): void {

    //populate template with data

    this.stepOrder = 1;
  }

}
