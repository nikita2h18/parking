import {Component, OnInit} from '@angular/core';
import {RentService} from "../../../service/rent.service";
import {Rent} from "../../../dto/Rent";
import {TokenProviderService} from "../../../service/token.provider.service";
import {LOCALSTORAGE_TOKEN_NAME} from "../../../../globals";

@Component({
  selector: 'app-rent',
  templateUrl: './rent.component.html',
  styleUrls: ['./rent.component.scss']
})
export class RentComponent implements OnInit {

  public rents: Rent[] = [];

  constructor(
    private rentService: RentService,
    private tokenProvider: TokenProviderService
  ) {
  }

  getAll() {
    console.log(localStorage.getItem(LOCALSTORAGE_TOKEN_NAME));
    this.rentService.getAll(localStorage.getItem(LOCALSTORAGE_TOKEN_NAME)).subscribe(
      rs => {
        this.rents = rs;
      }
    );
  }

  ngOnInit() {
  }
}
