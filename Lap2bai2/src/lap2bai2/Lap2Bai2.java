
package lap2bai2;
import java.util.Scanner;
public class Lap2Bai2 {

    public static void main(String[] args) {
        boolean cout = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the string: ");
                String tenLop = sc.next();
                if ( tenLop.matches("SE(.*)") == false )
                    throw new Exception();
                System.out.println("The string is " + tenLop);
                cout = false;
            }
            catch( Exception e ){
                System.out.println("The string is invalid");
                cout = true;
            }
        }
        while ( cout );          
    }
}
