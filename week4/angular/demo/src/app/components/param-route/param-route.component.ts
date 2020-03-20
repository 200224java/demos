import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-param-route',
  templateUrl: './param-route.component.html',
  styleUrls: ['./param-route.component.css']
})
export class ParamRouteComponent implements OnInit {

  id: number;
  name: string;

  nextId: number = 0;
  nextName: string = '';

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {

    this.route.params.subscribe( (params) => {
      this.id = +params.id;
      this.name = params.name;
    });
  }

  navigate(id: number, name: string) {
    this.router.navigate(['/param', id, name]);

    // The below syntax is slightly off, but it is close
    // The above syntax is much cleaner
    // this.route.paramMap.pipe(
    //   switchMap( params => {
    //     this.id = id;
    //     this.name = name;
    //   })
    // )
  }
}
