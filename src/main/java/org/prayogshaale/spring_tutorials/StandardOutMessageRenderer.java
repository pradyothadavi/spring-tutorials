/**
 * 
 */
package org.prayogshaale.spring_tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pradyot.ha
 */
/*
 * @Service annotation to specify that the bean provides services that other
 * beans may require, passing in the bean name as the parameter.
 */
@Service ("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer
{

	/*
	 * @Resource(name="messageProvider") can also be used to achieve the same
	 * result. It provides more fine grained DI requirement.
	 */
	@Autowired
	// @Resource (name = "messageProviderWithConstructionArg")
	private MessageProvider messageProvider = null;

	public void render()
	{
		if (null == messageProvider)
		{
			throw new RuntimeException("You must set the property messageProvider of class: "
			        + StandardOutMessageRenderer.class);
		}
		System.out.println(messageProvider.getMessage());

	}

	public void setMessageProvider(MessageProvider messageProvider)
	{
		this.messageProvider = messageProvider;

	}

	public MessageProvider getMessageProvider()
	{
		return this.messageProvider;
	}

}
