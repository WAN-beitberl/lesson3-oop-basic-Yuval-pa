package mypack;
import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String args[]){
		System.out.println("hello world");
		MenuItem item1 = new MenuItem("hot cocoa", "drink", 10.416f);
		MenuItem menu[]= {item1};
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
	}
}