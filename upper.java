class Main {

  public static void main(String args[]) {
    int n = 5;

    

    for (int i = n - 0; i >= 1; i--) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }

      for (int j = i; j <= n; j++) {
        System.out.print( "* ");
      }
      System.out.println();
    }
  }
}
