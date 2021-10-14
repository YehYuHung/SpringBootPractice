package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberAccount memberAccount;
	
	@Autowired
	MemberService memberService;

	@GetMapping("/addMember")
	public String addMemberPage() {
		return "addMemberPage";
	}
	
	
}
