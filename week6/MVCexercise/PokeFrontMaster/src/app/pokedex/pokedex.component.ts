import { Component, OnInit } from '@angular/core';
import { PokedexService } from '../pokedex.service';
import { Trainer } from '../trainer';
import { Pokemon } from '../pokemon';

@Component({
  selector: 'app-pokedex',
  templateUrl: './pokedex.component.html',
  styleUrls: ['./pokedex.component.css']
})
export class PokedexComponent implements OnInit {

  newTrainer: string;
  TrainId: number;
  newPokeId: number;
  trainers: Trainer[];

  constructor(private ps: PokedexService) { }

  ngOnInit(): void {
    this.getTrainers();
  }

  getTrainers() {
    this.ps.getAllTrainers().subscribe(
      (response: Trainer[]) => {
        this.trainers = response;
      }
    )
  }

  sendTrainer() {
    let t = new Trainer(0, this.newTrainer, null)
    this.ps.addTrainer(t).subscribe(
      (response: Trainer[]) => {
        this.trainers = response;
      }
    )
  }

  sendPoke() {
    this.ps.getPoke(this.newPokeId).subscribe(
      (response: any) => {
        let pstring = JSON.stringify(response);
        let fullp = JSON.parse(pstring);
        if (fullp) {
          console.log(fullp);
          this.ps.getTrainer(this.TrainId).subscribe(
            (resp: Trainer) => {
              if (resp) {
                console.log(resp);
                let p = new Pokemon(0, fullp.id, fullp.name, fullp.base_experience, resp);
                console.log(p);
                this.ps.addPoke(p).subscribe(
                  (res: Trainer[]) => {
                    this.trainers = res;
                  }
                )
              }
            }
          )
        }
      }
    )
  }
}
