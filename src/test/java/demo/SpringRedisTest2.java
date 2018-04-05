package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import demo.bean.User;
import demo.dao.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
@WebAppConfiguration
public class SpringRedisTest2 {

	@Autowired
	private UserRepository repo;

	@Test
	public void testRepositorySave() {
		// User u = new User("dq", "1", "q", "dq@qq.com");
		// repo.save(u);
		List<User> users = new ArrayList<User>();
		users.add(new User("dq", "1", "大强", "dq@qq.com"));
		users.add(new User("eq", "2", "二强", "eq@qq.com"));
		users.add(new User("xq", "3", "小强", "xq@qq.com"));
		repo.save(users);
	}

	@Test
	public void testRepositoryGet() {
		// User u = repo.findOne("dq");
		// System.out.println(u);
		Iterator<User> iterator = repo.findAll().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
