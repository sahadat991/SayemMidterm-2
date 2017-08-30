package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Object> arrayList = new ArrayList<>();

		arrayList.add("Dhaka");
		arrayList.add("Noakhali");
		arrayList.add("Cox's Bazar");
		arrayList.add("Rangpur");
		arrayList.add("Faridpur");
		arrayList.add("Khulna");




		arrayList.remove(2);


		for (Object name : arrayList) {
			System.out.println(name);
		}
		System.out.println();

		Iterator it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

			ConnectDB connectDB = new ConnectDB();
			connectDB.InsertDataFromArrayListToMySql(arrayList, "Users", "Name");
			connectDB.readDataBase("Users", "Name");
		}
	}

		public static void printForeach(List<Object>arrayList){

	}
		}
