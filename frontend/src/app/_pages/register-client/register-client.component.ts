import { Component, OnInit } from '@angular/core';
import { Client } from 'src/app/_models/client';
import { ClientService } from 'src/app/_services/client.service';

@Component({
  selector: 'app-register-client',
  templateUrl: './register-client.component.html',
  styleUrls: ['./register-client.component.css'],
})
export class RegisterClientComponent implements OnInit {
  client: Client;

  today = new Date();

  constructor(private clientService: ClientService) {}

  isUsuarioCadastrado: boolean = false;

  ngOnInit(): void {
    this.initClient();
  }

  initClient() {
    this.client = new Client();
  }

  // click button cadastrar
  registerClient() {
    this.clientService.createClient(this.client).subscribe((res) => {
      console.table(res);
      this.isUsuarioCadastrado = true;
      // Vai limpar o formulário (nova instancia de client)
      this.client = new Client();
      //setTimeout(function(){ document.getElementById("isUsuarioCadastrado") }, 3000);
    });
  }
}
