import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        int age = scan.nextInt();
        boolean isThursday = scan.nextBoolean();



        double ticketPrice =  calculateTicketPrice(city, age, isThursday);

        System.out.println("Data: " + city + ", ");
        System.out.println(age + " years old, ");
        System.out.println("weekday ticket price: " + ticketPrice + " PLN");
    }


    public static double calculateTicketPrice(String city, int age, boolean isThursday){
        double ticketPrice = 40;

        if (isThursday) return 0.0;
        if(age < 10) return 0.0;

        if (age >= 10 && age <= 18) {
            ticketPrice = ticketPrice * 0.5;
        }

        if (city.equals("Warsaw")) {
            ticketPrice = ticketPrice * 0.9;
        }


        return ticketPrice;

    }
}