package javaprac.interfaceprac;

public class Child extends Parent {

 

	public Child() {

	}

	public Child(String name, int age, int sex, int assets) {
		super.name = name;
		super.age = age;
		super.sex = sex;
		super.assets = assets;
	}

	@Override
	public String toString() {
		
		
		return "name: " + this.name + ", age: " + this.age + ", sex: " + this.sex + ", 부모 => assets: " +  String.format("%,d",super.assets);
	}


	
	
	}
