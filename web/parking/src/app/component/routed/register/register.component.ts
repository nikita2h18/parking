import {Component, OnInit} from '@angular/core';
import {RegisterRenter} from '../../../dto/RegisterRenter';
import {RegisterService} from '../../../service/register.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  registerRenter: RegisterRenter = new RegisterRenter();

  constructor(
    private registerService: RegisterService
  ) {
  }

  ngOnInit() {
  }

  register() {
    console.log(this.registerRenter);
    this.registerService.register(this.registerRenter).subscribe(success => {
      console.log('success!');
    }, error => {
      console.log('error!');
    });
  }

}
