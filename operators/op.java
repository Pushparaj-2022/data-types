public class op {
    public static void main(String[] args) {
        int rice = 100;
        int meat = 260;
        int veg = 400;
        int masala = 50;
        int cash = 800;
        int grocery = meat + veg + masala + rice;
        int total = rice + meat + veg + masala;
        int short1 = cash - grocery;
        System.out.print(
                "i was given " + cash + " i spend " + grocery + " and the total was " + total + " but short " + short1);

    }
}
