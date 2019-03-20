package com.glarimy.add;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@RequestMapping(value = "/employee", method = RequestMethod.POST, consumes = "application/json")
	public Employee addEmployee(@RequestBody Employee employee) {
		logger.debug("adding " + employee);
		return employee;
	}

}