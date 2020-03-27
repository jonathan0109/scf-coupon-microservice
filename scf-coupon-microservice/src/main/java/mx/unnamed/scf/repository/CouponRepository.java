package mx.unnamed.scf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.unnamed.scf.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

}
