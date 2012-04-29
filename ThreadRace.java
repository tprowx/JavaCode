public class ThreadRace {
  public static void main(String[] args) {
    Runnable travis = new Runner("Travis");
    Runnable chris = new Runner("Chris");

    Thread t1 = new Thread(travis);
    Thread c1 = new Thread(chris);

    t1.start();
    c1.start();
  }
}
