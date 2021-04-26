import { Component, OnInit } from '@angular/core';
import { clientMock } from '../../mocks/mock-client';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  client = clientMock;

  constructor() { }

  ngOnInit(): void {

  }

  logOn(): void {
    //localStorage.setItem("logado", JSON.stringify(dados))
    localStorage.setItem("logado", "1");
  }

}
