package com.ppr.prudhvicartdao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ppr.prudhvicart.Model.Category;

@Repository("categoryDAO")

public class CategoryDAOImpl implements CategoryDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;

	}


	@Transactional
	public void saveOrUpdate(Category category){
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		
		
	}
	
	@Transactional
	public void delete(String id) {
		Category category = new Category();
		category.setId(id);
		sessionFactory.getCurrentSession().delete(category);
	}
	
	@Transactional
	public Category get(String id) {
		String hql = "from Category where id=" + "'"+ id +"'";
		//  from category where id = '101'
		Query query = (Query)sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Category> listcategory = (List<Category>)  query.getResultList();
		
		if (listcategory != null && !listcategory.isEmpty()) {
			return listcategory.get(0);
		}
		return null;
	}


	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
