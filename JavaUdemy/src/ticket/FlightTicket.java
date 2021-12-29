package ticket;

public class FlightTicket {
    public int ticketNumber;
    public int ticketId;
    public int flightId;
    public String ticketCategory;
    public static int noOfSeatAvailable = 4;

    public FlightTicket(int ticketNumber, int ticketId, int flightId, String ticketCategory,int noOfSeatAvailable) {
        this.ticketNumber = ticketNumber;
        this.ticketId = ticketId;
        this.flightId = flightId;
        this.ticketCategory = ticketCategory;
        FlightTicket.noOfSeatAvailable = noOfSeatAvailable;
    }

    public static void main(String[] args) {
        createTicket(1 ,1100,1122,"Business");
        createTicket(2,1200,1122,"Business");
        createTicket(3 ,1300,1122,"Business");
        createTicket(4 ,1400,1122,"Business");
        createTicket(5 ,1500,1122,"Business");

        }

    private static void createTicket(int ticketNumber,int ticketId , int flightId , String ticketCategory) {
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Available number of seat before booking  : "+ FlightTicket.noOfSeatAvailable);
        if(FlightTicket.noOfSeatAvailable>0) {
            FlightTicket ticket = new FlightTicket(ticketNumber, ticketId, flightId, ticketCategory, --FlightTicket.noOfSeatAvailable);
            System.out.println("Ticket with Id : " + ticket.ticketId + " is booked");
            System.out.println("Available number of seat with post booking   : "+ticket.noOfSeatAvailable);
        }else{
            System.out.println(" :( sorry seats are not available");
        }

        System.out.println("------------------------------------------------------------------------------------------------------------");
    }
}
