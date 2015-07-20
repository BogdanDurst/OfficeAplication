package ua.bodo.office.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import ua.bodo.office.dao.BaseDao;
import ua.bodo.office.util.HibernateUtil;

public class BaseDaoImpl <E> implements BaseDao<E> {
	
	Class <E> entityClass;
	public BaseDaoImpl (Class<E> entityClass){
		this.entityClass = entityClass;
	}

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

	@SuppressWarnings("unchecked")
	public E getDateByID(long id) {
		
		Session session = null;
		E e = null;
		try{
			
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			e = (E) session.createQuery("Find e From" + entityClass.getSimpleName() + "as e Where e.id = :id").setParameter("id", id).uniqueResult();
			session.getTransaction().commit();
		}catch (Exception e1){
			e1.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen())) session.close();
		}
		
		return e;
	}

	@SuppressWarnings("unchecked")
	public List<E> getAllDate() {
		
		Session session = null;
		List<E> list = new ArrayList<>();
		try{
			
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			list = session.createQuery("Find e From" + entityClass.getSimpleName() + "as e").list();
			session.getTransaction().commit();
		}catch (Exception e1){
			e1.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen())) session.close();
		}
		
		return list;
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
