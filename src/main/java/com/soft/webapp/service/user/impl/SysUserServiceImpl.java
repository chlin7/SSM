package com.soft.webapp.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

	public IPage<SysUser> list(Page<SysUser> page,QueryWrapper<SysUser> queryWrapper){
		return sysUserMapper.selectPage(page,queryWrapper);
	}
}
