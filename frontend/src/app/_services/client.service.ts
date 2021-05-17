import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Client } from '../_models/client';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  constructor(private http: HttpClient) { }

  createClient(client: Client) {
    const url = 'http://localhost:8080/api/client';
    return this.http.post(url, client);
  }

  getClients() {
    const url = "http://localhost:8080/api/client";
    return this.http.get(url);
  }

  deleteClient(id) {
    const url = "http://localhost:8080/api/client/" + id;
    return this.http.delete(url);
  }
}
