import java.util.Scanner;

// public class Objects {

// java object basic
// public static void main(String[] args) {
// Objects Ob = new Objects();
// Objects Obx = new Objects();
// System.out.println(Ob.x);
// System.out.println(Obx.x);

// }

// }

// java attributes............

// public class Objects {
  // int x = 5;
  // // int y = 10;

  // public static void main(String[] args) {
  // Objects obj = new Objects();
  // Objects obj1 = new Objects();
  // obj1.x = 40;
  // System.out.println(obj.x);
  // System.out.println(obj1.x);

  // }

  // multiple attributes.................

  // String fname = "Bomb ";
  // String lname = "Pakkiri ";
  // int Age = 45;

  // public static void main(String[] args) {
  // Objects obx = new Objects();
  // System.out.println("The MC name is " + obx.fname + obx.lname + "and his age
  // is " + obx.Age);
  // }

  // java class methods..................

  // static void myMethod() {
  // System.out.println("Hello World !");

  // }

  // public static void main(String[] args) {
  // myMethod();
  // }

  // Access methods with objects ..................

  // public static void fullThrottle(String dumil) {
  // System.out.println("The car is goind on full throttle" + dumil);
  // }

  // public static void speed(int maxspeed) {
  // System.out.println("The car speed is 200km/p " + maxspeed);
  // }

  // int x;

  // public Objects() {
  // x = 5;
  // }

  // public static void main(String[] args) {
  // Objects myob = new Objects();
  // System.out.println(myob.x);
  // }

  // constructor parameters............................

  // int x;

  // public Objects(int y) {
  // x = y;
  // }

  // public static void main(String[] args) {
  // Objects ob = new Objects(5);
  // Objects ob1 = new Objects(15);
  // System.out.println(ob.x);
  // System.out.println(ob1.x);
  // }

  // int modelyear;
  // String modelname;

  // public Objects(int year, String name) {
  // modelyear = year;
  // modelname = name;
  // }

  // public static void main(String[] args) {
  // Objects car = new Objects(2001, "Ford Mustang");
  // Objects car1 = new Objects(1999, "TATA");
  // System.out.println(car.modelyear + " " + car.modelname);
  // System.out.println(car1.modelyear + " " + car1.modelname);
  // }

  // java this keyword........................

  // int x;

  // public Objects(int x) {
  // this.x = x;
  // }

  // public static void main(String[] args) {
  // Objects ob = new Objects(10);
  // System.out.println(ob.x);
  // }

  // constructor to constructor..............................

  // int modelyear;
  // String modelname;

  // // constructor one...............
  // public Objects(String modelname) {
  // this(2005, modelname);
  // }

  // // constructor two.........
  // public Objects(int modelyear, String modelname) {
  // this.modelyear = modelyear;
  // this.modelname = modelname;

  // }

  // // method to print object info ................
  // public void printinfo() {
  // System.out.println(modelname + " " + modelyear);
  // }

  // public static void main(String[] args) {
  // Objects car1 = new Objects(1995, "Ferrari");
  // Objects car2 = new Objects("Ford Mustang");
  // car1.printinfo();
  // car2.printinfo();
  // }

  // javs encapsulation..........................

  // public static void main(String[] args) {
  // Second myob = new Second();

  // myob.setName("Bom Pakkiri");
  // System.out.println(myob.getName());

  // }

  // java package #scanner......................

  // public static void main(String[] args){
  // Scanner myob = new Scanner(System.in);
  // String userName;

  // System.out.println("Enter Name: ");
  // userName = myob.nextLine();

  // System.out.println("User Name is " + userName);

  // }

  // ..................................................

  // java inheritance............................

  class vehicle {
    protected String brand = "Ford";

    public void sound() {
      System.out.println("rutu! tu! tu! tu! ");
    }
  }

  class car extends vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {

      car mycar = new car();
      mycar.sound();
      System.out.println(mycar.brand + " " + mycar.modelName);

    }

  }

// }
