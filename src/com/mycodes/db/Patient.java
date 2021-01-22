package com.mycodes.db;

public class Patient {
	
	//	public void myCall() {
	//		String[] patient = { "Henry", "Gilbert", "Ivan", "Mike", "Albert" };
	//		System.out.println(Arrays.toString(patient));
	//	}
	
	private int age;
	
	private String name;
	
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Patient {" + "Name: " + name + ", Age: " + age + " }";
	}
}
