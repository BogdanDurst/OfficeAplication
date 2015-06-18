package ua.bodo.office.dao;

import java.util.List;


public interface BaseDao<E> {
	
	public void addDate(E e);
	
	public void updateDate(E e);
	
	public E getDateByID(long id);
	
	public List<E> getAllDate();
	
	public void deleteDate(E e);

}
