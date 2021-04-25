import { Component, OnInit } from '@angular/core';
import { clientMock } from '../../mocks/mock-client';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  client = clientMock;

  constructor() { }

  ngOnInit(): void {
  }

}
