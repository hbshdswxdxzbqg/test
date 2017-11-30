package com.guava;

import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.RateLimiter;

//令牌桶
//平滑预热限流
public class SmoothWarmingUp {
	public static void main(String[] args) {
		//每秒新增5个，从冷启动速率过渡到平均速率的时间间隔
		RateLimiter limiter = RateLimiter.create(5, 1000, TimeUnit.MILLISECONDS);
		for (int i = 0; i < 5; i++) {
			System.out.println(limiter.acquire());
		}
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(limiter.acquire());
		}
		
	}

}
