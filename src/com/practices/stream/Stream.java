package com.practices.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.practices.util.Person;
import com.practices.util.PersonUtil;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream stream = new Stream();
		
		Arrays.asList("elma","armut","çilek","üzüm").stream().forEach(stream::process);
		
		List<String> fruits = Arrays.asList("elma","armut","çilek","üzüm");
		
		List<String> sonuc = fruits.stream().filter(item -> !"armut".equals(item)).collect(Collectors.toList());
		
		sonuc.stream().forEach(System.out::println);
		
		List<Person> secilenPersonalName = PersonUtil.mockPersons().stream().filter(item -> item.getAge() > 23).collect(Collectors.toList());
		
		secilenPersonalName.stream().map(Person::getFirstname).forEach(System.out::println);
		

	}
	
	public void process (String input) {
		System.out.println("reference " + input);
	}

}
