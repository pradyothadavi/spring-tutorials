/**
 * 
 */
package org.prayogshaale.spring_tutorials;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author pradyot.ha
 */

// @Component - Use when a class provides business service to other layers in the application
@Service ("simpleInjection")
public class SimpleInjection
{
	@Value ("Pradyot H Adavi")
	private String name;

	@Value ("25")
	private int age;

	@Value ("5.11")
	private float height;

	@Value ("true")
	private boolean programmer;

	@Value ("788400000")
	private Long ageInSeconds;

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

	/**
	 * @return the height
	 */
	public float getHeight()
	{
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height)
	{
		this.height = height;
	}

	/**
	 * @return the programmer
	 */
	public boolean isProgrammer()
	{
		return programmer;
	}

	/**
	 * @param programmer the programmer to set
	 */
	public void setProgrammer(boolean programmer)
	{
		this.programmer = programmer;
	}

	/**
	 * @return the ageInSeconds
	 */
	public Long getAgeInSeconds()
	{
		return ageInSeconds;
	}

	/**
	 * @param ageInSeconds the ageInSeconds to set
	 */
	public void setAgeInSeconds(Long ageInSeconds)
	{
		this.ageInSeconds = ageInSeconds;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("SimpleInjection [");
		if (name != null)
		{
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		builder.append("age=");
		builder.append(age);
		builder.append(", height=");
		builder.append(height);
		builder.append(", programmer=");
		builder.append(programmer);
		builder.append(", ");
		if (ageInSeconds != null)
		{
			builder.append("ageInSeconds=");
			builder.append(ageInSeconds);
		}
		builder.append("]");
		return builder.toString();
	}

}
