package JFS.BookShopApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class MyBook {
		
		@Autowired
		@Qualifier("myFavBook")
		MyFavBook myfavbook;
		@Autowired
		MyFirstBookImpl myfirstBookImpl;
		@Autowired
		MyFirstBookInterface myFirstBookInterface;
		public MyFavBook getMyFavbook() {
			return myfavbook;
		}
		
		public void setMyfavbook(MyFavBook myfavbook) {
			this.myfavbook=myfavbook;
		}
		
		public void displayMyBook() {
			System.out.println("MY BOOK NAME IS JAVA 17");
			myfavbook.myfavbk();
			myfavbook.my1stBook();
			myfirstBookImpl.my1stBook();
			myFirstBookInterface.my1stBook();
		}
}