//package com.id3academy.springmvcproject;
//
//import com.id3academy.springmvcproject.service.ProductsService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.hamcrest.Matchers.is;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(controllers = com.id3academy.springmvcproject.controller.Test.class)
//class SpringMvcProjectApplicationTests {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Autowired
//	private ProductsService productsService;
//
//	List<String> expectedList = productsService.execute();
//
//	@Test
//	public void main() throws Exception {
//		ResultActions resultActions = mockMvc.perform(get("/"))
//				.andExpect(status().isOk())
//				.andExpect(view().name("index"))
////                .andExpect(model().attribute("message", equalTo("Mkyong")))
//				.andExpect(model().attribute("listProducts", is(expectedList)))
//				.andExpect(content().string(containsString("Hello, Mkyong")));
//
//
//		MvcResult mvcResult = resultActions.andReturn();
//		ModelAndView mv = mvcResult.getModelAndView();
//		//
//
//
//	}
//
//}
