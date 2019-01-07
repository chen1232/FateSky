package com.fatesky;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FateskyApplicationTests {
	
	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	
	@Test
	public void contextLoads() {
			redisTemplate.opsForValue().set("study", "1234567897");
	      System.out.println(this.redisTemplate.opsForValue().get("study"));
	}
}

