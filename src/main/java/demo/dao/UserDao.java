package demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.stereotype.Component;

import demo.util.MyKeyspaceConfiguration;

@Component("userDao")
@EnableRedisRepositories(keyspaceConfiguration = MyKeyspaceConfiguration.class)
public class UserDao {

	@Autowired
	private UserRepository repo;

}