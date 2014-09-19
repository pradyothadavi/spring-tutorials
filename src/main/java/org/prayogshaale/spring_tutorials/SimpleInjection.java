/**
 * 
 */
package org.prayogshaale.spring_tutorials;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author pradyot.ha
 */
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
