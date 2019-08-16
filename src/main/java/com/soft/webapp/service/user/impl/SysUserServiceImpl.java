package com.soft.webapp.service.user.impl;

import com.soft.webapp.entity.SysUser;
import com.soft.webapp.mapper.user.ISysUserMapper;
import com.soft.webapp.service.user.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ desc：用户操作实现
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 10:43 2019/8/16
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

	@Autowired
	private ISysUserMapper sysUserMapper;

	public List<SysUser> list(){
		return sysUserMapper.selectList(null);
	}
}
