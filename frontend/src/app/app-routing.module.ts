import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './_pages/home/home.component';
import { LoginComponent } from './_pages/login/login.component';
import { PedidoComponent } from './_pages/pedido/pedido.component';
import { PerfilComponent } from './_pages/perfil/perfil.component';
import { SeuspedidosComponent } from './_pages/seuspedidos/seuspedidos.component';

const routes: Routes = [
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path: 'home', component: HomeComponent},
  {path: 'pedido', component: PedidoComponent},
  {path: 'seuspedidos', component: SeuspedidosComponent},
  {path: 'seuperfil', component: PerfilComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
