import { Component, OnInit, Input } from '@angular/core';
import { Client } from 'src/app/_models/client';

@Component({
  selector: 'app-banner',
  templateUrl: './banner.component.html',
  styleUrls: ['./banner.component.css']
})
export class BannerComponent implements OnInit {

  @Input() client: Client;

  constructor() { }

  ngOnInit(): void {
  }

}
