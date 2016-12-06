
package lab13;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
// Sammy Student: Data Analysis with Java File Processing

class DataAnalytics
{
public static void main(String args[])
{
  // declare an object to receive the data
  Scanner scan = new Scanner(System.in);
  // declare an array list to hold the data
  ArrayList<Integer> list;
  list = new ArrayList<Integer>();
  int count = 0;
  int num = 0;
  int val = 0;
  String line = "";

  try
  {
    // create or append to the file 
    FileWriter fileOut = new FileWriter("outData.txt");
    BufferedWriter fout = new BufferedWriter(fileOut);
    
    System.out.println("how many data items?");
    count = scan.nextInt();
    for (int i = 1; i <= count; i++)
    {
      System.out.println("enter a data value");
      val = scan.nextInt();
      fout.write(val + "\n");
    }
    System.out.println("thank you ... the data has been recorded!");
    
    // close the output stream objects
    fout.close();
    fileOut.close();

    scan.close();
  }
  catch(Exception e)
  {
    // catch an exception if any arises
    System.err.println("Error: " + e.getMessage());
  }
}
}
