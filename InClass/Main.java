
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String numInput = in.nextLine();
        int n = Integer.parseInt(numInput);
        System.out.print("Enter text: ");
        String s = in.nextLine();
        
        String str = "102";
        int num = Integer.parseInt(str);
        
        System.out.println(str + n);
        System.out.println(num + n);
        
    }
}

