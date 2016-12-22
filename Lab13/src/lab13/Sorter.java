/** This class is responsible for sorting the data in
 * the array list.
*/

package lab13;

import java.util.ArrayList;
/**
 *
 * @author colby
 */
public class Sorter 
    {
    public void BubbleSort(ArrayList<Integer> num) 
        {
        int j = 0;
        boolean flag = true;  // set the flag to true to begin first pass
        int temp = 0;  // define the holding variable
        while (flag) 
            {
            flag = false; //set flag to false awaiting a possible swap
            for (j = 0; j < num.size() - 1; j++) 
                {
                if (num.get(j) > num.get(j + 1)) // for descending sort change to <
                    {
                    temp = num.get(j); //swap the elements
                    num.set(j, num.get(j + 1));
                    num.set(j + 1, temp);
                    flag = true; //shows a swap occurred  
                    }
                }
            }
        }
    }
