/**
 * 
 */
package org.prayogshaale.spring_tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pradyot.ha
 */
@Service ("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider
{

	private String message;

	/**
	 * @param message
	 */
	@Autowired
	public ConfigurableMessageProvider(String message)
	{
		this.message = message;
	}

	public String getMessage()
	{
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}

}
