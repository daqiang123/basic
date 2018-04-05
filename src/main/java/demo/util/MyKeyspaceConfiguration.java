package demo.util;

import java.util.Collections;

import org.springframework.data.redis.core.convert.KeyspaceConfiguration;

import demo.bean.User;

public class MyKeyspaceConfiguration extends KeyspaceConfiguration {
	@Override
	protected Iterable<KeyspaceSettings> initialConfiguration() {
		return Collections
				.singleton(new KeyspaceSettings(User.class, "userme"));
	}
}