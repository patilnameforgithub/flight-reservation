public class Tickets {
    double ticketAmount;
    double charges;
    double cancellationCharge;
    int refaundAmount;
    boolean confirmedSeats;
    //methods
    double calculateRefaundAmount(){
        return  ticketAmount-cancellationCharge;
    }
    void availability(){
        active=true;
    }
    void confermation(){
        active=true;
    }
    double specialService(){
        double sp
                sp=ticketAmount+charges;
        return sp();
    }
}
