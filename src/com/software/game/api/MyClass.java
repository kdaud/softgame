/**
 * 
 */
package com.software.game.api;


/**
 * @author kdaud
 */
public class MyClass {
	
	private int age;
	
	private String name;
	
	private boolean elligibility;
	
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
	
	/**
	 * @return the elligibility
	 */
	public boolean isElligibility() {
		return elligibility;
	}
	
	/**
	 * @param elligibility the elligibility to set
	 */
	public void setElligibility(boolean elligibility) {
		this.elligibility = elligibility;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyClass [age= " + age + ", name= " + name + ", elligibility= " + elligibility + "]";
	}
	
	/**
	 * 
	 * @param age
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public int getAge() {
		return age;
	}
	 */
	public void myfunction() {
		String [] student= {"Game", "Magari","Daud","Eric"};
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
		System.out.println("**************************");
		String univ="Bugema University";
		char[] myCharacter=univ.toCharArray();
		
		for (char c : myCharacter) {
			System.out.print(c + " ");
		}
	}

}
