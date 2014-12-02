package model;
import java.util.HashSet;
import java.util.Hashtable;


public class Test {

	public static void main(String[] args) {
//		Product p = new Product(ProductType.Book,"asdas",123);
//		System.out.println(p.toString());
//		Product p1 = new Product(ProductType.Book,"asdas",123);
//		System.out.println(p1.toString());
//		Product p2 = new Product(ProductType.Book,"asdas",123);
//		System.out.println(p2.toString());
		
		StoreModel sm = new StoreModel();
		
		sm.addUser("mhmtnlr");
		System.out.println(sm.toString());
		sm.addUser("admin");
		
		System.out.println(sm.toString());
		System.out.println(sm.doesUserExist("mhmtnlr"));
		System.out.println(sm.doesUserExist("admin1"));
	}

}
