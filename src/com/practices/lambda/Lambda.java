package com.practices.lambda;

import java.util.List;
import java.util.function.Consumer;

import com.practices.methosRef.StartEngine;
import com.practices.util.Person;
import com.practices.util.PersonUtil;

public class Lambda {
	
	public static void main(String[] args) {
		
		StartEngine startEngine = (marka) -> marka + " Calisti"; // interface metodu implemente edildi
		System.out.println(startEngine.start("BRAND")); // implemente edilen method calisti

		List<Person> persons = PersonUtil.mockPersons();
		
		persons.forEach( (item) -> {
			
			System.out.println(item.getFirstname());
		});
		
		persons.forEach(System.err::println);
		
		Consumer<Person> method = (n) -> { System.out.println(n);};
		
		persons.forEach(method);
		
	}
}
