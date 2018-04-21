package javaprac.interfaceprac;

abstract class Parent {

	public String name = "";
	public int age = -1;
	public int sex = -1;
	public int assets = -1;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSex() {
		return sex;
	}

	public int getAssets() {
		return assets;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public void setAssets(int assets) {
		this.assets = assets;
	}

}
