import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PokebadgeComponent } from './pokebadge.component';

describe('PokebadgeComponent', () => {
  let component: PokebadgeComponent;
  let fixture: ComponentFixture<PokebadgeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PokebadgeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PokebadgeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
