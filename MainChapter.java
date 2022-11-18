package mypack2;
import java.util.*;
import java.lang.*;
public class MainChapter{
	public static void main(String args[]){
		System.out.println("hello world");
		Chapter book[] = {
			new Chapter("Chapter four", 46),
			new Chapter("Chapter five", 54),
};
		System.out.println(nearestChapter(book,50));
	}
	public static String nearestChapter(Chapter book[], int currentPage){
		int distCurrentChapter;
		int distNextChapter;
		for(int i=0;i<book.length -1; i++)
		{
			distCurrentChapter = currentPage - book[i].getStartingPage(); 
			distNextChapter = currentPage-book[i+1].getStartingPage();
			if(Math.abs(distCurrentChapter)<Math.abs(distNextChapter)){
				return book[i].getName();
			}
			else if (Math.abs(distCurrentChapter)==Math.abs(distNextChapter)){
				return book[i+1].getName();
			}
		}
		return book[book.length-1].getName();
	}
			
}