package com.tutorial.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tutorial.Dao.MemberRepository;
import com.tutorial.Model.MemberAccountJPA;

@Controller
public class MemberController {

	@Autowired
	MemberRepository memberRepository;

	@GetMapping("/login")
	public String login(@ModelAttribute MemberAccountJPA memberAccountJPA) {

		return "login";
	}

	@PostMapping("/doLogin")
	public String doLogin(@ModelAttribute MemberAccountJPA memberAccountJPA) {
		System.out.println(
				memberRepository.findCheckMemberAccount(memberAccountJPA.getEmail(), memberAccountJPA.getPhone()));

		return "welcome";
	}

}
