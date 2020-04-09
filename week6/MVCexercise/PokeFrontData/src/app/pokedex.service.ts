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
    return this.http.get<Trainer[]>('http://localhost:8086/data/pokemon');
  }

  getTrainer(id:number){
    return this.http.get<Trainer>('http://localhost:8086/data/pokemon/'+id);
  }

  addTrainer(t:Trainer): Observable<Trainer[]> {
    let body: Trainer = t;
    return this.http.post<Trainer[]>('http://localhost:8086/data/pokemon', body);
  }

  getPoke(id:number): Observable<any> {
    return this.http.get<any>(('https://pokeapi.co/api/v2/pokemon/'+id+'/'))
  }

  addPoke(p:Pokemon): Observable<Trainer[]> {
    console.log(p);
    return this.http.put<Trainer[]>('http://localhost:8086/data/pokemon', p);
  }
}
