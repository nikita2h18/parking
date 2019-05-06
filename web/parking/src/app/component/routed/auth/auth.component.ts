import {Component, OnInit} from '@angular/core';
import {AuthRenter} from '../../../dto/AuthRenter';
import {AuthService} from '../../../service/auth.service';
import {Router} from '@angular/router';
import {TokenProviderService} from '../../../service/token.provider.service';
import {LOCALSTORAGE_TOKEN_NAME} from '../../../../globals';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: [
    './auth.component.scss'
  ]
})
export class AuthComponent implements OnInit {

  authRenter: AuthRenter = new AuthRenter();

  constructor(
    private authService: AuthService,
    private router: Router,
    private tokenProviderService: TokenProviderService
  ) {
  }

  ngOnInit() {
  }

  auth() {
    this.authService.auth(this.authRenter).subscribe(token => {
      this.tokenProviderService.setToken(token);
      localStorage.setItem(LOCALSTORAGE_TOKEN_NAME, token);

      this.router.navigate(['/feed'], {replaceUrl: true});
    });
  }
}
