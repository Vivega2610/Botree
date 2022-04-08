package JFS.BookShopApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class MyFavBook implements MyFirstBookInterface{
	
	public void myfavbk() {
		System.out.println("My favorite book");
	}
	public void my1stBook() {
		System.out.println("im from interface: implements MyFavBook class");
	}
	public void my1stBook1() {
		System.out.println("im inside");
	}

}
