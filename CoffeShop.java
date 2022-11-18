package mypack;
import java.util.*;
import java.lang.*;	
public class CoffeShop{
	private String name;
	private MenuItem menu[];
	private LinkedList<String> orders;
	private boolean isOrdersEmpty;
	
	public CoffeShop(String name, MenuItem menu[]){
		this.name=name;
		this.menu=menu;
		this.orders = new LinkedList<String>();
	}
	public void addOrder(String itemName)
	{
		boolean flag= false;
		// checks if the item is in the menu
		for(int i = 0; i<this.menu.length; i++)
		{
			if(itemName.equals(this.menu[i].getItem())){
				flag=true;
				break;
			}
		}
		// the item is not in the menu
		if(flag == false)
		{
			System.out.println("This item is currently unavailable!");
		}
		// addes the item to the menu
		else{		
			this.orders.addFirst(itemName);
			System.out.println("Order added!");
		}
	}
	public void fulfillOrder(){
		String item = this.orders.pollLast();
		// the list of orders is empty
		if(item == null){
			System.out.println("All orders have been fulfilled!");
		}
		else{
			System.out.println("The " + item + " is ready!");
		}
	}
	// returns the list of order taken or an empty array if ther is non
	public String[] listOrders(){
		//converting to object array
		Object[] arr = this.orders.toArray();
		//converts the object to string
		return Arrays.copyOf(arr, arr.length, String[].class);
	}
	// returns the total price of all the orders
	public float dueAmount(){
		String list[] = listOrders();
		int itemIndex;
		float sum = 0f;
		for(int i = 0; i<list.length;i++){
			for(itemIndex = 0; itemIndex < this.menu.length; itemIndex++){
				if(list[i].equals(this.menu[itemIndex].getItem())){
					break;
				}
			}
			sum += this.menu[itemIndex].getPrice();
		}
		return (float)Math.round(sum*100.0f)/100.0f;
	}
	// returns the name of the cheapest item in the menu
	public String cheapestItem(){
		float min;
		String name;
		min=this.menu[0].getPrice();
		name = this.menu[0].getItem();
		for(int i = 1;i<this.menu.length;i++){
			if(min>this.menu[i].getPrice()){
				min = this.menu[i].getPrice();
				name = this.menu[i].getItem();
			}
		}
		return name;
	}
	// returns only the names of the drinks in the menu
	public ArrayList<String> drinksOnly(){
		ArrayList<String> drinks =  new ArrayList<String>();
		for(int i=0;i<this.menu.length;i++){
			if((this.menu[i].getType()).equals("drink")){
				drinks.add(this.menu[i].getItem());
			}
		}
		return drinks;
	}
	// returns only the names of the food in the menu
	public ArrayList<String> foodOnly(){
		ArrayList<String> food =  new ArrayList<String>();
		for(int i=0;i<this.menu.length;i++){
			if((this.menu[i].getType()).equals("food")){
				food.add(this.menu[i].getItem());
			}
		}
		return food;
	}
}
	