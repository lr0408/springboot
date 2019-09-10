package com.woniu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniu.springboot.po.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	Student student;
	@Test
	public void contextLoads() {
		
		System.out.println(student);
	}

}
