package com.wipro.encapsulation;

public class Book {
	private String bname;
	private Author bauthor;
	private double price;
	private int qtyInstock;
	public Book(String bname,Author bauthor,double price,int qtyInstock) {
		this.bname=bname;
		this.bauthor=bauthor;
		this.price=price;
		this.qtyInstock=qtyInstock;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Author getBauthor() {
		return bauthor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInstock() {
		return qtyInstock;
	}
	public void setQtyInstock(int qtyInstock) {
		this.qtyInstock = qtyInstock;
	}
	public static void main(String [] args) {
		Book b= new Book("Compilers",new Author("Alfred","alfred@gmail.com",'M'),290.0,5);
		b.setPrice(310.5);
		b.setQtyInstock(4);
		System.out.println("The name of book is "+b.getBname());
		System.out.println("The details of the author are: name- "+b.getBauthor().getName()+" email- "+b.getBauthor().getEmail()+" and gender- "+b.getBauthor().getGender());
		System.out.println("Number of copies and price of each copy is "+b.getQtyInstock()+", "+b.getPrice());
	}
}
