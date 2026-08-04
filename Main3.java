import java.util.Vector; 
public class Main3 { 
public static void main(String[] args) { 
Vector<String> cart = new Vector<>(); 
cart.add("Laptop"); 
cart.add("Mouse"); 
cart.add("Keyboard"); 
System.out.println("Shopping Cart:"); 
System.out.println(cart); 
cart.remove("Mouse"); 
System.out.println("After Removing Mouse:"); 
System.out.println(cart); 
} 
}