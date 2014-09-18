package org.prayogshaale.spring_tutorials;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 */
public class App
{
	public static void main(String[] args)
	{
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		// ctx.load("classpath:app-context-xml.xml");
		ctx.load("classpath:app-context-annotation.xml");
		ctx.refresh();

		MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
		messageRenderer.render();

		ctx.close();
	}
}
