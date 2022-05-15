
public class HW7 {

    public static void printAirplaneInfo (String name, String type){


        if (name == "F22" && type == "Jet"){
            System.out.println("Name - F22 raptor, type Jet" );
        }

       else if (name == "A370" && type == "Airliner"){
            System.out.println("Name A370, Type Airliner");
        }
       else if (name == "B777" && type == "Airliner") {
            System.out.println("Name Boeing 777, Type Airliner");

        }
        else {
            System.out.println("There is no such aircraft in our production");

        }




    }
    public static void printAirplaneInfo (String name, String type, int econSeats){


        if (name == "F22" && type == "Jet" && econSeats == 0 ){
            System.out.println("Name - F22 raptor, type Jet, no seats" );
        }

       else if (name == "A370" && type == "Airliner" && econSeats == 120 ){
            System.out.println("Name A370, Type Airliner, EconSeats - 120");
        }
        else if (name == "B777" && type == "Airliner" && econSeats == 133 ) {
            System.out.println("Name Boeing 777, Type Airliner, EconSeats - 133");

        }
        else {
            System.out.println("There is no such aircraft in our production");

        }




    }



    public static void printAirplaneInfo (String name, String type, int econSeats, int bussSeats){


        if (name == "F22" && type == "Jet" && econSeats == 0 && bussSeats ==0){
            System.out.println("Name - F22 raptor, type Jet, no seats" );
        }

        else if (name == "A370" && type == "Airliner" && econSeats == 120 && bussSeats == 0){
            System.out.println("Name A370, Type Airliner, EconSeats - 120, BusinessSeats - 0");
        }
        else if (name == "B777" && type == "Airliner" && econSeats == 133 && bussSeats == 45) {
            System.out.println("Name Boeing 777, Type Airliner, EconSeats - 133, BusinessSeats - 45");

        }
        else {
            System.out.println("There is no such aircraft in our production");

        }




    }

    public static void main(String[] args) {
        HW7.printAirplaneInfo ("F22", "Jet");
        HW7.printAirplaneInfo("A370", "Airliner",120);
        HW7.printAirplaneInfo("B777", "Airliner", 133, 45);
    }

}
