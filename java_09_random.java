import java.util.Random;;

public class java_09_random {

  public static void random() {

    Random rand = new Random();

    int a = rand.nextInt(5); // [0,5)
    int x = rand.nextInt(5) + 1; // [1,6)
    double y = rand.nextDouble(1) + 4; // [4,5)
    boolean z = rand.nextBoolean(); // true | false

    System.out.println(a);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

  }

  public static void main(String[] args) {
    random();
  }
}
