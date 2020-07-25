import { Component } from '@angular/core';
import { SeatService } from './seat.service';
import { Seat } from './seat';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'seat-booking-client';

  seats: Seat[];

  constructor(private seatService: SeatService) { 
  }

  ngOnInit() {
    this.seatService.findAll().subscribe(data => {
      this.seats = data;
    });
  }

}
