
package lap2bai1;
import java.util.Scanner;
public class Lap2Bai1 {

    public static void main(String[] args) {
        boolean cout = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int number = sc.nextInt();
                if ( number < 1 )
                    throw new Exception();
                System.out.println("The number is " + number);
                cout = false;
            }
            catch( Exception e ){
                System.out.println("The number is invalid");
                cout = true;
            }
        }
        while ( cout );          
    }
}
