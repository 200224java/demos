import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PokebadgeComponent } from './pokemon/pokebadge/pokebadge.component';
import { PokelistComponent } from './pokemon/pokelist/pokelist.component';
import { ParamRouteComponent } from './components/param-route/param-route.component';
import { AppComponent } from './app.component';


const routes: Routes = [
  {
    path: 'list',
    component: PokelistComponent
  },
  {
    path: 'badge',
    component: PokebadgeComponent
  },
  {
    path: 'param/:id/:name',
    component: ParamRouteComponent
  },
  {
    path: '',
    component: PokebadgeComponent
  },
  {
    path: '**',
    pathMatch: 'full',
    redirectTo: 'list'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
