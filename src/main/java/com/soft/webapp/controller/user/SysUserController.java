package com.soft.webapp.controller.user;

import com.soft.webapp.entity.SysUser;
import com.soft.webapp.framework.controller.BaseController;
import com.soft.webapp.service.user.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ desc：用户操作
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 10:45 2019/8/16
 */
@RestController
@RequestMapping(value = "/sysUser", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SysUserController extends BaseController {

	@Autowired
	private ISysUserService sysUserService;

	@GetMapping
	public List<SysUser> list(){

		List<SysUser> list = sysUserService.list();

		return list;
	}
}
