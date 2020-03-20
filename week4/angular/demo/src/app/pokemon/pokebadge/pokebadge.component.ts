import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/models/pokemon';
import { PokeService } from '../poke.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-pokebadge',
  templateUrl: './pokebadge.component.html',
  styleUrls: ['./pokebadge.component.css']
})
export class PokebadgeComponent implements OnInit {

  id: number = 59;
  name: string = "";

  pokemon: Pokemon;
  list: Pokemon[] = [];

  pStyle: any = {
    color: 'darkblue',
    backgroundColor: 'yellow'
  }

  constructor(private ps: PokeService) { }

  ngOnInit(): void {
    this.list.push(new Pokemon(1, "Bulbasaur", { front_default: "", front_shiny: ""}));
    this.list.push(new Pokemon(2, "Ivysaur", { front_default: "", front_shiny: ""}));
    this.list.push(new Pokemon(3, "Venusaur", { front_default: "", front_shiny: ""}));
    this.list.push(new Pokemon(4, "Charmander", { front_default: "", front_shiny: ""}));
    this.list.push(new Pokemon(5, "Charmeleon", { front_default: "", front_shiny: ""}));
    this.list.push(new Pokemon(6, "Charizard", { front_default: "", front_shiny: ""}));
  }

  myFunc(): void {
    this.ps.getPokemon(this.id).subscribe( (poke: Pokemon) => {
      this.pokemon = poke;
    });
  }

  myFunc2(): Observable<Pokemon> {
    return this.ps.getPokemon(this.id);
  }

  changeStyle(): void {
    if(this.pStyle.color === 'darkblue') {
      this.pStyle = {
        color: 'yellow',
        backgroundColor: 'darkblue'
      }
    } else {
      this.pStyle = {
        color: 'darkblue',
        backgroundColor: 'yellow'
      }
    }
  }
}
