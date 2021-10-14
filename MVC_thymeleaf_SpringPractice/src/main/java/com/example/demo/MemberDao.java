package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.MemberAccount;

@Repository
public class MemberDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addBooks(MemberAccount memberAccount) {
		System.out.println("EXCUTE INSERT MEMBER");
		
		jdbcTemplate.update("INSERT INTO BOOKS(ST_ID, TITLE, AUTHOR, PRICE, URL_ADDRESS)"
				+ "VALUES(?,?,?,?,?)",memberAccount.getST_ID(), memberAccount.getTITLE(),
				memberAccount.getAUTHOR(), memberAccount.getPRICE(), memberAccount.getURL_ADDRESS());
	}
}
