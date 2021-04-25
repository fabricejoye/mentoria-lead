import { Component, OnInit } from '@angular/core';
import { PIZZAS } from '../../../mocks/mock_pizzas';
import { PIZZAS_SIZE } from '../../../mocks/mock_pizza_size';

@Component({
  selector: 'app-montarpizza',
  templateUrl: './montarpizza.component.html',
  styleUrls: ['./montarpizza.component.css']
})
export class MontarpizzaComponent implements OnInit {

  pizzas = PIZZAS;

  pizzaFoto = {"1": "calabresa.png", "2": "marguerita.png", "3": "portuguesa.png"};

  pizza_size = PIZZAS_SIZE;

  pizzaSizeImg = {"1": "pizza-p.png", "2": "pizza-m.png", "3": "pizza-g.png"};

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
