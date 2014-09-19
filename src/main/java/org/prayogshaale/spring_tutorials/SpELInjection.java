/**
 * 
 */
package org.prayogshaale.spring_tutorials;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author pradyot.ha
 */
@Service ("spELInjection")
public class SpELInjection
{
	@Value ("#{simpleInjection.name}")
	private String name;

	@Value ("#{simpleInjection.age + 1}")
	private int age;

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
		builder.append("SpELInjection [");
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

}
