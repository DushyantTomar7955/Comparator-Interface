package com.jspider;

import java.util.Arrays;
import java.util.Comparator;

class Book{
	private String title;
	private double price;
	private int yop;
	private String author;
	Book(String title,double price,int yop,String author){
		this.title=title;
		this.price=price;
		this.yop=yop;
		this.author=author;
	}
	public String toString() {
		return "["+title+","+price+","+yop+","+author+"]";
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public int getYop() {
		return yop;
	}
	public String getAuthor() {
		return author;
	}
}

class SortAccordingToName implements Comparator{
	public int compare(Object o1,Object o2) {
		Book b1=(Book)o1;
		Book b2=(Book)o2;
		return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
		
	}
}
public class BookMain {

	public static void main(String[] args) {
	  Book b[]=new Book[3];
	  b[0]=new Book("Programming",500.00,2022,"Prachi Joshi");
	  b[1]=new Book("Data Structure",350,2021,"Pragya Chabbra");
	  b[2]=new Book("Concrete Cement",250,2020,"Neha Chauhan");
	  for(int i=0;i<3;i++) {
		  System.out.println(b[i]);
	  }
     Arrays.sort(b,new SortAccordingToName());
     System.out.println("================================");
     for(int i=0;i<3;i++) {
		  System.out.println(b[i]);
	  }
	}

}
