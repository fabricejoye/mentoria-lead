import { Component } from '@angular/core';
import { clientMock } from './mocks/mock-client';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend2';
  client = clientMock;
  logado = "0"

  ngOnInit(): void {
    if("logado" in localStorage){
      this.logado = localStorage.getItem("logado");
   } else {
    localStorage.setItem("logado", "0")
    this.logado = "0"
   }
  }

}
