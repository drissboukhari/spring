package spring.exemple;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Lesson2 {

	
	 public static void main( String[] args )
	    {
	    	ApplicationContext context = new
	    			FileSystemXmlApplicationContext("applicationContext.xml");
	    	
	    	String beanId = "emails";
	    	List<String> emails = (List<String>)context.getBean(beanId);
	    	System.out.println(emails);
	    	
	    					
	    }
}
