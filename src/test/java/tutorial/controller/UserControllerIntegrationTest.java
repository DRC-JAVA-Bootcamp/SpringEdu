package tutorial.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class UserControllerIntegrationTest {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;

	@BeforeEach
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	void testUserSave() throws Exception {
		String requestBodyJson = "{\"userName\":\"test\",\"userPassword\":\"123\",\"msisdn\":\"5320000001\"}";

		MvcResult result = mockMvc
				.perform(post("/user/save").content(requestBodyJson).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();

		MockHttpServletResponse response = result.getResponse();
		String responseMessage = response.getContentAsString();
		Assertions.assertEquals("true", responseMessage);
	}

	@Test
	void testIsTurkcell() throws Exception {
		String requestBodyJson = "{\"msisdn\":\"5320000001\"}";

		MvcResult result = mockMvc
				.perform(post("/user/isTurkcell").content(requestBodyJson).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();

		MockHttpServletResponse response = result.getResponse();
		String responseMessage = response.getContentAsString();
		Assertions.assertEquals("true", responseMessage);
	}

}
