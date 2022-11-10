public class Car implements VehicleInterface, InteriorInterface{
    String Make;
    String Model;
    String Colour;
    int Doors;



    public Car(String Make, String Model, String Colour, int Doors) {
        this.Make = Make;
        this.Model = Model;
        this.Colour = Colour;
        this.Doors = Doors;

    }

    @Override
    public void drive() {
        System.out.println("The car is driving");

    }

    @Override
    public void honk() {
        System.out.println("Beep Beep!");

    }

    @Override
    public void headlights() {
        System.out.println("Headlights are switched on");

    }

    @Override
    public void airCon() {
        System.out.println("Air con is switched on");

    }

    @Override
    public void heatedSeats() {
        System.out.println("Heated Seating is switched on");

    }

    @Override
    public void windowsOpen() {
        System.out.println("The windows are open");

    }

    @Override
    public void windowsClose() {
        System.out.println("Windows are closed");

    }
}
