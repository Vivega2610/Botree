package JFS.BookShopApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
//@SuppressWarnings("resource")
      ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       MyBook myBook=context.getBean(MyBook.class);
       myBook.displayMyBook();
       //MyFavBook mynewclass=context.getBean(MyFavBook.class);
       //mynewclass.myfavbk();
      // MyFavBook myfavbook=context.getBean(MyFavBook.class);
       //myfavbook.myfavbk();
    }
}
