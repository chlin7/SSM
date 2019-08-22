package com.soft.webapp.framework.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soft.webapp.framework.constants.PageCons;
import com.soft.webapp.framework.responses.ResponseResult;
import com.soft.webapp.framework.utils.AntiSQLFilter;
import com.soft.webapp.framework.utils.TypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

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
	 * @return page
	 */
	protected <T> Page<T> getPage() {
		int index = 1;
		// 页数
		Integer cursor = TypeUtils.castToInt(request.getParameter(PageCons.PAGE_CURRENT), index);
		// 分页大小
		Integer limit = TypeUtils.castToInt(request.getParameter(PageCons.PAGE_SIZE), PageCons.DEFAULT_LIMIT);
		// 是否查询分页
		Boolean searchCount = TypeUtils.castToBoolean(request.getParameter(PageCons.SEARCH_TOTAL), true);
		limit = limit > PageCons.MAX_LIMIT ? PageCons.MAX_LIMIT : limit;
		Page<T> page = new Page<>(cursor, limit, searchCount);

		return page;
	}

	/**
	 * 获取排序内容
	 * 例如 ascs->"id","user_name"
	 * @param <T>
	 */
	protected <T> QueryWrapper<T> getSort(){

		QueryWrapper<T> queryWrapper = new QueryWrapper<>();

		String[] ascOrders = getParameterSafeValues(PageCons.PAGE_ASCS);
		String[] descOrders = getParameterSafeValues(PageCons.PAGE_DESCS);

		queryWrapper.orderByAsc(ascOrders);
		queryWrapper.orderByDesc(descOrders);

		return queryWrapper;
	}

	/**
	 * 获取安全参数(SQL ORDER BY 过滤)
	 *
	 * @return columns
	 */
	protected String[] getParameterSafeValues(String type) {
		String[] columns = AntiSQLFilter.getSafeValues(request.getParameterValues(type));
		return columns;
	}

	/**
	 *
	 * -------------------返回结果统一格式------------------------------
	 *
	 */

	/**
	 * 成功返回
	 *
	 * @param object
	 */
	public <T> ResponseResult<T> success(T object) {
		return ResponseResult.<T>success(response, object);
	}

	/**
	 * 成功返回
	 *
	 */
	public ResponseResult<Void> success() {
		return success(HttpStatus.OK);
	}

	/**
	 * 成功返回
	 *
	 * @param status
	 * @param object
	 */
	public <T> ResponseResult<T> success(HttpStatus status, T object) {
		return ResponseResult.<T>success(response, status, object);
	}


	/**
	 * 成功返回
	 *
	 * @param status
	 */
	public ResponseResult<Void> success(HttpStatus status) {
		return ResponseResult.<Void>success(response, status);
	}

}
