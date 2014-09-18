/**
 * 
 */
package org.prayogshaale.spring_tutorials;

/**
 * @author pradyot.ha
 */
public interface MessageRenderer
{
	public void render();

	public void setMessageProvider(MessageProvider messageProvider);

	public MessageProvider getMessageProvider();

}
