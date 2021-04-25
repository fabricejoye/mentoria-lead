export class Client {
  // Temp para teste
  id: number;
  firstname: string;
  lastname: string;
  email: string;
  tel: string;
  street: string;
  streetNumber: number;
  city: string;
  zipcode: string;
  district: string;
  hint: string;
  creationDate: Date;
  order: number;
  logado: boolean;
  public constructor(id: number, firstname: string, lastname: string, email: string, tel: string, street: string, streetNumber: number, city: string, zipcode: string, district: string, creationDate: Date,  hint: string = "", order: number = 0, logado: boolean = false) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
  }
}
