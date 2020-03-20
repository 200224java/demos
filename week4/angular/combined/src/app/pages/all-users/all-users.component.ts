import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { Employee } from 'src/app/models/employee';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-all-users',
  templateUrl: './all-users.component.html',
  styleUrls: ['./all-users.component.css']
})
export class AllUsersComponent implements OnInit {

  employeesObs: Observable<Employee[]>;

  constructor(private us: UserService) { }

  ngOnInit(): void {
    this.employeesObs = this.us.findAll();
  }

}
