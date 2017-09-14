
/**
 * purpose:Displap JOption Message Box
 * Created on Sep 14,2017
 * Author Sriti Ahmed
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class DialogeBox{
    public static void main (String [] args){
        //constant
         final double PI = 22/7;
        double n1,n2,product,sum,diff;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first even numbers");
         n1= keyboard.nextDouble();
         System.out.println("Enter second even number");
         n2= keyboard.nextDouble();
         product =n1*n2;


         JOptionPane.showMessageDialog(null,"The product is \"" + product +"\'");
         System.exit(1);




    }
}
