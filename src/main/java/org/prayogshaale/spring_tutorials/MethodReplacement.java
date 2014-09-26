/**
 * 
 */
package org.prayogshaale.spring_tutorials;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * @author pradyot.ha
 */
public class MethodReplacement implements MethodReplacer
{

	public Object reimplement(Object beanOfOriginalMethod, Method methodToBeOverridden, Object[] argsOfMethods)
	        throws Throwable
	{
		if (isFormatMessageMethod(methodToBeOverridden))
		{
			String msg = (String) argsOfMethods[0];
			return "<h2>" + msg + "</h2>";
		}
		else
		{
			throw new IllegalArgumentException("Unable to reimplement method " + methodToBeOverridden.getName());
		}

	}

	private boolean isFormatMessageMethod(Method methodToBeOverridden)
	{
		if (1 != methodToBeOverridden.getParameterTypes().length)
		{
			return false;
		}

		if (!"formatMessage".equals(methodToBeOverridden.getName()))
		{
			return false;
		}

		if (String.class != methodToBeOverridden.getReturnType())
		{
			return false;
		}

		if (String.class != methodToBeOverridden.getParameterTypes()[0])
		{
			return false;
		}
		return true;
	}

}
