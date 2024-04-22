public class java_05_typeof {

  public static String typeOf(Object x) {
    String str = x.getClass().getSimpleName();
    return str;
  }

  public static void main(String[] args) {

    int _int = 55;
    long _long = 342_423_414;

    System.out.println("int: " + typeOf((Object) _int));
    System.out.println("int: " + typeOf((Object) _long));
  }

}
