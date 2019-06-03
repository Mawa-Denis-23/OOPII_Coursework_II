package oopii_coursework_ii;
import java.util.ArrayList;
import java.util.Scanner;
public class OOPII_Coursework_II {
    public static void main(String[] args) {
        ArrayList<String>denis=new ArrayList();
      Scanner mawa = new Scanner(System.in);
      System.out.println("Enter students name(Enter exit when done)");
      int x = 1;
      while(true){
      System.out.print("Input Student "+x+": ");
        String r = mawa.next();
      if(r.toLowerCase().equals("exit"))
          break;
      else{
     int[] b = new int[6];
        String[] a = new String[6];
        System.out.println("Enter the first course unit: ");
        a[0] = mawa.next();
        System.out.println("Input "+a[0]+" mark: ");
        b[0] = mawa.nextInt();
        System.out.println("Enter the second course unit: ");
        a[1] = mawa.next();
        System.out.println("Input "+a[1]+" mark: ");
        b[1] = mawa.nextInt();
        System.out.println("Enter the third course unit: ");
        a[2] = mawa.next();
        System.out.println("Input "+a[2]+" mark: ");
        b[2] = mawa.nextInt();
        System.out.println("Enter the fourth course unit: ");
        a[3] = mawa.next();
        System.out.println("Input "+a[3]+" mark: ");
        b[3] = mawa.nextInt();
        System.out.println("Enter the fifth course unit: ");
        a[4] = mawa.next();
        System.out.println("Input "+a[4]+" mark: ");
        b[4] = mawa.nextInt();
        System.out.println("Enter the sixth course unit: ");
        a[5] = mawa.next();
        System.out.println("Input "+a[5]+" mark: ");
        b[5] = mawa.nextInt();
        float avg = ((b[0]+b[1]+b[2]+b[3]+b[4]+b[5])*100)/600;
        System.out.println(r+"'s average is: "+avg+"%");
          denis.add(r);
          x++;
      }
      }
    }
    
}
