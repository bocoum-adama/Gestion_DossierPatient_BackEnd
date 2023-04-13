import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { DossiersMedicalComponent } from './dossiers-medical/dossiers-medical.component';
import { ConsultationsComponent } from './consultations/consultations.component';
import { CreerDossierComponent } from './creer-dossier/creer-dossier.component';
import { InterventionsComponent } from './interventions/interventions.component';
import { JournalComponent } from './journal/journal.component';
import { AuthentificationComponent } from './authentification/authentification.component';
import { MenuDocComponent } from './menu-doc/menu-doc.component';
import { MenuPatientComponent } from './menu-patient/menu-patient.component';
import { MenuAgentComponent } from './menu-agent/menu-agent.component';
import { CreerDossierMedecinComponent } from './creer-dossier-medecin/creer-dossier-medecin.component';
import { ConsultationPatientComponent } from './consultation-patient/consultation-patient.component';
import { SuiviInterventionsComponent } from './suivi-interventions/suivi-interventions.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    DossiersMedicalComponent,
    ConsultationsComponent,
    CreerDossierComponent,
    InterventionsComponent,
    JournalComponent,
    AuthentificationComponent,
    MenuDocComponent,
    MenuPatientComponent,
    MenuAgentComponent,
    CreerDossierMedecinComponent,
    ConsultationPatientComponent,
    SuiviInterventionsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
