/** This class is responsible for displaying the data in
 * the array list.
*/

package lab13;

import java.util.ArrayList;
/**
 *
 * @author colby
 */
public class Displayer 
    {
    public void DisplayData(ArrayList<Integer> num) 
        {
        for (int i = 0; i < num.size(); i++) 
            {
            System.out.println(num.get(i).toString());
            }
        }
    }
