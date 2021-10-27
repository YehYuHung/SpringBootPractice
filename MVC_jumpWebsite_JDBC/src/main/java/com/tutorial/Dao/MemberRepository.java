package com.tutorial.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tutorial.Model.MemberAccountJPA;

public interface MemberRepository extends JpaRepository<MemberAccountJPA, Long> {

	@Query(value = "select * from memberaccountjpa where MEMBER_EMAIL = ?1 and MEMBER_PHONE = ?2 ", nativeQuery = true)
	List<MemberAccountJPA> findCheckMemberAccount(String email, String phone);

}
