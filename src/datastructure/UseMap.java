package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

        List<String> name = new ArrayList<>();

        name.add("New York");
        name.add("Dhaka");
        name.add("London");
        name.add("Rome");

        List<String> sb = new ArrayList<>();

        sb.add("USA");
        sb.add("BANGLADESH");
        sb.add("UK");
        sb.add("ITALY");

        LinkedHashMap<String, List<String>> country = new LinkedHashMap<>();
        country.put("City Name:", name);
        country.put("Country Name:", sb);

        for (Map.Entry entry : country.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());



        }
	}

}
