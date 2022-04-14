//Count the number of digits in a given number. 
import java.util.*;
public class CountDigits {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int count = 0;
    while(n>0) {
      n = n/10;
      count++;
    }
    System.out.print(count);
  }
}
