package CustomerDbOperationsPackage;

public class Customer {
	private int id,age;
	private String socialSecurityId,name,surname;
	Customer(int id,String socialSecurityId ,String name,String surname,int age){
		this.id=id;
		this.socialSecurityId=socialSecurityId;
		this.name=name;
		this.surname=surname;
		this.age=age;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSocialSecurityId() {
		return socialSecurityId;
	}
	public void setSocialSecurityId(String socialSecurityId) {
		this.socialSecurityId = socialSecurityId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String[] toStringArray() {
		return new String[] {Integer.toString(this.id),this.socialSecurityId,this.name,this.surname,Integer.toString(this.age)}; 
	}
	

}
