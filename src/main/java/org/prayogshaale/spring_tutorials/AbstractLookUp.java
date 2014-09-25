/**
 * 
 */
package org.prayogshaale.spring_tutorials;

/**
 * @author pradyot.ha
 */
public abstract class AbstractLookUp implements LookUpMethodInjection
{
	public abstract LookUpHelper getLookUpHelper();

	public void someOperation()
	{
		getLookUpHelper().doSomethingHelpful();
	}
}
