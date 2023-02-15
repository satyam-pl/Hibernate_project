package com.helper;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

	
	public static SessionFactory factory;
	
	public static SessionFactory getFactory()
	{
		
		if(factory==null)
		{
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
	
	public static void closeFactory()
	{
		if(factory.isOpen())
		{
			factory.close();
		}
	}
}
