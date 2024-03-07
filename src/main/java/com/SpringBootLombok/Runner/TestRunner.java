package com.SpringBootLombok.Runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootLombok.model.Student;
@Component
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Set<Student> set=new HashSet<>();
		set.add(new Student(10, "A"));
		set.add(new Student(10, "A"));
		set.add(new Student(10, "A"));
		
		System.out.println(set);
		System.out.println(set.size());
		
	}

}
