export class Pokemon {
  id: number;
  name: string;
  sprites:{
      front_default: string,
      front_shiny: string
  }

  constructor(id, name, sprites) {
    this.id = id;
    this.name = name;
    this.sprites = sprites;
  }
}
