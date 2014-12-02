/*
 * Created by Mehmet ONLER on 02.12.2014
 */
package model;

public class Test {

	public static void main(String[] args) {
		StoreModel s = new StoreModel();
//		s.addUser("mehmet");
//		s.addUser("ahmet");
//		s.addUser("ayse");
//		s.addUser("fatma");
//		s.addUser("hayriye");
//		
//		s.addProduct(ProductType.Software, "aaa", 20.7);
//		s.addProduct(ProductType.Book, "bbb", 8.10);
//		s.addProduct(ProductType.MusicsCD, "ccc", 5.0);
//		s.addProduct(ProductType.MusicsCD, "ddd", 50.95);
//		s.addProduct(ProductType.Book, "eee", 30.85);
//		s.addProduct(ProductType.Software, "fff", 40.0);
//		s.addProduct(ProductType.Book, "aaasdadasdaa", 19.95);
//		s.addProduct(ProductType.MusicsCD, "qweqweqweq", 10.0);
//		s.addProduct(ProductType.Software, "12312312", 2.0);
		
		System.out.println(s.getProductList());
		System.out.println(s.getUserList());
//		s.editUser(2, UserType.Admin, "mhmtnlr");
	}

}
