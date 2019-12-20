import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { ListPayComponent } from './list-payee/list-payee.component';
import { LoginCustComponent } from './login-cust/login-cust.component';

@NgModule({
  declarations: [
    AppComponent,
    ListPayComponent,
    LoginCustComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
  constructor(){
    console.log("This is the root module loading!");
  }
 }
