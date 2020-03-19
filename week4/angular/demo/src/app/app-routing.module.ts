import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PokebadgeComponent } from './pokemon/pokebadge/pokebadge.component';
import { PokelistComponent } from './pokemon/pokelist/pokelist.component';


const routes: Routes = [
  {
    path: 'list',
    component: PokelistComponent
  },
  {
    path: 'badge',
    component: PokebadgeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
