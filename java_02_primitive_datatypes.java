import java.text.MessageFormat;

public class java_02_primitive_datatypes {

  public static void main(String[] args) {

    /*
     * range formula: [ 2^(n-1), 2^(n-1) - 1 ]
     */

    byte _byte = 3; // 8 bit signed [ -128, 127 ]
    short _short = 33; // 16 bit signed [-32,768, 32,767]
    int _int = 333; // 32 bit signed
    long _long = 3333; // 64 bit signed

    char _char = 'a'; // 16 bit unsigned

    boolean _bool = true; // true or false

    float _float = 3.5f;
    double _double = 3.5;

    String res = MessageFormat.format("""
        byte: {0}
        short: {1}
        int: {2}
        long: {3}

        char: {4}

        boolean: {5}

        float: {6}
        double: {7}
        """,
        _byte, _short, _int, _long, _char, _bool, _float, _double);
    System.out.println(res);

    /*
     * literals
     */

    long num_1 = 4_235_231_351L;
    System.out.println(MessageFormat.format("num_1: {0}", num_1));

  }
}