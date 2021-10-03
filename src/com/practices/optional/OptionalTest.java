package com.practices.optional;

import java.util.Date;
import java.util.Optional;
import java.util.Random;

import com.practices.util.Person;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<Person> empty = Optional.empty();
		
		Optional<Person> of = Optional.of(new Person("alican", "akkus", "male", 23, new Date().getTime() + new Random().nextInt()));
		
		//Optional<Person> ofNull = Optional.of(null); // hata fırlatır.
		
		Optional<Person> ofNullable = Optional.ofNullable(null);
		
		// ifPresent = varsa yap, yoksa yapma
		
		of.ifPresent(item -> {
			System.out.println(item);
		});
		
		of.ifPresent(System.err::println);
		
		//orElseGet = varsa al, yoksa üret
		
		Person newPerson;
		
		newPerson = of.orElseGet(() -> new Person());
		
		
		newPerson = ofNullable.orElseThrow(RuntimeException::new);
		
	}

}
