package helper;

public class helper {
  public static void line_block(Runnable method) {
    method.run();
    System.out.println("----------------------");
  }
}
