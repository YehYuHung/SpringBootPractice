package com.example.demo.Controller;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.MemberShipAccount;
import com.example.demo.Reposity.MemberShipAccountReposity;

@RestController
public class MemberShipAccountController {	
	
	@Autowired
	MemberShipAccountReposity memberShipAccountReposity;
	
	@RequestMapping("/address")
	public MemberShipAccount getAllData() {
		MemberShipAccount memberShipAccount = new MemberShipAccount();
		String Address = "新北市";
		memberShipAccount = memberShipAccountReposity.findByAddress(Address);
		return memberShipAccount;
	}
}
