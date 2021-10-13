package com.tutorial.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.Model.MemberAccount;
import com.tutorial.Service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	MemberAccount memberAccount;
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/addmember")
	public String hello() {
		memberAccount = new MemberAccount();
    	memberAccount.setAUTHOR("株式会社");
    	memberAccount.setPRICE(0.0);
    	memberAccount.setST_ID(2);
    	memberAccount.setTITLE("大家的日本語 初級Ⅰ 改訂版");
    	memberAccount.setURL_ADDRESS("https://www.dahhsin.com.tw/bookIntro.php?lv01_type=Japan-s01&prd_id=E151&gclid=Cj0KCQjw5JSLBhCxARIsAHgO2Sc-4EligbHrCrkSX6Iti6WmWLXkcoUUrD8BM_9C4vDED-A2acq1tG8aAlZLEALw_wcB");
    	memberService.addMember(memberAccount);
    	return "新會員註冊成功啦";
	}

}
