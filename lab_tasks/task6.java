import java.util.*; 
 
class InvalidBookingException extends Exception { 
    public InvalidBookingException(String message) { 
        super(message); 
    } 
} 
 
class Driver { 
    String name; 
 
    Driver(String name) { 
        this.name = name; 
    } 
} 
 
class Rider { 
    String name; 
 
    Rider(String name) { 
        this.name = name; 
    } 
} 
 
class Vehicle { 
    String vehicleNumber; 
 
    Vehicle(String vehicleNumber) { 
        this.vehicleNumber = vehicleNumber; 
    } 
} 
 
abstract class Trip { 
    protected double distance; 
 
    Trip(double distance) throws InvalidBookingException { 
        if (distance <= 0) { 
            throw new InvalidBookingException( 
                "Distance must be greater than zero" 
            ); 
        } 
 
        this.distance = distance; 
    } 
 
    abstract int calculateFare(); 
} 
 
class Bike extends Trip { 
 
    Bike(double distance) throws InvalidBookingException { 
        super(distance); 
    } 
 
    @Override 
    int calculateFare() { 
        return (int)(distance * 5); 
    } 
} 
 
class Auto extends Trip { 
 
    Auto(double distance) throws InvalidBookingException { 
        super(distance); 
    } 
 
    @Override 
    int calculateFare() { 
        return (int)(distance * 12); 
    } 
} 
 
class Cab extends Trip { 
 
    Cab(double distance) throws InvalidBookingException { 
        super(distance); 
    } 
 
    @Override 
    int calculateFare() { 
        return (int)(distance * 12); 
    } 
} 
 
public class Main { 
 
    public static Trip createTrip(String type, double distance) 
            throws InvalidBookingException { 
 
        switch (type.toLowerCase()) { 
 
            case "bike": 
                return new Bike(distance); 
 
            case "auto": 
                return new Auto(distance); 
 
            case "cab": 
                return new Cab(distance); 
 
            default: 
                throw new InvalidBookingException( 
                    "Invalid ride type: " + type 
                ); 
        } 
    } 
 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        int n = sc.nextInt(); 
 
        for (int i = 0; i < n; i++) { 
 
            String type = sc.next(); 
            double distance = sc.nextDouble(); 
 
            try { 
                Trip trip = createTrip(type, distance); 
 
                System.out.println(trip.calculateFare()); 
 
            } catch (InvalidBookingException e) { 
                System.out.println("Invalid Booking"); 
            } 
        } 
 
        sc.close(); 
    } 
} 
