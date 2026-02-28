import java.util.Scanner;

public class arraysum {
   public arraysum() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int[] var2 = new int[6];
      int var3 = 0;
      System.out.println("Enter 6 elements:");

      for(int var4 = 0; var4 < var2.length; ++var4) {
         var2[var4] = var1.nextInt();
         var3 += var2[var4];
      }

      System.out.println("Array elements are:");

      for(int var5 = 0; var5 < var2.length; ++var5) {
         System.out.println(var2[var5]);
      }

      System.out.println("summ is" + var3);
   }
}