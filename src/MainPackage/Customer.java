package MainPackage; 

public class Customer 
{
	String name;
	String nid;
	int age;
	int phoneNumber;
	String nationality;

	public Customer(){

	}

	public Customer(String name,String nid,
	int age,int phoneNumber,String nationality)
	{
		this.name=name;
		this.nid=nid;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.nationality = nationality;

	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setNid(String nid) 
	{
		this.nid=nid;
	}
	public void setAge(int age) 
	{
		this.age=age;
	}
	public void setphoneNumber(int phoneNumber) 
	{
		this.phoneNumber=phoneNumber;
	}
	public void setNationality(String nationality) 
	{
		this.nationality=nationality;
	}
	
	
	public String getName() 
	{
		return this.name;
	}
	public String getNid() 
	{
		return this.nid;
	}
	public int getAge() 
	{
		return this.age;
	}
	public int getphoneNumber() 
	{
		return this.phoneNumber;
	}
	public String getNationality() 
	{
		return this.nationality;
	}


	public String toString(){
		StringBuilder string = new StringBuilder();

		string.append(this.name+" ");
		string.append(this.nid+" ");
		string.append(this.age+" ");
		string.append(this.phoneNumber+" ");
		string.append(this.nationality+"\n");


		return string.toString();
	}
	
}