package com.defaults.methods;

public interface IMerhaba {
	
	default void helloworld(String mesaj) {  // default olduğu için içi dolu olabilir
		System.out.println("hello world " + mesaj);
	}

}
