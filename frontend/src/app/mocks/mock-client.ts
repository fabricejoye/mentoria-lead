import { Client } from 'src/app/_models/client';

export const clientMock: Client = {
  id: 1,
  firstname: "João",
  lastname: "Victor",
  email: "joavictor@gmail.com",
  tel: "(85) 9 2222 4444",
  street: "Avenida Antonio Sales",
  streetNumber: 34,
  city: "Fortaleza",
  zipcode: "60135-460",
  district: "Dionisio Torres",
  hint: "Lado supermercado São Luiz",
  creationDate: new Date()
}
