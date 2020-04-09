import { Pokemon } from './pokemon';

export class Trainer {
    public tId:number;
    public name:String;
    public party:Array<Pokemon>

    constructor(tId:number, name:String, party:Array<Pokemon>){
        this.tId=tId,
        this.name=name,
        this.party=party
    }
}
