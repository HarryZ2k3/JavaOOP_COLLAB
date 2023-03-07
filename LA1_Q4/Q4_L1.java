//ITITWE21039_HUYNH PHUONG DAI
package LA1_Q4;
import java.util.Scanner;
public class Q4_L1 
{   
    public static void main(String[] args)
    {
        Order firstOrder = new Order();
        boolean choice = true;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please provide the order details:");
            do {
                Item it = new Item();
                System.out.println("Enter the item name: ");
                it.name = sc.next();
                System.out.println("Enter the item id: ");
                it.id = sc.nextInt();
                System.out.println("Enter the item price: ");
                it.price = sc.nextDouble();
                System.out.println("Have more items? Press y/n");
                String ch = sc.next();
                firstOrder.items.add(it);
                if(ch.equalsIgnoreCase("y")) {
                    choice = true;
                } else {
                    choice = false;
                }
            } while (choice);
        }

        System.out.println("Average cost of the order is: " + firstOrder.calculateAverageCost(firstOrder.items));
    }
}
