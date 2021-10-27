package com.tutorial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutorial.Dao.MemberRepository;
import com.tutorial.Model.MemberAccountJPA;

@SpringBootApplication
public class SpringPracticeApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(SpringPracticeApplication.class, args);
	}

}
