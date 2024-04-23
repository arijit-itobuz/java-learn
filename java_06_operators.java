import java.text.MessageFormat;
import helper.helper;

public class java_06_operators {

  public static void arithmetic_operators() {
    int a = 10;
    int b = 5;

    System.out.println("a: " + a + " " + "b: " + b);
    System.out.println("sum: " + (a + b)); // 15
    System.out.println("sub: " + (a - b)); // 5
    System.out.println("mul: " + (a * b)); // 50
    System.out.println("div: " + (a / b)); // 2
    System.out.println("mod: " + (a % b)); // 0

  }

  public static void unary_operators() {
    int x = 10;
    /*
     * i++ : post increment
     * ++i : pre increment
     * i-- : post decrement
     * --i : pre decrement
     */
    System.out.println("x: " + x);
    System.out.println("x post increment: " + x++); // 10 (11)
    System.out.println("x pre increment: " + ++x); // 12
    System.out.println("x post decrement: " + x--); // 12 (11)
    System.out.println("x pre decrement: " + --x); // 10

    /*
     * ~ : Bitwise Complement Operator
     * invert all the bits
     * ~n = -(n+1)
     */
    int y = 4;
    System.out.println("y: " + y);
    System.out.println("~y: " + ~y); // -22
    System.out.println("~(-y): " + ~(-y)); // 20

    /*
     * ! : Logical NOT Operator
     */
    boolean z = true;
    System.out.println("z: " + z);
    System.out.println("!z: " + !z); // false
  }

  public static void comparison_operators() {
    int x = 5;
    int y = 7;
    int z = 5;

    System.out.println(MessageFormat.format("x: {0}, y: {1}, z: {2}", x, y, z));

    System.out.println("x == y : " + (x == y)); // false
    System.out.println("x == z : " + (x == z)); // true

    System.out.println("x != y : " + (x != y)); // true
    System.out.println("x != z : " + (x != z)); // false

    System.out.println("x > y : " + (x > y)); // false
    System.out.println("x < y : " + (x < y)); // true

    System.out.println("x >= y : " + (x >= y)); // false
    System.out.println("x <= y : " + (x <= y)); // true
    System.out.println("x >= z : " + (x >= z)); // true
    System.out.println("x <= z : " + (x <= z)); // true
  }

  public static void logical_operators() {
    int x = 5;
    int y = 7;
    int z = 5;

    System.out.println(MessageFormat.format("x: {0}, y: {1}, z: {2}", x, y, z));

    boolean bool_1 = x < y && x > z;
    boolean bool_2 = x < y || x > z;
    boolean bool_3 = !(x < y);

    System.out.println("x < y && x > z " + bool_1); // false
    System.out.println("x < y || x > z : " + bool_2);
    System.out.println("(!(x < y) : " + bool_3);
  }

  public static void assignment_operators() {
    int x = 5;

    x += 2; // 7
    x -= 2; // 5
    x *= 2; // 10
    x /= 5; // 2
    x %= 3; // 2

    x &= 5; // 010 AND 101 = 000 (0)
    x |= 7; // 000 OR 111 = 111 (7)
    x ^= 2; // 111 XOR 010 = 101 (5)
    x >>= 1; // 101 >> 1 = 010 (2)
    x <<= 1; // 010 << 1 = 100 (4)
    x >>>= 2; // 100 >>> 2 = 001 (1)

    System.out.println(x); // 1
  }

  public static void main(String[] args) {

    helper.line_block(java_06_operators::arithmetic_operators);
    helper.line_block(java_06_operators::unary_operators);
    helper.line_block(java_06_operators::comparison_operators);
    helper.line_block(java_06_operators::logical_operators);
    helper.line_block(java_06_operators::assignment_operators);

  }
}
