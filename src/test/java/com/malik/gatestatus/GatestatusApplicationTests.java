package com.malik.gatestatus;

import com.malik.hello.Hello;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Slf4j
class GatestatusApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}

	@Test
	void getGateStatusTest(){

		Gates.getGateData();

		assertTrue(true);

	}

	@Test
	void getGateDetailsByStatusFlagTest(){
		Optional<Gates> statusEnum = Gates.getEnumEvaluationByValue(0);

		if(statusEnum.isPresent()) {
			log.info("Gate Name: " + statusEnum.get().getName());
			log.info("Gate Status: " + statusEnum.get().getStatus());
		}

		assertTrue(statusEnum.isPresent());
	}

	@Test
	void getGateDetailsByNameTest(){
		Optional<Gates> statusEnum = Gates.getEnumEvaluationByValue("gate A");

		if(statusEnum.isPresent()) {
			log.info("Gate Name: " + statusEnum.get().getName());
			log.info("Gate Status: " + statusEnum.get().getStatus());
		}

		assertTrue(statusEnum.isPresent());
	}

	@Test
	void getHelloTest(){
		Hello hello = new Hello();
		hello.getGreeting();
	}

}
