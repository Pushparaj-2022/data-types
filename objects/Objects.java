
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
    int x = 5;
    // int y = 10;

    public static void main(String[] args) {
        Objects obj = new Objects();
        Objects obj1 = new Objects();
        obj1.x = 40;
        System.out.println(obj.x);
        System.out.println(obj1.x);

    }

}
