import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeuspedidosComponent } from './seuspedidos.component';

describe('SeuspedidosComponent', () => {
  let component: SeuspedidosComponent;
  let fixture: ComponentFixture<SeuspedidosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SeuspedidosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SeuspedidosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
