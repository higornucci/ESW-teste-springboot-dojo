package com.example.testingweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class TestingApplicationTest {

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		// levanta o contexto sem exceções
	}
}
