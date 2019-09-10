package com.woniu.springboot.po;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/*用于测试是否注入*/
@Component
/* 用于在yml中注入属性 */
@ConfigurationProperties(prefix="student")
/* spring注入方式 @Value 复合属性不支持*/
@PropertySource("classpath:myspring.properties")
public class Student {
	/* @Value("1") */
private Integer id;
	/* @Value("李四") */
private String name;
private List<Object> list;
private Map<String,Object> map;
private School school;
public Student() {
	super();
}
public Student(Integer id, String name, List<Object> list, Map<String, Object> map, School school) {
	super();
	this.id = id;
	this.name = name;
	this.list = list;
	this.map = map;
	this.school = school;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", list=" + list + ", map=" + map + ", school=" + school + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Object> getList() {
	return list;
}
public void setList(List<Object> list) {
	this.list = list;
}
public Map<String, Object> getMap() {
	return map;
}
public void setMap(Map<String, Object> map) {
	this.map = map;
}
public School getSchool() {
	return school;
}
public void setSchool(School school) {
	this.school = school;
}

	
	
}
