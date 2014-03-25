package spring.exemple;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.beans.User;

public class Lesson1 {

	
	 public static void main( String[] args )
	    {
	    	ApplicationContext context = new
	    			FileSystemXmlApplicationContext("applicationContext.xml");
	    	
	    	String beanId = "userConstr";
	    	User user = (User)context.getBean(beanId);
	    	user.printUser();
	    	
	    	// Si singleton
	    	System.out.println("Si singleton : "+context.isSingleton(beanId));
	    	// Type
	    	System.out.println("Type Bean : "+context.getType(beanId));
	    	// si contient un bean
	    	System.out.println("si contient un bean : "+context.containsBean(beanId));
	    	// alias
	    	System.out.println("Alias : "+Arrays.asList(context.getAliases(beanId)));
	    					
	    }
}
