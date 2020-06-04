package com.java;

import com.java.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {


	@Autowired
	@Qualifier("redisTemplate")
	private RedisTemplate redisTemplate;




	@Test
	void redisconfig(){

		User user = new User("zhangsan",12);

		redisTemplate.opsForValue().set("user",user);
//		System.out.println(redisTemplate.opsForValue().get(user));


	}
















}
