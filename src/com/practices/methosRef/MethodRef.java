package com.practices.methosRef;

public class MethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodRef methodRef = new MethodRef(); // MethodRef classının engineStop fonksiyonu, interface metoduna implemente edildi
		StopEngine stopEngine = methodRef::engineStop;
		stopEngine.stop("BRAND");
		
		StopEngine staticStopEngine = MethodRef::staticEngineStop; // static method referans verildi
		staticStopEngine.stop("BRAND via static method");
		
		StopBrand brand = new StopBrand(); // bir üstteki metodun Interface Classtan implemente edilmiş hali
		brand.stop("BRAND via created implementing class");
	}
	
	
	public void engineStop(String brand) {
		System.out.println(brand + " has been stop");
	}
	
	public static void staticEngineStop(String brand) {
		System.out.println(brand + " has been stop");
	}
} 
