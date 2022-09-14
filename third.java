class third {
  public static void main(String[] args) {
    int n = 10, fTerm = 0, sTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");
    for (int i = 1; i <= n; ++i) {
      System.out.print(fTerm + ", ");
      int nextTerm = fTerm + sTerm;
      fTerm = sTerm;
      sTerm = nextTerm;
    }
  }
}

