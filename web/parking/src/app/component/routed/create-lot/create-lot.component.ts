import { Component, OnInit } from '@angular/core';
import {NewLot} from "../../../dto/NewLot";
import {TokenProviderService} from "../../../service/token.provider.service";
import {LotService} from "../../../service/lot.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-lot',
  templateUrl: './create-lot.component.html',
  styleUrls: ['./create-lot.component.scss']
})
export class CreateLotComponent implements OnInit {

  newLot: NewLot = new NewLot();

  constructor(
    private tokenProviderService: TokenProviderService,
    private router: Router,
    private lotService: LotService
  ) { }

  ngOnInit() {
  }

  createLot() {
    this.tokenProviderService.token.subscribe(token => {
      this.lotService.createLot(token, this.newLot).subscribe(
        () => {
          console.log('created');
          this.router.navigate(['/rents'], {replaceUrl: true});
        }
      )
    });
  }
}
