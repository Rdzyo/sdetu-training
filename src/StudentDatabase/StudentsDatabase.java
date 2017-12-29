package StudentDatabase;

public class StudentsDatabase {

	public static void main(String[] args) {
		Student stu1 = new Student("Jim","Kovalsky","124153763", 1500.50);
		//Student stu2 = new Student("Thomas","Kovalsky","190283109", 1200);
		//Student stu3 = new Student("Ronald","Thumb","892583909", 1600);
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.pay(200);
		stu1.setCity("New York City");
		stu1.setState("New York");
		stu1.setPhone("123192849");
		System.out.println(stu1.toString());
	}

}
class Student implements ICourses
{
	private static int iD = 1000;
	private String name;
	private String surname;
	private String userID;
	private String email;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private double balance;
	
	public Student( String name, String surname, String SSN, double initDeposit)
	{
		this.name = name;
		this.surname = surname;
		this.SSN = SSN;
		this.balance = initDeposit;
		System.out.println("Name: " + name + " " + surname + " SSN: " + SSN);
		iD++;
		setEmail();
		setUserID();
	}
	private void setEmail()
	{
		email = name.substring(0,3) + surname.substring(0,3) + "@uni.edu";
		System.out.println("Your university's email is : " + email);
	}
	private void setUserID()
	{
		int random = (int) (Math.random() * 10000);
		userID = iD + "" + random + SSN.substring(5, 9);
	}
	public void showCourses()
	{
		course[0] = "Computer Science";
		course[1] = "Chemistry";
		course[2] = "Biology";
		course[3] = "Maths";
		System.out.println("You attend to courses: ");
		for(int i = 0;i<4;i++)
		{
			System.out.println(course[i]);
		}
	}
	public void enroll()
	{
		System.out.println("You have succesfuly enrolled!");
	}
	public void pay(double amount)
	{
		balance = balance - amount;
		System.out.println("Paying: $" + amount);
		checkBalance();
	}
	public void checkBalance()
	{
		System.out.println("Your account balance: $" + balance);
	}
	public String toString()
	{
		return "[UserID: " + userID + "]\n[Name: " + name + "]\n[Surname: " + surname + "]\n[SSN: " + SSN + "] \n[City " + city + "]" ;
	}
	
	// getters and setters
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getState()
	{
		return state;
	}
}
