import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Program 
{
    
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        
        List<String> list=new ArrayList<String>();
        
        for (int i=0;i<N;i++) 
        {   
            String firstName=sc.next();
            String emailID=sc.next();
            String regExPattern="[a-z].@gmail.com";

            Pattern p=Pattern.compile(regExPattern);
            Matcher m=p.matcher(emailID);
            
            if (m.find()) 
            {    
                list.add(firstName);
            }

        }
        Collections.sort(list);
        
        for (String string :list) 
        {
            
            System.out.println(string);
            
        }
        
    }
}
