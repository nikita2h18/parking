import {Injectable} from '@angular/core';
import {AuthRenter} from '../dto/AuthRenter';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {API_URL} from '../../globals';
import {Renter} from "../dto/Renter";

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(
    private http: HttpClient
  ) {
  }

  auth(authRenter: AuthRenter): Observable<string> {
    return this.http.post<string>(API_URL + 'auth', authRenter, {responseType: 'text' as 'json'});
  }

  validate(token: string): Observable<Renter> {
    return this.http.get<Renter>(API_URL + 'auth/validate', {
      headers: {token: token}
    });
  }

}
