import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DossiersMedicalComponent } from './dossiers-medical.component';

describe('DossiersMedicalComponent', () => {
  let component: DossiersMedicalComponent;
  let fixture: ComponentFixture<DossiersMedicalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DossiersMedicalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DossiersMedicalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
