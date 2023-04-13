import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SuiviInterventionsComponent } from './suivi-interventions.component';

describe('SuiviInterventionsComponent', () => {
  let component: SuiviInterventionsComponent;
  let fixture: ComponentFixture<SuiviInterventionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SuiviInterventionsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SuiviInterventionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
