public class Main {
    public static void main(String[] args) {

//        Car Car1 = new Car();
//        Car1.Make = "BMW";
//        Car1.Colour ="Red";
//        Car1.Model = "X5";
//        Car1.Doors = 4;
//
//        System.out.println(Car1.Colour);

        Car Car1 = new Car("BMW", "Red", "X5", 5);
        Car1.honk();
        Car1.windowsClose();






    }
}