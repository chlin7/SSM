package com.soft.webapp.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ desc：用户实体
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 10:46 2019/8/16
 */
@Data
public class SysUser {

	private Long id;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String userInfo;
	private String headImg;
	private Date createTime;

}
