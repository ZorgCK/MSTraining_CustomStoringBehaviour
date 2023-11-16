package domain;

import customization.StoreEager;


public class Customer
{
	private String	name;
	private Integer	age;
	@StoreEager
	private Company	company;
	
	public Customer(String name, Integer age, Company company)
	{
		super();
		this.name = name;
		this.age = age;
		this.company = company;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Integer getAge()
	{
		return age;
	}
	
	public void setAge(Integer age)
	{
		this.age = age;
	}
	
	public Company getCompany()
	{
		return company;
	}
	
	public void setCompany(Company company)
	{
		this.company = company;
	}
	
}
