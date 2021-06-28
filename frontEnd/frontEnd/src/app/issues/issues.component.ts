import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { Issue } from '../../app/issue.model';
import { IssueService } from '../../app/issue.service';
import { ClientService } from '../../app/client.service';
import { Comment } from '../../app/comment.model';
import { CommentService } from '../../app/comment.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-issues',
  templateUrl: './issues.component.html',
  styleUrls: ['./issues.component.css']
})
export class IssuesComponent implements OnInit {

  issues:Issue[]=[];

  constructor(  private issueService:IssueService,
                private clientService:ClientService,
                private commentService:CommentService,
                private router:Router  ) { }


  ngOnInit(): void {
    this.loadIssues();
  }

  loadIssues(){
    this.issueService.getIssuesByClientId(this.clientService.client.id)
    .subscribe( issues => {
        this.issues=issues;
    })
  }

  issueDetail(issueId:number){
        this.router.navigateByUrl('issues-details/'+issueId);
  }

}
