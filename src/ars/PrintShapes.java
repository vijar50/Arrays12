public class PrintShapes {

  public static void main(String[] args){
//Replace * with the next number
    for(int i = 1;i<=6;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      for(int k = 6; k > i; k--){
        System.out.print("*");
      }
      System.out.println();
    }
//Replace 12345 with & sequentially
    System.out.println();
    for(int i = 6;i>=1;i--){
      for(int j=1;j<i;j++){
        System.out.print(j);
      }
      for(int k = 6; k > i; k--){
        System.out.print("&");
      }
      System.out.println();
    }
    System.out.println();
//Print a Triangle
    System.out.println("@");
    for(int i = 5;i>=1;i--){
      System.out.print("@");
      for(int j=5;j>=i;j--){
        System.out.print(" ");
      }
      System.out.println("@");
    }
    for(int j = 5; j>0;j--){
      System.out.print("@ ");
    }
  }
}
