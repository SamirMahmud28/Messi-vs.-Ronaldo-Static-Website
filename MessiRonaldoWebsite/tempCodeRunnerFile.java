import java.util.Scanner;
public class Main {
 public static void main(String[] args)
 {
 Scanner input = new Scanner(System.in);
 System.out.println("please enter the value of n :");
 int n = input.nextInt();
 int row,col,c;
 for (row=1; row<=n; row++){
 for(col=1; col<=n-row; col++) {
 System.out.print(" ");
 }
 for(col=1,c=65; col<=row; col++,c++) {
 System.out.print((char)c);
 }
 System.out.println();
 }
 for (row=n-1; row>=1; row--){
 for(col=1; col<=n-row; col++) {
 System.out.print(" ");
 }
 for(col=1,c=65; col<=row; col++,c++) {
 System.out.print((char)c);
 }
 System.out.println();
 }
 }
}
