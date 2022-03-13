public class Flight {
//attributes
    int flightNumber;
    String nameOfTheFlight;
    String flightDetails;
    boolean availability;
    int availabilitySeats;
    int numberOfSeats;
    int bookedSeats;
    //method
    void availability(){
        active=true;
    }
    void printName(){
        System.out.println(nameOfTheFlight);
    }
    int getAvailableSeats(){
        return numberOfSeats-bookedSeats;
    }
}
