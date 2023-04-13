import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DossiersMedicalComponent } from './dossiers-medical/dossiers-medical.component';
import { ConsultationsComponent } from './consultations/consultations.component';
import { CreerDossierComponent } from './creer-dossier/creer-dossier.component';
import { InterventionsComponent } from './interventions/interventions.component';
import { JournalComponent } from './journal/journal.component';
import { AuthentificationComponent } from './authentification/authentification.component';
import { CreerDossierMedecinComponent } from './creer-dossier-medecin/creer-dossier-medecin.component';
import { ConsultationPatientComponent } from './consultation-patient/consultation-patient.component';
import { SuiviInterventionsComponent } from './suivi-interventions/suivi-interventions.component';

const routes: Routes = [
  { path: 'dossiers-medical', component: DossiersMedicalComponent },
  { path: 'consultations', component: ConsultationsComponent },
  { path: 'creer-dossier', component: CreerDossierComponent },
  { path: 'interventions', component: InterventionsComponent },
  { path: 'journal', component: JournalComponent },
  { path: 'creer-dossier-medecin', component: CreerDossierMedecinComponent },
  { path: 'creer-dossier-patient', component: CreerDossierComponent },
  { path: 'consultation-patient', component: ConsultationPatientComponent },
  { path: "suivi-interventions", component: SuiviInterventionsComponent },
  { path: '', component: AuthentificationComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
