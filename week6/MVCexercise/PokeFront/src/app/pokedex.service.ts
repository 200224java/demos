import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Trainer } from './trainer';
import { Observable } from 'rxjs';
import { Pokemon } from './pokemon';

@Injectable({
  providedIn: 'root'
})
export class PokedexService {
  

  constructor(private http:  HttpClient) { }

  getAllTrainers() {
  //  TODO
  }

  getTrainer(id:number){
    // TODO
  }

  addTrainer(t:Trainer): Observable<Trainer[]> {
    // TODO
  }

  getPoke(id:number): Observable<any> {
    //TODO - Goes to PokeAPI
  }

  addPoke(p:Pokemon): Observable<Trainer[]> {
    //TODO
  }
}
