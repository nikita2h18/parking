import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {RegisterComponent} from './component/routed/register/register.component';
import {AppComponent} from './app.component';
import {AuthComponent} from "./component/routed/auth/auth.component";

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
    path: '*',
    component: AppComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
