package com.soft.webapp.service.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soft.webapp.entity.SysUser;

import java.util.List;

/**
 * @ desc：用户操作接口
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 10:43 2019/8/16
 */
public interface ISysUserService {
	public IPage<SysUser> list(Page<SysUser> page,QueryWrapper<SysUser> queryWrapper);
}
