package net.exacode.bootstrap.web.controller;

import junit.framework.Assert;

import net.exacode.bootstrap.web.TestBase;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

public class GreetingControllerTest extends TestBase {

	@Autowired
	private GreetingsController greetingsController;
	
	@Test
	public void helloWorld() {
		logger.debug("hello!");
	}
	
	@Test
	public void greetingTestFromContext() {
		// given
		String name = "John";
		ModelMap model = new ModelMap();
		
		// when
		String path = greetingsController.greetPath(name, model);
		
		// then
		Assert.assertEquals("greetings", path);
		Assert.assertEquals(name, model.get("name"));
	}
}
