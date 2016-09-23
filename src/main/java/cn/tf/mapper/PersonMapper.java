package cn.tf.mapper;

import java.util.List;

import cn.tf.entity.Person;

public interface PersonMapper {

	List<Person> findAll();

	public void add(Person person);

	public void update(Person person);

	public void delete(String id);
	
}
