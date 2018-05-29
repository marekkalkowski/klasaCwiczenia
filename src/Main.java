public class Main {





    public static void main(String[] args) {
      /*  System.out.println("Infoshre");

        System.out.print("Hello World");
        System.out.print("test");

        System.out.println(); */

        int x = 5;
        int y = 6;

        int sum = x + y; //10 + 5

        System.out.println(sum);

        x=15;

        sum = x + y;

        System.out.println(x+y);

        Menu myMenu = new Menu();
        System.out.println(myMenu.number);
        System.out.println(myMenu.text);



        Menu mySecondMenu = new Menu(9);
        System.out.println(mySecondMenu.number);
        System.out.println(mySecondMenu.text);


        Menu myOtherMenu = new Menu ("ja");
        System.out.println(myMenu.number + " " + myMenu.text);
        System.out.println(myOtherMenu.text);

        Car car = new Car();

        car.maxSpeed = 11;
        car.name = "Opel tigra";

        Menu newMenu = new Menu (9, "tekst" );
        System.out.println("----------");
        System.out.println(newMenu.number);
        System.out.println(newMenu.text);

        car.startEngine();
        car.stopEngine();
        System.out.println( car.whatMaxSpeedWas(30));
        System.out.println("Current speed is: " + car.getCurrentSpeed());

        car.accelerate1();
        System.out.println(car.getCurrentSpeed());
        car.accelerate1();
        System.out.println(car.getCurrentSpeed());
        car.accelerate1();
        System.out.println(car.getCurrentSpeed());
        car.accelerate1();





    }

    }

