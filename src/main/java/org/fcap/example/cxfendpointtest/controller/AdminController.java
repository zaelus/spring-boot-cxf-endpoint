package org.fcap.example.cxfendpointtest.controller;

import org.fcap.example.cxfendpointtest.controller.enums.EUserType;
import org.fcap.example.cxfendpointtest.controller.model.UserVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/admin/v1")
public class AdminController {

	@GetMapping(value = "/whoami")
	public @ResponseBody
	ResponseEntity<UserVO> youAreAdmin(Principal principal){

		if(principal != null) {
			System.out.println("Principal : " + principal.getName());
		}

		return new ResponseEntity<UserVO>(new UserVO(EUserType.valueOf(principal.getName().toUpperCase())), HttpStatus.OK);
	}

}
