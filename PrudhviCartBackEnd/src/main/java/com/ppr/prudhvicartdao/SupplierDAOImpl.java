package com.ppr.prudhvicartdao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ppr.prudhvicart.Model.Supplier;



@Repository("SupplierDAO")

public class SupplierDAOImpl implements SupplierDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	


	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Supplier supplier){
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		
		
	}
	
	@Transactional
	public void delete(String id) {
		Supplier supplier = new Supplier();
		supplier.setId(id);
		sessionFactory.getCurrentSession().delete(supplier);
	}
	
	@Transactional
	public Supplier get(String id) {
		String hql = "from Supplier where id=" + "'"+ id +"'";
		//  from Supplier where id = '101'
		Query query = (Query)sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Supplier> listSupplier = (List<Supplier>)  query.getResultList();
		
		if (listSupplier != null && !listSupplier.isEmpty()) {
			return listSupplier.get(0);
		}
		return null;
	}


	public List<Supplier> list() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
