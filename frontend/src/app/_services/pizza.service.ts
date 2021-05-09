import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import { Injectable } from '@angular/core';

export interface PizzaFlavor {
  flavor: string;
  duration: number;
}

@Injectable({
  providedIn: 'root'
})
export class PizzaService {

  constructor(private _http: HttpClient) { }
  getPizzaFlavor(): Observable<PizzaFlavor> {
    return this._http.get<PizzaFlavor> ("http://localhost:8080/api/pizza");
  }
}
