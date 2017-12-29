package oop;

class Person
{
	String name;
	String email;
	String phone;
	
	void walk()
	{
		System.out.println(name + " is walking");
	}
	void eat()
	{
		System.out.println(email);
	}
	void sleep()
	{
		System.out.println(name + " is sleeping");
	}
}


public class Demo {
	
	public static void main(String[] args)
	{
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@testmail.com";		
		person1.phone = "192819491";
		
		person1.walk();
		
		
		Person person2 = new Person();
		person2.name = "Sarah";
		
		
		person2.sleep();
		
		/*String name = "Joe";
		String email = "joe@testmail.com";
		String phone = "9125831923";
		
		walking(name);
		//System.out.println(name + " is walking");
		System.out.println(name + " is eating");
		
	}
	
	static void walking(String name)
	{
		System.out.println(name + " is walking");
	}*/

}
}

