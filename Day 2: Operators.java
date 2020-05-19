import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); 
        int tipPercent = scan.nextInt(); 
        int taxPercent = scan.nextInt(); 
        scan.close();
      
        double tip = mealCost * (double)tipPercent / 100;
        double tax = mealCost * (double)taxPercent / 100;
        double total = mealCost + tip + tax;
        
    
        int totalCost = (int) Math.round(total);
      
        // Print your result
        System.out.println(totalCost);
    }
}
