import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreerDossierMedecinComponent } from './creer-dossier-medecin.component';

describe('CreerDossierMedecinComponent', () => {
  let component: CreerDossierMedecinComponent;
  let fixture: ComponentFixture<CreerDossierMedecinComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreerDossierMedecinComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreerDossierMedecinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
