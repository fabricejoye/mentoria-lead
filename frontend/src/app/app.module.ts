import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { BannerComponent } from './_components/banner/banner.component';
import { LoginComponent } from './_pages/login/login.component';
import { HomeComponent } from './_pages/home/home.component';
import { DiscountComponent } from './_components/discount/discount.component';
import { HomecontentComponent } from './_components/homecontent/homecontent.component';
import { PedidoComponent } from './_pages/pedido/pedido.component';
import { MontarpizzaComponent } from './_components/pedido/montarpizza/montarpizza.component';
import { PersonalizarpizzaComponent } from './_components/pedido/personalizarpizza/personalizarpizza.component';
import { SeuspedidosComponent } from './_pages/seuspedidos/seuspedidos.component';
import { PerfilComponent } from './_pages/perfil/perfil.component';
import { CartComponent } from './_components/cart/cart.component';
import { RegisterClientComponent } from './_pages/register-client/register-client.component';
import { ClientsComponent } from './_pages/clients/clients.component';

@NgModule({
  declarations: [
    AppComponent,
    BannerComponent,
    LoginComponent,
    HomeComponent,
    DiscountComponent,
    HomecontentComponent,
    PedidoComponent,
    MontarpizzaComponent,
    PersonalizarpizzaComponent,
    SeuspedidosComponent,
    PerfilComponent,
    CartComponent,
    RegisterClientComponent,
    ClientsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
