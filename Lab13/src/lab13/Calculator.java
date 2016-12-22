/** This class is responsible for performing calculations on the data in
 * the array list..
*/

package lab13;

import java.util.ArrayList;
/**
 *
 * @author colby
 */
public class Calculator 
    {
    public void Calculations(ArrayList<Integer> num)
    {
    float sum = 0, min = 0, max = 0;
    min = num.get(0);
    max = num.get(num.size()-1);
    for (int i = 0; i<num.size();++i)
        {
        sum += num.get(i);
        }
    float avg = (sum/num.size());
    System.out.println("Min Value Entered = " + min);
    System.out.println("Max Value Entered = " + max);
    System.out.println("Total of the Values = " + sum);
    System.out.println("Average of the Values = " + avg);
    }
    }
