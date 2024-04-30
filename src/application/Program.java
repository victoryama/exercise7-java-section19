package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.00));
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("Tablet", 400.00));
		
		Product prod = new Product("Notebook", 1200.00);
		
		System.out.println("Set:");
		System.out.println(set.contains(prod));
		
		
		System.out.println("\nTreeset:");
		
		Set<Product> treeSet = new HashSet<>();
		
		treeSet.add(new Product("TV", 900.00));
		treeSet.add(new Product("Notebook", 1200.00));
		treeSet.add(new Product("Tablet", 400.00));
		for (Product p : treeSet) {
			System.out.println(p);
		}

	}

}
