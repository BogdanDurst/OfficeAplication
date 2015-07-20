package ua.bodo.office.dao;

import ua.bodo.office.model.User;

public interface UserDao extends BaseDao<User>{
	
	User findByEmail (String email);

}
