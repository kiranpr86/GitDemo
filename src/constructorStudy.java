
public class constructorStudy {
	
	String name;//These 2 are class variables
	int age;
	
	
	
	public constructorStudy() {
		
		System.out.println("default constructors");
	}
	
	
	public constructorStudy(int i) {
		
		System.out.println("1 param");
	}
	
	public constructorStudy(int i,int j) {
		
		System.out.println("2 param");
	}
	
	
	
	public constructorStudy(String name,int age) {
	
		this.name=name;//this.classvariables=local variables
		this.age=age;
		//System.out.println(name + " " +  age);
		//System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructorStudy obj = new constructorStudy();
		constructorStudy obj1 = new constructorStudy(5);
		constructorStudy obj2= new constructorStudy(5,10);
		constructorStudy obj3= new constructorStudy("kiran",34);
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);
	}

}
