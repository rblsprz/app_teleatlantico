import { Component, OnInit } from '@angular/core';
import { Client } from 'src/app/client.model';
import { ClientService } from 'src/app/client.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  client:Client = new Client();

  constructor(  private clientService:ClientService) { }

  ngOnInit(): void {
    this.client=this.clientService.client;
  }

}
