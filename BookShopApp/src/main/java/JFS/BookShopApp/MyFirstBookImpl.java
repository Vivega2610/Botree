package JFS.BookShopApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
	
	public class MyFirstBookImpl implements MyFirstBookInterface {
	
public void my1stBook() {
			System.out.println("im from MyFirstBookInterface");
		}
	
	
}
