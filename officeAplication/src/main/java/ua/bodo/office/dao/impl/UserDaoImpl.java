package ua.bodo.office.dao.impl;

import org.hibernate.Session;

import ua.bodo.office.dao.UserDao;
import ua.bodo.office.model.User;
import ua.bodo.office.util.HibernateUtil;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	public UserDaoImpl() {
		super(User.class);
		
	}

	@Override
	public User findByEmail(String email) {
		Session session = null;
		User user = null;
		try{
			
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			user = (User) session.createQuery("Find u From User as u Where u.email = :email").setParameter("email", email).uniqueResult();
			session.getTransaction().commit();
		}catch (Exception e1){
			e1.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen())) session.close();
		}
		
		return user;
	}

}
