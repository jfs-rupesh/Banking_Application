import { Payee } from '../model/payee.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class PayeeServiceService {
  baseUrl: string = "http://localhost:3000";
  constructor(private http: HttpClient) {
  }
  getPayees() {
    console.log("in service layer");
    return this.http.get<Payee[]>(this.baseUrl + '/payees');
  }
}
