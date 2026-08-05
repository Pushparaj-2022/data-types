package array;

public class array {
    public static void main(String[] args) {

        // String[] cars ={ "volvo", "bmv", "ford", "skoda", "audi", "Tata",
        // "Mahindra"};
        // cars[0] ="Toyota";
        // System.out.println(cars.length);
        // // System.out.println(cars[1]);

        // String[] cars = { "volvo", "bmv", "ford", "skoda", "audi", "Tata", "Mahindra"
        // };

        // for (int x = 0; x < cars.length; x++) {
        // System.out.println(cars[x]);
        // }

        // int[] num = { 1, 5, 10, 20, 30 };
        // int sum = 0;
        // for (int x = 0; x < num.length; x++) {
        // sum += num[x];

        // }

        // System.out.println(sum);

        // for each loop..................
        // String[] cars = { "Tata", "Mahindra", "Tesla", "Toyota", "Skoda", "BMV" };

        // for (String car : cars) {
        // System.out.println(car);
        // }

        // int[] ages = { 20, 22, 18, 35, 48, 26, 87, 70 };

        // float avg, sum = 0;

        // int length = ages.length;
        // for (int i = 0; i < length; i++) {
        // sum += ages[i];
        // }
        // avg = sum / length;
        // System.out.println("The average of the ages is " + avg);

        // int[] ages = { 20, 22, 18, 35, 48, 26, 87, 70 };

        // int lowest =ages[0];
        // for (int age : ages){
        // if (age < lowest){
        // lowest = age;
        // }
        // }
        // System.out.println("The lowest age is " + lowest);

        // loop to to skip negative numbers
        // int[] num = { 1, 2, 3, -1, -2, 0, 4, 5, 6 };
        // for (int n : num) {
        // if (n < 0) {
        // continue;
        // }
        // if (n == 0) {
        // break;
        // }
        // System.out.println(n);
        // }

        // track highest and lowest value in an array
        // int[] num = { 20, 34, 55, 68, 35, 78, 90, 45, 74, 88, 37, 95, 127, 46, 34, 30
        // };

        // int max = num[0];
        // int min = num[0];
        // for (int n : num) {
        // if (n > max) {
        // max = n;
        // }
        // if (n < min) {
        // min = n;
        // }

        // }
        // System.out.println("the max " + max + " and the min is " + min);

        // multidimenstional array

        int[][] num = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9, 0} };
        // System.out.println(num[0][1]);
        for (int[] n : num) {
            for (int x : n) {
                System.out.println(x);
            }
        }

    }
}
