
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

public class Objects {
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

    public static void fullThrottle(String dumil) {
        System.out.println("The car is goind on full throttle" + dumil);
    }

    public static void speed(int maxspeed) {
        System.out.println("The car speed is 200km/p " + maxspeed);
    }

    public static void main(String[] args) {
        Objects myob = new Objects();
        myob.fullThrottle(" bom pakkiri");
        myob.speed(200);
    }

}
