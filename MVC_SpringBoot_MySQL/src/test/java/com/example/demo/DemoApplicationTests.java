package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Model.MemberShipAccount;
import com.example.demo.Reposity.MemberShipAccountReposity;

@SpringBootTest

class DemoApplicationTests {

	@Autowired
	MemberShipAccountReposity memberShipAccountReposity;

//	private String getMd5Password(String password, String salt) {
//		// 對password + salt 進行三重加密
//		String str = password + salt;
//		for (int i = 0; i < 3; i++) {
//			str = DigestUtils.md5DigestAsHex(str.getBytes()).toUpperCase();
//		}
//		return str;
//	}

	void testAdd() {

		String password = "ddduser7894";
		String phone = "846167";
		String address = "桃園市";
		String name = "morga.ghss";

		MemberShipAccount memberShipAccount = new MemberShipAccount();
		memberShipAccount.setName(name);
		memberShipAccount.setPassword(password);
		memberShipAccount.setPhone(phone);
		memberShipAccount.setAddress(address);
		memberShipAccountReposity.save(memberShipAccount);

		System.out.println(memberShipAccountReposity.findAll());

	}

	void testFind() {
		System.out.println(memberShipAccountReposity.findAll());
	}

	@Test
	void testUpdatePasswordByIdAndAccount() {

		String Address = "新北市";
		System.out.println(memberShipAccountReposity.findByAddress(Address));
//		System.out.println(memberShipAccountReposity.findAll());

//			String phone = data.getPhone();
//			String md5Password = getMd5Password(password, phone);
//			data.setPassword(md5Password);
//			
//			// 使用save() 方法更新欄位一定要是透過Repository 取得的實體物件。
//			memberShipAccountReposity.save(data);
//			MemberShipAccount result = memberShipAccountReposity.findByAccount();
//			System.err.println(result);	
	}

}