package mx.unnamed.scf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.unnamed.scf.model.Coupon;
import mx.unnamed.scf.repository.CouponRepository;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

	@Autowired
	CouponRepository couponRepository;
	
	@RequestMapping(value = "/coupons", method = RequestMethod.POST)
	public Coupon create(Coupon coupon) {
		
		return couponRepository.save(coupon);
	}
	
	@RequestMapping(value = "/coupons/{code}", 
			method = RequestMethod.GET)
	public Coupon getCoupon(String code) {
		
		return couponRepository.findByCode(code);
	}
}
