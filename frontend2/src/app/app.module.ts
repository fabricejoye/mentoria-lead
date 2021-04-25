import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BannerComponent } from './_components/banner/banner.component';
import { LoginComponent } from './_pages/login/login.component';
import { HomeComponent } from './_pages/home/home.component';
import { DiscountComponent } from './_components/discount/discount.component';
import { HomecontentComponent } from './_components/homecontent/homecontent.component';
import { PedidoComponent } from './_pages/pedido/pedido.component';
import { MontarpizzaComponent } from './_components/pedido/montarpizza/montarpizza.component';
import { PersonalizarpizzaComponent } from './_components/pedido/personalizarpizza/personalizarpizza.component';

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
    PersonalizarpizzaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
