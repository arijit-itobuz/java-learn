import java.lang.Math;

public class java_08_math {

  public static void math() {
    double x = 44.56;
    double y = 67.302;
    long z = -99L;

    System.out.println(Math.max(x, y));
    System.out.println(Math.min(x, y));

    System.out.println(Math.abs(z));

    System.out.println(Math.sqrt(x));
    System.out.println(Math.cbrt(x));

    System.out.println(Math.ceil(x));
    System.out.println(Math.floor(x));
  }

  public static void main(String[] args) {
    math();
  }
}
