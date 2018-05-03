package com.test.jpademo.business;

import javax.persistence.EntityManager;

import com.test.jpademo.db.DBUtil;

public class VendorDB {
	public static Vendor getVendorById(int vendorId) {
		EntityManager em =DBUtil.getEmFactory().createEntityManager();
		try {
			Vendor vendor = em.find(Vendor.class, vendorId);
			return vendor;
		}
		finally {
			em.close();
//			DBUtil.closeEMF();
		}
	}

}
