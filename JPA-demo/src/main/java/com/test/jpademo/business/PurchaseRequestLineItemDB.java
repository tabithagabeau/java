package com.test.jpademo.business;

import javax.persistence.EntityManager;

import com.test.jpademo.db.DBUtil;

public class PurchaseRequestLineItemDB {
	public static PurchaseRequestLineItem getPurchaseRequestLineItemById(int purchaseRequestLineItemId) {
		EntityManager em =DBUtil.getEmFactory().createEntityManager();
		try {
			PurchaseRequestLineItem purchaseRequestLineItem = em.find(PurchaseRequestLineItem.class, purchaseRequestLineItemId);
			return purchaseRequestLineItem;
		}
		finally {
			em.close();
//			DBUtil.closeEMF();
		}
	}

}
