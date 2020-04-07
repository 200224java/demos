import { Component, OnInit } from '@angular/core';
import { PokedexService } from '../pokedex.service';
import { Trainer } from '../trainer';

@Component({
  selector: 'app-pokedex',
  templateUrl: './pokedex.component.html',
  styleUrls: ['./pokedex.component.css']
})
export class PokedexComponent implements OnInit {

  newTrainer:number = 0;
  TrainId:number = 0;
  newPokeId:number = 0;
  trainers:Trainer[];

  constructor(private ps:PokedexService) { }

  ngOnInit(): void {
    this.getTrainers();
  }

  getTrainers(){
    this.ps.getAllTrainers().subscribe(
      (Response:Trainer[]) => {
        this.trainers=Response;
      }
    )
  }

}
