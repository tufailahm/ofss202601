package com.training.alstrom.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	private static final EntityManagerFactory entityManagerFactory;
	
	static
	{
		entityManagerFactory =  Persistence.createEntityManagerFactory("ofssjpa");
	}
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

}
