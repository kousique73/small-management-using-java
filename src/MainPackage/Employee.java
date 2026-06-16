package MainPackage; 

public class Employee 
{
	String name;
	String id;
	String age;
	String nationality;
	String designation;
	
	public Employee(String name,String id,String ageInt, String nationality,String designation) {
		this.name= name;
		this.id= id;
		this.age=ageInt;
		this.nationality=nationality;
		this.designation=designation;
  }
	
	public Employee(){

	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setId(String id) 
	{
		this.id=id;
	}
	public void setAge(String age) 
	{
		this.age=age;
	}
	public void setNationality(String nationality) 
	{
		this.nationality=nationality;
	}
	public void setDesignation(String designation) 
	{
		this.designation=designation;
	}
	
	public String getName() 
	{
		return this.name;
	}
	public String getId() 
	{
		return this.id;
	}
	public String getAge() 
	{
		return this.age;
	}
	public String getNationality() 
	{
		return this.nationality;
	}
	public String getDesignation() 
	{
		return this.designation;
	}


    public String toString(){
		StringBuilder string = new StringBuilder();

		string.append(this.getName()+" ");
		string.append(this.id+" ");
		string.append(this.age+" ");
		string.append(this.nationality+" ");
		string.append(this.designation+"\n");


		return string.toString();
	}

}