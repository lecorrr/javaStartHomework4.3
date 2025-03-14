
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Input heigh and width of square: ");

        Scanner sc = new Scanner(System.in);

        int heigh = sc.nextInt();
        int width = sc.nextInt();

        //to avoid additional "if" statments in for loops

        boundary(width);
        body(heigh, width);
        boundary(width);

    }

    public static void boundary(int width)
    
    {
        
        for (int i = width; i > 0; i--) 

        {
            System.out.print("*");
        }

        System.out.println();

    }

    public static void body(int heigh, int width)

    {

        for (int j = heigh; j > 2; j--) {

        System.out.print("*");

        for (int i = width - 1; i > 1; i--) 

        {
            System.out.print(" ");
        }

        System.out.print("*");
        System.out.println();

        }
    }
}
