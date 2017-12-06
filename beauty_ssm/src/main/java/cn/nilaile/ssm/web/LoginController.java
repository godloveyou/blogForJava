package cn.nilaile.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {


	
	@RequestMapping(value = "/checklogin")
	@ResponseBody
	public String login(@RequestParam(value="username", required=true, defaultValue="") String username,
			@RequestParam(value="password") String password){
		
		
		return "";
		
	}
}
