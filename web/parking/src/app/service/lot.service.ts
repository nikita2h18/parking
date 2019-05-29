import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {NewLot} from "../dto/NewLot";
import {API_URL} from "../../globals";
import {Lot} from "../dto/Lot";
import {Rent} from "../dto/Rent";

@Injectable({
  providedIn: 'root'
})
export class LotService {

  constructor(
    private http:HttpClient
  ) { }

  createLot(token: string, newLot: NewLot): Observable<void> {
    return this.http.post<void>(API_URL + 'lot/create', newLot, {
      headers: {
        token: token
      }
    });
  }

  getAll(token: string): Observable<Lot []> {
    return this.http.get<Lot[]> (API_URL + 'lot/lots', {
      headers: {
        token: token
      }
    })
  }
}
