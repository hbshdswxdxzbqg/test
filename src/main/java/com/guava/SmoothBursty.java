package com.guava;

import com.google.common.util.concurrent.RateLimiter;
//����Ͱ
//ƽ��ͻ������
public class SmoothBursty {
	public static void main(String[] args) {
		RateLimiter limiter = RateLimiter.create(5);
		System.out.println(limiter.acquire());
	}

}
