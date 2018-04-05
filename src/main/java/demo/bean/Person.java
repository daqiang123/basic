package demo.bean;

import org.apache.tomcat.jni.Address;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("persons")
public class Person {

	@Id
	String id;
	String firstname;
	String lastname;

	// Address address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	// public Person(String id, String firstname, String lastname, Address
	// address) {
	// super();
	// this.id = id;
	// this.firstname = firstname;
	// this.lastname = lastname;
	// this.address = address;
	// }
	public Person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	// public Address getAddress() {
	// return address;
	// }
	// public void setAddress(Address address) {
	// this.address = address;
	// }

}
