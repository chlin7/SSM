package com.soft.webapp.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ desc：主页跳转controller
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 17:48 2019/8/16
 */
@Controller
@RequestMapping("")
public class IndexController {

	@GetMapping(value = "/index")
	public String index(){
		return "index";
	}
}
