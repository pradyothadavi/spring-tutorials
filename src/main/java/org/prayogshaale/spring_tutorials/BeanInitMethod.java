/**
 * 
 */
package org.prayogshaale.spring_tutorials;

/**
 * @author pradyot.ha
 */
public class BeanInitMethod
{
	private static final String DEFAULT_NAME = "Pradyot H Adavi";

	private String name = null;
	private int age = Integer.MIN_VALUE;

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("BeanInitMethod [");
		if (name != null)
		{
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		builder.append("age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Method that is called during pre-initialization
	 */
	public void init()
	{
		System.out.println("Initializing Bean");
		if (null == name)
		{
			System.out.println("Using default name");
			name = DEFAULT_NAME;
		}

		if (Integer.MIN_VALUE == age)
		{
			throw new IllegalArgumentException("You must set the age property of any beans of type : "
			        + BeanInitMethod.class);
		}
	}
}
