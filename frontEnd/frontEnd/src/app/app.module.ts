import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { IssueComponent } from './issue/issue.component';
import { IssueDetailsComponent } from './issue-details/issue-details.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    IssueComponent,
    IssueDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
