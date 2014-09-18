/**
 * 
 */
package org.prayogshaale.spring_tutorials;

import org.springframework.stereotype.Service;

/**
 * @author pradyot.ha
 */
@Service ("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider
{

	public String getMessage()
	{
		return "Hello World !!!";
	}

}
