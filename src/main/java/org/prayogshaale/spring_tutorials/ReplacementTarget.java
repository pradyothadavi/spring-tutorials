/**
 * 
 */
package org.prayogshaale.spring_tutorials;

/**
 * @author pradyot.ha
 */
public class ReplacementTarget
{
	public String formatMessage(String msg)
	{
		return "<h1>" + msg + "</h1>";
	}

	public String formatMessage(Object msg)
	{
		return "<h1>" + msg + "</h1>";
	}
}
