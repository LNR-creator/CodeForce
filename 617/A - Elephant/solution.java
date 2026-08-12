import java.util.Scanner;
 
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
 
        int[] arr = { 1, 2, 3, 4, 5 };
 
        int moves = a / 5;
        int rem = a % 5;
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == rem) {
                moves++;
                break;
            }
        }
 
        System.out.println(moves);
 
    }
}