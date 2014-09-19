/**
 * 
 */
package org.prayogshaale.spring_tutorials;


/**
 * @author pradyot.ha
 */
// @Service ("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider
{

	public String getMessage()
	{
		return "Hello World !!!";
	}

}
