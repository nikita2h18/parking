import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {RegisterComponent} from './component/routed/register/register.component';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {AuthComponent} from './component/routed/auth/auth.component';
import {HeaderComponent} from "./component/embedded/header/header.component";
import { RentsComponent } from './component/routed/rents/rents.component';
import { MenuComponent } from './component/routed/menu/menu.component';
import { LotsComponent } from './component/routed/lots/lots.component';
import {CreateLotComponent} from './component/routed/create-lot/create-lot.component';
import { AddRentComponent } from './component/routed/add-rent/add-rent.component';
import { RentComponent } from './component/routed/rent/rent.component';
import { LotComponent } from './component/routed/lot/lot.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    AuthComponent,
    HeaderComponent,
    RentsComponent,
    MenuComponent,
    LotsComponent,
    CreateLotComponent,
    AddRentComponent,
    RentComponent,
    LotComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
