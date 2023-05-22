package classandobject;

class Author
{
	private String name;
	private String email;
Author(String name,String email) {
	this.name=name;
	this.email=email;
}
public String getname(){
	return name;
}
public String getemil() {
	return email;
}
public String toString() {
	return "author[name:" +name + ",email: " + email+"]";
}
}
class Book{
	private String name;
	private String author;
	private double price;
	private int qtyinstock;
	
Book(String name,String author,double price,int qtyinstock){
	
	this.name=name;
	this.author=author;
	this.price=price;
	this.qtyinstock=qtyinstock;
}
public String getname() {
	return name;
}
public String getAuthor() {
	return author;
}
public double getprice() {
	return price;
}
public void setprice(double price) {
	this.price=price;
}
public int qtyinstock() {
	return qtyinstock;
}
public void setqtyinstock(int qtyinstock) {
	this.qtyinstock=qtyinstock;
}
public String toString() {
	return "book name: "+name+",author: "+author+",price: "+price+",qtyinstock: "+qtyinstock;
}
}
public class auth {
	
	public static void main(String[] args) {
		Author Author=new Author("limat","limat@gmail.com");
		Book book=new Book("master of java","abcde",299.0,80);
	System.out.println(book);
	}

}
