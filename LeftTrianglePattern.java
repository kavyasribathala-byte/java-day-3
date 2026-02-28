public class LeftTrianglePattern {
   public static void main(String[] args) {
      int rows = 6;
      for (int i = 1; i <= rows; i++) {
         // Print spaces
         for (int j = 1; j <= rows - i; j++) {
            System.out.print("  ");
         }
         // Print stars
         for (int k = 1; k <= i; k++) {
            System.out.print("* ");
         }
         // Move to next line
         System.out.println();
      }
   }
}