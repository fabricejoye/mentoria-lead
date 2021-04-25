import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonalizarpizzaComponent } from './personalizarpizza.component';

describe('PersonalizarpizzaComponent', () => {
  let component: PersonalizarpizzaComponent;
  let fixture: ComponentFixture<PersonalizarpizzaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PersonalizarpizzaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonalizarpizzaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
