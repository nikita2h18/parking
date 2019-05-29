import {Injectable, Optional} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {NewRent} from "../dto/NewRent";
import {API_URL} from "../../globals";
import {Rent} from "../dto/Rent";

@Injectable({
  providedIn: 'root'
})
export class RentService {

  constructor(
    private http: HttpClient
  ) { }

  rentAdd(token: string, newRent: NewRent): Observable<void> {
    return this.http.post<void>(API_URL + 'rent/add', newRent, {
      headers: {
        token: token
      }
    });
  }

  getAll(token: string): Observable<Rent []> {
    return this.http.get<Rent[]> (API_URL + 'rent/rents', {
      headers: {
        token: token
      }
    })
  }
}
