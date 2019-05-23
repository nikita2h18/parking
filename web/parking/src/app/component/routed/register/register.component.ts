import {Component, OnInit} from '@angular/core';
import {RegisterRenter} from '../../../dto/RegisterRenter';
import {RegisterService} from '../../../service/register.service';
import {Router} from "@angular/router";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  registerRenter: RegisterRenter = new RegisterRenter();

  constructor(
    private registerService: RegisterService,
    private router: Router
  ) {
  }

  ngOnInit() {
  }

  register() {
    console.log(this.registerRenter);
    this.registerService.register(this.registerRenter).subscribe(success => {
      this.router.navigate(['/auth'], {replaceUrl: true});
    }, error => {
      this.router.navigate(['/register'], {replaceUrl: true});
    });
  }

}
