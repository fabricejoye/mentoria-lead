import { Pizza } from "./pizza";
import { Pizza_extra } from "./pizza_extra";
import { Pizza_size } from "./pizza_size";

enum State { inicializado, finalizado, abandonado, cancelado, andamento};
enum Step { montar, personalizar, pedido}

export class Order {
  id: number;
  clientID: number;
  pizza: Pizza;
  pizza_size: Pizza_size;
  has_pizza_extra: boolean;
  pizza_extra: Pizza_extra[];
  state: State;
  step: Step;
  price: number;
  duration: number;
  creationDate: Date;
  finishedDate: Date;

  public constructor(id: number, clientID: number ) {
    this.has_pizza_extra = false;
    this.state = State.inicializado;
    this.step = Step.montar;
    this.price = 0;
    this.duration = 0;
    this.creationDate = new Date();
  }
}
