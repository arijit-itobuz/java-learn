import java.io.Console;
import java.util.Scanner;

public class java_07_input {

  public static void _scanner() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter _nextline: ");
    String _nextline = scan.nextLine(); // can take spaces
    System.out.println("_nextline: " + _nextline);

    System.out.print("Enter _next: ");
    String _next = scan.next(); // cannot take spaces
    scan.nextLine(); // to flush the \n added due to enter
    System.out.println("_next: " + _next);

    System.out.print("Enter _int: ");
    int _int = scan.nextInt();
    System.out.println("_int: " + _int);

    scan.close();
  }

  public static void _console() {
    Console console = System.console();

    System.out.print("Enter text: ");
    String _readLine = console.readLine();
    System.out.println("_readPassword: " + _readLine);

    System.out.print("Enter password: ");
    char[] _readPassword = console.readPassword();
    System.out.println("_readPassword: " + new String(_readPassword));
  }

  public static void main(String[] args) {
    _scanner();
    _console();
  }
}
