import { Component, OnInit } from '@angular/core';
import { PokedexService } from '../pokedex.service';
import { Trainer } from '../trainer';
import { Pokemon } from '../pokemon';
import { map, switchMap } from 'rxjs/operators';

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

  sendPoke(): void {
    this.ps.getPoke(this.newPokeId).pipe(
      switchMap( (poke: any) => this.ps.getTrainer(this.TrainId).pipe(
        map( (t: Trainer) => ({t, poke}))
      ))
    ).pipe(
      switchMap( ({t, poke}) => this.ps.addPoke(new Pokemon(0, poke.id, poke.name, poke.base_experience, t)).pipe(
        map( allTrainers => ({t, poke, allTrainers}))
      ))
    ).subscribe( ({t, poke, allTrainers}) => {
      this.trainers = allTrainers;
    });
  }


  // sendPoke() {
  //   this.ps.getPoke(this.newPokeId).subscribe(
  //     (response: any) => {
  //       let pstring = JSON.stringify(response);
  //       let fullp = JSON.parse(pstring);
  //       if (fullp) {
  //         this.ps.getTrainer(this.TrainId).subscribe(
  //           (resp: Trainer) => {
  //             if (resp) {
  //               let p = new Pokemon(0, fullp.id, fullp.name, fullp.base_experience, resp);
  //               this.ps.addPoke(p).subscribe(
  //                 (res: Trainer[]) => {
  //                   this.trainers = res;
  //                 }
  //                 )
  //               }
  //             }
  //             )
  //           }
  //         }
  //         )
  //       }
      }
      
      
      
