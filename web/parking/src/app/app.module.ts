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
import { AddLotComponent } from './component/routed/add-lot/add-lot.component';
import { AddRentComponent } from './component/routed/add-rent/add-rent.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    AuthComponent,
    HeaderComponent,
    RentsComponent,
    MenuComponent,
    LotsComponent,
    AddLotComponent,
    AddRentComponent
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
