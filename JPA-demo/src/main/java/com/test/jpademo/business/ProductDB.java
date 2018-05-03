package com.test.jpademo.business;

import javax.persistence.EntityManager;

import com.test.jpademo.db.DBUtil;

public class ProductDB {
	public static Product getProductById(int productId) { //p439 get by userID
		EntityManager em =DBUtil.getEmFactory().createEntityManager();
		try {
			Product product = em.find(Product.class, productId);
			return product;
					
		}
		finally {
			em.close();
//			DBUtil.closeEMF();
		}
	}

}
