package methods;

public class methods {
    // call method
    // static void hw() {
    // System.out.println("Hello Wolrd");
    // }

    // public static void main(String[] args) {
    // hw();
    // hw();
    // hw();
    // }

    // // Method with parameters
    // static void greet(String name) {
    // System.out.println("Hello" + name);
    // }

    // public static void main(String[] args) {
    // greet(" bom pakkri");
    // greet(" pattasu Balu");
    // greet(" parava vavaal");
    // }

    // static void family(String fname, int age) {
    // System.out.println(fname + "pakkiri age is " + age);

    // }

    // public static void main(String[] args) {
    // family("bom ", 40);
    // family("pattasu ", 35);
    // family("parava ", 28);
    // }


    // methods with if else statement.....................
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access Denied You're not authorized");
        } else {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
        checkAge(17);
    }


}
