package com.example.demo.Reposity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.MemberShipAccount;

public interface MemberShipAccountReposity extends JpaRepository<MemberShipAccount, Long>{
	
	public MemberShipAccount findByAddress(String address);
	
}
