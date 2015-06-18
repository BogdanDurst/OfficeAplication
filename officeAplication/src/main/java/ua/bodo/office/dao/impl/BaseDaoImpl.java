package ua.bodo.office.dao.impl;

import java.util.List;

import org.hibernate.Session;

import ua.bodo.office.dao.BaseDao;
import ua.bodo.office.util.HibernateUtil;

public class BaseDaoImpl <E> implements BaseDao<E> {

	public void addDate(E e) {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(e);
			session.getTransaction().commit();
			
		}catch (Exception e1){
			e1.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		
	}

	public void updateDate(E e) {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(e);
			session.getTransaction().commit();
			
		}catch (Exception e1){
			e1.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		
	}

	public E getDateByID(long id) {
		
		
		return null;
	}

	public List<E> getAllDate() {
		return null;
	}

	public void deleteDate(E e) {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(e);
			session.getTransaction().commit();
			
		}catch (Exception e1){
			e1.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		
	}

}
