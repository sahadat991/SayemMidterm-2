package datastructure;

import javax.lang.model.element.Element;
import java.util.*;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

        Queue<String> k = new LinkedList<>();

        k.add("NY");
        k.add("DC");
        k.offer("NH");
        k.offer("TX");

            System.out.println(k.peek());

            System.out.println(k.poll());
            System.out.println(k.peek());

        k.remove("DC");
            System.out.println();

        for (String q : k) {
            System.out.println(q);
        }

            System.out.println();

        Iterator it = k.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
