# Seat Booking Application
![ui](https://raw.githubusercontent.com/hmouloudi/battlebrain2020/master/content/images/ui.PNG)

## Getting Started

Microservice seat booking application with spring cloud as API provider and angular as web client.

## Built With

* [Angular](https://angular.io/) - The web framework used
* [Gradle](https://maven.apache.org/) - Dependency Management
* [Spring boot](https://spring.io/) - Used as backend API

## Endpoints : 
* Front application :
  * URL : http://localhost:4200/
  * Login (soon)
  * Book a seat
  * Filter seats
  * View booked seats
* Eureka server : 
  * http://localhost:8761/
* Seat service : 
  * Gateway URL  -> http://localhost:8080/api/seats 
  * Direct URL -> http://localhost:8081/api/seats
  * Retrieve all seats
* Customer service : 
  * Authetification & authorazation
  * Validate login from web client
* Reservation Service : 
  *  Book a seat based on table size / 2 and seat avalaibility
  
## C4 Model

### Context

### Container

### Components
![components](https://raw.githubusercontent.com/hmouloudi/battlebrain2020/master/content/images/component-architecture.PNG)

### Code
  

## Locale Deploiment Procedure


### Prerequisite
* Docker
* Lombok ( optionnel for dev only)
* Intellij (or eclipse)
* NPM
* Angular CLI
* VisualStudio code (optionel)

### Locale Deploiment
* Run docker containers :
  * cd seat-booking
  * docker-compose up -d
* Import project 'seat-booking' in IntelliJ
* Run the following in order :
  * eureka-discovery-server
  * api-gateway
  * seat-service
  * reservation-service
  * customer-service
* Run the web client
  * cd seat-booking-client
  * npm install
  * ng serve
 
## Project Info
### Next release Feature

- Integration with Azure cloud
- Add logging 
- Add swagger

### Authors

* **Hicham Mouloudi** - *Initial work*

### License

SQLI SQLI-Morocco Battle Brain 2020
