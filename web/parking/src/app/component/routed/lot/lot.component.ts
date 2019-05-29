import {Component, OnInit} from '@angular/core';
import {TokenProviderService} from "../../../service/token.provider.service";
import {LOCALSTORAGE_TOKEN_NAME} from "../../../../globals";
import {Lot} from "../../../dto/Lot";
import {LotService} from "../../../service/lot.service";

@Component({
  selector: 'app-lot',
  templateUrl: './lot.component.html',
  styleUrls: ['./lot.component.scss']
})
export class LotComponent implements OnInit {

  public lots: Lot[] = [];

  constructor(
    private lotService: LotService,
    private tokenProvider: TokenProviderService
  ) {
  }

  getAll() {
    console.log(localStorage.getItem(LOCALSTORAGE_TOKEN_NAME));
    this.lotService.getAll(localStorage.getItem(LOCALSTORAGE_TOKEN_NAME)).subscribe(
      ls => {
        this.lots = ls;
      }
    );
  }

  ngOnInit() {
  }

}
