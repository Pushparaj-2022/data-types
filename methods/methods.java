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
    // static void checkAge(int age) {
    // if (age < 18) {
    // System.out.println("Access Denied You're not authorized");
    // } else {
    // System.out.println("Access Granted");
    // }
    // }

    // public static void main(String[] args) {
    // checkAge(20);
    // checkAge(17);
    // }

    // return value .....................

    // static int add(int x) {
    // return x + 5;

    // }

    // public static void main(String[] args) {
    // System.out.println(add(5));
    // }

    // static int add() {
    // return 5 + 5;

    // }

    // public static void main(String[] args) {
    // int result = add();
    // System.out.println(result);
    // }

    // Methods with for loop

    // static int doubleGame(int x) {
    // return x * 2;
    // }

    // public static void main(String[] args) {
    // for (int i = 1; i < 5; i++) {
    // System.out.println(i + " is " + doubleGame(i));
    // }
    // }

    // method overloading

    static int method(int x, int y) {
        return x + y;
    }

    static double method(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int num1 = method(5, 5);
        double num2 = method(5.9, 4.5);
        System.out.println(num1);
        System.out.println(num2);
    }

}
