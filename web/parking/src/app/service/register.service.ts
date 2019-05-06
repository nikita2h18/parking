import {Injectable} from '@angular/core';
import {RegisterRenter} from '../dto/RegisterRenter';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {API_URL} from '../globals';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(
    private http: HttpClient
  ) {
  }

  register(registerRenter: RegisterRenter): Observable<void> {
    return this.http.post<void>(API_URL + 'register', registerRenter);
  }

}
