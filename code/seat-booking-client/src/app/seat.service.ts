import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Seat } from './seat';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SeatService {


  private seatsUrl: string;
 
  constructor(private http: HttpClient) {
    this.seatsUrl = 'http://localhost:8081/seats';
  }
 
  public findAll(): Observable<Seat[]> {
    return this.http.get<Seat[]>(this.seatsUrl);
  }
 
  public save(seat: Seat) {
    return this.http.post<Seat>(this.seatsUrl, seat);
  }
}
