package com.contact.demo.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@SpringBootTest
@RunWith(SpringRunner.class)
public class ContactControllerTest {

	private static MockMvc mvc;
	
	@Autowired
	private WebApplicationContext context;
	
	@BeforeEach
	public void setup() {
		mvc = MockMvcBuilders.webAppContextSetup(context)
				.build();
	}

	@Test
	public void testpostcontact() throws Exception {
		
		mvc.perform(post("/contacts")
				.contentType(MediaType.APPLICATION_JSON)
				.content(TestUtils.dummyContactrequest()))
		.andExpect(status().isOk())
		.andExpect(content().json(TestUtils.dummyContactresponse()));

	}

}
