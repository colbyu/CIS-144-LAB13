/** This class provides the main engine of the program. 
*It creates and maintains the array list and calls external 
*classes that manipulate the data in the array list.
*/

package lab13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import lab13.Displayer;
import lab13.Sorter;
import lab13.Calculator;
/**
 *
 * @author colby
 */
public class DataAnalytics 
    {
    static int min = 0, max = 0;
    Displayer d = new Displayer();
    Sorter s = new Sorter();
    Calculator c = new Calculator();
    public void Engine()
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
            // read the data
            FileReader fileIn = new FileReader("outData.txt");
            BufferedReader fin = new BufferedReader(fileIn);
            while ((line = fin.readLine()) != null) 
                {
                num = Integer.parseInt(line);
                list.add(num);
                System.out.println(num);
                }
            System.out.println("thank you ... the data has been received!");
            fin.close();
            fileIn.close();
            System.out.println("Unsorted Data:");
            d.DisplayData(list);
            s.BubbleSort(list);//Sort the data!!!
            System.out.println("Sorted Data:");
            d.DisplayData(list);
            c.Calculations(list);  //display max, min, and other calculated values
            } 
        catch (Exception e) 
            {
            // catch an exception if any arises
            System.err.println("Error: " + e.getMessage());
            }
        }
    }