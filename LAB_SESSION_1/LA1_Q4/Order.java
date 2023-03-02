//ITITWE21039_HUYNH PHUONG DAI
package LA1_Q4;
import java.util.ArrayList;
public class Order {
    ArrayList<Item> items = new ArrayList<Item>();

    public double calculateAverageCost(ArrayList<Item> arr) {
        //function to calculate average
        double sum = 0;
        int n = arr.size();
        for(Item i : arr) {
            //iterate over the Ecommerces list
            System.out.println(i.name);
            sum = sum + i.price;
        }
        return sum/n;
    }
}
