import { Pipe, PipeTransform } from '@angular/core';
import { Pokemon } from '../models/pokemon';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(value: Pokemon[], name: string, ...args: any[]): Pokemon[] {
    return value.filter( (p) => {
      return p.name.toLowerCase()
        .includes(name.toLowerCase());
    });
  }
}
