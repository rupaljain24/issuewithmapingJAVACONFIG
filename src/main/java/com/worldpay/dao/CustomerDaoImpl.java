package com.worldpay.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.worldpay.entities.Customer;


@Repository
public class CustomerDaoImpl implements CustomerDao  {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addCustomer(Customer customer) {
	 Session session=sessionFactory.openSession();
	 Transaction tr=session.beginTransaction();
	 session.save(customer);
	 tr.commit();
	 session.close();
		
	}
	
	
/*	public void addStudent(Student student) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
	}
*/
}
