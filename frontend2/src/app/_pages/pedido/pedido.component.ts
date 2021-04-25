import { Component, OnInit } from '@angular/core';
import { clientMock } from '../../mocks/mock-client';
import { PIZZAS } from '../../mocks/mock_pizzas';
import { PIZZAS_EXTRA } from '../../mocks/mock_pizza_extra';
import { PIZZAS_SIZE } from '../../mocks/mock_pizza_size';
import { Order } from 'src/app/_models/order';


@Component({
  selector: 'app-pedido',
  templateUrl: './pedido.component.html',
  styleUrls: ['./pedido.component.css']
})
export class PedidoComponent implements OnInit {

  client = clientMock;
  pizzas = PIZZAS;
  pizzas_extra = PIZZAS_EXTRA;
  pizzas_size = PIZZAS_SIZE;
  client_order = new Order(1, this.client.id);

  constructor() { }

  ngOnInit(): void {
  }

}
