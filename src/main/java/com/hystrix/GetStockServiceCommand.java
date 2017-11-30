package com.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixThreadPoolKey;
import com.netflix.hystrix.HystrixThreadPoolProperties;

public class GetStockServiceCommand extends HystrixCommand<String> {

	private String string;

	public GetStockServiceCommand() {
		super(setter());
	}

	private static Setter setter() {
		// 服务分组
		HystrixCommandGroupKey groupKey = HystrixCommandGroupKey.Factory
				.asKey("stock");
		// 服务标识
		HystrixCommandKey commandKey = HystrixCommandKey.Factory
				.asKey("getStock");
		// 线程池名称
		HystrixThreadPoolKey threadPoolKey = HystrixThreadPoolKey.Factory
				.asKey("stock-pool");
		// 线程池配置
		HystrixThreadPoolProperties.Setter threadPoolProperties = HystrixThreadPoolProperties
				.Setter().withCoreSize(10).withKeepAliveTimeMinutes(5)
				.withMaxQueueSize(Integer.MAX_VALUE)
				.withQueueSizeRejectionThreshold(10000);
		// 命令属性配置
		HystrixCommandProperties.Setter commandProperties = HystrixCommandProperties.Setter()
		.withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.THREAD);
		return HystrixCommand.Setter.withGroupKey(groupKey).andCommandKey(commandKey).andThreadPoolKey(threadPoolKey)
		.andThreadPoolPropertiesDefaults(threadPoolProperties).andCommandPropertiesDefaults(commandProperties);
	}

	@Override
	protected String run() throws Exception {
		return string.toString();
	}

}
