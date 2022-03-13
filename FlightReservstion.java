package PACKAGE_NAME;
public class FlightReservstion {
    //passenger details
    Passenger p1=new Passenger();
    p1.name;
    p1.phoneNumber;
    p1.emailId;
    p1.streetName;
    p1.cityName;
    //passenger method calling
    p1.printName();
    p1.printCityName();
    p1.printStreetName();
    p1.printEmailId();
    p1.printPhoneNumber();
    //flight details
    Flight f1=new Flight();
    f1.flightNumber;
    f1.nameOfTheFlight;
    f1.flightDetails;
    f1.availability;
    f1.availabilitySeats;
    f1.numberOfSeats;
    f1.bookedSeats;
    //flight Method calling
    f1.printName();
    f1.availability();
    int gAs=f1.getAvailableSeats();
    System.out.println(gAs);
    //Ticket details
    Ticket t1=new Tickets();
    t1.seatsAvailable;
    t1.ticketAmount;
    t1.charges;
    t1.cancellationCharge;
    t1.refaundAmount;
    t1.confirmedSeats;
    //ticket method calling
    double cRa=t1.calculateRfaundAmount();
    System.out.println(cRa);

    double ss=t1.specialService();
    System.out.println(ss);

    //tourist details
    Tourist to=new Tourist();
    to.hotelAddress;
    to.touristLocation;
    to.numOfAddLocation;
    to.touristAmount;
    //tourist method calling
    double cTa=to.calculateTouristAmount();
    System.out.println(cTa);
    to.printHotelAddress();
    to.printTouristLocation();


}
}