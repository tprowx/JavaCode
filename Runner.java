public class Runner implements Runnable {
  private final String name;
  public Runner(String name) {
    this.name = name;
  }

  @Override public void run() {
    bm1();
    System.out.println("Thread \"" + name + "\" Finished!");
  }

  public void bm1() {
    final int N = 20;
    int i;
    int j;
    short t;

    short vec[] = new short[N];

    // seed with descending order

    for (i = 0; i < N; i++)
      vec[i] = (short)(N - i);

    // sort into ascending order

    for (i = 0; i < N - 1; i++) {
      System.out.println("Thread " + name + ": " + i);
      for (j = i + 1; j < N; j++) {
        if (vec[i] > vec[j]) {
          t = vec[i];
          vec[i] = vec[j];
          vec[j] = t;
        }
      }
    }
  }
}
