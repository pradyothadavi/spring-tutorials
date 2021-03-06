package org.prayogshaale.spring_tutorials;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * Hello world!
 */
public class App
{
	public static void main(String[] args)
	{

		GenericXmlApplicationContext ctx_parent = new GenericXmlApplicationContext();
		ctx_parent.load("classpath:app-context-parent-xml.xml");
		ctx_parent.refresh();

		GenericXmlApplicationContext ctx_child = new GenericXmlApplicationContext();
		ctx_child.load("classpath:app-context-xml.xml");
		ctx_child.setParent(ctx_parent);
		ctx_child.refresh();

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-annotation.xml");
		ctx.setParent(ctx_child);
		ctx.refresh();

		MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
		messageRenderer.render();

		SimpleInjection simleInjection = ctx.getBean("simpleInjection", SimpleInjection.class);
		System.out.println(simleInjection.toString());

		SpELInjection spElInjection = ctx.getBean("spELInjection", SpELInjection.class);
		System.out.println(spElInjection);

		SimpleTarget target1 = ctx_child.getBean("target1", SimpleTarget.class);
		System.out.println(target1);

		SimpleTarget target2 = ctx_child.getBean("target2", SimpleTarget.class);
		System.out.println(target2);

		SimpleTarget target3 = ctx_child.getBean("target3", SimpleTarget.class);
		System.out.println(target3);

		CollectionInjection collectionInjection = ctx.getBean("collectionInjection", CollectionInjection.class);
		collectionInjection.displayCollectionInjection();

		LookUpMethodInjection standardLookUp = ctx_child.getBean("standardLookUp", StandardLookUp.class);
		LookUpMethodInjection abstractLookUp = ctx_child.getBean("abstractLookUp", AbstractLookUp.class);

		displayLookUpInjectionInfo(standardLookUp);
		displayLookUpInjectionInfo(abstractLookUp);

		ReplacementTarget withoutReplacementMethod =
		        ctx_child.getBean("withoutMethodReplacementBean", ReplacementTarget.class);
		ReplacementTarget withReplacementMethod = ctx_child.getBean("methodReplacementBean", ReplacementTarget.class);

		displayMethodReplacementInfo(withoutReplacementMethod);
		displayMethodReplacementInfo(withReplacementMethod);

		BeanInheritance parent = ctx_child.getBean("inheritParentBean", BeanInheritance.class);
		System.out.println(parent);

		BeanInheritance child = ctx_child.getBean("inheritChildBean", BeanInheritance.class);
		System.out.println(child);

		BeanInitMethod allValues = ctx_child.getBean("methodInitWithAllValues", BeanInitMethod.class);
		System.out.println(allValues);
		BeanInitMethod withoutName = ctx_child.getBean("methodInitWithoutName", BeanInitMethod.class);
		System.out.println(withoutName);
		try
		{
			BeanInitMethod withoutAge = ctx_child.getBean("methodInitWithoutAge", BeanInitMethod.class);
			System.out.println(withoutAge);
		}
		catch (BeanCreationException e)
		{
			System.out.println(e.getMessage());
		}

		ctx.close();
		ctx_parent.close();
		ctx_child.close();
	}

	public static void displayLookUpInjectionInfo(LookUpMethodInjection lookUpMethodInjection)
	{
		LookUpHelper h1 = lookUpMethodInjection.getLookUpHelper();
		LookUpHelper h2 = lookUpMethodInjection.getLookUpHelper();

		System.out.println("Are the helper instances same ? " + (h1 == h2));

		StopWatch stopWatch = new StopWatch();
		stopWatch.start("lookUpMethodInjection");

		for (int i = 0; i < 100000; i++)
		{
			LookUpHelper h = lookUpMethodInjection.getLookUpHelper();
			h.doSomethingHelpful();
		}

		stopWatch.stop();

		System.out.println("100000 get took " + stopWatch.getTotalTimeMillis() + " ms");
	}

	public static void displayMethodReplacementInfo(ReplacementTarget target)
	{
		System.out.println(target.formatMessage("Hello World"));

		StopWatch stopWatch = new StopWatch();
		stopWatch.start("methodReplacement");

		for (int i = 0; i < 100000; i++)
		{
			target.formatMessage("Hello World");
		}
		stopWatch.stop();

		System.out.println("100000 invocations took " + stopWatch.getTotalTimeMillis() + " ms");
	}
}
