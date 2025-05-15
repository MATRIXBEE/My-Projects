//  public class pryamid1 {
//      public static void main(String[] args) {
//          int n = 5;
//          for (int i = 1; i <= n; i++) {
            
//              for (int j = i; j < n; j++) {
//                  System.out.print(" ");
//              }
            
//              for (int k = 1; k <= (1 * i - 1); k++) {
//                  System.out.print("*");
//              }
//              System.out.println();
//          }
//      }
    
//  }


public class Pryamid {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) {
                System.out.print( "*");{
                }
            }
            System.out.println();
        }
    }
}

// public class Pryamid {
//     public static void main(String[] args) {
//         int rows = 4;

//         for (int i = rows; i >= 1; i--) {
//             // spaces
//             for (int s = 0; s < rows - i; s++) {
//                 System.out.print("  ");
//             }
//             // stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


