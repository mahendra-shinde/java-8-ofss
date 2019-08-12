
public class Employee {
	public static int ID = 1;
	private int id = 10;

	public void print() {
		int id = 100;
		System.out.println("Value =" + id);
		System.out.println("Value =" + Employee.ID);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.print();
	}
}
