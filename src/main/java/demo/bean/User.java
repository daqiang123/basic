package demo.bean;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("users")
public class User implements Serializable {

	public User(String username, String password, String nickname, String email) {
		super();
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.email = email;
	}

	private static final long serialVersionUID = 1L;

	@Id
	private String username;
	private String password;
	private String nickname;
	private String email;
	private String filePath;

	public User() {
	}

}
