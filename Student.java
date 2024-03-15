
public class Student extends Person{
	public void set() {
		super.age = 18;
		super.height = 155;
		super.name = "오지은";
		super.setWeight(45);
	}
	
	public void print() {
		System.out.println(super.age +"\t"+ super.height +"\t" + super.name +"\t" + super.getWeight());
	}
}
