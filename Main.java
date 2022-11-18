package mypack;
import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String args[]){
		System.out.println("hello world");
		MenuItem item1 = new MenuItem("hot cocoa", "drink", 10.46f);
		MenuItem item2 = new MenuItem("burger", "food", 15f);
		MenuItem item3 = new MenuItem("water", "drink", 2f);
		MenuItem menu[]= {item1, item2, item3};
		CoffeShop shop = new CoffeShop("my Shop", menu);
		shop.addOrder("tea");
		shop.addOrder("hot cocoa");
		shop.addOrder("hot cocoa");
		shop.addOrder("hot cocoa");
		System.out.println(shop.dueAmount());
		shop.fulfillOrder();
		String orderList[] = shop.listOrders();
		if (orderList.length == 0){
			System.out.println("the array is empty");
		}
		System.out.println("the cheapest item in the menu is "+ shop.cheapestItem());
	}
}