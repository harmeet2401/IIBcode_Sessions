package B;
import A.Trip;
public class Holiday {
    public static void main(String[] args) {
        Trip trip_1 = new  Trip();
        trip_1.noOfPlannedDays=2;
        trip_1.location ="Eiffel Tower";
        System.out.println(printTripDetails(1,trip_1.location, trip_1.noOfPlannedDays));
        Trip trip_2 = new  Trip();
        trip_2.noOfPlannedDays=1;
        trip_2.location ="Notre Dame Catheral";
        System.out.println(printTripDetails(2,trip_2.location, trip_2.noOfPlannedDays));
        Trip trip_3 = new  Trip();
        trip_3.noOfPlannedDays=5;
        trip_3.location ="Louvre Museum";
        System.out.println(printTripDetails(3, trip_3.location, trip_3.noOfPlannedDays));

    }
    public static String printTripDetails(int i,String location , int noofplanneddays){
        // TODO : Write you logic here to return trip details
        return "Trip "+i+": location - "+location+" and "+"noofplanneddays - "+noofplanneddays;

    }
}