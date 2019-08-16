package com.soft.webapp.framework.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soft.webapp.framework.constants.PageCons;
import com.soft.webapp.framework.utils.TypeUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ desc：Controller基类
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 11:30 2019/8/16
 */
public class BaseController {

	@Autowired
	protected HttpServletRequest request;

	@Autowired
	protected HttpServletResponse response;

	/**
	 * 获取分页对象
	 *
	 * @return
	 */
	protected <T> Page<T> getPage() {
		return getPage(false);
	}

	/**
	 * 获取分页对象
	 *
	 * @param openSort
	 * @return
	 */
	protected <T> Page<T> getPage(boolean openSort) {
		int index = 1;
		// 页数
		Integer cursor = TypeUtils.castToInt(request.getParameter(PageCons.PAGE_PAGE), index);
		// 分页大小
		Integer limit = TypeUtils.castToInt(request.getParameter(PageCons.PAGE_ROWS), PageCons.DEFAULT_LIMIT);
		// 是否查询分页
		Boolean searchCount = TypeUtils.castToBoolean(request.getParameter(PageCons.SEARCH_COUNT), true);
		limit = limit > PageCons.MAX_LIMIT ? PageCons.MAX_LIMIT : limit;
		Page<T> page = new Page<>(cursor, limit, searchCount);
		return page;
	}

}
