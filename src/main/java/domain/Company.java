package domain;

public class Company
{
	private String	name;
	private byte[]	image;
	
	public Company(String name, byte[] image)
	{
		super();
		this.name = name;
		this.image = image;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public byte[] getImage()
	{
		return image;
	}
	
	public void setImage(byte[] image)
	{
		this.image = image;
	}
	
}
