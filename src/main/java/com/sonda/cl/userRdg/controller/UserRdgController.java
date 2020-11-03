package com.sonda.cl.userRdg.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("api")
@CrossOrigin
public class UserRdgController {

	@GetMapping(value = "/userRdg/all", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Entrega Todos los usuarios")
	@CrossOrigin
	@ResponseBody
	public String userRdgGet() {

		return "User";
	}
}
