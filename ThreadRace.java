public class ThreadRace {
  public static void main(String[] args) {
    new Thread(new Runner("Travis")).start();
    new Thread(new Runner("Chris")).start();
  }
}
