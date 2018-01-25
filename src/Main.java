import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        specs();


        Car audi = new Car();
        Car porsche = new Car();
        audi.setModel("TT");

        System.out.println("Model is " + audi.getModel());


    }



    public static void specs(){

        String name;
        int carDoors;
        int carWheels;
        String carModel;
        String carEngine;
        String carColor;

        Scanner scan = new Scanner(System.in);


        System.out.println("What is the name of the car manufacturer?");
        name = scan.next();
        System.out.println("How many doors does it have?");
        carDoors = scan.nextInt();
        System.out.println("How many wheels does it have?");
        carWheels = scan.nextInt();
        System.out.println("what is the model?");
        carModel = scan.next();
        System.out.println("What type of engine does it have?");
        carEngine = scan.next();
        System.out.println("What is the car color?");
        carColor = scan.next();


        System.out.println(name + " " + carDoors + " " + carWheels + " " + carModel + " " + carEngine + " " + carColor);


        assemblyLine();

    }




    public static void assemblyLine(){

        String directions;
        String directive;
        Scanner scan = new Scanner(System.in);

        System.out.println("Are we making another car? (yes/no");
        directions = scan.next();
        directive = directions.toLowerCase();

        if(directive.equals("y") || directive.equals("yes")){
            specs();

        } else {
            System.out.println("The assembly line is finished!");
        }


    }

}
