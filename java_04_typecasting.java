import java.text.MessageFormat;

public class java_04_typecasting {
  public static void main(String[] args) {

    byte b = 127;
    int i = 12;

    i = b; // type conversion [implicit]
    // b = i; // error: incompatible types: possible lossy conversion from int to byte
    b = (byte) i; // type casting [explicit]

    float f = 5.667F;
    i = (int) f;

    System.out.println(MessageFormat.format("""
        byte: {0}
        int: {1}
        float: {2}
        """,
        b, i, f));

  }
}
