import java.util.*;
class Person{
	String name;
	String dob;
	String clg;
	int uid;
	Person(){
		clg="CEMK";
	}
	Person(String college){
		clg=college;
	}
	Person(String name,String dob){
		this.name=name;
		this.dob=dob;
	}
	Person(String name,String dob,int x){
                this.name=name;
                this.dob=dob;
		this.uid=x;
        }

	void setName(){
		name="Pramit";
	}
	void setDOB(){
		dob="24/12/2005";
	}
	String getName(){
		return name;
	}
	String getDOB(){
		return dob;
	}
}
class PersonTest{
	public static void main(String args[]){
		Person p[]=new Person[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			String n,d;
			int y;
			System.out.println("Enter the name: ");
			n=sc.nextLine();
			System.out.print("Enter the dob: ");
			d=sc.nextLine();
			System.out.print("Enter the aadhar: ");
			y=sc.nextInt();
			sc.nextLine();
			p[i]=new Person(n,d,y);
		}
		System.out.print("Enter the person index: ");
		int x=sc.nextInt();
		System.out.print(" Name: "+p[x].name+" dob: "+p[x].dob+" aadhar: "+p[x].uid);
		/*p.setName();
		p.setDOB();
		System.out.println("Person-> "+p);
		System.out.println("Name-> "+p.getName());
		System.out.println("College-> "+p.clg);
		System.out.println("DOB-> "+p.getDOB());
		Person p1=new Person("IIEST");
                p1.setName();
                p1.setDOB();
                System.out.println("Person-> "+p1);
                System.out.println("Name-> "+p1.getName());
                System.out.println("College-> "+p1.clg);
                System.out.println("DOB-> "+p1.getDOB());
		*/

	}
}
