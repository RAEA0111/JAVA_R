package Day07.Ex04_02_AccessModifier;

import Day07.Ex04_01_AccessModifier.Person;

public class Student extends Person {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int height, int age,int weight) {
		super(name, height,age, weight);
	}
	
	public void defaultSetting() {
		name = "이름없음";
		height = 160;
		// age = 20;	//default라서 같은 패키지에서만 접근 가능
		// weight =50;	//private라서 해당클래스에서만 접근 가능 
		setAge(20);
		setWeight(50);
		
	}
	
	
	
	

}
