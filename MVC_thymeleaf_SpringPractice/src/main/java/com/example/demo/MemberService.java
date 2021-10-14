package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.MemberDao;
import com.example.demo.MemberAccount;

@Service
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	public void addMember(MemberAccount memberAccount){
		memberDao.addBooks(memberAccount);
	}
}
