package demo.dao;

import org.springframework.data.repository.CrudRepository;

import demo.bean.Person;

public interface PersonRepository extends CrudRepository<Person, String> {

}
