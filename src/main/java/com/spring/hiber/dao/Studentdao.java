package com.spring.hiber.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.hiber.entyties.Student;

public class Studentdao {

	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		int i=(Integer)this.hibernateTemplate.save(student);		
		return i;
	}
	
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
