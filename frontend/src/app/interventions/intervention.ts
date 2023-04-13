export class Intervention {
    id: number;
    type: string;
    status: string;
    date: Date;
  
    constructor(id: number, type: string, status: string, date: Date) {
      this.id = id;
      this.type = type;
      this.status = status;
      this.date = date;
    }
  }