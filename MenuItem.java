package mypack;
import java.util.*;
import java.lang.*;
public class MenuItem{
	private String item;
	private String type;
	private float price;
	
	public MenuItem(String item, String type, float price){
		this.item=item;
		this.type=type;
		this.price=price;
	}
	public String getItem(){
		return this.item;
	}
	public String getType(){
		return this.type;
	}
	public float getPrice(){
		return this.price;
	}
}