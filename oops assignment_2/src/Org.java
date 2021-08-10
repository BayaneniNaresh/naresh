class Employee{
	int id;
	String name;
	int salary;
	int totalSal=0;
	public void totalSalary(int salary) {
		totalSal+=salary;
	}
}
class Manager extends Employee{
	int incentive;
	Manager(int id,String name,int salary,int incentive){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.incentive=incentive;
	}
	public int totalSalary() {
		return totalSal+=(salary+incentive);
	}
	
}
class Labour extends Employee{
	int extraTimeSal;
	Labour(int id,String name,int salary,int extraTimeSal){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.extraTimeSal=extraTimeSal;
	}
	public int totalSalary() {
		return totalSal+=(salary+extraTimeSal);
	}
}
public class Org {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(1,"naresh",20000,3000);
		System.out.println((m.name)+" has earned Rs."+m.totalSalary());
		Labour L=new Labour(2,"harish",1000,200);
		System.out.println((L.name)+" daily wage is Rs."+(L.totalSalary()));

	}

}


