import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MontarpizzaComponent } from './montarpizza.component';

describe('MontarpizzaComponent', () => {
  let component: MontarpizzaComponent;
  let fixture: ComponentFixture<MontarpizzaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MontarpizzaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MontarpizzaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
