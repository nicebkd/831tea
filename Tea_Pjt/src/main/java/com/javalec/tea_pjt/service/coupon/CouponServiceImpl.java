package com.javalec.tea_pjt.service.coupon;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.javalec.tea_pjt.model.coupon.dao.CouponDAO;
import com.javalec.tea_pjt.model.coupon.dto.CouponDTO;

@Service
public class CouponServiceImpl implements CouponService{
	
	@Inject
	CouponDAO cDao;

	@Override
	public int cInsert(String user_id, String cName, String cEx) {
		return cDao.cInsert(user_id, cName, cEx);
	}

	@Override
	public int cCount(String user_id) {
		return cDao.cCount(user_id);
	}

	@Override
	public CouponDTO cGet(String user_id) {
		return cDao.cGet(user_id);
	}
}
