package net.exacode.bootstrap.web.controller;

import net.exacode.bootstrap.web.model.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Service hello world controller.
 * Presents basic usage of SpringMVC and REST service API.
 * @author pmendelski
 *
 */
@Controller
public class UserServiceController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/user/{name}/{surname}.json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User getUserJson(@PathVariable String name, @PathVariable String surname) {
		logger.trace("Responding service request");
		User user = new User(name, surname);
		return user;
	}
	
	@RequestMapping(value = "/user/{name}/{surname}.xml", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody User getUserXml(@PathVariable String name, @PathVariable String surname) {
		logger.trace("Responding service request");
		User user = new User(name, surname);
		return user;
	}

}
