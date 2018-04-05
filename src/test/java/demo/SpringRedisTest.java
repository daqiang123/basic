package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
@WebAppConfiguration
public class SpringRedisTest {

	@Autowired
	private RedisTemplate<String, String> template;

	@Test
	public void testFirst() {
		// set username daqiang
		template.opsForValue().set("username", "daqiang");
		// get username
		System.out.println(template.opsForValue().get("username"));
	}

	@Test
	public void testBound() {
		BoundValueOperations<String, String> boundValueOps = template
				.boundValueOps("username");
		System.out.println(boundValueOps.get());
		boundValueOps.set("daqiang is good!");
		System.out.println(boundValueOps.get());
	}

}