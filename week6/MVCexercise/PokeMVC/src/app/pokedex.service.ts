import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Trainer } from './trainer';

@Injectable({
  providedIn: 'root'
})
export class PokedexService {
  

  constructor(private http:  HttpClient) { }

  getAllTrainers() {
    return this.http.get<Trainer[]>('http://localhost:8080/PokeSpringMVCMaster/pokemon');
  }
}
