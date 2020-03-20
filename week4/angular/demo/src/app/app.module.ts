import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PokebadgeComponent } from './pokemon/pokebadge/pokebadge.component';
import { PokelistComponent } from './pokemon/pokelist/pokelist.component';
import { FilterPipe } from './pipes/filter.pipe';
import { ParamRouteComponent } from './components/param-route/param-route.component';

@NgModule({
  declarations: [
    AppComponent,
    PokebadgeComponent,
    PokelistComponent,
    FilterPipe,
    ParamRouteComponent
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
