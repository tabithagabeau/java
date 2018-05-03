package com.test.jpademo.business;

import javax.persistence.EntityManager;

import com.test.jpademo.db.DBUtil;

public class PurchaseRequestDB {
	public static PurchaseRequest getPurchaseRequestById(int purchaseRequestId) {
		EntityManager em =DBUtil.getEmFactory().createEntityManager();
		try {
			PurchaseRequest purchaseRequest = em.find(PurchaseRequest.class, purchaseRequestId);
			return purchaseRequest;
		}
		finally {
			em.close();
//			DBUtil.closeEMF();
		}
	}

}
