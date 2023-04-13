import { Component, OnInit } from '@angular/core';
import { DossierMedical } from './dossier-medical';


@Component({
  selector: 'app-dossiers-medical',
  templateUrl: './dossiers-medical.component.html',
  styleUrls: ['./dossiers-medical.component.scss']
})

export class DossiersMedicalComponent implements OnInit {
  // Propriétés pour la liste des dossiers médicaux
  public titre: string = 'Liste des dossiers médicaux';
  public nbDossiers: number = 0;
  public dossiers: DossierMedical[] = [];

  // Propriétés pour la pagination
  public currentPage: number = 1;
  public pageSize: number = 20;
  public totalPages: number = 0;

  // Méthode pour récupérer la liste des dossiers médicaux
  public getDossiers(): void {
    // Code pour récupérer les dossiers médicaux depuis le backend
  }

  // Méthode pour naviguer vers la page suivante
  public nextPage(): void {
    if (this.currentPage < this.totalPages) {
      this.currentPage++;
      this.getDossiers();
    }
  }

  // Méthode pour naviguer vers la page précédente
  public previousPage(): void {
    if (this.currentPage > 1) {
      this.currentPage--;
      this.getDossiers();
    }
  }

  // Méthode pour afficher les détails d'un dossier médical
  public showDetails(dossier: DossierMedical): void {
    // Code pour naviguer vers la page de détails du dossier
  }

  ngOnInit(): void {
    this.getDossiers();
  }

}
