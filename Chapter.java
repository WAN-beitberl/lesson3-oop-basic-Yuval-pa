package mypack2;
import java.util.*;
import java.lang.*;
public class Chapter{
	private String name;
	private int startingPage;
	public Chapter(String name, int startingPage){
		this.name= name;
		this.startingPage=startingPage;
	}
	public String getName(){
		return this.name;
	}
	public int getStartingPage(){
		return this.startingPage;
	}
}