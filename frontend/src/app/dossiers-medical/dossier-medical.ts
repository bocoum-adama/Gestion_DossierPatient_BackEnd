export class DossierMedical {
    id: number;
    dateOuverture: Date;
    dateFermeture: Date;
    etatPatient: string;
  
    constructor(id: number, dateOuverture: Date, dateFermeture: Date, etatPatient: string) {
      this.id = id;
      this.dateOuverture = dateOuverture;
      this.dateFermeture = dateFermeture;
      this.etatPatient = etatPatient;
    }
  }