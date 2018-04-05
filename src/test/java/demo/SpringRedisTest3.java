package demo;

import org.apache.tomcat.jni.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import demo.bean.Person;
import demo.dao.PersonRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
@WebAppConfiguration
public class SpringRedisTest3 {

	@Autowired
	PersonRepository repo;

	@Test
	public void basicCrudOperations() {

		Person rand = new Person("liu", "daqiang");
		// rand.setAddress(new Address());

		repo.save(rand);

		repo.findOne(rand.getId());

		repo.count();

		// repo.delete(rand);
	}

}
