package com.training;

import javax.persistence.EntityManager;

import com.training.alstrom.model.Contract_Employee;
import com.training.alstrom.model.Employee;
import com.training.alstrom.util.EntityManagerUtil;

public class TestEmployee {

	public TestEmployee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		EntityManager em = EntityManagerUtil.getEntityManager();
		
		Contract_Employee emp = new Contract_Employee();
		emp.setId(22);
		emp.setName("Sathvik");
		emp.setContract_duration(12);
		emp.setPay_per_hour(100000);
		
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
		
		System.out.println("Employee saved");
	}
}
