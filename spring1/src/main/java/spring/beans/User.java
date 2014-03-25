package spring.beans;

import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {

	private String firstName;
	private String lastName;
	private Integer age;
	
	@Autowired
	private Profil profil;
	
	private Map<String, String> mapAdress;
	
	private Properties userProperties;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setMapAdress(Map<String, String> mapAdress) {
		this.mapAdress = mapAdress;
	}
	
	public void setUserProperties(Properties userProperties) {
		this.userProperties = userProperties;
	}	
	public User(String firstName, String lastName, Integer age) {
		this(firstName, lastName);
		this.age = age;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void printUser(){
		System.out.println("Nom : " + firstName + " "+lastName);
		System.out.println("Age : " + age);
		if(null != mapAdress && !mapAdress.isEmpty()){
			System.out.println("Liste des adresses : ");
			for(String adrKey : mapAdress.keySet()){
				System.out.println(adrKey +" : "+ mapAdress.get(adrKey));
			}
		}
		System.out.println("Emails : " + userProperties.getProperty("email"));
		if(null != profil){
			System.out.println("Je suis un : "+profil.getProfilName());
		}
	}
	
}
