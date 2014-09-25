/**
 * 
 */
package org.prayogshaale.spring_tutorials;

/**
 * @author pradyot.ha
 */
public class StandardLookUp implements LookUpMethodInjection
{

	private LookUpHelper lookUpHelper;

	public LookUpHelper getLookUpHelper()
	{
		return this.lookUpHelper;
	}

	/**
	 * @param lookUpHelper the lookUpHelper to set
	 */
	public void setLookUpHelper(LookUpHelper lookUpHelper)
	{
		this.lookUpHelper = lookUpHelper;
	}

	public void someOperation()
	{
		lookUpHelper.doSomethingHelpful();
	}

}
