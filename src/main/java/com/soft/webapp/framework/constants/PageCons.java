package com.soft.webapp.framework.constants;

/**
 * PAGE 常量
 *
 */
public interface PageCons {

    /**
     * 当前页码
     */
    String PAGE_CURRENT = "current";
    /**
     * 每一页数量
     */
    String PAGE_SIZE = "size";
    /**
     * 查询总数
     */
    String SEARCH_TOTAL = "total";
    /**
     * 默认每页条目20,最大条目数100
     */
    int DEFAULT_LIMIT = 20;

	/**
	 * 每页最大条数
	 */
	int MAX_LIMIT = 100;

	/**
	 * 排序字段 ASC
	 */
	String PAGE_ASCS = "ascs";
	/**
	 * 排序字段 DESC
	 */
	String PAGE_DESCS = "descs";

}
