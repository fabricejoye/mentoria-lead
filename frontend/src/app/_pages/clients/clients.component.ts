import { Component, OnInit } from '@angular/core';
import { Client } from 'src/app/_models/client';
import { ClientService } from 'src/app/_services/client.service';

@Component({
  selector: 'app-clients',
  templateUrl: './clients.component.html',
  styleUrls: ['./clients.component.css']
})
export class ClientsComponent implements OnInit {

  clients: Client[];

  constructor(private clientService: ClientService) { }

  ngOnInit(): void {
    this.getAllClients();
  }

  getAllClients() {
    this.clientService.getClients().subscribe((res: any) => {
      console.log(res);
      this.clients = res;
    });
  }

  deleteClient(id) {
    this.clientService.deleteClient(id).subscribe((res: any) => {
      console.log(res);
      document.getElementById(id).remove();
    })
  }

}
