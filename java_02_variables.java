public class java_02_variables {

  int a = 44; // instance variable
  static int b = 33; // static variable

  public static int sum() {
    int num1, num2, num3, sum; // local variable
    num1 = 4;
    num2 = 5;
    num3 = 6;
    sum = num1 + num2 + num3;
    return sum;

  }

  public static void main(String[] args) {

    System.out.println("sum of local variables: " + sum());
    System.out.println("instance variable: " + new java_02_variables().a);
    System.out.println("static variable: " + b);

  }

}
