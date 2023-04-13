import { Component, OnInit } from '@angular/core';
import { Intervention } from './intervention';

@Component({
  selector: 'app-interventions',
  templateUrl: './interventions.component.html',
  styleUrls: ['./interventions.component.scss']
})

export class InterventionsComponent implements OnInit {
  // Propriétés pour la liste des dossiers médicaux
  public titre: string = 'Liste des interventions';
  public nbInterventions: number = 0;
  public interventions: Intervention[] = [];

  // Propriétés pour la pagination
  public currentPage: number = 1;
  public pageSize: number = 20;
  public totalPages: number = 0;

  // Méthode pour récupérer la liste des dossiers médicaux
  public getInterventions(): void {
    // Code pour récupérer les dossiers médicaux depuis le backend
  }

  // Méthode pour naviguer vers la page suivante
  public nextPage(): void {
    if (this.currentPage < this.totalPages) {
      this.currentPage++;
      this.getInterventions();
    }
  }

  // Méthode pour naviguer vers la page précédente
  public previousPage(): void {
    if (this.currentPage > 1) {
      this.currentPage--;
      this.getInterventions();
    }
  }

  // Méthode pour afficher les détails d'un dossier médical
  public showDetails(dossier: Intervention): void {
    // Code pour naviguer vers la page de détails du dossier
  }

  ngOnInit(): void {
    this.getInterventions();
  }

}
