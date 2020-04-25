package com.minseok.app;

import com.minseok.app.entity.*;
import com.minseok.app.Repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
	private final PersonRepository personRepository;

	private final SocialMediaRepository socialMediaRepository;

	private final InterestRepository interestRepository;

	private final SkillRepository skillRepository;

	private final WorkRepository workRepository;


	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository,
						  InterestRepository interestRepository, SkillRepository skillRepository,
						  WorkRepository workRepository) {
		this.personRepository = personRepository;
		this.socialMediaRepository = socialMediaRepository;
		this.interestRepository = interestRepository;
		this.skillRepository = skillRepository;
		this.workRepository = workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("이민석", "데이터 분석", "hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("anymous","anymous"));
		interestRepository.save(new Interests("영화보기"));
		interestRepository.save(new Interests("요리하기"));
		interestRepository.save(new Interests("게임"));
		skillRepository.save(new skill("웹 프로그래밍",2));
		workRepository.save(new work("신입사원","네이버","2개월","null"));
	}
}