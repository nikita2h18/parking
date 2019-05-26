import {Component, OnInit} from '@angular/core';
import {NewRent} from "../../../dto/NewRent";
import {Observable} from "rxjs";
import {RentService} from "../../../service/rent.service";
import {TokenProviderService} from "../../../service/token.provider.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-add-rent',
  templateUrl: './add-rent.component.html',
  styleUrls: ['./add-rent.component.scss']
})
export class AddRentComponent implements OnInit {

  newRent: NewRent = new NewRent();

  constructor(
    private rentService: RentService,
    private router: Router,
    private tokenProviderService: TokenProviderService
  ) {
  }

  ngOnInit() {
  }

  rentAdd() {
    this.tokenProviderService.token.subscribe(token => {
      console.log(token);
      this.rentService.rentAdd(token, this.newRent).subscribe(
        () => {
          console.log('success');
          this.router.navigate(['/rents'], {replaceUrl: true});
        }
      )
    });
  }
}
