import { Trainer } from './trainer';

export class Pokemon {
    public pokeId:number;
    public pokedexId:number;
    public name:String;
    public baseXP:number;
    public trainer:Trainer

    constructor(pokeId:number, pokedexId:number, name:String, baseXP:number, trainer:Trainer) {
        this.pokeId = pokeId,
        this.pokedexId = pokedexId,
        this.name=name,
        this.baseXP=baseXP,
        this.trainer=trainer
    }
}
