import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {RegisterComponent} from './component/routed/register/register.component';
import {AppComponent} from './app.component';
import {AuthComponent} from "./component/routed/auth/auth.component";
import {RentsComponent} from "./component/routed/rents/rents.component";
import {LotsComponent} from "./component/routed/lots/lots.component";
import {AddLotComponent} from "./component/routed/add-lot/add-lot.component";
import {AddRentComponent} from "./component/routed/add-rent/add-rent.component";

const routes: Routes = [
  {
    path: 'register',
    component: RegisterComponent
  },
  {
    path: 'auth',
    component: AuthComponent
  },
  {
    path: 'rents',
    component: RentsComponent
  },
  {
    path: '*',
    component: AppComponent
  },
  {
    path:'lots',
    component: LotsComponent
  },
  {
    path:'add-lot',
    component: AddLotComponent
  },
  {
    path:'add-rent',
    component: AddRentComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
