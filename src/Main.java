import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("search available flights or available hotels");
        System.out.println("press 1 for flights and 2 for hotels");
        int input = in.nextInt();
        Search obj = new Search();
        obj.search(input);
        int input1 = in.nextInt();
        Book obj1 = new Book();
        obj1.selectOption(input, input1);
        System.out.println("Cancel Reservation? press 1 to cancel flight reservation, press 2 to cancel hotel reservation 3 to exit");
        int input2 = in.nextInt();
        CancelReservation obj3 = new CancelReservation();
        obj3.selectOption(input2, input);

    }
    static class Search {

        public void search(int input) {
            if (input == 1) {
                flightsAvailable();
                return;
            }
            hotelsAvailable();
        }
        public void flightsAvailable() {
            System.out.println("Available Flights");
            System.out.println("1) Boeing 747");
            System.out.println("2) 743");
            System.out.println("3) emirates");
            System.out.println("press 1 or 2 or 3");
        }
        public void hotelsAvailable() {
            System.out.println("Available Hotels");
            System.out.println("1) hotel 1");
            System.out.println("2) hotel 2");
            System.out.println("3) hotel 3");
            System.out.println("press 1 or 2 or 3");
        }
    }
    static class Book{
        public void selectOption(int input, int input1){
            if(input == 1){
                bookFlight(input1);
            } else if (input == 2) {
                bookHotels(input1);
            }
        }
        public void bookFlight(int input1){
            if(input1 == 1){
                System.out.println("Boeing 747 confirmed");
            }
            else if(input1 == 2){
                System.out.println("743 confirmed");
            }
            else if(input1 == 3){
                System.out.println("emerates confirmed");
            }
            else{
                System.out.println("Flight unavailable");
            }
        }
        public void bookHotels(int input1){
            if(input1 == 1){
                System.out.println("Hotel 1 confirmed");
            }
            else if(input1 == 2){
                System.out.println("Hotel 2 confirmed");
            }
            else if(input1 == 3){
                System.out.println("Hotel 3 confirmed");
            }
            else{
                System.out.println("Hotel unavailable");
            }
        }
    }
}
class CancelReservation{
    public void selectOption(int input2, int input){
        if(input == 1) {
            System.out.println("no hotels booked");
            if (input2 == 1) {
                cancelFlight();
            }
        }
        if(input == 2) {
            System.out.println("no flights booked");
            if (input2 == 2) {
                cancelHotel();
            }
        }else if (input2 == 3) {
            System.out.println("exit--");
        }
    }
    public void cancelFlight(){
        System.out.println("Flight booking canceled");
    }
    public void cancelHotel(){
        System.out.println("Hotel booking canceled");
    }
}