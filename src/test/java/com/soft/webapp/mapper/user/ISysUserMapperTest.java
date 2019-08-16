package com.soft.webapp.mapper.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soft.webapp.WebAppApplicationTests;
import com.soft.webapp.entity.SysUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ISysUserMapperTest extends WebAppApplicationTests {

	@Autowired
	private ISysUserMapper sysUserMapper;

	@Test
	public void testSelect(){
		List<SysUser> list = sysUserMapper.selectList(null);



		Page<SysUser> page = new Page<>(1, 3, true);
		IPage<SysUser> result = sysUserMapper.selectPage(page,null);

		Assert.assertTrue(list.size()>0);
	}

}