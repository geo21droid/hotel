package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new  ArrayList<>();
		
		list.add("Maria");
		list.add("geovane");
		list.add("ana");
		list.add("linda");
		list.add(2, "marco");
		
		System.out.println(list.size());
		
		list.remove("ana");
		for (String x : list) {
			System.out.println(x);
		}

	}

}
