package com.soft.webapp.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ desc：myatis-plus配置相关
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 11:12 2019/8/16
 */
@EnableTransactionManagement
@Configuration
public class MybatisPlusConfig {
	/**
	 * 分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
		// paginationInterceptor.setLimit(你的最大单页限制数量，默认 500 条，小于 0 如 -1 不受限制);
		return paginationInterceptor;
	}

	/**
	 * SQL执行效率插件
	 */
	@Bean
	@Profile({"dev"})// 设置 dev 环境开启
	public PerformanceInterceptor performanceInterceptor() {
		return new PerformanceInterceptor();
	}
}
