public class java_10_conditionals {

  public static void if_else() {

    int x = 34;
    int y = 48;
    int z = 12;

    if (x > y && x > z) {
      System.out.println("x: " + x);
      if (y > z) {
        System.out.println("y: " + y);
        System.out.println("z: " + z);
      } else {
        System.out.println("z: " + z);
        System.out.println("y: " + y);
      }
    } else if (y > x && y > z) {
      System.out.println("y: " + y);
      if (x > z) {
        System.out.println("x: " + x);
        System.out.println("z: " + z);
      } else {
        System.out.println("z: " + z);
        System.out.println("x: " + x);
      }
    } else if (z > x && z > y) {
      System.out.println("z: " + z);
      if (x > z) {
        System.out.println("x: " + x);
        System.out.println("z: " + z);
      } else {
        System.out.println("z: " + z);
        System.out.println("x: " + x);
      }
    } else {
      System.out.println(x + "" + y + "" + z);
    }
  }

  public static void switch_case() {
    String day = "Wednesday";

    switch (day) {
      case "Sunday":
        System.out.println("I am Sunday");
        break;
      case "Monday":
        System.out.println("I am Monday");
        break;
      case "Tuesday":
        System.out.println("I am Tuesday");
        break;
      case "Wednesday":
        System.out.println("I am Wednesday");
        break;
      case "Thrusday":
        System.out.println("I am Thrusday");
        break;
      case "Friday":
        System.out.println("I am Friday");
        break;
      case "Saturday":
        System.out.println("I am Saturday");
        break;
      default:
        System.out.println("I am not a day :(");
        break;
    }
  }

  public static void ternary() {
    boolean bool = true;

    String result = bool ? "i am true" : "i am false";

    System.out.println("result: " + result); // i am true
  }

  public static void main(String[] args) {
    if_else();
    switch_case();
    ternary();

  }
}
