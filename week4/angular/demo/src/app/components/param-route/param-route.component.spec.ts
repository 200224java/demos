import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParamRouteComponent } from './param-route.component';

describe('ParamRouteComponent', () => {
  let component: ParamRouteComponent;
  let fixture: ComponentFixture<ParamRouteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParamRouteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParamRouteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
