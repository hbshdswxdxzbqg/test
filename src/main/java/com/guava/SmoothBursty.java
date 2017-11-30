package com.guava;

import com.google.common.util.concurrent.RateLimiter;
//令牌桶
//平滑突发限流
public class SmoothBursty {
	public static void main(String[] args) {
		RateLimiter limiter = RateLimiter.create(5);
		System.out.println(limiter.acquire());
	}

}
