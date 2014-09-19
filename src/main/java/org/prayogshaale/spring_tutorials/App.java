package org.prayogshaale.spring_tutorials;

import org.springframework.context.support.GenericXmlApplicationContext;

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

		ctx.close();
		ctx_parent.close();
		ctx_child.close();
	}
}
