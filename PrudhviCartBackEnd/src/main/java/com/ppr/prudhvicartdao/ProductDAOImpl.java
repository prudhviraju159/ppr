package com.ppr.prudhvicartdao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.transform.ResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ppr.prudhvicart.Model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	
	
	private static final ResultTransformer DISTINCT_ROOT_ENTITY = null;
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void saveOrUpdate(Product product){
		
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		
		
	}
	@Transactional
	public void delete(String id) {
		Product product = new Product();
		product.setId(id);
		sessionFactory.getCurrentSession().delete(product);
	}

	@Transactional
	public Product get(String id) {
		String hql = "from Product where id=" + "'"+ id +"'";
		//  from product where id = '101'
		Query query = (Query)sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Product> listproduct = (List<Product>)  query.getResultList();
		
		if (listproduct != null && !listproduct.isEmpty()) {
			return listproduct.get(0);
		}
		return null;
	}
	
	@Transactional
	public List<Product> list() {
		@SuppressWarnings(  "unchecked")
		List<Product> listProduct = (List<Product>) 
		           sessionFactory.getCurrentSession()
			.createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listProduct;
	}





}
