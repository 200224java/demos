import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/models/pokemon';
import { PokeService } from '../poke.service';

@Component({
  selector: 'app-pokebadge',
  templateUrl: './pokebadge.component.html',
  styleUrls: ['./pokebadge.component.css']
})
export class PokebadgeComponent implements OnInit {

  id: number = 1;
  // name: string = "bulbasaur";
  // image: string = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png";

  pokemon: Pokemon;

  constructor(private ps: PokeService) { }

  ngOnInit(): void {

  }

  myFunc(): void {
    this.ps.getPokemon(this.id).subscribe( (poke: Pokemon) => {
      // this.name = poke.name;
      // this.image = poke.sprites.front_shiny;
      this.pokemon = poke;
    });
  }
}
