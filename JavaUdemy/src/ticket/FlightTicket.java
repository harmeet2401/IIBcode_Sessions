package ticket;

public class FlightTicket {
    public int ticketNumber;
    public int ticketId;
    public int flightId;
    public String ticketCategory;
    public static int noOfSeatAvailable = 8;

    public FlightTicket(int ticketNumber, int ticketId, int flightId, String ticketCategory,int noOfSeatAvailable) {
        this.ticketNumber = ticketNumber;
        this.ticketId = ticketId;
        this.flightId = flightId;
        this.ticketCategory = ticketCategory;
        FlightTicket.noOfSeatAvailable = noOfSeatAvailable;
    }

    public static void main(String[] args) {
        FlightTicket ticket1 = new FlightTicket(1,1100,1122,"Business",--FlightTicket.noOfSeatAvailable);
        System.out.println("Ticket with Id : "+ticket1.ticketId +" is booked");
        System.out.println("Available number of seat : "+FlightTicket.noOfSeatAvailable);

        FlightTicket ticket2 = new FlightTicket(2,1200,1122,"Economy",--FlightTicket.noOfSeatAvailable);
        System.out.println("Available number of seat with ID : - "+ticket2.ticketId+" before booking  : "+ticket2.noOfSeatAvailable);
        System.out.println("Ticket with Id : "+ticket2.ticketId +" is booked");
        System.out.println("Available number of seat with ID : - "+ticket2.ticketId+" before booking  : "+ticket2.noOfSeatAvailable);


        FlightTicket ticket3 = new FlightTicket(3,1300,1122,"Business",--FlightTicket.noOfSeatAvailable);
        System.out.println("Available number of seat with ID : - "+ticket3.ticketId+" before booking  : "+ticket3.noOfSeatAvailable);
        System.out.println("Ticket with Id : "+ticket3.ticketId +" is booked");
        System.out.println("Available number of seat with ID : - "+ticket3.ticketId+" before booking  : "+ticket3.noOfSeatAvailable);
    }
}
