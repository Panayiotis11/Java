package tutorial1;

public class Classes {

	private String name;
	private String food;
	private String color;
	private int age;
	
	
	public Classes(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Classes(String food) {
		this.food = food;
		
	}

	
	public void speak() {
		System.out.print("My name is" + name + "and my age is " + age + "\n");
		
	}
	
	public int getAge() {
		return this.age;
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	

		 
}


